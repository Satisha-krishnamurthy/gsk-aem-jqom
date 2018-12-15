
package com.gsk.cq.jqom.model.Tabs;

import com.gsk.cq.jqom.model.Settings;

public class Result {
    private String type = "Tab";
    private String selectedTab;
    private Settings settings;
    private Pods pods;

    public String getType() {
        return type;
    }

    public String getSelectedTab() {
        return selectedTab;
    }

    public void setSelectedTab(String selectedTab) {
        this.selectedTab = selectedTab;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Pods getPods() {
        return pods;
    }

    public void setPods(Pods pods) {
        this.pods = pods;
    }
}
