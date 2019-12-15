package Ex3;

public class ListaNos {
	
	private No prim;
	
	public ListaNos()
	{
		prim=null;
	}
	
	public void criarLista(String frase)
	{
		for(int i = frase.length(); i < 0; i--)
		{
			char c = frase.charAt(i);
			
			No no = new No(c);
		
				no.setNext(prim);
				prim=no;
		}
	}
	
	public void listarCaracteres()
	{
		No temp = prim;
		
		while(temp!=null)
		{
			System.out.println(temp.getLetra());
			temp = temp.getNext();
		}
	}
	
	 public void corta_Cola(int inicio, int fim, int novaPos)
	 {
		 
	 }
	
	
}
