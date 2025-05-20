

/**
 *
 * @author INSTIKI
 */
import java.util.Scanner;

public class AplikasiPegawai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pegawai[] pegawaiArray = new Pegawai[10]; // Array untuk menyimpan data pegawai
        int index = 0; // Untuk menandai index array yang kosong

        while (true) {
            displayMenu(); // Menampilkan menu aplikasi
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    // Pencatatan Data Pegawai
                    if (index < pegawaiArray.length) {
                        System.out.print("Masukkan ID Pegawai: ");
                        int idPegawai = scanner.nextInt();
                        scanner.nextLine(); // Clear buffer
                        System.out.print("Masukkan Nama Pegawai: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan Alamat Pegawai: ");
                        String alamat = scanner.nextLine();
                        System.out.print("Masukkan Jabatan Pegawai: ");
                        String jabatan = scanner.nextLine();

                        Pegawai pegawai = new Pegawai(idPegawai, nama, alamat, jabatan);
                        pegawaiArray[index] = pegawai;
                        index++;
                        System.out.println("Data Pegawai berhasil ditambahkan!");
                    } else {
                        System.out.println("Array pegawai sudah penuh.");
                    }
                    break;

                case 2:
                    // Menampilkan Data Pegawai
                    System.out.println("Daftar Data Pegawai:");
                    for (int i = 0; i < index; i++) {
                        pegawaiArray[i].tampilData();
                        System.out.println("====================================");
                    }
                    break;

                case 3:
                    // Mengubah Data Pegawai
                    System.out.print("Masukkan ID Pegawai yang akan diubah: ");
                    int idUbah = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    boolean ditemukan = false;

                    for (int i = 0; i < index; i++) {
                        if (pegawaiArray[i].getIdPegawai() == idUbah) {
                            ditemukan = true;
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan Alamat Baru: ");
                            String alamatBaru = scanner.nextLine();
                            System.out.print("Masukkan Jabatan Baru: ");
                            String jabatanBaru = scanner.nextLine();

                            pegawaiArray[i].ubahData(namaBaru, alamatBaru, jabatanBaru);
                            System.out.println("Data Pegawai berhasil diubah!");
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("ID Pegawai tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Menghapus Data Pegawai
                    System.out.print("Masukkan ID Pegawai yang akan dihapus: ");
                    int idHapus = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    boolean dataDihapus = false;

                    for (int i = 0; i < index; i++) {
                        if (pegawaiArray[i].getIdPegawai() == idHapus) {
                            pegawaiArray[i].hapusData();
                            dataDihapus = true;
                            System.out.println("Data Pegawai berhasil dihapus!");
                            break;
                        }
                    }

                    if (!dataDihapus) {
                        System.out.println("ID Pegawai tidak ditemukan.");
                    }
                    break;

                case 5:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan aplikasi!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        }
    }

    // Menampilkan menu aplikasi
    public static void displayMenu() {
        System.out.println("\nMenu Aplikasi Pegawai:");
        System.out.println("1. Pencatatan Data Pegawai");
        System.out.println("2. Menampilkan Data Pegawai");
        System.out.println("3. Mengubah Data Pegawai");
        System.out.println("4. Menghapus Data Pegawai");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }
}
