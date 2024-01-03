# Sistem Manajemen Perpustakaan Alya Hanun (32602200040)

Proyek ini adalah implementasi sederhana dari sistem manajemen perpustakaan yang menggunakan Java. Aplikasi ini memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada data buku melalui Command Line Interface (CLI). Proyek ini konsep-konsep OOP (Object-Oriented Programming) seperti  :

1.inheritance
2.polymorphism
3.encapsulation
4.getter dan setter 
5.interface

## hal yang dilakukan sistem ini
- Menambahkan buku baru ke sistem
- Melihat detail buku
- Mengupdate informasi buku
- Menghapus buku dari sistem


## Penerapan konsep OOP
### 1. Encapsulation
- **Kelas Book**:
  - Encapsulation diterapkan dengan membuat semua field (title, author, year) menjadi private.
  - Menyediakan getter dan setter untuk setiap field (ada pada file Book.java).

### 2. Inheritance
- **Kelas Library mewarisi Book**:
  - Ini merupakan contoh inheritance, di mana Library adalah subclass yang mewarisi properties dari superclass Book (ada pada file Library.java).

### 3. Polymorphism
- Polymorphism diterapkan melalui implementasi interface.
- Metode yang didefinisikan dalam interface diimplementasikan dengan cara yang berbeda-beda oleh class yang mengimplementasikannya.

### 4. Interface
- **Interface LibraryOperations**:
  - Mendefinisikan kontrak untuk operasi CRUD yang kemudian diimplementasikan oleh Library (ada pada file LibraryOperations.java dan Library.java).

### 5. Getter dan Setter
- **Kelas Book**:
  - Menggunakan getter dan setter untuk mengakses dan memodifikasi field private (ada pada file Book.java).


