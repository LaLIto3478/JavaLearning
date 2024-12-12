package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_1 {

    public static void main(String[] args) {
        // DECLARAR "N" QUE SERÁ LA CANTIDAD DE ELEMENTOS DEL ARREGLO
        int N = 0, aux = 0;
        boolean bandera;
        
        // PEDIR EL VALOR DE N;
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA LONGITUD DE SU CADENA"));
                if (N<3){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (100 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");                   
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }            
        }while(bandera == false);
        
        // DECLARAR EL ARRAY
        int [] enteros = new int[N];
        
        // LLENAR EL ARRAY
        for (int i = 0 ; i < N ; i++){
            do{
                bandera = true;
                try{
                    enteros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                    
                    if (enteros[i] < -100000){
                        JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                        bandera = false;
                    }
                    if (100000 < enteros[i]){
                        JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                        bandera = false;
                    }                
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido.");
                    bandera = false;
                }
            }while(bandera == false);
        }
        for (int i = 0; i < N ; i++){
            for (int j = 0 ; j < N - 1 ; j++){
                if (enteros[j] > enteros[j+1]){
                    aux = enteros[j+1];
                    enteros[j+1] = enteros[j];
                    enteros[j] = aux;
                }
            }
        }
        
        // IMPRIMIR EN PANTALLA LOS RESULTADOS
        JOptionPane.showMessageDialog(null, enteros[N-1]+"\n"+enteros[N-2]+"\n"+enteros[N-3]);
    }    
}
