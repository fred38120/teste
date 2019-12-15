package Ex2;

import Ex1.No;

public class ListaNos {

	private No prim;
	
	public ListaNos()
	{
		prim=null;
	}
	
	public boolean isEmpty() //Verifica se a lista está vazia (se prim == null)
	{
		if(prim==null)
		return true;		
		return false;
	}
	
	public void setPrim(No prim) {
		this.prim = prim;
	}

	public No getPrim() {
		return prim;
	}

	public void adicionar(int n) //Adiciona um numero ao ínicio da LikedList
	{	
		No no = new No(n); //Cria a node
		
		if(prim==null) {
			setPrim(no);
			no.setNext(null);
		}
		else {
			no.setNext(prim);
			prim=no;
		}
		
	}
	
	public void imprimir() //Imprime todos os elementos da LinkedList
	{
		No temp = prim;
		
		while(temp!=null) //Enquanto o temporário for diferente de nulo, imprime toString()
		{
			System.out.println(temp);
			temp=temp.getNext();
		}
	}
	
	public int eliminar(int n) //Dado um número, elimina todas as suas ocorrências. Return o numero de ocorrências eliminadas
	{
		No temp = prim;
		No fim;
		int c = 0;
		
		if(this.isEmpty()) //Se a lista estiver vazia, retorna -1
		{
			return -1;
		}
		
		if(prim.getNum()==n) //Se o primeiro valor for "5"
		{
			c++;
			if(prim.getNext().getNum()==n) //Se o proximo valor for igual a "5" - REDUNDANTE?
			{
				c++;
				fim = temp.getNext(); //fim = "5"
				
				while(fim.getNext().getNum()==n) //Para quando o proximo nao for = 5, ou seja, no último "5" consecutivo.
				{
					c++;
					fim = fim.getNext();
				}
				
				prim.setNext(fim.getNext());
			}
			
			temp = temp.getNext();
		}
		
		while(temp.getNext()!=null) //Se o primeiro valor nao for "5" OU se ainda existirem repetições
		{
			if(temp.getNext().getNum()==n) //Se o proximo valor for igual a "5"
			{
				c++;
				fim = temp.getNext(); //fim = "5"
				
				while(fim.getNext().getNum()==n) //Para quando o proximo nao for = 5, ou seja, no último "5" consecutivo.
				{
					c++;
					fim = fim.getNext();
				}
				
				temp.setNext(fim.getNext());
			}
			
			temp = temp.getNext();	
		}
		
		return c;
	}
}
