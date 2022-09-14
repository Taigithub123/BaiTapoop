package com.company.btjava.oop;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class QuanLiThuVien {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Book> books = new ArrayList();
    public static List<Newspaper> newspapers = new ArrayList();
    public static List<Magazine> magazines = new ArrayList();

    public static void main(String[] args) {

        while (true) {
            menu();
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("1: Nhập thông tin sách: ");
                    System.out.println("2: Nhập thông tin tạp chí: ");
                    System.out.println("3: Nhập thông tin báo: ");
                    int loai = scanner.nextInt();
                    add(loai);
                    break;
                case 2:
                    System.out.println("1: Xóa thông tin sách: ");
                    System.out.println("2: Xóa thông tin tạp chí: ");
                    System.out.println("3: Xóa thông tin báo: ");
                    int loai2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập mã tài liệu");
                    String ma = scanner.nextLine();
                    delete(loai2, ma);
                    break;
                case 3:
                    System.out.println("1: Hiển thị thông tin sách: ");
                    System.out.println("2: Hiển thị thông tin tạp chí: ");
                    System.out.println("3: Hiển thị thông tin báo: ");
                    int loai1 = scanner.nextInt();
                    display(loai1);
                    break;
                case 4:
                    System.out.println("1: Tìm kiếm thông tin sách: ");
                    System.out.println("2: Tìm kiếm thông tin tạp chí: ");
                    System.out.println("3: Tìm kiếm thông tin báo: ");
                    loai = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap ma tai lieu");
                    String ma2 = scanner.nextLine();
                    findout(loai, ma2);
                default:
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("1: Nhập thông tin tài liệu");
        System.out.println("2: Xóa thông tin tài liệu");
        System.out.println("3: Hiển thị thông tin tài liệu");
        System.out.println("4: Tìm kiếm theo loại");
        System.out.println("5: Exit");
        System.out.println("Nhập lựa chọn của bạn: ");
    }

    public static void add(int loai) {
        switch (loai) {
            case 1:
                Book book = new Book();
                book.inputData();
                books.add(book);
                break;
            case 2:
                Magazine magazine = new Magazine();
                magazine.inputData();
                magazines.add(magazine);
                break;

            case 3:
                Newspaper newspaper = new Newspaper();
                newspaper.inputData();
                newspapers.add(newspaper);
                break;
        }
    }

    public static void display(int loai1) {
        switch (loai1) {
            case 1:
                for (Book book : books) {
                    System.out.println(book.toString());
                }
                break;

            case 2:
                for (Magazine magazine : magazines) {
                    System.out.println(magazine.toString());
                }
                break;
            case 3:
                for (Newspaper newspaper : newspapers) {
                    System.out.println(newspaper.toString());
                }
                break;
        }
    }

    public static void delete(int loai, String ma) {
        switch (loai) {
            case 1:
                for (Book book : books) {
                    if (book.getIdDocument().equals(ma)) {
                        boolean remove=books.remove(book);
                        if(remove)
                        System.out.println("xóa thành công: ");
                    }
                }
                break;

            case 2:
                for (Magazine magazine : magazines) {
                    if (magazine.getIdDocument().equals(ma)) {
                        boolean remove = magazines.remove(magazine);
                        if (remove)
                            System.out.println("xóa thành công: ");
                    }
                }
                break;
            case 3:
                for (Newspaper newspaper : newspapers) {
                    if (newspaper.getIdDocument().equals(ma)) {
                       boolean remove= newspapers.remove(newspaper);
                        if (remove)
                        System.out.println("xóa thành công: ");
                    }
                }
                break;
        }
    }

    public static void findout(int loai, String ma) {
        switch (loai) {
            case 1:

                for (Book book :
                        books) {
                    if (book.getIdDocument().equals(ma))
                        System.out.println(book.toString());
                    else
                        System.out.println("not found");
                }
                break;
            case 2:
                for (Magazine magazine :
                        magazines) {
                    if (magazine.getIdDocument().equals(ma))
                        System.out.println(magazine.toString());
                    else
                        System.out.println("not found");
                }
                break;
            default:
                for (Newspaper newspaper :
                        newspapers) {
                    if (newspaper.getIdDocument().equals(ma))
                        System.out.println(newspaper.toString());
                    else
                        System.out.println("not found");
                }
                break;
        }
    }

}
