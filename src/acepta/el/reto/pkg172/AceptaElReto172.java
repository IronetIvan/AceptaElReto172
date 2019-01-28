/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta.el.reto.pkg172;
import java.util.*;
/**
 *
 * @author Usuario DAM 1
 */
public class AceptaElReto172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Introduce numero de sillas: ");
          int sillas = sc.nextInt();
      
       while (sillas != 0){
         String sillitas = sc.nextLine();  
            boolean I = false;
            boolean D = false;
       for(int i = 0; i<sillitas.length(); i++){
           if(sillitas.charAt(i)== 'I'){
               I = true;
           }// if
           if (sillitas.charAt(i) == 'D'){
         
           D = true;
           }
           }// for
           if (I&&D){
               System.out.println("ALGUNO NO COME");
           }else{
               System.out.println("TODOS COMEN");
           }
           
       sillas = sc.nextInt();
       }// while
   }// main
}