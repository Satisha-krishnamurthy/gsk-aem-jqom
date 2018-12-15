
package com.gsk.cq.jqom.model.Megamenu;

import java.util.ArrayList;
import java.util.List;

import com.gsk.cq.jqom.model.Settings;
import com.gsk.cq.jqom.model.SrcBrkPnt;

public class Leaf {
    private String type;
    private String content;
    private Settings settings;
    private List<SrcBrkPnt> srcBrkPnt = new ArrayList<SrcBrkPnt>();
    private String thumbImg;
    private String src;
    private String alt;
    private String caption;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public List<SrcBrkPnt> getSrcBrkPnt() {
        return srcBrkPnt;
    }

    public void setSrcBrkPnt(List<SrcBrkPnt> srcBrkPnt) {
        this.srcBrkPnt = srcBrkPnt;
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
