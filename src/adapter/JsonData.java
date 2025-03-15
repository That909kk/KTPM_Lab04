package adapter;

import java.util.LinkedHashMap;
import java.util.Map;

public class JsonData {
    private Map<String, Object> data;

    public JsonData() {
        this.data = new LinkedHashMap<>();
    }

    public void addProperty(String key, Object value) {
        data.put(key, value);
    }

    public String getJson() {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        
        int count = 0;
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            json.append("  \"").append(entry.getKey()).append("\": ");
            
            if (entry.getValue() instanceof String) {
                json.append("\"").append(entry.getValue()).append("\"");
            } else {
                json.append(entry.getValue());
            }
            
            if (count < data.size() - 1) {
                json.append(",");
            }
            json.append("\n");
            count++;
        }
        
        json.append("}");
        return json.toString();
    }

    public Map<String, Object> getData() {
        return data;
    }
}