
public class Subset_of_Array {

	public static void main(String[] args)
	{
		
	int []a= {2,3,5,6,4,3,6};
	int []b= {3,4,5};
	int count=0;
	boolean c=false;
	for(int i=0;i<b.length;i++)
	{
		count=0;
		for(int j=0;j<a.length;j++)
		{
			if(b[i]==a[j])
			{
				count++;
			}
		}
		if(count==0)
		{
			c=true;
			System.out.println("Array B is not subset of A");
			break;
		}
	}
if(c==false)
{
	System.out.println("Array B is subset of A");
}
	}

}
