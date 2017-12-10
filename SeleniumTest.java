

public class SeleniumTest {
	
	public static void main (String [] args)
	{
		 int [] arr= {1,4,5,6,8};
		 TestArray t= new TestArray();
		 t.tail="hhh";
		 int c=t.Sum(arr, 5);
		 t.SumTest();
		 t.SumTestNull();
		 t.SumTestBignum();
//		 System.out.println(t);
		 System.out.println(c);
		 Animal an = new Animal();
		 an.tail="poch";
		 an.tat=4;

	}
	
}


