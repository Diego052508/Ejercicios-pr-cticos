package run;

import javax.swing.JOptionPane;

    public class Main {
        public static void main(String[] args) {

            String entrada = JOptionPane.showInputDialog(null, "Ingresa un día de la semana:", "Días de la semana", JOptionPane.QUESTION_MESSAGE);

            if (entrada != null && !entrada.trim().isEmpty()) {

                String dia = entrada.toUpperCase();

                String tipoDeDia = switch (dia) {
                    case "LUNES", "MARTES", "MIERCOLES", "MIÉRCOLES", "JUEVES", "VIERNES" -> "Día laboral";
                    case "SABADO", "SÁBADO", "DOMINGO" -> "Fin de semana";
                    default -> "Día inválido";
                };

                JOptionPane.showMessageDialog(null, "El día " + entrada + " es un: " + tipoDeDia, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            }

            else
            {
                JOptionPane.showMessageDialog(null, "No ingresaste ningún día.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
