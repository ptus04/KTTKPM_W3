package adapter;

public class JsonParserAdapter extends XMLParser {
    private final JsonParser adaptee;

    public JsonParserAdapter(JsonParser adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String parse(Object object) {
        return adaptee.stringify(object);
    }
}
