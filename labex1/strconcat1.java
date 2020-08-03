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
public class strconcat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str,concatstr="\0";
        System.out.println("String concatenation:");
        System.out.println("Enter the number of strings:");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter string  "+(i+1)+":");
            str=obj.next();
            concatstr=concatstr+" "+str;
        }
        System.out.println("Concatenated strings:\n"+concatstr);
    }
    
}
