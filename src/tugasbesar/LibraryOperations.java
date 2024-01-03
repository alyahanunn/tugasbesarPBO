/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tugasbesar;

/**
 *
 * @author user
 */
// LibraryOperations.java
public interface LibraryOperations {
    void addBook(Book book);
    Book getBook(String title);
    void updateBook(String title, Book book);
    void deleteBook(String title);
}