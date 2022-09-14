package com.company.lambda.instancemt;

public class StringConverter {
    public int convertToInt(String v1){
            return Integer.valueOf(v1);
        }
    public static void main(String[] args) {
        StringConverter stringConverter = new StringConverter();
        Deserializer des = stringConverter::convertToInt;
        System.out.println(des.deserialize("12"));
    }
    }