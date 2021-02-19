package com.company;

import java.util.Scanner;

/*Ahora, crea una clase clase ejecutable:

Crea un array de Passwords con el tamaño que tu le indiques por teclado.
Crea un bucle que cree un objeto para cada posición del array.
Indica también por teclado la longitud de los Passwords (antes de bucle).
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contraseña1 valor_booleano1

contraseña2 valor_bololeano2*/
public class Main {

    public static void main(String[] args) {
        //Creo el array de password y genero las contraseñas con un bucle for
        Password[] contrasenias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la cantidad de contraseñas que quieres generar");
        int cantidad = sc.nextInt();
        sc.nextLine();
        System.out.println("Indica la longitud de las contraseñas");
        int longitud = sc.nextInt();
        sc.nextLine();
        contrasenias = new Password[cantidad];

        for (int i = 0; i < contrasenias.length;i++ ){
            contrasenias[i] = new Password(longitud);
        }

        //Con este bucle comprobamos la seguridad de las contraseñas. y saco el resultado por consola
        boolean[] passSegura = new boolean[cantidad];

        for(int i = 0; i < passSegura.length;i++){
            passSegura[i] = contrasenias[i].esFuerte();
            System.out.println(contrasenias[i].toString() + passSegura[i]);
        }

    }
}
