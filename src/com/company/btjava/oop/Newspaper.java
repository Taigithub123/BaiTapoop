package com.company.btjava.oop;

import java.util.Scanner;

public class Newspaper extends Document{
    private int releaseDate;

    public Newspaper(String idDocument, String publisher, int date, int releaseDate) {
        super(idDocument, publisher, date);
        this.releaseDate = releaseDate;
    }
public Newspaper(){

}

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ngày phát hành: ");
        this.releaseDate=scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "releaseDate=" + releaseDate +
                '}';
    }
}
