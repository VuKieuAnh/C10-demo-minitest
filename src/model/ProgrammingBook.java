package model;

public class ProgrammingBook extends Book {
    private String language;

    public ProgrammingBook(String language) {
        this.language = language;
    }

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
