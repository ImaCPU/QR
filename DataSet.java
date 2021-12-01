
package mlr;

public class DataSet {
    double x,a,b,c;
    double sse, sst;
    double r2;
        
    double datos[][] = {
        {-3,7.5}, {-2,3}, {-1,0.5}, {0,1}, {1,3}, {2,6}, {3,14}
    };//Fin double tablaX
    
    
    /*
    double datos[][] = {
        {50,3.3}, {50,2.8}, {50,2.9}, 
        {70,2.3}, {70,2.6}, {70,2.1}, 
        {80,2.5}, {80,2.9}, {80,2.4}, 
        {90,3}, {90,3.1}, {90,2.8}, 
        {100,3.3}, {100,3.5}, {100,3}
    };//Fin double tablaX
    */
    
    public DataSet(){}
    
    public double[][] getMatrizX(){        
        return datos;
    }//Fin public double[][] getMatrix
    
    
    public void setX( double x){
        this.x = x;
    }
    
    public void setA( double a){
        this.a = a;
    }
    
    public void setB( double b){
        this.b = b;
    }
    
    public void setC( double c){
        this.c = c;
    }
    
    public void setSSE( double sse){
        this.sse = sse;
    }
    
    public void setSST( double sst){
        this.sst = sst;
    }
    
    public void setR2( double r2){
        this.r2 = r2;
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    
    public double getX(){
        return x;
    }
    
    public double getSST(){
        return sst;
    }
    
    public double getSSE(){
        return sse;
    }
    
    public double getR2(){
        return r2;
    }
    
}
