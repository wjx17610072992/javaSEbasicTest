//Java
import java.util.*;
public class Wjx_practice1{
	public static void main(String[]args){
	/*	String str = "统计一个字符在字符串中的所有位置";
		System.out.print("请输入查找的字符:");
		Scanner scanner = new Scanner(System.in);
		String content = scanner.next();
		char first = content.charAt(0);
		int [] pos = {};
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c==first){
				pos = Arrays.copyOf(pos,pos.length+1);
				pos[pos.length-1] = (int)i;
			}
			
		}
		System.out.println(Arrays.toString(pos));
		
		
		
		String str1="雪中悍刀行北凉王徐凤年王仙芝李淳罡徐骁王嘉兴";
		System.out.print("请输入查找的字符:");
		Scanner scanner1 = new Scanner(System.in);
		String jx = scanner1.next();
		char first1 = jx.charAt(0);
		int[] pos1 = {};
		for(int i1=0;i1<str1.length();i1++){
			char cc = str1.charAt(i1);
			if(cc==first1){
				pos1 = Arrays.copyOf(pos1,pos1.length+1);
				pos1[pos1.length-1] = (int)i1;
			}
			
		}
		System.out.print(Arrays.toString(pos1));
		
		
		
		String str2 = "天之道损有余而补不足不足胜有余";
		System.out.println("请输入查找的字符:");
		Scanner num = new Scanner(System.in);
		String num1 = num.next();
		char first2 = num1.charAt(0);
		int[] pos2 = {};
			for(int b=0;b<str2.length();b++){
				char ccc = str2.charAt(b);
			if(ccc==first2){
				pos2 = Arrays.copyOf(pos2,pos2.length+1);
				pos2[pos2.length-1]=(int)b;
			}
		}
		System.out.println(Arrays.toString(pos2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] arr = {8,2,3,7,1,6,9,3,10};
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));	
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
		return arr;*/
		 
		 
		 /* int[] num = {-9,888,12,241,0,1};
		 //控制趟数
		 for(int i=0;i<num.length-1;i++){
			 //每一趟次数
			 for(int j=i+1;j<num.length;j++){
				 if(num[i]>num[j]){
					 int temp = num[i];
					 num[i] = num[j];
					 num[j] = temp;
				 }
			 }
			  
		 }
		System.out.println(Arrays.toString(num));
		} */
		
		int[] arr = {5,3,2,1,88,12,31};
		int[] arr1 = bubbleSort(arr);
		System.out.println(Arrays.toString(arr1));		
		
		
		
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
