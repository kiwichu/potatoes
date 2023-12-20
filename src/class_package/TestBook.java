package class_package;

public class TestBook {

    public static void main(String[] args) {
        //class_package.Author author = new class_package.Author("Potato", 65, 'F', "PHD" );
        //class_package.Book book1 = new class_package.Book("First Day at PNT", author, 1234, 55);
       //this below is an anonymous object
        Book book1 = new Book("First Day at PNT", new Author("Potato", 65, 'F', "PHD" ), 1234, 55);

        System.out.println(book1.getAuthor().getName());
        System.out.println(book1.getTitle());
    }
}
