/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner; 
/**
 * Nama : Mufida Anggradita
 * NIM : 22166010
 * Kelas : Sistem Informasi
 * Semester 3
 * Mata Kuliah : Pemrogaman Berorientasi Objek 1
 * LATIHAN 56
 */
class BarangAntik {

    protected int umur;

    // Konstruktor BarangAntik
    public BarangAntik(int umur) {
        this.umur = umur;
    }

    // Metode tampilUmur untuk menampilkan umur
    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah: " + umur + " tahun.");
    }
}

// Kelas Radio yang merupakan turunan dari BarangAntik
class Radio extends BarangAntik {
    private String name;

    // Konstruktor Radio
    public Radio(int umur) {
        super(umur);
    }

    // Metode getter untuk mendapatkan nama
    public String getName() {
        return name;
    }

    // Metode setter untuk mengatur nama
    public void setName(String name) {
        this.name = name;
    }
}

// Kelas Main untuk menjalankan program
public class Lat56_radioAntik {
    public static void main(String[] args) {
        // Input umur barang antik dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan umur barang antik (dalam tahun): ");
        int umurBarangAntik = scanner.nextInt();

        // Membuat objek Radio
        Radio radioAntik = new Radio(umurBarangAntik);

        // Input nama radio dari pengguna
        System.out.print("Masukkan nama radio antik: ");
        scanner.nextLine(); // Membersihkan buffer
        String namaRadio = scanner.nextLine();
        radioAntik.setName(namaRadio);

        // Menampilkan informasi umur dan nama radio
        System.out.println("Nama barang antik: " + radioAntik.getName());
        radioAntik.tampilUmur();
    }
}
