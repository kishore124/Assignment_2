
public class BubbleSort {

	public static void main(String[] args)
	{
		int []arr= {5,8,9,4,3,5,4,7,8,5,5,2,1,2,8,3,9,1,7,8};
		sorting(arr);
		// to print sorted array
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
    public static void sorting(int []arr)
    {
    	boolean swap;
    	for(int i=0;i<arr.length;i++)
    	{
    		swap=false;
    		for(int j=1;j<arr.length-i;j++)
    		{
    			if(arr[j]<arr[j-1])
    			{
    				int temp=arr[j];
    				arr[j]=arr[j-1];
    				arr[j-1]=temp;
    				swap=true;	
			}
		}
    		/*
    		 * Check for any swapping process is done or not , if no swapping is done then
    		 * the array is sorted (end of program).
    		 */
    		if(swap==false)
    		{
    			break;
    			
    		}
	}
}
}
