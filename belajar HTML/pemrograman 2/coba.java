/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pemrograman.pkg2;

import java.util.Scanner;

/**
 *
 * @author Mahasiswa
 */
public class p1_tplp008 {
    
    public static void main(String args[]) {
        String nama, nim, grade;
        double uts, uas, kehadiran, tugas, pres_kehadiran, n_akhir;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan data mahasiswa");
        System.out.print("NIM       : "); nim = input.next();
        System.out.print("Nama      : "); nama = input.next();
        System.out.print("Tugas     : "); tugas = input.nextDouble();
        System.out.print("UTS       : "); uts = input.nextDouble();
        System.out.print("UAS       : "); uas = input.nextDouble();
        System.out.print("Kehadiran : "); kehadiran = input.nextDouble();

        pres_kehadiran = kehadiran / 14 * 100;
        
//        System.out.print(pres_kehadiran);
        if(pres_kehadiran < 50){
            grade = "E";
        }else if(pres_kehadiran < 75){
            n_akhir = (tugas + uts + uas) / 3;
            
            if(n_akhir < 60){
                grade = "E";
            }else{
                grade = "D";
            }
        } else {
             n_akhir = (tugas + uts + uas) / 3;
            
            if(n_akhir < 60){
                grade = "E";
            }else if(n_akhir < 70){
                grade = "D";
            }else if(n_akhir < 80){
                grade = "c";
            }else if(n_akhir < 90){
                grade = "B";
            }else{
                grade = "A";
        }
        
        System.out.println("NIM\t Nama\t Tugas\t UTS\t UAS\t Kehadiran\t Nilai\t Grade");
        System.out.println(nim+" \t" + nama+" \t" + tugas + " \t" +uts + " \t" + pres_kehadiran + " \t" + n_akhir + " \t" + grade );
    }
}