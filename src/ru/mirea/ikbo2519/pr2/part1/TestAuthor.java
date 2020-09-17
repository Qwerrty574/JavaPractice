package ru.mirea.ikbo2519.pr2.part1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author_1 = new Author("John", "john@email.com", 'M');
        Author author_2 = new Author("Helen", 'F');
        Author author_3 = new Author("Mike", "mike@email.com", 'M');
        System.out.println(author_1);
        author_2.setEmail( "Helen@email.com");
        System.out.println(author_2);
        System.out.println(author_3);
    }
}
