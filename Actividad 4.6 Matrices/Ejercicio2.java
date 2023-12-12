/**
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de 
 * multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 *
 * @author Manuel López Mairate
 * 
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        

        //Creación de el array (Multiplicamos i * j para hacer la tabla de multiplicar)
        int[][] array = new int[11][11];
        for (int i = 1; i<array.length; i++){
            for (int j = 1; j<array.length; j++){
                array[i][j] = (i * j);
            }
        }

        //Imprimimos el array con dos bucles for
        for (int i = 1; i<array.length; i++){
            for (int j = 1; j<array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
