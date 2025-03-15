package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        // Create JSON data
        JsonData userData = new JsonData();
        userData.addProperty("name", "That");
        userData.addProperty("age", 22);
        userData.addProperty("email", "mthat456@gmail.com");
        userData.addProperty("isActive", true);

        // Create product data
        JsonData productData = new JsonData();
        productData.addProperty("productName", "Laptop");
        productData.addProperty("price", 909.99);
        productData.addProperty("inStock", true);
        productData.addProperty("description", "Good ");

        // Display original JSON format
        System.out.println("Original JSON Data (User):");
        System.out.println(userData.getJson());
        System.out.println("\nOriginal JSON Data (Product):");
        System.out.println(productData.getJson());

        // Convert to XML using adapter
        JsonToXmlAdapter userAdapter = new JsonToXmlAdapter(userData);
        JsonToXmlAdapter productAdapter = new JsonToXmlAdapter(productData);

        // Display converted XML
        System.out.println("\nConverted to XML format (User):");
        System.out.println(userAdapter.toXML());  // Changed from toXml() to toXML()
        System.out.println("\nConverted to XML format (Product):");
        System.out.println(productAdapter.toXML());  // Changed from toXml() to toXML()
    }
}