//Java
import java.util.*;
public class Wjx_practice1{
	public static void main(String[]args){
	/*	String str = "ͳ��һ���ַ����ַ����е�����λ��";
		System.out.print("��������ҵ��ַ�:");
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
		
		
		
		String str1="ѩ�к����б��������������֥������������";
		System.out.print("��������ҵ��ַ�:");
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
		
		
		
		String str2 = "��֮��������������㲻��ʤ����";
		System.out.println("��������ҵ��ַ�:");
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
		 //��������
		 for(int i=0;i<num.length-1;i++){
			 //ÿһ�˴���
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
