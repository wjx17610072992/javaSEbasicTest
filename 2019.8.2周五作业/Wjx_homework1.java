// ������ҵ��һ��
import java.util.Arrays;
public class Wjx_homework1{
	public static void main(String[]args){
		String str = "ͳ��һ���ַ����ַ������е�����λ��";
		int[] ary = countAll(str, '��');
		System.out.println(Arrays.toString(ary));
		
		}
		
		public static int[] countAll(String str, char ch){
			int[] ary =  {};
			for (int i=0; i<str.length(); i++){
				char c = str.charAt(i);
				if(c==ch){
					ary = Arrays.copyOf(ary,ary.length+1);
					ary[ary.length-1] = i;
				}
			}
			return ary;
		}
		
	
}

