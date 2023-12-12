/**
 * Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
 * del 1 al 25
 * y luego muestre la matriz por pantalla.
 * 
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio1 {
    public static void main(String[] args) {

        //Contador para ir sumando
        int contador = 1;

        //Array de 5x5
        int[][] array = new int[5][5];

       //Creación de array con dos bucles for 
        for (int i = 0; i<array.length; i++){
            for (int y = 0; y<array.length; y++){
                array[i][y] = contador;
                contador++;
            }     
        }

        //Imprimir el array con dos bucles for
        for (int i = 0; i<array.length; i++){
            for (int y = 0; y<array.length; y++){
                System.out.print(array[i][y] + " ");
            }     
            System.out.println("");
        }

    }
}