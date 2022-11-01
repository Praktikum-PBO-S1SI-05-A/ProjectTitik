/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum.pbo.projecttitik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author YASYKUR MF
 */
public class ProjectTitik {

    public static void main(String[] args) {
        
        Titik t1 = new Titik();
        Titik t2 = new Titik();       
        
        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            int pilihan;
            
            do {
                System.out.print
                    ("""
                    Menu Operasi Titik
                    1. Inisialisasi Titik
                    2. Tampil Titik
                    3. Perkalian Skalar Titik
                    4. Pencerminan Terhadap Sumbu X
                    5. Pencerminan Terhadap Sumbu Y
                    6. Jarak Antara Dua Titik
                    0. Keluar
                     
                    """);
                System.out.print("Masukkan Pilihan: ");
                pilihan = Integer.parseInt(br.readLine());
                System.out.println();
            
                switch (pilihan) {
                case 1:
                    System.out.println("Inisialisasi titik");
                    System.out.print("Masukkan nilai x: ");
                    double x = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan nilai y: ");
                    double y = Integer.parseInt(br.readLine());

                    t1.inisialisasiTitik(x, y);
                    break;

                case 2:
                    t1.tampilTitik();
                    break;

                case 3:
                    System.out.println("Perkalian Titik dengan Skalar");
                    System.out.print("Masukkan nilai skalar: ");
                    int skalar = Integer.parseInt(br.readLine());

                    t1.perkalianSkalar(skalar);
                    break;

                case 4:
                    System.out.println("Pencerminan Sumbu x");
                    t1.pencerminanSumbuX();
                    break;

                case 5:
                    System.out.println("Pencerminan Sumbu y");
                    t1.pencerminanSumbuY();
                    break;

                case 6:
                    System.out.println("Jarak Titik t1(x1, y1) dan t2(x2, y2)");
                    System.out.print("Masukkan nilai x2: ");
                    double x2 = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan nilai y2: ");
                    double y2 = Integer.parseInt(br.readLine());

                    t2.inisialisasiTitik(x2, y2);
                    System.out.println("Hasil: " + t1.jarak(t2));
                    break;
                }
                System.out.println();
                System.out.print("Tekan Enter untuk melanjutkan..");
                br.readLine();
                System.out.println();
            } while (pilihan != 0);
  
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
