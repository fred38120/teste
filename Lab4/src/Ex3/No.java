package Ex3;

public class No {
	
	private char letra;
	private No next;
	
	public No(char letra)
	{
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public No getNext() {
		return next;
	}

	public void setNext(No next) {
		this.next = next;
	}
	
	
	
	
}
