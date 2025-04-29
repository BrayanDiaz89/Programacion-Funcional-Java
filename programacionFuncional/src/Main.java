import interfaces.Operador;

public class Main {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 5;
        //Solución con clases anónimas
        Operador suma = new Operador() {
            @Override
            public int operar(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println("Suma anónima: "+ suma.operar(num1,num2));

        //Solución con lambdas
        Operador sumaLambdas = (n1, n2) ->  n1 + n2;
        System.out.println("Suma lambda: "+ sumaLambdas.operar(num1, num2));

    }
}