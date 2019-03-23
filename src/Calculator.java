public class Calculator 
{
	private int result=0;
	public void add(int n)
	{
		result = result + n;
	}
	public void substract(int n)
	{
		result = result - n;
	}
	public void multiply(int n)
	{
		result = result * n;
	}
	public void divide(int n)
	{
		result = result / n;
	}
	public int getResult()
	{
		return result;
	}
}