package com.company.finall;

public class FinalMethod {
    void sayHi() {
        System.out.println("hi");
    }

    public static class SubFinalMethod extends FinalMethod {
void sayHi(){

    System.out.println("hi tài");
}
    }

    public static void main(String[] args) {
        SubFinalMethod subFinalMethod=new SubFinalMethod();
        subFinalMethod.sayHi();
    }
}