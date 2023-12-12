public class Ejercicio5 {
    public static void main(String[] args){

        System.out.println("Inserte el valor de la cantidad de personas de la quede sea insertar el sueldo :");
        int npersonas = Integer.parseInt(System.console().readLine());

        int[][] salario = new int[2][npersonas];

            for (int j = 0; j< npersonas; j++){
                System.out.print("Inserte 1 si es mujer, 0 si es hombre: ");
                int genero = Integer.parseInt(System.console().readLine());

                System.out.print("Inserte lo que gana: ");
                int dinero = Integer.parseInt(System.console().readLine());
                salario[genero][j] =  dinero;
            }

        int[] arraysumaporgenero = new int[2];

        int sumadinero=0;
        for(int i = 0; i<2; i++){

            for(int j = 0; j<npersonas; j++){

               sumadinero = sumadinero + salario[i][j];
               arraysumaporgenero[i] = sumadinero;

            }

            sumadinero = 0;

        }

        System.out.println("");
        System.out.println("Total dinero mujeres: " + (arraysumaporgenero[1]/npersonas));
        System.out.println("Total dinero hombres: " + (arraysumaporgenero[0]/npersonas));



    }
}
