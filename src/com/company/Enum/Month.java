package com.company.Enum;

public class Month {
    public enum Thang {
        January(31),
        February (29),
        March(31),
        April(30),
        May(31),
        June(30),
        July(31),
        August(31),
        September(30),
        October(31),
        November(30),
        December(31);

        private final int soNgay;
        Thang(int soNgay){
            this.soNgay = soNgay;
        }
        public int soNgay() {
            return soNgay;
        }
    }
}
