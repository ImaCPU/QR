package mlr;

import static java.lang.Math.pow;

public class HelperArithmetic extends Cramer{
    
    Interfaz IN = new Interfaz();
    
    double matrizCR[][];
    private double[][] matrizQR_A;
    private double[][] matrizQR_B;
    private double[][] matrizQR_C;    
    
    public HelperArithmetic() {

    }

    public double[][] getMatrizQR(){
        return matrizCR;
    }   
    
    public double[][] getMatrizQR_A(){
        return matrizQR_A;
    }
    
    public double[][] getMatrizQR_B(){
        return matrizQR_B;
    }   
    
    public double[][] getMatrizQR_C(){
        return matrizQR_C;
    }  
        
    
    public double xPotenciax(double base, double exponente){
        double p = Math.pow(base,exponente);
        return p;
    }//Fin xPotenciax
    
    public double SumatoriaExp( double Vector[][], int exp){
        double suma=0;
        for (int i = 0; i <= Vector.length-1; i++){
            suma += xPotenciax(Vector[i][0],exp);
        }
        return suma;
    }//SumatoriaExp
    
    public double SumatoriaExp( double Vector[][], int exp, int column){
        double suma=0;
        for (int i = 0; i <= Vector.length-1; i++){
            suma += xPotenciax(Vector[i][column],exp);
        }
        return suma;
    }//SumatoriaExp
        
    public double SumatoriaExpPorY( double Vector[][], int exp){
        double suma=0;
        for (int i = 0; i <= Vector.length-1; i++){
            suma += xPotenciax(Vector[i][0],exp) * Vector[i][1];
        }
        return suma;
    }
    
    public double[][] MatrizQR(DataSet DS){
        double M[][] = DS.getMatrizX();
        double matriz[][] = new double [3][3];
        
        matriz[0][0] = M.length;
        matriz[0][1] = SumatoriaExp(M,1);
        matriz[0][2] = SumatoriaExp(M,2);
        
        matriz[1][0] = SumatoriaExp(M,1);
        matriz[1][1] = SumatoriaExp(M,2);
        matriz[1][2] = SumatoriaExp(M,3);
        
        matriz[2][0] = SumatoriaExp(M,2);
        matriz[2][1] = SumatoriaExp(M,3);
        matriz[2][2] = SumatoriaExp(M,4);

        matrizCR = matriz;
        
        return matriz;
    }//Fin MatrizCR
    
    public double[][] MatrizQR_A(DataSet DS){
        double M[][] = DS.getMatrizX();
        double matriz[][] = new double [3][3];
        
        matriz[0][0] = SumatoriaExpPorY(M,0);
        matriz[0][1] = SumatoriaExp(M,1);
        matriz[0][2] = SumatoriaExp(M,2);
        
        matriz[1][0] = SumatoriaExpPorY(M,1);
        matriz[1][1] = SumatoriaExp(M,2);
        matriz[1][2] = SumatoriaExp(M,3);
        
        matriz[2][0] = SumatoriaExpPorY(M,2);
        matriz[2][1] = SumatoriaExp(M,3);
        matriz[2][2] = SumatoriaExp(M,4);
        
        matrizQR_A = matriz;
        
        return matriz;
    }//Fin Matriz A
    
    public double[][] MatrizQR_B(DataSet DS){
        double M[][] = DS.getMatrizX();
        double matriz[][] = new double [3][3];
        
        matriz[0][0] = M.length;
        matriz[0][1] = SumatoriaExpPorY(M,0);
        matriz[0][2] = SumatoriaExp(M,2);
        
        matriz[1][0] = SumatoriaExp(M,1);
        matriz[1][1] = SumatoriaExpPorY(M,1);
        matriz[1][2] = SumatoriaExp(M,3);
        
        matriz[2][0] = SumatoriaExp(M,2);
        matriz[2][1] = SumatoriaExpPorY(M,2);
        matriz[2][2] = SumatoriaExp(M,4);
        
        matrizQR_B = matriz;
        
        return matriz;
    }//Fin Matriz B
    
    public double[][] MatrizQR_C(DataSet DS){
        double M[][] = DS.getMatrizX();
        double matriz[][] = new double [3][3];
        
        matriz[0][0] = M.length;
        matriz[0][1] = SumatoriaExp(M,1);
        matriz[0][2] = SumatoriaExpPorY(M,0);
        
        matriz[1][0] = SumatoriaExp(M,1);
        matriz[1][1] = SumatoriaExp(M,2);
        matriz[1][2] = SumatoriaExpPorY(M,1);
        
        matriz[2][0] = SumatoriaExp(M,2);
        matriz[2][1] = SumatoriaExp(M,3);
        matriz[2][2] = SumatoriaExpPorY(M,2);
        
        matrizQR_C = matriz;
        
        return matriz;
    }//Fin Matriz C
    
    public void QuadraticRegretion(DataSet DS){
       DS.setX(Determinante(MatrizQR(DS)));
       DS.setA(Determinante(MatrizQR_A(DS)));
       DS.setB(Determinante(MatrizQR_B(DS)));
       DS.setC(Determinante(MatrizQR_C(DS)));
       
       DS.setA(DS.getA()/DS.getX());
       DS.setB(DS.getB()/DS.getX());
       DS.setC(DS.getC()/DS.getX());

    }
    
    public void SSE(DataSet DS){
        double M[][] = DS.getMatrizX();
        float suma=0;
        double f1,f2,f3,f4 = DS.getA();
        //System.out.println(DS.getC());
        for (int i = 0; i < M.length; i++){
            
            f1 = M[i][1];
            f2 = DS.getC()*pow(M[i][0],2);
            f3 = DS.getB()*M[i][0];
            //System.out.println(pow(f1 - f2 - f3 - f4, 2));
            suma = (float) (pow(f1 -1*( f2+ f3 +f4), 2) + suma);
            
            //suma += pow(  M[i][1] - DS.getA()*pow(M[i][0],2) - DS.getB()*M[i][0] - DS.getC(), 2);
        }
        DS.setSSE(suma);
        //System.out.println(String.format("%.3f", suma));
        //return suma;
    }
    
    public void SST(DataSet DS){
        double M[][] = DS.getMatrizX();
        double suma=0;
        double media = SumatoriaExp(M,1,1)/ M.length;
        //System.out.println(media);
        for (int i = 0; i < M.length; i++){
            suma =  Math.pow(M[i][1] - media,2) + suma;
        }
        DS.setSST(suma);
        //return suma;
    }
    
    public void R2(DataSet DS){
        SSE(DS);
        SST(DS);
        double sse= DS.getSSE();
        double sst= DS.getSST();
        //System.out.println(sse/sst);
        //System.out.println(1 - sse/sst);
        DS.setR2(1-(sse/sst));
    }
    
}


/*
        matriz[0][0] = SumatoriaExp(M,4);
        
        matriz[0][1] = SumatoriaExp(M,3);
        matriz[1][0] = SumatoriaExp(M,3);
        
        matriz[0][2] = SumatoriaExp(M,2);
        matriz[1][1] = SumatoriaExp(M,2);
        matriz[2][0] = SumatoriaExp(M,2);
        
        matriz[1][2] = SumatoriaExp(M,1);
        matriz[2][1] = SumatoriaExp(M,1);
        
        matriz[2][2] = M.length;
        */


            //suma+= (DS.getA()*Math.pow(M[i][0],2));
            //suma += pow(  M[i][1] - DS.getA()*pow(M[i][0],2) - DS.getB()*M[i][0] - DS.getC(), 2);
            //System.out.println (Math.pow(  M[i][1] - DS.getA()*Math.pow(M[i][0],2) - DS.getB()*M[i][0] - DS.getC(), 2));
            
            //System.out.println (Math.pow(  M[i][1] - DS.getA()*Math.pow(M[i][0],2) - DS.getB()*M[i][0] - DS.getC(), 2));
            //System.out.println(DS.getB()*M[i][0]);
            //System.out.println(DS.getA()*Math.pow(M[i][0],2));
            //System.out.println(Math.pow(M[i][0],2));
            //System.out.println(M[i][1]);
            
            //