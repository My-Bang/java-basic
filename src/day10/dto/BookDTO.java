package day10.dto;

public class BookDTO {
    public String title;
    public int price;
    public String company;
    public String author;
    public int page;
    public String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printBook(BookDTO book){
        System.out.println(this.title);
        System.out.println(this.price);
        System.out.println(this.company);
        System.out.println(this.author);
        System.out.println(this.page);
        System.out.println(this.isbn);
    }
}
