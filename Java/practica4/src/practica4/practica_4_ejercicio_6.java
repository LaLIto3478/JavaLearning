package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_6 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int M = 0, N = 0, aux = 0;
        String salida = "";
        boolean bandera;
        
        // PEDIR VARIABLES Y VALIDAR QUE SEAN ENTEROS
        do{
            bandera = true;
            try{
                M = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas de su matriz"));
                if (M < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango en filas");
                    bandera = false;
                }
                if (100 < M){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango en filas");
                    bandera = false;
                }
                
                N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas"));
                if (N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango en columnas");
                    bandera = false;
                }
                if (100 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango en columnas");
                    bandera = false;
                }               
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Dimensiones NO válidas");
                bandera = false;
            }
        }while(bandera == false);
     
        
        // PROCESAMIENTO
        int A[][] = new int[M][N];
        
        // LLENAR EL ARREGLO
        for (int i = 0 ; i < M ; i++){
            for (int j = 0 ; j < N ; j++){
                do{
                    bandera = true;
                    try{
                        A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
                        if (A[i][j] < -100){
                            JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                            bandera = false;
                        }
                        if (100 < A[i][j]){
                            JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                            bandera = false;
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                        bandera = false;
                    }
                }while(bandera == false);
            }
        }   
        // ORDENAR MATRIZ
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < (M - 1) ; j++){
                for(int k = 0 ; k < (M - 1) ; k++){
                    if(A[k][i] > A[k+1][i]){
                        aux = A[k][i];
                        A[k][i] = A[k+1][i];
                        A[k+1][i] = aux;
                    }
                }
            }
        }
        //IMPRIMIR EN PANTALLA
        for(int i = 0 ; i < M ; i++){
            for(int j = 0 ; j < N ; j++){
                salida+= A[i][j]+" ";
            }
            salida += "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
