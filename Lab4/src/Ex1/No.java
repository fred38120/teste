package Ex1;
public class No {
	
	private int n;
	private No next;
	
	public No(int n)
	{
		this.n = n;
	}
	
	public int getNum()
	{
		return n;
	}
	
	public void setNome(int n)
	{
		this.n = n;
	}
	
	public No getNext()
	{
		return next;
	}
	
	public void setNext(No proximo)
	{
		next = proximo;
	}

	@Override
	public String toString() {
		return "No [Numero=" + this.n+"]";
	}
	
	
	
}
