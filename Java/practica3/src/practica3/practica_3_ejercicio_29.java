package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_29 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int dd = 0, mm = 0, aaaa = 0, dias = 0;
        char primeroenero = ' ';
        String [] diasdelasemana = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        boolean bandera, añobisiesto = true;
        int[] diaspormes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String aux;

        // PEDIR AL USUARIO LOS VALORES
        do{
            bandera = true;
            try{
                añobisiesto = false;
                dd = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
                mm = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
                aaaa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
                
                aux = JOptionPane.showInputDialog("¿Qué día de la semana fue el primero de enero de dicho año?").toLowerCase();
                primeroenero = aux.charAt(0);
                
                if ((primeroenero == 'l') || (primeroenero == 'm') || (primeroenero == 'x') || (primeroenero == 'j') || (primeroenero == 'v') || (primeroenero == 's') || (primeroenero == 'd')){
                }
                else{
                    JOptionPane.showMessageDialog(null, "ERROR: Día de la semana NO válido.\nIngrese alguno de los siguientes: l, m, x, j, v, s, d");
                    bandera = false;
                }
                if (dd < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Días NO válidos");
                    bandera = false;
                }
                
                if (12 < mm){
                    JOptionPane.showMessageDialog(null, "ERROR: Número de meses NO válidos");
                    bandera = false;
                }else if (mm < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Número de meses NO válidos");
                    bandera = false;
                }
                // VERIFICAR SI ES BISIESTO
                if (aaaa % 4 == 0){
                    if (aaaa % 100 == 0){
                        if(aaaa % 400 == 0){
                            añobisiesto = true;
                        }
                        else{}
                    }
                    else {
                        añobisiesto = true;
                    }
                }
                else {}      
                if (añobisiesto == false){
                    if (dd == 29){
                        if (mm == 2){
                            JOptionPane.showMessageDialog(null, "ERROR: Su año NO es bisiesto, por lo que 29 de febrero de dicho año NO existe.\nVuelva a ingresar los datos");
                            bandera = false;
                        }
                    }
                }
                // VERIFICAR QUE SEA UNA FECHA VÁLIDA
                if (dd > diaspormes[mm - 1]){
                    JOptionPane.showMessageDialog(null, "ERROR: Su fecha NO es válida");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"ERROR: Fechas NO válidas.");
                bandera = false;
            }
        }while(bandera == false);
        //PROCESAMIENTO
        if (añobisiesto != true){
            diaspormes[1] = 28;
        }
        mm--;
        for (int i = 0 ; i < mm ; i++){
            dias += diaspormes[i];
        }
        dias += dd;
        dias = dias % 7;
        
        switch (primeroenero){
            case 'm':
                dias += 6;
                dias = dias % 6;
                if (dias != 0)
                    dias++;
                break;
            case 'x':
                dias += 2;
                dias = dias % 7;
                break;
            case 'j':
                dias += 3;
                dias = dias % 7;
                break;
            case 'v':
                dias += 4;
                dias = dias % 7;
                break;
            case 's':
                dias += 5;
                dias = dias % 7;
                break;
            case 'd':
                dias += 6;
                dias = dias % 7;
                break;
            default:
                break;
        }
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, "El dia de la semana correspondiente a su fecha es:\n"+diasdelasemana[dias]);
    }
}
