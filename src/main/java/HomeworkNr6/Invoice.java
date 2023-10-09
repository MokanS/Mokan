package HomeworkNr6;

public class Invoice {
    private String model;
    private String description;
    private int quantity;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Invoice(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        this.quantity = quantity > 0 ? quantity : 0;
        this.price = price > 0 ? price : 0;

    }

    public double getAmount() {
        return quantity * price;
    }

    public static void main(String[] args) {
        Invoice first = new Invoice("Asus", "Laptop", 5, 5000);
        double sum = first.getAmount();
        System.out.println("Сумма за "+ first.description +" "+ first.model + "= "+ sum);
    }
}
