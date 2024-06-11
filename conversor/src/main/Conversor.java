package main;

import java.sql.ClientInfoStatus;

public class Conversor {

	public static String dec_para_bin(String numDec) {

		int dividendo = Integer.parseInt(numDec);
		int resto = 0;
		String binInvertido = "";

		// Descobre valor binário invertido
		while (dividendo != 0) {
			resto = dividendo % 2;
			binInvertido += resto;
			dividendo /= 2;
		}

		// Desinverte o número binário
		String binReal = "";
		for (int i = binInvertido.length() - 1; i >= 0; i--) {
			binReal += binInvertido.charAt(i);
		}

		return binReal;
	}

	public static String bin_para_dec(String numBin) {
		int somaNum = 0;
		int indice = 0;

		for (int i = numBin.length() - 1; i >= 0; i--) {
			String num = Character.toString(numBin.charAt(i));
			somaNum += Integer.parseInt(num) * Math.pow(2, indice);
			indice++;
		}

		return "" + somaNum;
	}

	public static String dec_para_hex(String dec) {
		int dividendo = Integer.parseInt(dec);
		int resto = 0;
		String numHexInvertido = "";

		while (dividendo != 1) {
			resto = dividendo % 16;

			if (resto == 10) {
				numHexInvertido += "A";
			} else if (resto == 11) {
				numHexInvertido += "B";
			} else if (resto == 12) {
				numHexInvertido += "C";
			} else if (resto == 13) {
				numHexInvertido += "D";
			} else if (resto == 14) {
				numHexInvertido += "E";
			} else if (resto == 15) {
				numHexInvertido += "F";
			} else {
				numHexInvertido += resto;
			}

			dividendo /= 16;

			if (dividendo == 1) {
				numHexInvertido += 1;
			}
		}

		String numHex = "";
		for (int i = numHexInvertido.length() - 1; i >= 0; i--) {
			numHex += numHexInvertido.charAt(i);
		}

		return numHex;
	}

	public static String hex_para_dec(String hex) {

		// MANEIRA MAIS FÁCIL DE FAZER
		// return "" + Integer.parseInt(hex, 16);

		//MAIS DIFÍCIL, IMPLEMENTANNDO A LÓGICA
		int numDec = 0;
		int indice = 0;

		for (int i = hex.length() - 1; i >= 0; i--) {
			if (hex.charAt(i) == 'A' || hex.charAt(i) == 'a') {
				numDec += 10 * Math.pow(16, indice);
				;
			} else if (hex.charAt(i) == 'B' || hex.charAt(i) == 'b') {
				numDec += 11 * Math.pow(16, indice);
				;
			} else if (hex.charAt(i) == 'C' || hex.charAt(i) == 'c') {
				numDec += 12 * Math.pow(16, indice);
				;
			} else if (hex.charAt(i) == 'D' || hex.charAt(i) == 'd') {
				numDec += 13 * Math.pow(16, indice);
				;
			} else if (hex.charAt(i) == 'E' || hex.charAt(i) == 'e') {
				numDec += 14 * Math.pow(16, indice);
				;
			} else if (hex.charAt(i) == 'F' || hex.charAt(i) == 'f') {
				numDec += 15 * Math.pow(16, indice);
				;
			} else {
				numDec += Integer.parseInt(Character.toString(hex.charAt(i))) * Math.pow(16, indice);
			}

			indice++;
		}

		return "" + numDec;
	}

	public static String dec_para_oct(String dec) {
		int dividendo = Integer.parseInt(dec);
		String numOctInv = "";

		while (dividendo != 0) {
			numOctInv += (dividendo % 8);
			dividendo /= 8;
		}

		String numOct = "";
		for (int i = numOctInv.length() - 1; i >= 0; i--) {
			numOct += numOctInv.charAt(i);
		}
		return numOct;
	}

	public static String oct_para_dec(String oct) {

		int numDec = 0;
		int indice = 0;

		for (int i = oct.length() - 1; i >= 0; i--) {
			numDec += (Integer.parseInt(Character.toString(oct.charAt(i))) * Math.pow(8, indice));
			indice++;
		}

		return "" + numDec;
	}

	// Métodos de validação dos números passados

	// Varifica se tem letra no número
	private static boolean contemLetra(String valor) {
		for (int i = 0; i < valor.length(); i++) {
			char c = valor.charAt(i);

			if (Character.isLetter(c)) {
				return true;
			}
		}
		return false;
	}

	// Decimal
	public static boolean validaDec(String num) {
		if (contemLetra(num) == true) {
			return false;
		}
		return true;
	}

	// Binário
	public static boolean validaBin(String num) {
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);

			if (Character.isLetter(c) || (c != '1' && c != '0')) {
				return false;
			}
		}
		return true;
	}

	// Hexadecimal
	public static boolean validaHex(String num) {// O método que mais deu trabalho até agora
		String letras = "";

		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);

			if (Character.isLetter(c)) {
				letras += c;
			}
		}

		String letrasValidas = "AaBbCcDdEeFf";

		int validas = 0;

		for (int i = 0; i < letras.length(); i++) {

			int qtdValidas = 0;
			validas = 0;

			char c = letras.charAt(i);

			for (int j = 0; j < letrasValidas.length(); j++) {// Arrays não tem o método length() mas o atributo length
				if (c == letrasValidas.charAt(j)) {
					qtdValidas++;
					validas++;
					break;
				}
				if (j == 11 && qtdValidas == 0) {
					return false;
				}
			}
		}
		return true;
	}

	// Octal
	public static boolean validaOct(String num) {

		if (contemLetra(num) == true) {
			return false;
		}
		
		for(int i = 0; i < num.length(); i++) {
			int n = Integer.parseInt(Character.toString(num.charAt(i)));
			if(n > 7 || n < -7) {
				return false;
			}
		}
		return true;
	}
}
