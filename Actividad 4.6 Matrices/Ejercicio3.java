/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e 
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la 
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son 
 * menores que cero y cuántos son igual a cero.
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio3 {
    public static void main(String[] args){


        //Pedimos los datos
        System.out.print("Inserte el numero de filas que desea crear: ");
        int numerfilas = Integer.parseInt(System.console().readLine());

        System.out.print("Inserte el numero de valores por fila: ");
        int numerovalores = Integer.parseInt(System.console().readLine());


        //Creamos el array con valores que pedimos por pantalla, además de hacer el array con los ya pedidos anteriormente
        int [][] array = new int[numerfilas][numerovalores];
        for (int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                System.out.println("Inserte el valor que quiera añadir: ");
                array[i][j] = Integer.parseInt(System.console().readLine());
            }
        }


        //Creamos las variables para almacenar las veces que el numero es mayor que cero, menor que cero o igual a cero
        int mayorquecero = 0;
        int menorquecero = 0;
        int igualacero = 0;

        //Este For Imprimirá por pantalla los valores de el array.
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array.length; j++){
                System.out.print(array[i][j]);

            
            }
            System.out.println("");
        }

        //Este for sumará en los contadores en caso de que sean mayor, igual y menor que cero
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array.length; j++){

                if (array[i][j] == 0){
                    igualacero++;
                }

                if (array[i][j] > 0){
                    mayorquecero++;
                }

                if (array[i][j] < 0){
                    menorquecero++;
                }
            }
        }


        System.out.println("Numeros mayores que cero: " + mayorquecero);
        System.out.println("Numeros menores que cero: " + menorquecero);
        System.out.println("Numeros iguales a cero: " + igualacero);
    }
}
