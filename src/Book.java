import java.util.Objects;
public class Book {
    private String bookName;
    private Author author;
    int publishingYear;
    public Book(String bookName, Author author, int publishingYear){
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getBookName(){
        return this.bookName;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
    public String toString(){
        return author +" "+ bookName + " " + publishingYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author) && Objects.equals(publishingYear, book.publishingYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishingYear);
    }


}