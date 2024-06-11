package main;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("-------------------------- CONVERSOR DE BASES --------------------------");
        
        System.out.print("\nEscolha uma opção de conversão:\n\n1 - Decimal para Binário\n2 - Binário para Decimal\n3 - Decimal para Hexadecimal\n4 - Hexadecimal para Decimal\n5 - Decimal para Octal\n6 - Octal para Decimal\n\n : ");

        int opcao = 0;
        boolean continuar = true;

        do {
            Scanner scan2 = new Scanner(System.in);
            try{
                opcao = scan2.nextInt();

                if(opcao > 6 || opcao < 1){
                    System.out.print("\n\nEntrada inválida!!!\nDigite novamente : ");
                }else{
                  continuar = false;  
                }

            }catch(Exception e){
                System.out.print("\nEntrada inválida!!!\nDigite novamente : ");
            }
        } while (continuar);

        String valor = "";

        switch (opcao) {
        	
            case 1:
            	continuar = true;
            	
                System.out.print("\nEntre com o valor em Decimal: ");
                do {
                	valor = scan1.next();
                	if(Conversor.validaDec(valor) == false) {
                		System.out.print("\nO valor informado não é um número decimal!\n\nDigite novamente : ");
                	}else {
                		continuar = false;
                	}
                }while(continuar);
               
                System.out.printf("\nO valor %s convertido para Binário é %s%n%n", valor, Conversor.dec_para_bin(valor));
                break;
        
            case 2:
            	continuar = true;
            	
                System.out.print("\nEntre com o valor em Binário: ");
                do {
                	valor = scan1.next();
                	if(Conversor.validaBin(valor) == false) {
                		System.out.print("\nO valor informado não é um número binário\n\nDigite novamente : ");
                	}else {
                		continuar = false;
                	}
                }while(continuar);
                
                System.out.printf("\nO valor %s convertido para Decimal é %s%n%n", valor, Conversor.bin_para_dec(valor));
                break;
            case 3:
            	continuar = true;
            	
                System.out.print("\nEntre com o valor em Decimal: ");
                do {
                	valor = scan1.next();
                	if(Conversor.validaDec(valor) == false) {
                		System.out.print("\nO valor informado não é um número decimal!\n\nDigite novamente : ");
                	}else {
                		continuar = false;
                	}
                }while(continuar);
                
                System.out.printf("\nO valor %s convertido para Hexadecimal é %s%n%n", valor, Conversor.dec_para_hex(valor));
                break;
            case 4:
            	continuar = true;
            	
                System.out.print("\nEntre com o valor em Hexadecimal: ");
                do {
                	valor = scan1.next();
                	if(Conversor.validaHex(valor) == false) {
                		System.out.print("\nO valor informado não é um número Hexadecimal!\n\nDigite novamente : ");
                	}else {
                		continuar = false;
                	}
                }while(continuar);
                
                System.out.printf("\nO valor %s convertido para Decimal é %s%n%n", valor, Conversor.hex_para_dec(valor));
                break;
            case 5:
            	continuar = true;
            	
                System.out.print("\nEntre com o valor em Decimal: ");
                do {
                	valor = scan1.next();
                	if(Conversor.validaDec(valor) == false) {
                		System.out.print("\nO valor informado não é um número decimal!\n\nDigite novamente : ");
                	}else {
                		continuar = false;
                	}
                }while(continuar);
                
                System.out.printf("\nO valor %s convertido para Octal é %s%n%n", valor, Conversor.dec_para_oct(valor));
                break;
            case 6:
            	continuar = true;
            	
                System.out.print("\nEntre com o valor em Octal: ");
                do {
                	valor = scan1.next();
                	if(Conversor.validaOct(valor) == false) {
                		System.out.print("\nO valor informado não é um número Octal!\n\nDigite novamente : ");
                	}else {
                		continuar = false;
                	}
                }while(continuar);
                
                System.out.printf("\nO valor %s convertido para Decimal é %s%n%n", valor, Conversor.oct_para_dec(valor));
                break;
        }

        scan1.close();
    }
}