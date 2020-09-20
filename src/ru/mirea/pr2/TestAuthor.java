package ru.mirea.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("John Smith", "johny666@mail.ru", 'M');
        System.out.println(author1);
        author1.setEmail("sm1thXXX@gmail.com");
        System.out.println(author1);
    }
}
