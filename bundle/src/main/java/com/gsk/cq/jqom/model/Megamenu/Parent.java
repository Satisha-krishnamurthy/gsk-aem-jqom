package com.gsk.cq.jqom.model.Megamenu;

import java.util.ArrayList;
import java.util.List;

import com.gsk.cq.jqom.model.Settings;

public class Parent {

    private Settings settings;
    private List<Child> children = new ArrayList<Child>();

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
