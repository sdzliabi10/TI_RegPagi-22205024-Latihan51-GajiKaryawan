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
  public class manager extends karyawan{
        private int kehadiran;
        private float tunjanganGolongan;
        private float tunjanganJabatan;
        private float tunjanganKehadiran;
        
        public int getKehadiran(){
            return kehadiran;
        }
        public void setKehadiran(int kehadiran){
            this.kehadiran = kehadiran;
        }
        public float tunjangankehadiran(int hadir){
            tunjanganKehadiran = kehadiran * 10000;
            return tunjanganKehadiran;
        }
        
        public float tunjanganGolongan(int golongan){
            if (golongan == 1) {
                tunjanganGolongan =500000;
            }else if (golongan == 2){
                tunjanganGolongan = 1000000;
            } else if (golongan == 3){
                tunjanganGolongan = 1500000;
            } else {
                tunjanganGolongan = 0;
            }
            return tunjanganGolongan;
        }
        
        public float tunjanganJabatan(String jabatan){
            if (jabatan.equals("manager")){
                tunjanganJabatan = 2000000;
            }else if(jabatan.equals("Kabag")){
                tunjanganJabatan = 1000000;
            } else {
                tunjanganJabatan = 0;
            }
            return tunjanganJabatan;
        }
        
        public float totalGaji(){
        return tunjanganKehadiran + tunjanganGolongan + tunjanganJabatan;
  }
}
