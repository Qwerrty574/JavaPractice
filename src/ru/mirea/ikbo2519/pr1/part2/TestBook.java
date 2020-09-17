package ru.mirea.ikbo2519.pr1.part2;

public class TestBook {
    public static void main(String[] args) {
        Book book_1 = new Book("1984", "G.Orwell", 1949);
        Book book_2 = new Book("We", "Yevgeny Zamyatin");
        book_2.setYear(1924);
        System.out.println(book_1);
        System.out.println(book_2);
    }
}
