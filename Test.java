package HW3_Part2;

public class Test {
    public static void main(String[] args) {
        // Создаем 6 книг
        Book book1 = new Book("War and World", "Tolstoy");
        Book book2 = new Book("Java 8", "Shildt");
        Book book3 = new Book("Spring in Active", "Craig Walls");
        Book book4 = new Book("Eugene Onegin", "Pushkin");
        Book book5 = new Book("Effective Java", "Joshua Bloch");
        Book book6 = new Book("Microservice Patterns", "Chris Richardson");

        // Создаем 3-х посетителей
        Visitor visitor1 = new Visitor("Ivan Ivanov");
        Visitor visitor2 = new Visitor("Pavel Stryuk");
        Visitor visitor3 = new Visitor("Vadim Gubarev");

        // Создаем библиотеку
        // (объект типа Library)
        Library library = new Library();

        // Добавляем в библиотеку
        // 6 ранее созданных книг
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        // Выводим книги, их авторов и id
        System.out.println("Книги в библиотеке");
        System.out.println(library.getBooks());
        System.out.println();
        System.out.println("Авторы книг библиотеки");
        System.out.println(library.getAuthorOfBook());
        System.out.println();
        System.out.println("Идентификаторы книг библиотеки");
        System.out.println(library.getIdBook());
        System.out.println();

        // Удаляем 3-ю и 6-ю книгу
        library.deleteBook(book3);
        library.deleteBook(book6);

        // Выводим книги, их авторов и id
        System.out.println("После удаления (3-ей и 6-ой книги)");
        System.out.println("Книги в библиотеке");
        System.out.println(library.getBooks());
        System.out.println();
        System.out.println("Авторы книг библиотеки");
        System.out.println(library.getAuthorOfBook());
        System.out.println();
        System.out.println("Идентификаторы книг библиотеки");
        System.out.println(library.getIdBook());
        System.out.println();

        // Возвращаем книгу по названию
        System.out.println("Вернуть книгу по названию (Eugene Onegin)");
        System.out.println(library.returnBook("Eugene Onegin"));

        // Возвращаем книгу по названию
        System.out.println("Вернуть книгу по названию (Harry Potter)");
        System.out.println(library.returnBook("Harry Potter"));
        System.out.println();

        // Возвращаем книгу по автору
        System.out.println("Вернуть все книги по автору (Shildt)");
        System.out.println(library.returnBookByAuthor("Shildt"));

        // Возвращаем книгу по автору
        System.out.println("Вернуть книгу по автору (Esenin)");
        System.out.println(library.returnBookByAuthor("Esenin"));
        System.out.println();

        // Даем книги посетителям
        library.giveBook(book1, visitor1);
        library.giveBook(book2, visitor2);
        library.giveBook(book2, visitor3);
        library.giveBook(book5, visitor1);

        // Выводим id посетителей
        System.out.print("Посетитель " + visitor1.getNameVisitor() + " взял книгу: ");
        System.out.println(visitor1.getId());
        System.out.print("Посетитель " + visitor2.getNameVisitor() + " взял книгу: ");
        System.out.println(visitor2.getId());
        System.out.print("Посетитель " + visitor3.getNameVisitor() + " взял книгу: ");
        System.out.println(visitor3.getId());
        System.out.println();

        // Выводим книги, их авторов и id
        System.out.println("После того, как посетители взяли книги");
        System.out.println("Книги в библиотеке");
        System.out.println(library.getBooks());
        System.out.println();
        System.out.println("Авторы книг библиотеки");
        System.out.println(library.getAuthorOfBook());
        System.out.println();
        System.out.println("Идентификаторы книг библиотеки");
        System.out.println(library.getIdBook());
        System.out.println();

        // Принимаем книги от посетителей назад
        System.out.println("Посетитель " + visitor1.getNameVisitor() +
                " отдал книгу: " + visitor1.getId());
        library.returnBookFromVisitor(visitor1);
        System.out.println("Посетитель " + visitor2.getNameVisitor() +
                " отдал книгу: " + visitor2.getId());
        library.returnBookFromVisitor(visitor2);
        System.out.println();

        // Выводим книги, их авторов и id
        System.out.println("После возвращения книг");
        System.out.println("Книги в библиотеке");
        System.out.println(library.getBooks());
        System.out.println();
        System.out.println("Авторы книг библиотеки");
        System.out.println(library.getAuthorOfBook());
        System.out.println();
        System.out.println("Идентификаторы книг библиотеки");
        System.out.println(library.getIdBook());
        System.out.println();

        // Выводим id посетителей
        System.out.println("Идентификаторы посетителей после возврата книг");
        System.out.println(visitor1.getNameVisitor() + ": " + visitor1.getId());
        System.out.println(visitor2.getNameVisitor() + ": " + visitor2.getId());
        System.out.println(visitor3.getNameVisitor() + ": " + visitor3.getId());
    }
}
