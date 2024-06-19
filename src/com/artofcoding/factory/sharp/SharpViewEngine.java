package src.com.artofcoding.factory.sharp;

import src.com.artofcoding.factory.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View Rendered by Sharp";
    }
}
