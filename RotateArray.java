package com.xworkz.aptitude;

public class RotateArray {

	
	
/*	rotate array by Problem: Rotate an array of n elements to the right by k steps.
	For example, with n= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/
	public static int[] rotateArray(int[] array,int number) {
		//using bubble sort
		System.out.println("rotate position number:"+number);
		for(int i=0;i<number;i++) {
			
			for(int j=array.length-1;j>0;j--) {
				int temp=array[j];
				array[j]=array[j-1];
				array[j-1]=temp;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7};
		int returnArray[]=RotateArray.rotateArray(array,1);
		for(int i=0;i<returnArray.length-1;i++) {
			System.out.println(returnArray[i]);
		}
	}

}
