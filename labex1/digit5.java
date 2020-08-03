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
public class digit5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int temp,count=0,dig;
        System.out.println("Enter value of n:");
        int n=val.nextInt();
        System.out.println("Numbers from 1 to "+n+":");
        for(int i=1;i<=n;i++)
        {
            temp=i;
            while(temp!=0)
            {
                dig=temp%10;
                if(dig==5)
                {
                    count++;
                    break;
                }
                temp/=10;
                
            }
            
        }
        System.out.println("Numbers that have '5' as a digit: "+count);
    }
    
}
