
package com.gsk.cq.jqom.model.Megamenu;

import com.gsk.cq.jqom.model.Settings;

public class Result {
    private String type = "Megamenu";
    private Settings settings;
    private Pods pods;

    public String getType() {
        return type;
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