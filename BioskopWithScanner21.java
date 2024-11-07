import java.util.Scanner;
public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris,kolom;
        String nama, next;

        String [][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

        
            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris atau kolom tidak valid. Silahkan masukkan kembali.");
                        continue;  
                    }
                    if (penonton[baris - 1][kolom -1] != null) {
                        System.out.println("Kursi sudah terisi. Harap pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                     if (next.equalsIgnoreCase("n")) {
                     break;
                     }
                }continue;
            }
            else if (menu == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton.length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else{
                            System.out.print(penonton[i][j] + "\t");
                        }
                    } System.out.println();
                }continue;
            }
            else if (menu == 3) {
                System.out.println("Program selesai");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid. Silahkan pilih menu yang tersedia.");
                continue;
            }
            
        } 
        sc.close();
    }
    
}
