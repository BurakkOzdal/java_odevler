package odevler.odev2.constructor;

public class ProductConstructor {
    private int id;
    private String name;
    private String description;
    private double price;
    private int unitsInStock;

    public ProductConstructor(int id, String name, String description, double price, int unitsInStock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.unitsInStock = unitsInStock;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnitsInStock() {
        return this.unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
