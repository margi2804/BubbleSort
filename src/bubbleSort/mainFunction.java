package bubbleSort;

import java.util.Scanner;

public class mainFunction {
	Scanner sc = new Scanner(System.in);
	
	//method
	void bubbleSort(int array[]) { 
		int size = array.length;
		System.out.println("Choose array order : ");
		System.out.println("Press 1 for Ascending Order \nPress 2 for Descending Order");
		int ordering = sc.nextInt();
		
		// this loop will access array components starting from 0th
		for(int i=0; i < size - 1; i++) {
			
			//this loop is for comparing elements inside the array
			for(int j = 0; j < size - i - 1; j++) {
				//Ascending Order
				if(ordering == 1 ) {					
					if(array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
				//Descending Order
				else {
					if(array[j] < array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
					
				}
			}
		}
	}

}
