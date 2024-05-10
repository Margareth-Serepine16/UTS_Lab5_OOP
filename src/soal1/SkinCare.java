package soal1;

import java.util.ArrayList;
import java.util.List;

//  Kelas Skincare memuat objek berupa Skincare yang dapat menyimpan informasi tentang objek tersebut
class Skincare {
    // Attributes
    final private String brand;
    final private String productName;
    final private double price;
    final private int netto;
    final private List<String> ingredients;
    private int stock;

    // Constructor untuk membuat objek Skincare baru dengan memberikan nilai awal kepada atribut-atributnya
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

    // Method untuk memeriksa apakah produk tersebut tersedia
    public boolean checkAvailability() {
        return stock > 0;
    }

    // Method Overloading untuk memeriksa ketersediaan dengan jumlah tertentu
    public boolean checkAvailability(int quantity) {
        return stock >= quantity;
    }

    // Getter untuk mengambil nama brand
    public String getBrand() {
        return brand;
    }

    // Getter untuk mengambil productName
    public String getProductName() {
        return productName;
    }

    // Getter untuk untuk mengambil nilai price
    public double getPrice() {
        return price;
    }

    // Getter untuk mengambil nilai netto (berat bersih)
    public int getNetto() {
        return netto;
    }

    // Getter untuk mengambil nilai stock
    public int getStock() {
        return stock;
    }

    // Setter untuk mengatur dan mengecek nilai stock suatu Skincare
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock value. Stock value cannot be negative.");
        }
    }

    // Getter untuk mengambil daftar ingredients yang dimiliki oleh suatu Skincare
    public List<String> getIngredients() {
        return ingredients;
    }
}
