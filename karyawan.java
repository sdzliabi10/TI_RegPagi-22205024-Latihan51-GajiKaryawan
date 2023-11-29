/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan51_Gaji_Karyawan;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi menghitung gaji karyawan
 */
public class karyawan {
    protected String nik;
    
    public String getNik() {
    return nik;
}
    public void setNik(String nik) {
        this.nik = nik;
    }
    protected String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    protected String jabatan;
    public String getJabatan(){
        return jabatan;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    protected int golongan;
    public int getGolongan(){
        return golongan;
    }
    public void setGolongan(int golongan){
        this.golongan =golongan;
    }
}

