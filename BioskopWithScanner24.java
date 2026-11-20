import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length
                                || kolom < 1 || kolom > penonton[baris - 1].length) {
                            System.out.println("Kursi tidak tersedia! Baris 1-" + penonton.length
                                    + ", kolom 1-" + penonton[0].length);
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh "
                                    + penonton[baris - 1][kolom - 1]
                                    + ". Pilih kursi lain.");
                            continue;
                        }

                        break;
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();
                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isi + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih.");
                break;
            } else {
                System.out.println("Menu tidak tersedia!");
            }
    }
    sc.close();
}
} 
