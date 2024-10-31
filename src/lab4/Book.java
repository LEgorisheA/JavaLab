package lab4;

import javax.lang.model.type.NullType;
import java.lang.reflect.Type;
import java.util.Date;

public class Book {
    private String name;
    private String author;
    private Date deliveryDay;

    public Book() {
        name = "BookName";
        author = "BookAuthor";
        deliveryDay = new Date(2024, 11, 31);
    }

    public Book(Book book) {
        this.name = book.name;
        this.author = book.author;
        this.deliveryDay = book.deliveryDay;
    }

    public Book(String bookName, String bookAuthor, Date deliveryDate ) {
        name = bookName;
        author = bookAuthor;
        deliveryDay = deliveryDate;
    }

    public String name() {
        return name;
    }

    public String author() {
        return author;
    }

    public void setName(String bookName) {
        name = bookName;
    }

    public void deliveryDay(Date date) {
        deliveryDay = date;
    }

    public void setAuthor (String bookAuthor) {
        author = bookAuthor;
    }

    public void setDeliveryDay (Date date) {
        deliveryDay = date;
    }

    public boolean isExpired(Date deliveryDate) {
        return !(deliveryDate.after(this.deliveryDay)?true:false);
    }

    @Override
    public String toString() {
        return this.name + " автора " + this.author;
    }
}
