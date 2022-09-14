package com.company.trycatch;

public class Hello {
    public static void main(String[] args) {
        try {
            chia2so(1,0);
        } catch (MyException e) {
            System.out.println(e.getError());
        }
    }
    public static void chia2so(int a, int b)throws MyException{
        try{
            int kq=a/b;
        }catch (Exception e){
            throw new MyException("lỗi chia cho ko");
        }
    }

}
