package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_28 {

    public static void main(String[] args) {
        //PROCESAMIENTO
        int N = 0, sumatoria = 0, aux = 0;
        boolean bandera;
        
        // PEDIR AL USUARIO EL VALOR DE N
        do {
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero N"));
                if (N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (1000000 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido.");
                bandera = false;
            }
        }while(bandera == false);
        
        //PROCESAMIENTO
        int i = -1;
        do{
            i++;
            aux = (int) ((int) N/(Math.pow(2, i)));
            sumatoria += aux;
        }while(aux != 0);
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, sumatoria);
    }
}