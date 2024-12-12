package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_2 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, K = 0;
        boolean bandera;
        String entero = " ";
        
        // PEDIR VARIABLES Y VALIDAR RANGOS Y QUE SEAN NÚMEROS
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA LONGITUD DE SU ARREGLO"));
                if (N < 0){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango en la longitud del arreglo");
                    bandera = false;
                }
                if (1000 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango en la longitud del arreglo");
                    bandera = false;
                } 
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }
        }while(bandera == false);
        
        //CREAR ARREGLO
        int[] enteros = new int[N];
        for (int i = 0 ; i < N ; i++){
            do{
                bandera = true;
                try{
                    enteros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                }
            }while(bandera == false);
        }
    
        // PEDIR EL NÚMERO DE DATOS QUE SE IGNORARÁN
        do{
            bandera = true;
            try{
                K = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de datos que quiere que se ignoren."));
                if (K > N){
                    JOptionPane.showMessageDialog(null, "ERROR: No se pueden ignorar más datos de los que hay!!!");
                    bandera = false;
                }
                if (K > 1000){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango.");
                    bandera = false;
                }
                if (K < 0){
                    JOptionPane.showMessageDialog(null, "ERROR: Número NO válido.");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Número NO válido");
                bandera = false;
            }
        }while(bandera == false);
        
        N -= K;
        for (int i = 0 ; i < N ; i++){
            entero += enteros[i]+" ";
        }
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, entero);
    }
}
