package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_25 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, aux = 0;
        boolean bandera;
        String piramide = "";
        // PEDIR AL USUARIO LA ALTURA DE LA PIRAMIDE
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA ALTURA DE SU PIRÁMIMDE"));
                
                if (N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango.");
                    bandera = false;
                }
                if (100 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango.");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido: "+ex.getMessage());
                bandera = false;
            }
        }while(bandera == false);
        
        //PROCESAMIENTO
        for (int i = 0 ; i < N  ; i++){
            if (i < N - 1){
                for (int j = 0 ; j < (N - (i + 1)) ; j++){
                    piramide += " ";
                }
            }
            aux++;
            for (int k = 0 ; k < (2 * aux) - 1; k++){
                piramide += "*";
            }
            if (i < N - 1){
                for (int l = 0 ; l < (N - (i + 1)) ; l++){
                    piramide += " ";
                    if (l == (N - (i + 1)) - 1){
                        piramide += "\n";
                    }
                }
            }   
        } 
        JOptionPane.showMessageDialog(null, piramide);
    }
}
