public class QuickSort
{
	public static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j=low; j<high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				//swaping
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			//System.out.print(arr[i]+" ");
			
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
		
	}	
	public static void quicksort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int pivtindx = partition(arr, low, high);
			
			quicksort(arr, low, pivtindx-1);
			quicksort(arr, pivtindx+1, high);
		}
	}
	public static void main(String args[])
	{
		int[] arr = {6,3,9,5,2,8,7};
		int n = 7;
		
		quicksort(arr, 0, n-1);
		
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}