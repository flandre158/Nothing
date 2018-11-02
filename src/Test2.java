class Person {
    private String name;
    private int age;
    private Book book;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

class Book {
    private String title;
    private double price;
    private Person person;

    public Book(String title, double price) {
        this.setTitle(title);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Person per = new Person("jojo",108);
        Book bk = new Book("dio",0);
        per.setBook(bk);
        bk.setPerson(per);
        System.out.println(per.getName()+per.getAge()+per.getBook().getTitle()+per.getBook().getPrice());
        System.out.println(per.getName()+per.getAge()+per.getBook().getTitle());
    }
}
