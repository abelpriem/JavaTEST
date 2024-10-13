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
		int cero = 0;

		boolean check = example.checkPositivo(positive);
		boolean check2 = example.checkPositivo(cero);

		assertTrue(check);
		assertTrue(check2);
		assertInstanceOf(Boolean.class, check);
		assertInstanceOf(Boolean.class, check2);
		assertThrows(IllegalArgumentException.class, () -> {
			example.checkPositivo(negative);
		});

		assertTrue(example.checkPositivo(Integer.MAX_VALUE));
		assertTrue(example.checkPositivo(1));
	}

	@Test
	public void testContarLetrasA() {
		String string = "macarilla";
		String string2 = "cesped";
		String string3 = "";

		int result = example.contarLetrasA(string);
		int result2 = example.contarLetrasA(string2);
		int result3 = example.contarLetrasA(string3);

		assertEquals(3, result);
		assertEquals(0, result2);
		assertInstanceOf(Integer.class, result);
		assertInstanceOf(Integer.class, result2);
		assertInstanceOf(Integer.class, result3);
		assertThrows(NullPointerException.class, () -> {
			example.contarLetrasA(null);
		});
		assertEquals(0, result3);
	}

	@Test
	public void testContieneElemento() {
		List<String> list = new ArrayList<>();
		List<String> emptyList = new ArrayList<>();

		list.add("Perro");
		list.add("Gato");
		list.add("Pájaro");
		list.add("Ratón");

		boolean checkElement = example.contieneElemento(list, "Ratón");
		boolean checkElement2 = example.contieneElemento(emptyList, "Perro");
		boolean checkNotExistElement = example.contieneElemento(list, "Caballo");
		boolean checkNull = example.contieneElemento(list, null);

		assertTrue(checkElement);
		assertFalse(checkElement2);
		assertFalse(checkNotExistElement);
		assertFalse(checkNull);
		assertInstanceOf(Boolean.class, checkElement);
		assertInstanceOf(Boolean.class, checkElement2);
		assertInstanceOf(Boolean.class, checkNotExistElement);
		assertInstanceOf(Boolean.class, checkNull);
	}

	@Test
	public void testRevertirCadena() {
		String string = "Hola me llamo Abel";
		String emptyString = "";

		String reverse = example.revertirCadena(string);
		String result = example.revertirCadena(emptyString);

		assertInstanceOf(String.class, reverse);
		assertInstanceOf(String.class, result);
		assertEquals("lebA omall em aloH", reverse);
		assertEquals("", result);
		assertThrows(NullPointerException.class, () -> {
			example.revertirCadena(null);
		});
	}

	@Test
	public void testFactorial() {
		int number = 5;
		int negative = -1;

		long result = example.factorial(number);
		long result2 = example.factorial(0);
		long result3 = example.factorial(1);

		assertInstanceOf(Long.class, result);
		assertInstanceOf(Long.class, result2);
		assertInstanceOf(Long.class, result3);
		assertEquals(120, result);
		assertEquals(1, result2);
		assertEquals(1, result3);
		assertThrows(IllegalArgumentException.class, () -> {
			example.factorial(negative);
		});
	}

	@Test
	public void testEsPrimo() {
		int number = 2;
		int number2 = 10;
		int number3 = 1;
		int number4 = -5;

		boolean result = example.esPrimo(number);
		boolean result2 = example.esPrimo(number2);
		boolean result3 = example.esPrimo(number3);
		boolean result4 = example.esPrimo(number4);

		assertInstanceOf(Boolean.class, result);
		assertInstanceOf(Boolean.class, result2);
		assertInstanceOf(Boolean.class, result3);
		assertInstanceOf(Boolean.class, result4);
		assertTrue(result);
		assertFalse(result2);
		assertFalse(result3);
		assertFalse(result4);
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
		List<Integer> emptyList = new ArrayList<>();

		listaNumeros.add(10);
		listaNumeros.add(20);
		listaNumeros.add(30);
		listaNumeros.add(40);

		List<String> listNewString = example.convertirAString(listaNumeros);
		List<String> listNewString2 = example.convertirAString(emptyList);

		assertInstanceOf(List.class, listNewString);
		assertInstanceOf(List.class, listNewString2);
		assertTrue(listNewString2.isEmpty());

		assertEquals("10", listNewString.get(0));
		assertEquals("20", listNewString.get(1));
		assertEquals("30", listNewString.get(2));
		assertEquals("40", listNewString.get(3));
	}

	@Test
	public void testCalcularMedia() {
		List<Integer> listaMedia = new ArrayList<>();
		List<Integer> listaMedia2 = new ArrayList<>();
		List<Integer> listaMedia3 = new ArrayList<>();

		listaMedia.add(10);
		listaMedia.add(20);
		listaMedia.add(30);
		listaMedia.add(40);

		listaMedia3.add(50);

		double result = example.calcularMedia(listaMedia);
		double result2 = example.calcularMedia(listaMedia3);

		assertInstanceOf(Double.class, result);
		assertInstanceOf(Double.class, result2);
		assertEquals(25, 0, result);
		assertEquals(50.0, result2);
		assertThrows(IllegalArgumentException.class, () -> {
			example.calcularMedia(listaMedia2);
		});
	}

	@Test
	// 11. Método para convertir una lista de enteros a lista de strings
	public void testConvertirListaAString() {
		List<String> newList = new ArrayList<>();
		List<String> emptyList = new ArrayList<>();

		newList.add("hola");
		newList.add("mundo");
		newList.add(null);
		newList.add("java");

		String result = example.convertirListaAString(newList);
		String result2 = example.convertirListaAString(emptyList);

		assertInstanceOf(String.class, result);
		assertInstanceOf(String.class, result2);

		assertEquals("", result2);

		String expected = "HOLA,MUNDO,NULL,JAVA";

		assertEquals(expected, result, "La conversión de la lista no es correcta.");

		List<String> listaSoloNull = new ArrayList<>();
		listaSoloNull.add(null);
		listaSoloNull.add(null);

		String result3 = example.convertirListaAString(listaSoloNull);

		assertEquals("NULL,NULL", result3);
	}
}
