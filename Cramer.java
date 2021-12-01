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
public class Cramer {
    
    // privadas de Crammer
    double determi;
    
    
    int registrosX;
    
    public double getDeterminante(){
        return determi;
    }
    
    public double Determinante(double matriz[][]){
        determi =
                ( matriz[0][0] * matriz[1][1] * matriz[2][2] ) + 
                ( matriz[0][1] * matriz[1][2] * matriz[2][0] ) + 
                ( matriz[0][2] * matriz[1][0] * matriz[2][1] ) -
                ( matriz[0][2] * matriz[1][1] * matriz[2][0] ) - 
                ( matriz[0][0] * matriz[1][2] * matriz[2][1] ) - 
                ( matriz[0][1] * matriz[1][0] * matriz[2][2] );
        return determi;
    }
  
}

/*
    public int Determinante(double matriz[][], int n){
        int Determinante =0;
        if ( n == 1){
            determi = Determinante;
            return (int) matriz[0][0];
        }
        double temp[][] = new double [n][n];
        int multiplicador = 1;
        for (int f = 0; f < n; f++){
            obtenerCofactor(matriz, temp, 0, f,n);
            Determinante += multiplicador  * matriz[0][f] * Determinante(temp, n-1);
            multiplicador = -multiplicador;
        }
        determi = Determinante;
        return Determinante;
    }
    
    public void obtenerCofactor(double matriz[][], double temp[][], int p, int q, int n){
        int i = 0, j=0;
        for (int fila = 0; fila < n; fila++){
            for (int column = 0; column < n ; column ++){
                if (fila != p && column != q){
                    temp[i][j++] = matriz[fila][column];
                    if (j == n -1){
                        j=0;
                        i++;
                    }
                }
            }
        }
    }//Termina cofactor
}
*/