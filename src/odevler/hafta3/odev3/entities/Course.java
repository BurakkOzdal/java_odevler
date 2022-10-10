package odevler.hafta3.odev3.entities;

public class Course {
    private int id;
    private String name;
    private String description;
    private String category;
    private String instructor;

    private double price;

    public Course() {
    }

    public Course(int id, String name, String description, String category, String instructor, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.instructor = instructor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
