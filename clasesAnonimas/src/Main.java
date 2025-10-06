import clasesAnomimas.clasesAbstractas.Persona;
import clasesAnomimas.interfaces.Animal;
import lambda_funcionesAnonimas.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciando mi clase service Calculadora
        //Esta clase contiene las funciones lambda aplicadas a una interface funcional
        Calculadora calc = new Calculadora();

        System.out.println("Uso de clases anónimas");
        System.out.println("Ejemplo 1: ");
        //Ejemplo 1, implementando de una interface
        Animal perro = new Animal() {
            @Override
            public void hacerSonido() {
                System.out.println("Guau guau");
            }
        };
        perro.hacerSonido();

        //Ejemplo 2, heredando de una clase abstracta
        System.out.println("Ejemplo 2: ");
        new Persona() {
            private String nombre;

            public void comunicar(){
                System.out.println("La persona se comunica en algún lenguaje");
            }
        }.comunicar();

        System.out.println("------------------------------------------------");
        System.out.println("Entendiendo las funciones anónimas (Lambda)");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el número 1: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite el número 2: ");
        int num2 = teclado.nextInt();

        //LLamo las funciones lambda creadas en mi clase Calculadora
        calc.lambdaMultiplicar.aplicar(num1, num2);
        calc.lambdaSumar.aplicar(num1, num2);

    }
}