package src.com.artofcoding.factory.matcha;

import src.com.artofcoding.factory.ViewEngine;

import java.util.Map;

public class MachaViewEngine implements ViewEngine {
    public String render(String viewName, Map<String, Object> context) {
        return "View Rendered by Macha";
    }
}


