package interpreter;

public class Loja {
  public static String formula = "acumulador1 + acumulador2 * 0.1";

  public static double calcularDesconto(double acumulador1, double acumulador2) {
    String expressao;
    expressao = formula.replace("acumulador1", Double.toString(acumulador1));
    expressao = expressao.replace("acumulador2", Double.toString(acumulador2));
    InterpretadorCalculo interpretador = new InterpretadorCalculoDesconto(expressao);
    return interpretador.interpretar();
  }
}
