package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_8 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N  = 0, A = 0, aux = 0, resultado = 0;
        boolean bandera;
        
        // PEDIR EL NÚMERO DE SALTOS
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N"));
                if(N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if(500 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                bandera = false;
            }
        }while(bandera == false);
        
        // CREAR EL ARREGLO
        int arreglo[] = new int[N];
        
        // LLENAR EL ARREGLO
        for(int i = 0 ; i < N ; i++){
            do{
                try{
                    arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
                    if(arreglo[i] == 0){
                        JOptionPane.showMessageDialog(null, "ERROR: El cero NO es válido.");
                        bandera = false;
                    }else if(arreglo[i] < -20){
                        JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                        bandera = false;
                    }else if(20 < arreglo[i]){
                        JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                        bandera = false;
                    }                    
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                }
            }while(bandera == false);
        }
        // PEDIR EL VALOR DE A
        do{
            try{
                A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de A"));
                if(A < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }else if(500 < A){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }
        }while(bandera == false);
        
        // PROCESAMIENTO
        for(int i = 0 ; i < N ; i++){
            aux += arreglo[i];
            if(aux == A){
                resultado++;
            }
        }
        
        // IMPRIMIR EN PANTALLA EL RESULTADO
        JOptionPane.showMessageDialog(null, resultado);
    }
}
