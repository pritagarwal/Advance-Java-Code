package in.ineuron;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static int sum(int a ,int b)
	{
		int sum  = a+b;
		return sum;
	}
    public static void main( String[] args )
    {
    	int sum = App.sum(1, 2);
        System.out.println( "The sum is :-"+sum);
    }
}
