package com.testf5.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleTest {

	Example example = new Example();

	@Test
	public void testSumar() {
		int num1 = 35;
		int num2 = 79;

		int result = example.sumar(num1, num2);

		assertEquals(114, result);
		assertTrue(result > 100);
		assertTrue(result > 110);
		assertFalse(result < 100);
		assertNotNull(result);
		assertInstanceOf(Integer.class, result);
	}

	@Test
	public void testCheckPositivo() {
		int positive = 5;
		int negative = -1;

		boolean check = example.checkPositivo(positive);

		assertTrue(check);
		assertInstanceOf(Boolean.class, check);
		assertThrows(IllegalArgumentException.class, () -> {
			example.checkPositivo(negative);
		});
	}

	@Test
	public void testContarLetrasA() {
		String string = "macarilla";
		String string2 = "cesped";

		int result = example.contarLetrasA(string);
		int result2 = example.contarLetrasA(string2);

		assertEquals(3, result);
		assertEquals(0, result2);
		assertInstanceOf(Integer.class, result);
		assertInstanceOf(Integer.class, result2);
	}

	@Test
	public void testContieneElemento() {
		List<String> list = new ArrayList<>();

		list.add("Perro");
		list.add("Gato");
		list.add("Pájaro");
		list.add("Ratón");

		boolean checkElement = example.contieneElemento(list, "Ratón");
		boolean checkNotExistElement = example.contieneElemento(list, "Caballo");
		boolean checkNull = example.contieneElemento(list, null);

		assertTrue(checkElement);
		assertFalse(checkNotExistElement);
		assertFalse(checkNull);
		assertInstanceOf(Boolean.class, checkElement);
		assertInstanceOf(Boolean.class, checkNotExistElement);
		assertInstanceOf(Boolean.class, checkNull);
	}

	@Test
	public void testRevertirCadena() {
		String string = "Hola me llamo Abel";

		String reverse = example.revertirCadena(string);

		assertInstanceOf(String.class, reverse);
		assertEquals("lebA omall em aloH", reverse);
	}

	@Test
	public void testFactorial() {
		int number = 5;
		int negative = -1;

		long result = example.factorial(number);

		assertInstanceOf(Long.class, result);
		assertEquals(120, result);
		assertThrows(IllegalArgumentException.class, () -> {
			example.factorial(negative);
		});
	}

	@Test
	public void testEsPrimo() {
		int number = 2;
		int number2 = 10;
		int number3 = 1;

		boolean result = example.esPrimo(number);
		boolean result2 = example.esPrimo(number2);
		boolean result3 = example.esPrimo(number3);

		assertInstanceOf(Boolean.class, result);
		assertTrue(result);
		assertFalse(result2);
		assertFalse(result3);
	}

	@Test
	public void testMensajeConRetraso() {
		String result = assertTimeout(Duration.ofMillis(6000), () -> example.mensajeConRetraso());

		assertInstanceOf(String.class, result);
		assertEquals("Listo después de retraso", result);
	}

	@Test
	public void testConvertirAString() {
		List<Integer> listaNumeros = new ArrayList<>();

		listaNumeros.add(10);
		listaNumeros.add(20);
		listaNumeros.add(30);
		listaNumeros.add(40);

		List<String> listNewString = example.convertirAString(listaNumeros);

		assertInstanceOf(List.class, listNewString);
	}

	@Test
	public void testCalcularMedia() {
		List<Integer> listaMedia = new ArrayList<>();
		List<Integer> listaMedia2 = new ArrayList<>();

		listaMedia.add(10);
		listaMedia.add(20);
		listaMedia.add(30);
		listaMedia.add(40);

		double result = example.calcularMedia(listaMedia);

		assertInstanceOf(Double.class, result);
		assertEquals(25, 0, result);
		assertThrows(IllegalArgumentException.class, () -> {
			example.calcularMedia(listaMedia2);
		});
	}

	@Test
	// 11. Método para convertir una lista de enteros a lista de strings
	public void testConvertirListaAString() {
		List<Integer> newList = new ArrayList<>();

		newList.add(10);
		newList.add(20);
		newList.add(null);
		newList.add(40);

		List<String> result = example.convertirAString(newList);

		assertInstanceOf(List.class, result);

		List<String> expected = new ArrayList<>();
		expected.add("10");
		expected.add("20");
		expected.add("null");
		expected.add("40");

		assertEquals(expected, result, "La conversión de la lista no es correcta.");
	}
}
