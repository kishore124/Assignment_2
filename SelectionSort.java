

public class SelectionSort 
{

	public static void main(String[] args)
	{
		int []arr= {5,8,9,2,3,5,1,2};
		select(arr);
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}
	static void select(int[] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			int lastIndex=arr.length-i-1;
			int maxValueIndex=getmaxIndex(arr,0,lastIndex);
			swap(arr,lastIndex,maxValueIndex);
		}
	}
	//Method for Swaping the lastIndex value with maxIndex value
	static void swap(int[] arr,int first,int second)
	{
		
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	// Method to find the max element index
	static int getmaxIndex(int[] arr,int start,int end)
	{
		int max=start;
		for(int i=start;i<=end;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		return max;
	}

}
