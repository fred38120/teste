package Ex1;
public class ListaNos {
	
	private No prim;
	
	public ListaNos()
	{
		prim=null;
	}
	
	public boolean adicionar(int n) //Adiciona um numero ao ínicio da LikedList
	{	
		No no = new No(n);
		
		if(this.isEmpty()) //verificar lista vazia
		{
			prim = no;
			return true;
		}
		
		if(this.hasRepetition(n)==null) //se a lista nao tem o numero repetido -> adicionar
		{
			no.setNext(prim);
			prim = no;
			
			return true;
		}
		
		return false;
	}
	
	public void eliminar(int n) //Dado um numero, eliminar da LinkedList
	{
		No temp = prim;
		
		if(this.isEmpty()) //Lista vazia
		{
			//TODO
		}
		
		if(temp.getNum()==n)
		{
			prim=temp.getNext();
		}
		else
		{
		
			while(temp.getNext()!=null && temp.getNext().getNum()!=n) //Enquanto o próximo elemnto for diferente do n, passar para o proximo elemento
			{				
				temp = temp.getNext();
			}
			
			if(temp.getNext()!=null)
			{
				temp.setNext(temp.getNext().getNext());
			}
		}
	}
	
	public void imprimir()
	{
		No temp = prim;
		
		while(temp!=null)
		{
			System.out.println(temp.toString());
			temp=temp.getNext();
		}
	}
	
	public int contar()
	{
		int c = 0;
		No temp = prim;
		
		if(this.isEmpty()==false)
		{
			while(temp.getNext()!=(null))
			{	
				c++;
				temp = temp.getNext();
			}
			
			return c;
		}
		
		return 0;
	}
	
	public boolean isEmpty()
	{
		if(prim==null)
		return true;		
		return false;
	}
	
	public No hasRepetition(int n)
	{		
		No temp = prim;
		
		while(temp!=null && n!=temp.getNum())
		{				
			temp = temp.getNext();
		}
			
		return temp;
	}
}
