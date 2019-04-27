package com.modul;

public class Komputer {
    public CPU cpu;

    Komputer(CPU cpu){
        this.cpu = cpu;
    }

    Komputer(){}

    public void memasang(CPU amd1) {
        this.cpu = cpu;
        System.out.println("CPU : " + this.cpu.getCPUData() + "dipasang");
    }

    public void mencabut(CPU intel1){
        System.out.println("CPU : " + this.cpu.getCPUData() +  "dicabut");
        this.cpu = null;
    }

    public void cetakInfo(){
        System.out.println("Spesifikasi : " + this.cpu.getCPUData());
    }
}
