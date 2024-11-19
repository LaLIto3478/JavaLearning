package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_21 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int exponenciaciones = 0, N = 0;
        boolean bandera;
        
        // PEDIR NÚMERO N
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU NÚMERO N"+"\nNOTA: Su entero debe estar en el rango 2 <= N <= 1000000"));
                
                if (N < 2){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (N > 1000000){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido "+ex.getMessage());
                bandera = false;
            }
        }while(bandera == false);
        
        // PROCESAMIENTO
        while (N < 30000){
            N = (int) Math.pow(N, 2);
            exponenciaciones++;
        }
        
        // IMPRIMIR RESULTADOS
        JOptionPane.showMessageDialog(null, N + " " + exponenciaciones);
    }
}
