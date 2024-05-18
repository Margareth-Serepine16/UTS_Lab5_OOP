package soal1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // Membuat objek skincare dengan meminta user memasukkan inputan
        Scanner in = new Scanner(System.in);
        System.out.print("Total Skincare : ");
        int banyakSkincare = in.nextInt();
        in.nextLine();

        Skincare[] skincares = new Skincare[banyakSkincare];
        for(int i=0 ; i<banyakSkincare ; i++ ){
            System.out.println("Skincare " + (i + 1));
            System.out.println();
            String brand, productName;
            System.out.print("Brand: ");
            brand = in.nextLine();
            System.out.print("Product Name: ");
            productName = in.nextLine();
            double price;
            System.out.print("Price: ");
            price = in.nextDouble();
            int netto;
            System.out.print("Netto: ");
            netto = in.nextInt();
            int stock;
            System.out.print("Banyak stock: ");
            stock = in.nextInt();
            int banyakIngredient;
            System.out.print("Banyak Ingredient: ");
            banyakIngredient = in.nextInt();
            List<String> ingredients = new ArrayList<>();
            in.nextLine(); //Membersihkan newline character
            for (int j = 0; j < banyakIngredient; j++) {
                String ingredient;
                System.out.print("Ingredient " + (j+1) + ": ");
                ingredient = in.nextLine();
                ingredients.add(ingredient);
            }
            skincares[i] = new Skincare(brand, productName, price, netto, stock, ingredients);
            System.out.println();
        }
        //  Menampilkan informasi produk
        for (int i = 0; i < banyakSkincare; i++) {
            System.out.println("Skincare " + (i + 1));
            System.out.println("Product Information:");
            System.out.println(skincares[i]);
            System.out.println();
        }
        // Method overloading untuk memeriksa ketersediaan stok objek Skincare
        System.out.println(skincares[0].checkAvailability());
        System.out.println(skincares[0].checkAvailability(5));
        in.close();
    }
}
