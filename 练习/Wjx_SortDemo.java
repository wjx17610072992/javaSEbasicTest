import java.util.Arrays;
public class Wjx_SortDemo{
	public static void main(String[] args){
		int[] arr={2,3,1,5,67,7,4,23,122,43};
		arr = bubbleSort(arr);
		int[] arr1= selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		

	}
	public static int[] selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	
	
	
	
	public static int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	
	
	
	
}