/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengolahandata;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class array {
         private ArrayList<String>  nim     = new ArrayList();
        private ArrayList<String>  nama     = new ArrayList();
        private ArrayList<String>  tglLahir = new ArrayList();
        private ArrayList<Integer> gender   = new ArrayList();

    Scanner input = new Scanner(System.in);
    
    void menu(){
        OUTER:
        while (true) {
            System.out.println(">>>>>Pengolahan Data Mahasiswa<<<<<");
            System.out.println("Menu : ");
            System.out.println("a. Tambah Data ");
            System.out.println("b. Hapus Data ");
            System.out.println("c. Cari Data ");
            System.out.println("d. Tampil Data ");
            System.out.println("e. Keluar ");
            System.out.print("Pilih menu : ");
            String menu = input.next();
            switch (menu) {
                case "a":
                    {
                        System.out.println(">Tambah data<");
                        System.out.println("Masukkan data yang akan ditambahkan");
                        System.out.print("Nama          : ");
                        String name = input.next();
                        System.out.print("NIM           : ");
                        String nomor = input.next();
                        System.out.print("Tanggal lahir : ");
                        String tgl = input.next();
                        System.out.print("Gender (0: Laki-laki atau 1: Perempuan)  : ");
                                int gdr = input.nextInt();
                                nama.add(name);
                                nim.add(nomor);
                                tglLahir.add(tgl);
                                gender.add(gdr);
                                System.out.println("Telah ditambahkan");
                                break;
                    }
                case "b":
                    {
                        System.out.println(">Hapus Data<");
                        System.out.println("Masukkan NIM yang akan dihapus");
                        System.out.print("NIM : ");
                        String nomor = input.next();
                                int index = Collections.binarySearch(nim, nomor);
                                nama.remove(index);
                                nim.remove(index);
                                tglLahir.remove(index);
                                gender.remove(index);
                                System.out.println("Telah dihapus");
                                break;
                    }
                    
                case "c":
                    System.out.println(">Cari Data<");
                    System.out.println("1.Cari data berdasarkan Gender");
                    System.out.println("2.Cari data berdasarkan NIM");
                    System.out.print("Pilih : ");
                    int pilihan = input.nextInt();
                    if (pilihan == 1){
                        System.out.println(">Berdasarkan Gender<");
                        System.out.print("Pilih Gender (0 / 1) : ");
                        int gend = input.nextInt();
                        
                        for ( int i = 0; i < nama.size(); i++) {
                            if (gender.get(i) == 0){
                                System.out.println("Nama          : " + nama.get(i));
                                System.out.println("NIM           : " + nim.get(i));
                                System.out.println("Tanggal Lahir : " + tglLahir.get(i));
                                System.out.println("Gender        : " + gender.get(i));
                               
                            } else if (gender.get(i) == 1){
                                System.out.println("Nama          : " + nama.get(i));
                                System.out.println("NIM           : " + nim.get(i));
                                System.out.println("Tanggal Lahir : " + tglLahir.get(i));
                                System.out.println("Gender        : " + gender.get(i));
                            
                            }
                        }
                    } else if (pilihan == 2){
                        System.out.println(">Berdasarkan NIM<");
                        System.out.print("Masukkan NIM : ");
                        String nomor = input.next();
                        
                        int index = Collections.binarySearch(nim, nomor);
                        String cariNama = nama.get(index);
                        String cariNIM = nim.get(index);
                        String caritanggal = tglLahir.get(index);
                        int cariGender = gender.get(index);
                        
                        System.out.println("Nama            : " + cariNama);
                        System.out.println("NIM             : " + cariNIM);
                        System.out.println("Tanggal Lahir   : " + caritanggal);
                        System.out.println("Gender          : " + cariGender);
                    }   break;
                    
                case "d":
                    System.out.println(">Tampilkan Data<");
                    for ( int i = 0; i < nama.size(); i++) {
                        System.out.println("Nama            : " + nama.get(i));
                        System.out.println("NIM             : " + nim.get(i));
                        System.out.println("Tanggal Lahir   : " + tglLahir.get(i));
                        System.out.println("Gender          : " + gender.get(i));
                       
                    }   System.out.println("Jumlah Data Mahasiswa : " + nama.size());
                    
                case "e":
                    break OUTER;
                
            }
        }
    }

}
