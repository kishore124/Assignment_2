
public class DuplicatesInArray {

	public static void main(String[] args) 
	{
	int []arr= {1,4,1,2,3,2,3};
	boolean check=false;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				
		System.out.println("Duplicate Elemets "+arr[i]);
			check=true;	
			}
		}
	
	}
	if(check==false)
	{
		System.out.println("No duplicate elements");
	}
	}
}
