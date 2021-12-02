/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlr;

/**
 *
 * @author PC
 */
public class Interfaz{

   
   public void formula(DataSet DS){
        System.out.println("Formula: "+String.format("%.4f",DS.getA())+"+"+String.format("%.4f",DS.getB())+"x+"+String.format("%.6f",DS.getC())+"x²");
    }
    
   public void R2(DataSet DS){
       System.out.println("Presición: "+String.format("%.4f",DS.getR2()));
       //Exit();
   }
   
   
   public void printMatriz(double [][] x){
        for (int i=0; i<x.length;i++){
            //System.out.print("[");
             for(int j=0; j<x[0].length;j++){
                System.out.print(" "+String.format("%.0f",x[i][j])+" ");
                    }
             System.out.print("\n");
                }
        //System.out.print("]\n");
             }
    
   public void Print( double x){
       System.out.println(String.format("%.8f",x));
       //System.exit(0);
       
   }
   
}
