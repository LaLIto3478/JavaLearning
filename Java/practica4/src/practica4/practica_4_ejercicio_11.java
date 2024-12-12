package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_11 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int F = 0, C = 0;
        boolean bandera;
        String salida = "";
        
        // PEDIR LOS VALORES DE F Y C
        do{
            bandera = true;
            try{
                F = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de F"));
                if(F < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }else if(50 < F){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                
                C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de C"));
                if(C < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }else if(50 < C){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }                
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }
        }while(bandera == false);
        
        // CREAR EL ARREGLO
        int arreglo[][] = new int[F][C];
        
        // LLENAR EL ARREGLO
        for(int i = 0 ; i < F ; i++){
            for(int j = 0 ; j < C ; j++){
                do{
                    bandera = true;
                    try{
                        arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                        bandera = false;
                    }
                }while(bandera == false);
            }
        }
        
        // MATRIZ TRASPUESTA
        for(int i = 0 ; i < C ; i++){
            for(int j = 0 ; j < F ; j++){
                salida += arreglo[j][i]+" ";
            }
            salida += "\n";
        }
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, salida);
    }
}
