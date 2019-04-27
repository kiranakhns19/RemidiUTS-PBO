package com.modul;

public class CPU extends Komputer {
    private String nama;
    private int kecepatan;

   CPU (String nama, int kecepatan){
       this.nama = nama;
       this.kecepatan = kecepatan;
   }
    public String getCPUData(){
        return nama + " " + kecepatan + "GHz";
    }
}
