package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        //Desde el método main() se llamará al resto de métodos, pasándoles a cada uno, respectivamente, los argumentos necesarios
        positionInAList(5);
        sumFirstNaturalNumbers(5);
        showFirstNaturalNumbers(5);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        //El método positionInAList() recibe un número entero por parámetro. En el método habrá que
        // declarar una variable de tipo List<Integer> e inicializarla como un nuevo ArrayList.
        // A continuación se le añadirán a la lista los números del 0 al 10, ambos inclusive, a través del
        // método add(). Se recorrerá la lista para comprobar cuál es el índice, es decir: la posición, del número recibido
        //  por parámetro en la lista. Finalmente, se mostrará por pantalla dicha posición; y en el caso de que el número
        //  no se encuentre en la lista, también se mostrará por pantalla.
        List<Integer> listaI = new ArrayList<Integer>();
        boolean encontrado = false;
        for(int i = 0; i <= 10; i++){
            listaI.add(i);
        }

        for(int i = 0; i < listaI.size(); i++){
            if(listaI.get(i) == num){
                System.out.println("El elemento X se encuentra en la posición: Y");
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("El elemento X no se encuentra en la lista.");
        }



    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        //El método sumFirstNaturalNumbers() recibe un número entero por parámetro.
        // El método mostrará por pantalla un mensaje o mensajes, para que quede más claro,
        //  que muestre la suma de los primeros números positivos que indique el parámetro.
        int suma=0;
        for(int i=1;i<=num;i++) {
            suma=suma+i;
        }
        System.out.println(suma);

    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        //El método showFirstNaturalNumbers() recibe un número entero por parámetro.
        // El método mostrará por pantalla un mensaje o mensajes, para que quede más claro, que muestre los primeros números positivos que indique el parámetro.
        for(int i=1;i<=num;i++) {
            System.out.println(i);
        }

    }

}
