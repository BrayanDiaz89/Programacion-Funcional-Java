package lambda_funcionesAnonimas;

import clasesAnomimas.interfaces.Operacion;

public class Calculadora {

    //Sintaxis= variableLambda = (parametros) -> { sentencia1; sentencia2; ...};

    public Operacion lambdaMultiplicar = (n1, n2) -> {
            System.out.println("La multiplicación es: "+ (n1 * n2));};

    public Operacion lambdaSumar = (n1, n2) -> {
        System.out.println("La suma es: " + (n1 + n2));
    };


}
