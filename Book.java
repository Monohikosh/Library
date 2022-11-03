package HW3_Part2;

class Book {
    private String nameBook; // название книги
    private String author; // автор книги

    Book(String nameBook, String author){
        this.nameBook = nameBook;
        this.author = author;
    }

    // Вывести название книги
    public String getNameBook(){
        return nameBook;
    }

    // Вывести автора книги
    public String getAuthor(){
        return author;
    }
}
