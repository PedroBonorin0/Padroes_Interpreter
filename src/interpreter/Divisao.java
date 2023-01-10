package interpreter;

public class Divisao implements InterpretadorCalculo {

    private double x;
    private double y;

    public Divisao (Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return x / y;
    }
}
