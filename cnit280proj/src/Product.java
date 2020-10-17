public class Product {
    private String id;
    private String name;
    private String description;
    private double weight;
    private double height;
    private double width;
    private double length;
    private double price;
    private String category;
    private String supplier;


    public Product(String id, String name, String description, double weight, double height, double width, double length, double price, String category, String supplier) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }
    public String getSupplier() {
        return this.supplier;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", weight='" + getWeight() + "'" +
            ", height='" + getHeight() + "'" +
            ", width='" + getWidth() + "'" +
            ", length='" + getLength() + "'" +
            ", price='" + getPrice() + "'" +
            ", category='" + getCategory() + "'" +
            "}";
    }

}