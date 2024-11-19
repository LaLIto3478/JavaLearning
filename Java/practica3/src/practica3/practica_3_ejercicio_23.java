package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_23 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, M = 0;
        boolean bandera;
        String pares = "";
        
        //PROCESAMIENTO
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL EXTREMO INFERIOR"));
                M = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL EXTREMO SUPERIOR"));
                
                if(M < N){
                    JOptionPane.showMessageDialog(null, "ERROR: El valor del extremo superior DEBE ser mayor o igual al valor del extremo inferior.");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Valores de los extremos numéricos NO válidos.\n"+ex.getMessage());
                bandera = false;
            }
        }while(bandera == false);
        
        for (int i = N ; i <= M ; i++){
            if (i != 0){
                if (i % 2 == 0){
                    pares += i + "\n";
                }
            }
        }
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, pares);
    }
}
