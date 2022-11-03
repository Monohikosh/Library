package HW3_Part2;

import java.util.ArrayList;

class Library {
    private ArrayList<String> books = new ArrayList<>(); // книги
    private ArrayList<String> authorOfBook = new ArrayList<>(); // авторы книг
    // идентификатор, показывающий,
    // взята ли книга
    private ArrayList<String> idBook = new ArrayList<>();

    Library(){

    }

    // Вывести книги, имеющиеся у библиотеки
    public ArrayList<String> getBooks(){
        return books;
    }

    // Вывести авторов книг
    public ArrayList<String> getAuthorOfBook(){
        return authorOfBook;
    }

    // Вывести идентификаторы книг
    public ArrayList<String> getIdBook(){
        return idBook;
    }

    /**
     * Добавляет книгу
     * в библиотеку
     * @param book
     */
    public void addBook(Book book){
        if (!books.contains(book.getNameBook())){
            books.add(book.getNameBook());
            authorOfBook.add(book.getAuthor());
            idBook.add("available");
        }
    }

    /**
     * Удаляет книгу
     * из библиотеки
     * @param book
     */
    public void deleteBook(Book book){
        if (books.contains(book.getNameBook()) &&
                idBook.get(books.indexOf(book.getNameBook())).equals("available")){
            authorOfBook.remove(books.indexOf(book.getNameBook()));
            idBook.remove(books.indexOf(book.getNameBook()));
            books.remove(book.getNameBook());
        }
    }

    /**
     * Возвращает книгу
     * по названию
     * @return
     */
    public String returnBook(String nameBook){
        if (books.contains(nameBook)){
            return nameBook + ". " +
                    authorOfBook.get(books.indexOf(nameBook));
        }
        return "Книга не найдена!";
    }

    /**
     * Возвращает книгу
     * по автору
     * @return
     */
    public String returnBookByAuthor(String author){
        ArrayList<String> bookByAuthor = new ArrayList<>();
        String result = "";

        for (int i = 0; i < authorOfBook.size(); i++) {
            if (authorOfBook.get(i).equals(author))
                bookByAuthor.add(books.get(i));
        }

        if (bookByAuthor.isEmpty()){
            return "Книг данного автора в библиотеке нет!";
        } else {
            for (int i = 0; i < bookByAuthor.size(); i++){
                if (i != bookByAuthor.size() - 1)
                    result += bookByAuthor.get(i) + ", ";
                else
                    result += bookByAuthor.get(i);
            }
        }
        return result;
    }

    /**
     * Отдает книгу
     * посетителю
     * @param book
     * @param visitor
     */
    public void giveBook(Book book, Visitor visitor){
        if (books.contains(book.getNameBook()) &&
                visitor.getId() == null &&
                idBook.get(books.indexOf(book.getNameBook())).equals("available")){
            visitor.setId(book.getNameBook());
            idBook.set(books.indexOf(book.getNameBook()), "unavailable");
        }
    }

    /**
     * Принимает назад
     * книгу от посетителя
     * @param visitor
     */
    public void returnBookFromVisitor(Visitor visitor){
        if (visitor.getId() != null && !visitor.getId().equals("no book")){
            idBook.set(books.indexOf(visitor.getId()), "available");
            visitor.setId("no book");
        }
    }
}
