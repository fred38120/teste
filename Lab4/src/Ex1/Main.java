package Ex1;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner scanf = new Scanner(System.in);
		ListaNos lista = new ListaNos();
		int n;
		
		System.out.println("*********MENU*********");
		System.out.println("1) Adicionar Numero");
		System.out.println("2) Eliminar Numero");
		System.out.println("3) Imprimir Lista");
		System.out.println("4) Contar Lista");
		System.out.println("5) Verificar se a lista está vazia");
		System.out.println("6) Verificar se existe repetição");
		System.out.println("0) Sair");
		
		int q = scanf.nextInt();
		boolean quit = false;
		
		do {
			
			switch(q)
			{
			case 1: //Adicionar Numero
				System.out.println("Qual o numero que quer adicionar?");
				n = scanf.nextInt();
				if(lista.adicionar(n))
				{
					System.out.println("Numero: "+n+" adicionado!");
				}
				break;
				
			case 2: //Eliminar Numero
				
				break;
				
			case 3: //Imprimir Lista
				lista.imprimir();
				break;
				
			case 4: //Contar
				
				break;
				
			case 5: //Verificar se a lista está vazia
				
				break;
				
			case 6: //Verificar se existe repetição
				
				break;
				
			case 0:
				quit = true;
				break;
				
			default:
				System.out.println("Invalido");
			}
			
			System.out.println("*********MENU*********");
			System.out.println("1) Adicionar Numero");
			System.out.println("2) Eliminar Numero");
			System.out.println("3) Imprimir Lista");
			System.out.println("4) Contar Lista");
			System.out.println("5) Verificar se a lista está vazia");
			System.out.println("6) Verificar se existe repetição");
			System.out.println("0) Sair");
			q = scanf.nextInt();
			
			
		}while(quit!=true);
	}
}
