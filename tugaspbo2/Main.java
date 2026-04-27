/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class Main {

    public static void main(String[] args) {

        // ── Object dari Constructor 1 (default) ─────────
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        // Set data mhs1 via method void ubahIPK
        mhs1.ubahIPK(2.8);

        mhs1.tampilkanInfo();   // method void
        System.out.println("Predikat : " + mhs1.getPredikat());
        System.out.println("Status   : " + (mhs1.isLulus() ? "Lulus" : "Tidak Lulus"));

        System.out.println();

        mhs2.tampilkanInfo();
        System.out.println("Status   : " + (mhs2.isLulus() ? "Lulus" : "Tidak Lulus"));

        System.out.println("\n============================\n");

        // ── Object dari Constructor 2 (berparameter) ────
        Mahasiswa mhs3 = new Mahasiswa(
            "Andi Pratama", "2301001",
            20, 3.75, "Teknik Informatika"
        );
        Mahasiswa mhs4 = new Mahasiswa(
            "Sari Dewi", "2301002",
            21, 3.10, "Sistem Informasi"
        );

        mhs3.tampilkanInfo();   // method void
        System.out.println("Predikat : " + mhs3.getPredikat());
        System.out.println("Status   : " + (mhs3.isLulus() ? "Lulus" : "Tidak Lulus"));

        System.out.println();

        mhs4.tampilkanInfo();
        System.out.println("Predikat : " + mhs4.getPredikat());
        System.out.println("Status   : " + (mhs4.isLulus() ? "Lulus" : "Tidak Lulus"));
    }
}

