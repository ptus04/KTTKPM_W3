package adapter;

public class Main {
    public static void main(String[] args) {
        XMLParser xmlParser = new XMLParser();
        StorageService storageService = new StorageService(xmlParser);
        storageService.Save("Hello");

        JsonParser jsonParser = new JsonParser();
        JsonParserAdapter jsonParserAdapter = new JsonParserAdapter(jsonParser);
        StorageService storageService2 = new StorageService(jsonParserAdapter);
        storageService2.Save("Hello");
    }
}
