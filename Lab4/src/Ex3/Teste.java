package Ex3;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		ListaNos lista = new ListaNos();
		int n;
			
		System.out.println("*********MENU*********");
		System.out.println("1) Adicionar String");
		System.out.println("2) Imprimir Lista");
		System.out.println("3) Corta Cola");
		System.out.println("0) Sair");
			
		int q = scanf.nextInt();
		boolean quit = false;
			
		do {
			switch(q)
			{
			case 1: //Adicionar Numero
				System.out.println("Qual o numero que quer adicionar?");
				String frase = scanf.next();
				lista.criarLista(frase);
				break;
				
			case 2: //Imprimir Lista
				lista.listarCaracteres();
				break;
				
			case 3: //Eliminar Elementos
				System.out.println("Qual o numero que pretende eliminar?");
				//lista.eliminar(n = scanf.nextInt());
			
			case 0: //Sair
				quit = false;
				break;
				
			default:
				System.out.println("Invalido");
				break;
			}
			
			System.out.println("*********MENU*********");
			System.out.println("1) Adicionar Numero");
			System.out.println("2) Imprimir Lista");
			System.out.println("3) Eliminar Elemento");
			System.out.println("0) Sair");
				
			q = scanf.nextInt();
			
		}while(quit!=true);
	}
		
}
