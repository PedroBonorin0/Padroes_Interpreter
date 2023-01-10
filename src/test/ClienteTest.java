package test;

import interpreter.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
  @Test
  void deveCalcularExpressaoComFormula() {
    Cliente cliente = new Cliente();
    cliente.setAcumulador1(20.0);
    cliente.setAcumulador2(50.0);

    assertEquals(7.0, cliente.calcularDesconto(), 0.1);
  }

}