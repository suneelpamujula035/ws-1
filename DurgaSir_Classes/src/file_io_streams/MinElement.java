package file_io_streams;

public class MinElement {

	public static void main(String[] args) {

		int arr[] = {45,34,98,78,12,38,96,57};
		
		int min = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum element in Array is : "+min);
	}

}
