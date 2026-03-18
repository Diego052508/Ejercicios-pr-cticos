package run;

import javax.swing.*;

public class Ejercicio1
{
    public static void main(String[] args)
    {

        float distancia = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la distancia: "));
        int peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso: "));
        String envio="";
        String producto = JOptionPane.showInputDialog(null, "El producto es fragil? (S/N): ");
        if (peso >= 50 && distancia >= 100 && producto.equals("n") || producto.equals("N") )
        {
            envio = "Transporte Pesado";
            JOptionPane.showMessageDialog(null,"Envío es por " + envio);
        }
        else if (peso <= 50 && producto.equals("S") || producto.equals("s"))
        {
            envio = "envío Premium";
            JOptionPane.showMessageDialog(null,"Es " + envio);
        }
        else if (peso <= 10 && distancia <= 20)
        {
            envio = "Dron";
            JOptionPane.showMessageDialog(null,"Envío es por " + envio);
        }
    }
}
