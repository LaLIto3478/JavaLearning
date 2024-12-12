package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_7 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0;
        String salida = "";
        boolean bandera;
        
        // PEDIR EL TAMAÑO DEL ARRAY
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMAÑO DEL ARRAY"));
                if(N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if(1000 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }
        }while(bandera == false);
        
        // CREAR EL ARREGLO
        int arreglo[] = new int[N];
        
        // LLENAR EL ARREGLO
        for(int i = 0 ; i < N ; i++){
            do{
                bandera = true;
                try{
                    arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                }
            }while(bandera == false);
        }
        
        // PROCESAMIENTO
        for(int i = (N - 1) ; i >= 0 ; i--){
            salida += arreglo[i] + " ";
        }
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, salida);
    }
}
