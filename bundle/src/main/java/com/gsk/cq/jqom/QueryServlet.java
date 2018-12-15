package com.gsk.cq.jqom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.Session;
import javax.jcr.query.Query;
import javax.jcr.query.QueryManager;
import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONObject;
import org.apache.sling.jcr.api.SlingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@SlingServlet(paths = { "/services/query" }, methods = { "GET" })
public class QueryServlet extends SlingAllMethodsServlet {
	private static final long serialVersionUID = 1L;

	@Reference
	private ResourceResolverFactory resolverFactory;

	@Reference
	private SlingRepository repo;

	private final Logger log = LoggerFactory.getLogger(QueryServlet.class);

	@Override
	public void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {

		log.info("####### Inside Servlet ########");
		Session session = null;

		Map<String, Object> param = new HashMap<String, Object>();

		param.put(ResourceResolverFactory.SUBSERVICE, "jqom");
		log.info("####### Inside Servlet USER ########");

		ResourceResolver resolver = null;
		JSONArray jsonArry = new JSONArray();
		try {

			// Invoke the getServiceResourceResolver method to create a Session
			// instance
			resolver = resolverFactory.getServiceResourceResolver(param);
			log.info("####### Inside Servlet resolver ########");
			session = resolver.adaptTo(Session.class);

			log.info("####### session ######### : " + session.getUserID());

			QueryManager queryManager = session.getWorkspace().getQueryManager();
			// create query
			String sqlStatement = "SELECT * FROM [nt:unstructured] AS s  WHERE ISDESCENDANTNODE([/content/sensodyne/product]) and "
					+ "([cq:lastModified] >= '2018-12-14T00:00' or [jcr:lastModified] >= '2018-12-14T00:00')";
			Query query = queryManager.createQuery(sqlStatement, Query.JCR_SQL2);

			log.info("######### Query ######### : " + query.getStatement());
			NodeIterator nodes = query.execute().getNodes();
			log.info("### query result : " + nodes.getSize());
			PrintWriter pw = response.getWriter();

			while (nodes.hasNext()) {

				Node node = nodes.nextNode();
				Resource rs = resolver.getResource(node.getPath());
				ValueMap prop = rs.adaptTo(ValueMap.class);
				Gson gson = new GsonBuilder().create();
				String json = gson.toJson(prop);
				JSONObject jsonObj = new JSONObject(json);
				jsonArry.put(jsonObj);

			}
			pw.println(jsonArry);

		} catch (Exception e) {
			log.error(e.getMessage());
		} finally {
			if (session.isLive()) {
				session.logout();
			}
		}

	}

}