package files;

public class Thread implements Runnable
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Thread t = new Thread();
t.run();
for(int a=1;a<=10;a++)
{
	System.out.println("a="+a);
}
}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		for(int i=0;i<=9;i++)
		{
			System.out.println("i="+i);
		}
	}

}
