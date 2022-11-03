package HW3_Part2;

class Visitor {
    private String nameVisitor; // имя посетителя
    // идентификатор, проверяющий,
    // взял ли книгу посетитель
    private String id;

    Visitor(String nameVisitor){
        this.nameVisitor = nameVisitor;
        this.id = null;
    }

    // Вывести имя посетителя
    public String getNameVisitor(){
        return nameVisitor;
    }

    // Вывести идентификатор
    public String getId(){
        return id;
    }

    // Задать идентификатор
    public void setId(String id){
        this.id = id;
    }
}
