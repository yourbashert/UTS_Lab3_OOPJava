import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah string (Reverse Perhuruf): ");
        String str = input.nextLine();

        if (str.trim().isEmpty()) {
            System.out.println("String tidak boleh kosong. Silakan masukkan string yang valid.");
            return; 
        }

        String perHuruf = reversePerHuruf(str);
        System.out.println("Reverse Perhuruf: " + perHuruf);

        System.out.print("Masukkan sebuah string (Reverse Perkata): ");
        String str2 = input.nextLine();

        if (str2.trim().isEmpty()) {
            System.out.println("String tidak boleh kosong. Silakan masukkan string yang valid.");
            return; // Keluar dari program jika input kosong atau hanya berisi spasi
        }

        String perKata = reversePerKata(str2);
        System.out.println("Reverse Perkata: " + perKata);
    }

    public static String reversePerHuruf(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String reversePerKata(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }
        return result;
    }
}
