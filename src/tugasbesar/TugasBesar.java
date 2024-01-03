/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbesar;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TugasBesar{ 
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Selamat datang di Sistem Perpustakaan!");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Lihat Buku");
                System.out.println("3. Ubah Buku");
                System.out.println("4. Hapus Buku");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");

                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline yang tersisa

                  switch (pilihan) {
                case 1:
                    // Tambah Buku
                    System.out.print("Masukkan judul buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String author = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline yang tersisa

                    Book newBook = new Book(title, author, year);
                    library.addBook(newBook);
                    System.out.println("Buku berhasil ditambahkan!");
                    break;

                case 2:
                    // Lihat Buku
                    System.out.print("Masukkan judul buku yang ingin dilihat: ");
                    title = scanner.nextLine();
                    Book book = library.getBook(title);
                    if (book != null) {
                        System.out.println("Judul: " + book.getTitle());
                        System.out.println("Penulis: " + book.getAuthor());
                        System.out.println("Tahun: " + book.getYear());
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;

                case 3:
                    // Ubah Buku
                    System.out.print("Masukkan judul buku yang ingin diubah: ");
                    title = scanner.nextLine();
                    System.out.print("Masukkan judul baru: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Masukkan penulis baru: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit baru: ");
                    int newYear = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline yang tersisa

                    Book updatedBook = new Book(newTitle, newAuthor, newYear);
                    library.updateBook(title, updatedBook);
                    System.out.println("Buku berhasil diubah!");
                    break;

                case 4:
                    // Hapus Buku
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    title = scanner.nextLine();
                    library.deleteBook(title);
                    System.out.println("Buku berhasil dihapus!");
                    break;

                case 5:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan Sistem Perpustakaan!");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine(); // Mengonsumsi input yang salah untuk mencegah loop tak terbatas
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                // Anda bisa menambahkan lebih banyak logika penanganan kesalahan di sini jika diperlukan
            }
        }
    }
}