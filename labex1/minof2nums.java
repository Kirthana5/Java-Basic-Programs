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
public class minof2nums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner val=new Scanner(System.in);
          System.out.println("Enter two numbers:");
          int a=val.nextInt();
          int b=val.nextInt();
          System.out.println("Minimum of "+a+" and "+b+" is: "+((a<b)?a:b));
    }
    
}
