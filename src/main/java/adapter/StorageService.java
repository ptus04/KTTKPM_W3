package adapter;

public class StorageService {
    private XMLParser parser;

    public StorageService(XMLParser parser) {
        this.parser = parser;
    }

    public void Save(Object object) {
        String data = parser.parse(object);
        System.out.println("Saved: " + data);
    }
}
