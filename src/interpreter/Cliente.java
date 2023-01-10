package interpreter;

public class Cliente {
  private double acumulador1;
  private double acumulador2;

  public double getAcumulador1() {
    return acumulador1;
  }

  public void setAcumulador1(double acumulador1) {
    this.acumulador1 = acumulador1;
  }

  public double getAcumulador2() {
    return acumulador2;
  }

  public void setAcumulador2(double acumulador2) {
    this.acumulador2 = acumulador2;
  }

  public double calcularDesconto() {
    return Loja.calcularDesconto(this.acumulador1, this.acumulador2);
  }
}
