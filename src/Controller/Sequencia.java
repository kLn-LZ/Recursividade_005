package Controller;

public class Sequencia {

    public Sequencia() {
        super();

    }

    public double fSeq (int n) {

        // Condição de parada, iteração da váriavel chegar no valor 1;
        if (n == 1 ){

            return 1;
        }

        // Cada retorno somar a divisão de cada iteração
        return 1/ (double) n + fSeq(n - 1);

    }

}
