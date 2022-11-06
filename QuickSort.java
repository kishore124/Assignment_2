import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) 
	{
		int []arr= {10,20,3,5,1,0,22,45};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	static void sort(int []arr,int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int start=low;
		int end=high;
		int mid=(start+end)/2;
		int pivot=arr[mid];
		while(start<=end)
		{
			while(arr[start]<pivot)
			{
				start++;
			}
			while(arr[end]>pivot)
			{
				end--;
			}
			if(start<=end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		sort(arr,low,end);
		sort(arr,start,high);
	}

}
