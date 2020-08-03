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
public class revenue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner val=new Scanner(System.in);
       float discount;
       System.out.println("Enter unit price:");
       float unitprice=val.nextFloat();
       System.out.println("Enter quantity:");
       int quantity=val.nextInt();
       if(quantity>120)
           discount=15;
       else if(quantity>=100 && quantity<=120)
           discount=10;
       else
           discount=0;
       double disamt=(unitprice*quantity*discount)/100;
       double revenue=(unitprice*quantity);
       System.out.println("The revenue from sale :"+revenue);
       System.out.println("The revenue from sale after discount :"+(revenue-disamt));
       System.out.println("After discount:"+disamt+"("+discount+"%)");
    }
    
}
