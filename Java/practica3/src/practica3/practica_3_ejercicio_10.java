package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_10 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        double tarifa = 0, horas = 0, trabajador = 0, salariomayor = 0, promedio = 0;
        int trabajadores = 0;
        boolean bandera;
        String validador = " ";
        
        // PEDIR LOS TRABAJADORES A EVALUAR
        do {
            validador = JOptionPane.showInputDialog("INGRESE EL NÚMERO DE TRABAJADORES");
            bandera = true;
            
            for (int i = 0 ; i < validador.length() ; i++){
                if (validador.charAt(i) < 48 || validador.charAt(i) > 57){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                    break;
                }
            }
        } while(bandera == false);
        trabajadores = Integer.parseInt(validador);
        
        // PROCESAMIENTO
        for (int i = 0 ; i < trabajadores ; i++){
            do {                    // PEDIR AL USUARIO LA TARIFA Y VALIDAR QUE SEA UN NÚMERO
                validador = JOptionPane.showInputDialog("INGRESE EL VALOR DE LA TARIFA POR HORA QUE SE LE DA AL TRABAJADOR"); //tarifa
                bandera = true;
                
                for (int j = 0 ; j < validador.length() ; j++){
                    if (validador.charAt(j) < 46 || validador.charAt(j) > 57 || validador.charAt(j) == 47){
                        JOptionPane.showMessageDialog(null, "ERROR: Número NO válido.");
                        bandera = false;
                        break;
                    }
                }
            } while(bandera == false);
            tarifa = Double.parseDouble(validador);
            
            do {
                validador = JOptionPane.showInputDialog("INGRESE LAS HORAS TRABAJADAS POR EL TRABAJADOR");                     //horas
                bandera = true;
                
                for (int j = 0 ; j < validador.length() ; j++){
                    if (validador.charAt(j) < 46 || validador.charAt(j) > 57 || validador.charAt(j) == 47){
                        JOptionPane.showMessageDialog(null, "ERROR: Número NO válido.");
                        bandera = false;
                        break;
                    }
                }
            } while(bandera == false);
            horas = Double.parseDouble(validador);
            
            trabajador = tarifa * horas;
            promedio += trabajador;
            if (trabajador >= 500){
                salariomayor++;
            }
        }
        promedio /= trabajadores;
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, "ESTADÍSTICA" + "\nNÚMERO DE TRABAJADORES CON SALARIO MAYOR O IGUAL A 500: "+salariomayor + "\nPROMEDIO DEL SALARIO DE LOS TRABAJADORES: "+promedio);
        
    }
}