package model;

public abstract class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int price;

    public Book() {
    }

    public Book(int id, String title, String author, String publisher, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
