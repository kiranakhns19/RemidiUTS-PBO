package com.modul;

public class Rakitan {

    public static void main(String[] args) {
    Komputer komputer1 = new Komputer();
    CPU intel1 = new Intel(2);
    CPU amd1 = new AMD(3);

	komputer1.cetakInfo();
	komputer1.mencabut(intel1);
	komputer1.memasang(amd1);
	komputer1.cetakInfo();
    }
}