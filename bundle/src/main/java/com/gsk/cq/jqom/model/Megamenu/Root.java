
package com.gsk.cq.jqom.model.Megamenu;

import com.gsk.cq.jqom.model.Settings;

public class Root {
    private String content;
    private String type;
    private Settings settings;
    private Parent parent;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
