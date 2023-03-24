package task1.main;

public class Product {
    private String name;
    private final int code;

    public Product(String name, int code) {
        if (code < 0) throw new IllegalArgumentException("Code must be above zero");
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void changeName(String name) {
        this.name = name;
    }
}
