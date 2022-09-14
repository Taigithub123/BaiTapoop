package com.company.trycatch;

import java.io.*;
import java.util.Scanner;

public class TryWithResources2 {
    public static void main(String[] args)throws IOException {
//        String line;
//        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
//            while ((line = br.readLine()) != null) {
//                System.out.println("Line =>"+line);
//            }
//        } catch (IOException e) {
//            System.out.println("IOException in try block =>" + e.getMessage());
//        }
//        mutilphite resources
        try (Scanner scanner = new Scanner(new File("input.txt"));
             PrintWriter writer = new PrintWriter(new File("out.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
    }
}
