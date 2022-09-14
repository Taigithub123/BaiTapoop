package com.company.btjava.oop;

import java.util.Scanner;

public class Book extends Document{
    private String authorName;
    private int pageNumber;

    public Book(String idDocument, String publisher, int date, String authorName, int pageNumber) {
        super(idDocument, publisher, date);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }
public Book(){

}
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tên tác giả: ");
        this.authorName=scanner.nextLine();
        System.out.println("Số trang: ");
        this.pageNumber=scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
