package src.com.artofcoding.factory;

import java.util.Map;

public interface ViewEngine {
    public String render(String viewName, Map<String, Object> context);
}
