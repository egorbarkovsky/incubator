package com.wldrmnd.incubator.domain;

import java.util.List;

public class Material {
    private String directionName;
    private List<Theme> themes;

    public Material(String directionName, List<Theme> themes) {
        this.directionName = directionName;
        this.themes = themes;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }
}
