package com.demo;

public class BubSort {

	
	public static void main(String[] args) {
		int i,j,temp;
		int arr[] = {34,89,12,45,23,8,19,76,38};
		
		for(i=0; i<=arr.length-2; i++)
		{
			for(j=0; j<=arr.length-2-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
//					temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
					arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
				}
			}
		}
		
//		for(i=0; i<=arr.length-1; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	

}
