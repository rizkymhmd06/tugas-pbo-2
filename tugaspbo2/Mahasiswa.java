/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo2;

/**
 *Tugas :
 *buat class bebas dengan isi atribut dan method,
  ada method dengan nilai dan tanpa nilai balik,
  buat 2 constructor,
  pada class main buat 2 object dari masing masing constructor,

 * @author Banjarmasin123
 */
public class Mahasiswa {
        // ── Atribut ─────────────────────────────────────
    private String  nama;    
    private String  npm;    
    private int     umur;   
    private double  ipk;     
    private String  jurusan; 

    // ── Constructor 1 (tanpa parameter) ─────────────
    public Mahasiswa() {                  
        nama    = "Muhammad Rizky";
        npm     = "2410010226";
        umur    = 20;
        ipk     = 3.9;
        jurusan = "Teknik Informatika";
    }

    // ── Constructor 2 (dengan parameter) ────────────
    public Mahasiswa(String nama, String nim,    
                     int umur, double ipk,
                     String jurusan) {
        this.nama    = nama;
        this.npm     = nim;
        this.umur    = umur;
        this.ipk     = ipk;
        this.jurusan = jurusan;
    }

    // ── Method TANPA nilai balik (void) ──────────────
    public void tampilkanInfo() {              
        System.out.println("===== Data Mahasiswa =====");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + npm);
        System.out.println("Umur    : " + umur + " tahun");
        System.out.println("IPK     : " + ipk);
        System.out.println("Jurusan : " + jurusan);
    }

    public void ubahIPK(double ipkBaru) {      
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui.");
        } else {
            System.out.println("IPK tidak valid!");
        }
    }

    // ── Method DENGAN nilai balik ─────────────────────
    public String getPredikat() {             
        if      (ipk >= 3.5) return "Cumlaude";
        else if (ipk >= 3.0) return "Sangat Memuaskan";
        else if (ipk >= 2.5) return "Memuaskan";
        else                   return "Cukup";
    }

    public boolean isLulus() {                
        return ipk >= 2.0;
    }

    public String getNama()    { return nama; }   
    public String getNim()     { return npm; }    
    public double getIPK()     { return ipk; }    
    public String getJurusan() { return jurusan; } 
}

