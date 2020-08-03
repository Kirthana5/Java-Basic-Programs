/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex1;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class sumofoddandeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int i,odd=0,even=0;
        int a[]=new int[10];
        System.out.println("Enter size of an array:");
        int n=val.nextInt();
        System.out.println("Enter array elements:\n");
        for(i=0;i<n;i++)
        {
            a[i]=val.nextInt();
            if(a[i]%2!=0)
                odd+=a[i];
            else
                even+=a[i];
        }
        System.out.println("Array:");
        for(i=0;i<n;i++)
        {
            System.out.print(""+a[i]+" ");
        }
        System.out.println("\nSum of odd numbers in the array: "+odd+"\nSum of even numbers in the array: "+even);
        
    }
    
}
