package category;

import java.util.List;

import app.App;

public class Category {
    private String nameCategory;
    private List<App> apps;

    public Category(String nameCategory, List<App> apps) {
        this.nameCategory = nameCategory;
        this.apps = apps;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }
}
