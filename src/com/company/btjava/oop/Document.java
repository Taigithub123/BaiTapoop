package com.company.btjava.oop;

import java.util.Scanner;

public class Document {
    private String idDocument;
    private String Publisher;
    private int number;

    public Document(String idDocument, String publisher, int number) {
        this.idDocument = idDocument;
        Publisher = publisher;
        this.number = number;
    }
public Document(){

}
    public String getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
public void inputData(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Nhập vào mã tài liệu: ");
    this.idDocument=scanner.nextLine();
    System.out.println("nhập vào nhà phát hành: ");
    this.Publisher=scanner.nextLine();
    System.out.println("Nhập vào số bản phát hành: ");
    this.number=scanner.nextInt();
}

    @Override
    public String toString() {
        return "Document{" +
                "idDocument='" + idDocument + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", number=" + number +
                '}';
    }
}
