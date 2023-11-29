/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan51_Gaji_Karyawan;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi menghitung gaji karyawan
 */
public class PBO_22205024_Latihan51_GajiKaryawan {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        manager manager = new manager();
        
        System.out.println("======Program perhitungan gaji karyawan");
        System.out.print("Masukan NIK : ");
        manager.setNik(scanner.nextLine());
        System.out.print("Masukan Nama : ");
        manager.setNama(scanner.nextLine());
        System.out.print("Masukan Golongan(1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        System.out.print("Masukan Jabatan (manager/kabag) : ");
        manager.setJabatan(scanner.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        
        System.out.println("======Hasil perhitungan");
        System.out.println("NIK : " + manager.getNik());
        System.out.println("NAMA : " + manager.getNama());
        System.out.println("GOLONGAN : " + manager.getGolongan());
        System.out.println("JABATAN : " + manager.getJabatan());
        
        System.out.println("Tunjangan Golongan : " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("Tunjangan Jabatan : " + manager.tunjanganJabatan(manager.jabatan));
        System.out.println("Tunjangan Kehadiran : " + manager.tunjangankehadiran(manager.getKehadiran()));
        
        System.out.println("Gaji Total : " + manager.totalGaji());
}
}