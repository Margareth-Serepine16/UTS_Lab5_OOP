package soal2;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static boolean isAnagram(String kata1, String kata2) {
        // Mengubah string ke array karakter
        char[] charArrayHuruf1 = kata1.toCharArray();
        char[] charArrayHuruf2 = kata2.toCharArray();

        // Mengurutkan array karakter
        Arrays.sort(charArrayHuruf1);
        Arrays.sort(charArrayHuruf2);

        // Membandingkan array yang telah diurutkan
        return Arrays.equals(charArrayHuruf1, charArrayHuruf2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String  kata1, kata2;

        kata1 = in.next();
        kata2 = in.next();
        System.out.println("kata 1 : " + kata1);
        System.out.println("kata 2 : " + kata2);
        System.out.println("apakah kedua kata merupakan anagram ? " + isAnagram (kata1, kata2));

    }
}
