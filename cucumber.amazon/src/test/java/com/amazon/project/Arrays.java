package com.amazon.project;

public class Arrays {

	public static void main(String[] args) {
		int[] arr = {4,5,1,2,3,5,7,12};
		System.out.println(arr.length);

		// Sum of the array elements
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum = sum + arr[i];	
			}
		System.out.println("Sum of the Array is:" +sum);
		
		// Multiply of the array elements
		int mul=1;
		for (int i=0;i<arr.length;i++) {
			mul = mul * arr[i];	
			}
		System.out.println("Multiplication  of the Array is:" +mul);
		
		// Maximum of the array elements
		int Max=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (Max<arr[i]) {
				Max= arr[i];	
			}
		}
		System.out.println("Maximum of the Array is:" +Max);

		// Minimum of the array elements
		int Min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (Min>arr[i]) {
				Min= arr[i];	
			}
		}
		System.out.println("Maximum of the Array is:" +Min);

		// duplicate in the array elements
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.println("Maximum of the Array is:" +arr[i]);	
				}
			}
		}
		
		// square elements in the array
		for (int i=0;i<arr.length;i++) {
			int same= arr[i];
			same = same * arr[i];
			System.out.println("Multiplication of same array elements is:"+ same);

		}
		// Sum same elements in the array
		for (int i=0;i<arr.length;i++) {
			int me= arr[i];
			me = me + arr[i];
			System.out.println("Multiplication of same array elements is:"+ me);
		}
	   // Reverse of the array
		for (int i=arr.length-1;i>=0;i--) {
			int rev = arr[i];
			System.out.print(rev+" ");
		}
		System.out.println(" ");

		// Ascending order
//		 {4,5,1,2,3,5,7,12}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
					if (arr[i]>arr[j]) {   
						int temp = arr[i]; 
						arr[i]=arr[j];  
						arr[j]=temp;   
					}
			}

		}
		System.out.println("Ascending order is:");

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.println(" ");

		// Descending order
//		 {4,5,1,2,3,5,7,12}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
					if (arr[i]<arr[j]) {   
						int temp = arr[i];   // temp = 5
						arr[i]=arr[j];       // 4 in 5 
						arr[j]=temp;         // 5 in 4
					}
			}

		}
		System.out.println("Descending order is:");

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");

		}
	}
}
