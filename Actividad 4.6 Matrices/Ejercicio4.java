/**
 * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una 
 * empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la 
 * información de N personas distintas (valor también introducido por teclado). Para cada 
 * persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe 
 * guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada 
 * género.
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        //Creación de el array con sus datos
        double[][] alumno = new double[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("Inserte la nota de el alumno " + (i + 1)+ " en la asignatura numero " + (j + 1) + ": ");
                alumno[i][j] = Integer.parseInt(System.console().readLine());
                

            }
            System.out.println(" ");
        }


        //creación de las variables para la nota mínima y maxima
        double notaminima = 0;
        double notamáxima = 0;

        //Un bucle for para la creación de las notas minimas y máxima
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                notaminima = alumno[i][0];
                notamáxima = alumno[i][0];

                if (notaminima > alumno[i][j]) {

                    notaminima = alumno[i][j];

                }

                if (notamáxima < alumno[i][j]) {

                    notamáxima = alumno[i][j];

                }

            }

            System.out.println("La nota minima de el alumno numero " + (i + 1) + " es: " + notaminima);
            System.out.println("La nota máxima de el alumno numero " + (i + 1) + " es: " + notamáxima);
            
        }

        //Creación de una variale para hacer de sumatorio
        double sumatorio = 0;
        
        //Crearemos un array que nos servirá para guardar las medias de los alumnos
        double [] suma = new double[4];
        //Con un for que irá sumando por alumno todas las notas
        for(int i = 0; i<4 ; i++){
            for(int j = 0; j<5; j++){

                sumatorio = sumatorio + alumno[i][j];
                suma[i] = sumatorio;

            }
            sumatorio = 0;
            System.out.println("La media de el alumno " + (i + 1) + " es: " + (suma[i] / 5 ));
        }

        

    }
}
