/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlr;


import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class QR extends Agent{
    
    @Override
   protected void setup (){
       System.out.println("Agent " + getLocalName() + " Started.");
       addBehaviour(new MyGenericBehaviour());
   }

    private static class MyGenericBehaviour extends Behaviour {

        @Override
        public void action() {
            DataSet DS = new DataSet();
            HelperArithmetic HA = new HelperArithmetic();
            Interfaz IN = new Interfaz();
            
            HA.QuadraticRegretion(DS);
            IN.formula(DS);
            HA.R2(DS);
            IN.R2(DS);
            
        }

        @Override
        public boolean done() {
            myAgent.doDelete();
            return false;
            
        }
    }
}


   /*
    private class MyGenericBehavior extends Behaviour{
           
           public void action() {
               
            DataSet DS = new DataSet();
            HelperArithmetic HA = new HelperArithmetic();HA.MatrizCR_A(DS);
            CRA.Determinante(HA.getMatrizCR(), 3);
            IN.printMatriz(HA.getMatrizCR());
            System.out.println(CRA.getDeterminante());
            Cramer CRA = new Cramer();
            Interfaz IN = new Interfaz();
            
            HA.MatrizCR_A(DS);
            CRA.Determinante(HA.getMatrizCR(), 3);
            IN.printMatriz(HA.getMatrizCR());
            System.out.println(CRA.getDeterminante());
            System.out.println("\n");
            
            
            HA.MatrizCR_A(DS);
            IN.printMatriz(HA.getMatrizCR());
            System.out.println(CRA.getDeterminante());
            
            HA.MatrizCR_B(DS);
            IN.printMatriz(HA.getMatrizCR());
            System.out.println(CRA.getDeterminante());
            
            HA.MatrizCR_C(DS);
            IN.printMatriz(HA.getMatrizCR());
            System.out.println(CRA.getDeterminante());
            
            
            //IN.printMatriz(DS.getMatrizX());
            //System.out.println(CRA.getDeterminante());
            //System.exit(0);
            
           }

           @Override
           public boolean done() {
               myAgent.doDelete();
               //return false;
               return false;
           }
    }
}   
   /*
   public class MyOneShotBehaviour extends OneShotBehaviour{

    @Override
        public void action(){
            DataSet DS = new DataSet();
            HelperArithmetic HA = new HelperArithmetic();
            Cramer CRA = new Cramer();
            Interfaz IN = new Interfaz();
            
            HA.MatrizCR(DS);
            CRA.Determinante(HA.getMatrizCR(), 3);
            System.out.println(CRA.getDeterminante());
            
            //IN.Print(CRA.getDeterminante());
            
        }
    
        @Override
        public int onEnd(){
            
            myAgent.doDelete();
            return super.onEnd();
        }
    }*/
/*
double x,a,b,c;
            
            DataSet DS = new DataSet();
            HelperArithmetic HA = new HelperArithmetic();
            Cramer CRA = new Cramer();
            Interfaz IN = new Interfaz();
            
            HA.MatrizQR(DS);
            CRA.Determinante(HA.getMatrizCR(), 3);
            //IN.printMatriz(HA.getMatrizCR());
            
            //yuhigjhgjhg
            x = CRA.getDeterminante();
            System.out.println(CRA.getDeterminante());
            
            HA.MatrizQR_A(DS);
            CRA.Determinante(HA.getMatrizCR_A(), 3);
            IN.printMatriz(HA.getMatrizCR_A());
            a = CRA.getDeterminante();
            System.out.println(CRA.getDeterminante());
            System.out.println("\n");
            
            HA.MatrizQR_B(DS);
            CRA.Determinante(HA.getMatrizCR_B(), 3);
            IN.printMatriz(HA.getMatrizCR_B());
            b = CRA.getDeterminante();
            System.out.println(CRA.getDeterminante());
            System.out.println("\n");
            
            HA.MatrizQR_C(DS);
            CRA.Determinante(HA.getMatrizCR_C(), 3);
            IN.printMatriz(HA.getMatrizCR_C());
            c = CRA.getDeterminante();
            System.out.println(CRA.getDeterminante());
            System.out.println("\n");
            
            System.out.println(a/x);
            System.out.println(b/x);
            System.out.println(c/x);

*/

/*
double matriz[][] = new double [3][3];
            matriz[0][0] = 15;
            matriz[0][1] = 1170;
            matriz[0][2] = 95700;
            
            matriz[1][0] = 1170;
            matriz[1][1] = 95700;
            matriz[1][2] = 8127000;
            
            matriz[2][0] = 95700;
            matriz[2][1] = 8127000;
            matriz[2][2] = 710490000;
            
            IN.printMatriz(matriz);
            HA.Determinante(matriz);
            System.out.println(HA.getDeterminante());

*/

//HA.SSE(DS);
            //System.out.println(DS.getSSE());
            //HA.SST(DS);
            //System.out.println(DS.getSST());
            //HA.R2(DS);
            //IN.Print(DS.getSSE());
            
            //HA.R2(DS);
            //IN.Print(DS.getR2());
            
            //IN.Print(DS.getSSE());
            //IN.Print(DS.getSST());
            
            
            
            //IN.Print(HA.SSE(DS));
            //IN.Print(HA.SST(DS));
            
            //HA.R2(DS);
            //IN.R2(DS);
            
            
            /*
            IN.printMatriz(HA.MatrizQR(DS));
            IN.Print(HA.Determinante(HA.getMatrizQR(), 3));
            System.out.println("");
            */
            
            /*
            IN.printMatriz(HA.getMatrizQR_A());
            IN.Print(HA.Determinante(HA.getMatrizQR_A(), 3));
            System.out.println("");
            
            IN.printMatriz(HA.getMatrizQR_B());
            IN.Print(HA.Determinante(HA.getMatrizQR_B(), 3));
            System.out.println("");
            
            IN.printMatriz(HA.getMatrizQR_C());
            IN.Print(HA.Determinante(HA.getMatrizQR_C(), 3));
            System.out.println("");
            */
            
            //HA.R2(DS);
            //IN.R2(DS);