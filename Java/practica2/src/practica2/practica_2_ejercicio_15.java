package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_15 {
    
    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int alumno1 = 0, alumno2, alumno3;
        int menos40kg = 0, entre40y50 = 0, entre50y60 = 0, mas60kg = 0;
        
        //PEDIR LAS VARIABLES Y PROCESAMIENTO
        alumno1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PESO DEL ALUMNO 1: "));  //alumno1
        if (alumno1 < 40){
           menos40kg++;
        }
        else if (alumno1 >= 40 && alumno1 <= 50){
                entre40y50++;
        }
        else if (alumno1 > 50 && alumno1 < 60){
                entre50y60++;
        }
        else{
            mas60kg++;
        }
        
        alumno2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PESO DEL ALUMNO 2: "));  //alumno2
        if (alumno2 < 40){
           menos40kg++;
        }
        else if (alumno2 >= 40 && alumno2 <= 50){
                entre40y50++;
        }
        else if (alumno2 > 50 && alumno2 < 60){
                entre50y60++;
        }
        else{
            mas60kg++;
        }
        
        alumno3 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PESO DEL ALUMNO 3: "));  //alumno3
        if (alumno3 < 40){
           menos40kg++;
        }
        else if (alumno3 >= 40 && alumno3 <= 50){
                entre40y50++;
        }
        else if (alumno3 > 50 && alumno3 < 60){
                entre50y60++;
        }
        else{
            mas60kg++;
        }
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, "ESTADÍSTICA: \n" + "Alumnos de menos de 40 kg: " + menos40kg + "\nAlumnos entre 40 y 50 kg: " + entre40y50 + "\nAlumnos de más de 50 kg y menos de 60 kg: "+ entre50y60 + "\nAlumnos de más o igual a 60 kg: " + mas60kg);
    }
}
