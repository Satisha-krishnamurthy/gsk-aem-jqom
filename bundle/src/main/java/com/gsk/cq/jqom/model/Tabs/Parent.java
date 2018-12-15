
package com.gsk.cq.jqom.model.Tabs;

import java.util.ArrayList;
import java.util.List;

import com.gsk.cq.jqom.model.Settings;

public class Parent {
    private Settings settings;
    private List<Leaf> leaves = new ArrayList<Leaf>();

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }
}
