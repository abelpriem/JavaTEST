package com.testf5.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleUnitTest {

    Example example = new Example();

    @Test
    public void testSumar() {
        int num1 = 35;
        int num2 = 79;

        int result = example.sumar(num1, num2);

        assertEquals(114, result);
    }

    @Test
    public void testCheckPositivoConPositivo() {
        int positive = 5;

        boolean check = example.checkPositivo(positive);

        assertTrue(check);
    }

    @Test
    public void testCheckPositivoConNegativo() {
        int negative = -1;

        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(negative);
        });
    }

    @Test
    public void testCheckPositivoConCero() {
        int cero = 0;

        boolean check = example.checkPositivo(cero);

        assertTrue(check);
    }

    @Test
    public void testContarLetrasA() {
        String string = "mascarilla";

        int result = example.contarLetrasA(string);

        assertEquals(3, result);
    }

    @Test
    public void testContarLetrasSinA() {
        String string = "cesped";

        int result = example.contarLetrasA(string);

        assertEquals(0, result);
    }

    @Test
    public void testContarLetrasVacio() {
        String string = "";

        int result = example.contarLetrasA(string);

        assertEquals(0, result);
    }

    @Test
    public void testContarLetrasConNull() {
        assertThrows(NullPointerException.class, () -> {
            example.contarLetrasA(null);
        });
    }

    @Test
    public void testContieneElemento() {
        List<String> list = new ArrayList<>();

        list.add("Perro");
        list.add("Gato");
        list.add("Pájaro");
        list.add("Ratón");

        boolean checkElement = example.contieneElemento(list, "Pájaro");

        assertTrue(checkElement);
    }

    @Test
    public void testNoContieneElemento() {
        List<String> list = new ArrayList<>();

        list.add("Perro");
        list.add("Gato");
        list.add("Pájaro");
        list.add("Ratón");

        boolean checkElement = example.contieneElemento(list, "Elefante");

        assertFalse(checkElement);
    }

    @Test
    public void testContieneElementoListaVacía() {
        List<String> list = new ArrayList<>();

        boolean checkElement = example.contieneElemento(list, "Perro");

        assertFalse(checkElement);
    }

    @Test
    public void testContieneElementoNull() {
        List<String> list = new ArrayList<>();

        list.add("Perro");
        list.add("Gato");
        list.add("Pájaro");
        list.add("Ratón");

        boolean checkElement = example.contieneElemento(list, null);

        assertFalse(checkElement);
    }

    @Test
    public void testRevertirCadena() {
        String string = "Hola me llamo Abel";

        String reverse = example.revertirCadena(string);

        assertEquals("lebA omall em aloH", reverse);
    }

    @Test
    public void testRevertirCadenaVacía() {
        String string = "";

        String reverse = example.revertirCadena(string);

        assertEquals("", reverse);
    }

    @Test
    public void testRevertirCadenaNull() {
        assertThrows(NullPointerException.class, () -> {
            example.revertirCadena(null);
        });
    }

    @Test
    public void testFactorial() {
        int number = 5;

        long result = example.factorial(number);

        assertEquals(120, result);
    }

    @Test
    public void testFactorialDeCero() {
        int number = 0;

        long result = example.factorial(number);

        assertEquals(1, result);
    }

    @Test
    public void testFactorialNegativo() {
        int negative = -1;

        assertThrows(IllegalArgumentException.class, () -> {
            example.factorial(negative);
        });
    }

    @Test
    public void testEsPrimo() {
        int number = 2;

        boolean result = example.esPrimo(number);

        assertTrue(result);
    }

    @Test
    public void testNoEsPrimo() {
        int number = 10;

        boolean result = example.esPrimo(number);

        assertFalse(result);
    }

    @Test
    public void testPrimoNegativo() {
        int number = -5;

        boolean result = example.esPrimo(number);

        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() {
        String result = assertTimeout(Duration.ofMillis(6000), () -> example.mensajeConRetraso());

        assertEquals("Listo después de retraso", result);
    }

    @Test
    public void testConvertirAStringIndex0() {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        List<String> listNewString = example.convertirAString(lista);

        assertEquals("10", listNewString.get(0));
    }

    @Test
    public void testConvertirAStringIndex1() {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        List<String> listNewString = example.convertirAString(lista);

        assertEquals("20", listNewString.get(1));
    }

    @Test
    public void testConvertirAStringIndex2() {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        List<String> listNewString = example.convertirAString(lista);

        assertEquals("30", listNewString.get(2));
    }

    @Test
    public void testConvertirAStringIndex3() {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        List<String> listNewString = example.convertirAString(lista);

        assertEquals("40", listNewString.get(3));
    }

    @Test
    public void testConvertirAStrinListaVacia() {
        List<Integer> lista = new ArrayList<>();

        List<String> listNewString = example.convertirAString(lista);

        assertTrue(listNewString.isEmpty());
    }

    @Test
    public void testCalcularMedia() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        double result = example.calcularMedia(list);

        assertEquals(25, 0, result);
    }

    @Test
    public void testCalcularMediaUnElemento() {
        List<Integer> list = new ArrayList<>();

        list.add(50);

        double result = example.calcularMedia(list);

        assertEquals(50, result);
    }

    @Test
    public void testCalcularMediaListaVacía() {
        List<Integer> list = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(list);
        });
    }

    @Test
    public void testConvertirListaAString() {
        List<String> list = new ArrayList<>();

        list.add("hola");
        list.add("mundo");
        list.add(null);
        list.add("java");

        String result = example.convertirListaAString(list);
        String expected = "HOLA,MUNDO,NULL,JAVA";

        assertEquals(expected, result, "La conversión de la lista es correcta.");
    }

    @Test
    public void testConvertirListaAStringIncorrecto() {
        List<String> list = new ArrayList<>();

        list.add("hola");
        list.add("mundo");
        list.add(null);
        list.add("java");

        String result = example.convertirListaAString(list);
        String expected = "MUNDO,MULL,JAVA,HOLA";

        assertNotEquals(expected, result, "La conversión de la lista no es correcta.");
    }

    @Test
    public void testConvertirAStringListaVacía() {
        List<String> list = new ArrayList<>();

        String result = example.convertirListaAString(list);

        assertEquals("", result, "Lista vacía.");
    }
}
