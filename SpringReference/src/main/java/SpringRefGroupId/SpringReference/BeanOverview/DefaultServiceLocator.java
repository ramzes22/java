package SpringRefGroupId.SpringReference.BeanOverview;

public class DefaultServiceLocator {

	private static Service service = new Service();
	
	public DefaultServiceLocator() {
		System.out.println("DefaultServiceLocator was created....");
	}
	
	public Service getService()
	{
		return service;
	}
}
