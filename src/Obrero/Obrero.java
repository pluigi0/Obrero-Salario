
package Obrero;

import javax.swing.JOptionPane;

/*
un obrero necesita calcular su salario semanal el cual se obtiene de la siguiente manera: 
Si trabaja 40 horas o menos se le paga 
$16 por horas. 
Si trabaja mas de 40 horas 
se le paga 16 por cada una de las primeras 40 horas y 
20 por cada hora extra
 */
public class Obrero {
    public static void main(String[] args) {
        float horasTrabajadas, salarioH, extras;

        
        horasTrabajadas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese horas trabajadas de esta semana: "));
        
        if (horasTrabajadas <= 40){
            salarioH = horasTrabajadas * 16;
            JOptionPane.showMessageDialog(null, "Solo se le paga $16 la hora");
            JOptionPane.showMessageDialog(null, "Por lo que su salario de la semana es: "+salarioH); //
        }
        else{
            salarioH = (40*16);
            extras = horasTrabajadas-40;
            salarioH += extras *20;
            JOptionPane.showMessageDialog(null, "Se le paga $16 la hora");
            JOptionPane.showMessageDialog(null, " Adicional, sus horas extras ("+ extras+") las     cuales se pagan a $20 cada una"+
                    "\nPor lo que el salario de esta semana es: "+salarioH);
        }
        
        
        
    } 
}
