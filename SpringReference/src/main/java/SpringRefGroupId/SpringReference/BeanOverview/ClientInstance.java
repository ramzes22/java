package SpringRefGroupId.SpringReference.BeanOverview;

public class ClientInstance
{	
	private static ClientInstance instance = new ClientInstance();
	
	private ClientInstance(){}
	
	public static ClientInstance getIntstance()
	{
		System.out.println("ClientInstance was created....");
		return instance;
	}
	
	public void test()
	{
		System.out.println("test");
	}
}
