package ui;

import java.io.IOException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws IOException{
			
			Scanner sc = new Scanner(System.in);
			
			int amount = sc.nextInt();
			
			sc.nextLine();
			
			String [] numbers = new String[amount];
			
			for (int i=0; i<amount; i++) {
				numbers[i] = sc.nextLine(); 
			}
			
			for(int i=0; i<amount; i++) {
				System.out.println(bubbleSort(toDouble(numbers[i])));
			}
			
			sc.close();
	}
	
	public static double[] toDouble(String line) {
		
		String [] converter = line.split("\\ ");
		double [] arrayDouble = new double[converter.length];
		
		for(int i=0; i<converter.length;i++) {
			arrayDouble[i]= Double.parseDouble(converter[i]);
		}
		
		return arrayDouble;
	}
	

	public static String bubbleSort(double[] array) {
		
		boolean changed = true;
		double num=0;
		String output="";
		
		for(int i=1; i < array.length && changed; i++ ) {
			
			changed = false;
			
			for (int j=0; j<array.length-1; j++) {
				
				if(array[j]>array[j+1]) {
					double temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					num++;
					changed = true;
					
				}			
			}
		}
		
		double average = num / (array.length-1);
		double finalAverage = Math.floor(average * 100)/100;
		
		boolean out = false;
		
		for(int i = 0; i<array.length; i++) {
			if(out) {
			output += " ";
			}
			output += array[i];
			out=true;
		}
		
		
		//output += array[array.length-1]; 
		
		
		return finalAverage+"-"+output;
		
	}
	
}
