/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pbo.projecttitik;

/**
 *
 * @author YASYKUR MF
 */
public class Titik {
    
    private double x, y;
    
    public Titik() {
        x = 0;
        y = 0;
    }
    
    public void inisialisasiTitik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void tampilTitik() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
    public void perkalianSkalar(double skalar) {
        x = x * skalar;
        y = y * skalar;
        System.out.println("Hasil");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
    public void pencerminanSumbuX() {
        y = -y;
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
    }
    
    public void pencerminanSumbuY() {
        x = -x;
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
    }
    
    public double jarak(Titik t2) {
        double a = Math.pow((t2.x - x), 2);
        double b = Math.pow((t2.y - y), 2);
        
        return (Math.sqrt(a + b));
    }
}
