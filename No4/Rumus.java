import java.util.Scanner;

public class Rumus {
    Scanner scanner = new Scanner(System.in);
    int pilih;
    double hasil;

    public Rumus() {
        System.out.println("Selamat datang di program menghitung rumus!");
    }

    public void pilihan() {
        System.out.println("Pilih rumus yang ingin dihitung:");
        System.out.println("1. Matematika - Menghitung Luas Lingkaran");
        System.out.println("2. Fisika - Menghitung Momentum");
        System.out.print("Masukkan pilihan Anda: ");
        pilih = scanner.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double r = scanner.nextDouble();
                hitung(r);
                break;
            case 2:
                System.out.print("Masukkan massa benda (kg): ");
                double m = scanner.nextDouble();
                System.out.print("Masukkan kecepatan benda (m/s): ");
                double v = scanner.nextDouble();
                hitung(m, v);
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
                break;
        }
    }

    public void hitung(double r) {
        hasil = Math.PI * Math.pow(r, 2);
        System.out.println("Luas lingkaran dengan jari-jari adalah " + r + " adalah " + hasil);
    }

    public void hitung(double m, double v) {
        hasil = m * v;
        System.out.println("Momentum benda dengan massa " + m + " kg dan kecepatan " + v + " m/s adalah " + hasil + " kg.m/s");
    }

    public void lanjutkan() {
        System.out.print("Apakah Anda ingin melanjutkan perhitungan? (y/n): ");
        String jawaban = scanner.next();
        if (jawaban.equalsIgnoreCase("y")) {
            pilihan();
            lanjutkan();
        } else if (jawaban.equalsIgnoreCase("n")) {
            System.out.println("Terima kasih telah menggunakan program ini!");
        } else {
            System.out.println("Jawaban tidak valid, silakan coba lagi!");
            lanjutkan();
        }
    }

    public static void main(String[] args) {
        Rumus program = new Rumus();
        program.pilihan();
        program.lanjutkan();
    }
}
