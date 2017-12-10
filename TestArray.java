
public class TestArray {
	public  String tail;
	public int Sum (int arr[], int count)
	{
		int sum=0;
		for (int i =0; i<count; i++)
		{
    	   sum+=arr[i];
		}
		return sum;
	}
	
	public void SumTest ()
	{
		 
		try
		{
			int [] arr= {1,4,5,6,-8,8};
			 this.Sum(arr, 8);
  	}
		catch(Exception e)
		{
			System.out.println(e + "hhh");
			
		}
		
	}
	
	public void SumTestNull ()
	{
		 
		try
		{
			int [] arr= {};
			 this.Sum(arr, 2);
  	    }
		catch(Exception e)
		{
			System.out.println(e + "Nullllllll.");
			
		}
		
	}
	
	public void SumTestBignum ()
	{
		try
		{
			int [] arr = {1,5,8, 2147483647};
			this.Sum(arr, 4);
  	    }
		catch(Exception e)
		{
			System.out.println(e + "big.");
		}
	}
}



	