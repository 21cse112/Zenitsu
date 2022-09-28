/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expt6java;
import java.util.Scanner;

/**
 *
 * @author kathier K
 */
public class Expt6java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of apartments:");
        n=sc.nextInt();
        apartment obj[]=new apartment[n];      
        String address[]=new String[n];
        String apt_no[]=new String[n];
        int beds[]=new int[n];
        double rent[]=new double[n];
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter address of the apartment"+(i+1)+":");
        address[i]=sc.next();
        System.out.println("Enter no of the apartment"+(i+1)+":");
        apt_no[i]=sc.next();
        System.out.println("Enter bed countof the apartment"+(i+1)+":");
        beds[i]=sc.nextInt();
        System.out.println("Enter rent of the apartment"+(i+1)+":");
        rent[i]=sc.nextDouble();
        obj[i]=new apartment(address[i],apt_no[i],beds[i],rent[i]);
        }
        for(int i=0;i<n;i++)
        {
        obj[i].AptNoError();
        obj[i].BedsError();
        obj[i].RentError();
    }
}
}




