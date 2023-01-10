package test;

import interpreter.InterpretadorCalculo;
import interpreter.InterpretadorCalculoDesconto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class InterpretadorCalculoTest {

    @Test
    void deveCalcularExpressaoSoma() {
        InterpretadorCalculo interpretador = new InterpretadorCalculoDesconto("6 + 2");
        assertEquals(8.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao() {
        InterpretadorCalculo interpretador = new InterpretadorCalculoDesconto("6 - 2");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoMultiplicacao() {
        InterpretadorCalculo interpretador = new InterpretadorCalculoDesconto("6 * 2");
        assertEquals(12.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoDivisao() {
        InterpretadorCalculo interpretador = new InterpretadorCalculoDesconto("6 / 2");
        assertEquals(3.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoCombinada() {
        InterpretadorCalculo interpretador = new InterpretadorCalculoDesconto("10 / 2 * 3 + 1 - 4");
        assertEquals(12.0, interpretador.interpretar());
    }

    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorCalculo interpretador = new InterpretadorCalculoDesconto("2 ^ 2");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorCalculo interpretador = new InterpretadorCalculoDesconto("2 +");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }


}