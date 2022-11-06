import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) 
	{
		int []arr= {3,5,7,0,3,6,8,99,4,5,6};
		
		arr=sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
   static int[] sorting(int []arr)
   {
	   if(arr.length==1)
	   {
		   return arr;
	   }
	   int mid=arr.length/2;
	   int[]left=sorting(Arrays.copyOfRange(arr, 0, mid)); // left array
	   int[]right=sorting(Arrays.copyOfRange(arr, mid, arr.length)); // right array
	   
	   return merge(left,right);
   }
   
   // Method to merge two arrays in sorted order(ascending)
   static int []merge(int []left,int[]right)
   {
	   int []mix=new int[left.length+right.length];
	   int i=0,j=0,k=0;
	   while(i<left.length && j< right.length)
	   {
		   if(left[i]<right[j])
		   {
			   mix[k]=left[i];
			   i++;
			   k++;
		   }
		   else
		   {

			   mix[k]=right[j];
			   j++;
			   k++;
		   }
	   }
	   while(i<left.length)
	   {
		   mix[k]=left[i];
		   i++;
		   k++;
	   }
	   while(j<right.length)
	   {
		   mix[k]=right[j];
		   j++;
		   k++;
	   }
	   return mix;
   }
}
