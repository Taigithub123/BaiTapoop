package com.company.trycatch;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResources1 {
    public static void main(String[] args) {
        // su dung try-with-resources
        // su dung nhieu resources
        try (FileOutputStream fos = new FileOutputStream("message2.txt");
             InputStream is = new FileInputStream("message2.txt")) {
            // ghi data vao file
            String msg = "Welcome to VietTuts.Vn!";
            byte byteArray[] = msg.getBytes();
            fos.write(byteArray);
            System.out.println("-------Data da duoc ghi vao file---------");
            System.out.println(msg);
            // doc data tu file da ghi
            DataInputStream inst = new DataInputStream(is);
            int data = is.available();
            byte[] byteArray2 = new byte[data]; //
            inst.read(byteArray2);
            String str = new String(byteArray2);
            System.out.println("-------Data read from file---------");
            System.out.println(str);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
