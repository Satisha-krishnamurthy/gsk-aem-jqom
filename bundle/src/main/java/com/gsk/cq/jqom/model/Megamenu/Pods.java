
package com.gsk.cq.jqom.model.Megamenu;

import java.util.ArrayList;
import java.util.List;

import com.gsk.cq.jqom.model.Settings;

public class Pods {
    private Settings settings;
    private List<Root> root = new ArrayList<Root>();

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public List<Root> getRoot() {
        return root;
    }

    public void setRoot(List<Root> root) {
        this.root = root;
    }


}
