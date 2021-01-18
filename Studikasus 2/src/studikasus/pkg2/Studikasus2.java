/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus.pkg2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Studikasus2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        KartuKeluarga data=new KartuKeluarga();
        
        System.out.println("== INPUT DATA ==");
        data.input_anak();
        System.out.println("");
        System.out.println("Ayah masih hidup ?");
        System.out.println("'1' jika iya dan '2' jika tidak");
        int ayah = sc.nextInt();
        if(ayah == 1){
            data.input_ayah();
        }
        System.out.println("");
        System.out.println("IBU masih hidup ?");
        System.out.println("'1' jika iya dan '2' jika tidak");
        int ibu = sc.nextInt();
        if(ibu == 1){
            data.input_ibu();
        }
    }
    
}
