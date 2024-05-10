package soal1;

import java.util.ArrayList;
import java.util.List;

// Class representing a skincare product
class Skincare {
    // Attributes
    final private String brand;
    final private String productName;
    final private double price;
    final private int netto;
    final private List<String> ingredients;
    private int stock;

    // Constructor
    public Skincare(String brand, String productName, double price, int netto, int stock, List<String> ingredients) {
        this.brand = brand;
        this.productName = productName;
        this.price = price;
        this.netto = netto;
        this.stock = stock;
        this.ingredients = ingredients;
    }

    // Method Overriding untuk menampilkan informasi produk
    @Override
    public String toString() {
        return "Brand: " + brand +
        "\nProduct Name: " + productName +
        "\nPrice: $" + price +
        "\nNetto: " + netto + " grams" +
        "\nStock: " + stock + " object" +
        "\nIngredients: " + ingredients;
    }

    // Metode untuk memeriksa apakah produk tersebut tersedia
    public boolean checkAvailability() {
        return stock > 0;
    }

    // Method Overloading untuk memeriksa ketersediaan dengan jumlah tertentu
    public boolean checkAvailability(int quantity) {
        return stock >= quantity;
    }

    // Getter untuk brand

    public String getBrand() {
        return brand;
    }

    // Getter untuk productName

    public String getProductName() {
        return productName;
    }

    // Getter untuk price
    public double getPrice() {
        return price;
    }

    // Getter untuk netto
    public int getNetto() {
        return netto;
    }

    // Getter untuk stock
    public int getStock() {
        return stock;
    }

    // Setter untuk price
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock value. Stock value cannot be negative.");
        }
    }

    // Getter untuk ingredients
    public List<String> getIngredients() {
        return ingredients;
    }
}
