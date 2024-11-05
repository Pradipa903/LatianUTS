package model;

public class Product {
    private String name;
    private String ImagefileName;
    private int price;
    private String description;

    public Product(String name, String imagefileName, int price, String description) {
        this.name = name;
        ImagefileName = imagefileName;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagefileName() {
        return ImagefileName;
    }

    public void setImagefileName(String imagefileName) {
        ImagefileName = imagefileName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
