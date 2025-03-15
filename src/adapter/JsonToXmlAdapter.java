package adapter;

import java.util.Map;

public class JsonToXmlAdapter implements IXmlFormat {
    private JsonData jsonData;

    public JsonToXmlAdapter(JsonData jsonData) {
        this.jsonData = jsonData;
    }

    @Override
    public String toXML() {  // Changed from toXml() to toXML() to match interface
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<root>\n");

        for (Map.Entry<String, Object> entry : jsonData.getData().entrySet()) {
            xml.append("  <").append(entry.getKey()).append(">");
            
            // Handle different types of values
            Object value = entry.getValue();
            if (value instanceof String) {
                xml.append(escapeXml((String) value));
            } else {
                xml.append(value);
            }
            
            xml.append("</").append(entry.getKey()).append(">\n");
        }

        xml.append("</root>");
        return xml.toString();
    }

    private String escapeXml(String input) {
        return input.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;")
                   .replace("\"", "&quot;")
                   .replace("'", "&apos;");
    }
}