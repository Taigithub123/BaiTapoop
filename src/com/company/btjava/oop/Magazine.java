package com.company.btjava.oop;

import java.util.Scanner;

public class Magazine extends Document{
    private int releaseNumber;
    private int releaseMonth;


    public Magazine(String idDocument, String publisher, int date, int releaseNumber, int releaseMonth) {
        super(idDocument, publisher, date);
        this.releaseNumber = releaseNumber;
        this.releaseMonth = releaseMonth;
    }
public Magazine(){

}
    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Số phát hành: ");
        this.releaseNumber=scanner.nextInt();
        System.out.println("Tháng phát hành: ");
        this.releaseMonth=scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "releaseNumber=" + releaseNumber +
                ", releaseMonth=" + releaseMonth +
                '}';
    }
}
