package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_26 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, aux = 1, logaritmo = 0;
        double logaritmo2;
        boolean bandera;
        
        // PEDIR AL USUARIO LAS VARIABLES
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE N"));
                
                if (N < 2){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (230 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango.");
                    bandera = false;
                }
                
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido: "+ex.getMessage());
                bandera = false;
            }
        } while(bandera == false);
        
        // APROXIMACIÓN EXACTA
        logaritmo2 = Math.log(N) / Math.log(2);
        
        // APROXIMACIÓN ENTERA    
        while (aux < N){
            aux *= 2;
            logaritmo++;
        }
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, "APROXIMACIÓN EXACTA: " +logaritmo2);
        JOptionPane.showMessageDialog(null, "APROXIMACIÓN ENTERA: "+logaritmo);
    }
}