package test;

import main.Conversor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {
    
	@Test
	void teste_valida_binario_false() {
		boolean passa = Conversor.validaBin("10011012");
		assertFalse(passa);
	}
	
	@Test
	void teste_valida_binario_true() {
		boolean passa = Conversor.validaBin("01010110110101");
		assertTrue(passa);
	}
	
	@Test
	void teste_valida_decimal_false() {
		boolean passa = Conversor.validaDec("783a");
		assertFalse(passa);
	}
	
	@Test
	void teste_valida_decimal_true() {
		boolean passa = Conversor.validaDec("235");
		assertTrue(passa);
	}
	
	@Test
	void teste_valida_hexadecimal_false() {
		boolean passa = Conversor.validaHex("5b7t");
		assertFalse(passa);
	}
	
	@Test
	void teste_valida_hexadecimal_true() {
		boolean passa = Conversor.validaHex("1f4c8");
		assertTrue(passa);
	}
	
	@Test
	void teste_valida_octal_false() {
		boolean passa = Conversor.validaOct("0397");
		assertFalse(passa);
	}
	
	@Test
	void teste_valida_octal_true() {
		boolean passa = Conversor.validaOct("2361");
		assertTrue(passa);
	}
	
	@Test
	void teste_converte_decimal_para_binario() {
		assertEquals("111100011", Conversor.dec_para_bin("483"));
	}
	
	@Test
	void teste_converte_binario_para_decimal() {
		assertEquals("7539", Conversor.bin_para_dec("1110101110011"));
	}
	
	@Test
	void teste_converte_decimal_para_hexadecimal() {
		assertEquals("15C", Conversor.dec_para_hex("348"));
	} 
	
	@Test
	void teste_converte_hexadecimal_para_decimal() {
		assertEquals("8076527", Conversor.hex_para_dec("7b3cef"));
	} 
	
	@Test
	void teste_converte_decimal_para_octal() {
		assertEquals("31", Conversor.dec_para_oct("25"));
	}
	
	@Test
	void teste_converte_octal_para_decimal() {
		assertEquals("90", Conversor.oct_para_dec("132"));
	}
}
