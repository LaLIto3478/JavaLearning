package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_4 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int M = 0, N = 0, aux = 1;
        boolean bandera, sucesion = true;
        String matriz = "";
        
        // PEDIR AL USUARIO LAS VARIABLES
        do{
            bandera = true;
            try{
                M = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE M"));
                if (M >= 20){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (M < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE N"));
                if (N >= 20){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }                               
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }
        }while(bandera == false);
        
        // PROCESAMIENTO
        int serpentina[][] = new int[M][N];
        
        for(int i = 0 ; i < M ; i++){
            if (sucesion == true){
                sucesion = false;
                for (int j = 0 ; j < N ; j++){
                    serpentina[i][j] = aux;
                    aux++;                    
                }
            }
            else{ 
                sucesion = true;
                for (int j = N - 1 ; j >= 0 ; j--){
                    serpentina[i][j] = aux;
                    aux++;                    
                }
            }
        }
        // IMPRIMIR EN PANTALLA
        for (int i = 0 ; i < M ; i++){
            for (int j = 0 ; j < N ; j++){
                matriz += serpentina[i][j]+" ";
            }
            matriz += "\n";
        }
        JOptionPane.showMessageDialog(null, matriz);
    }
}
