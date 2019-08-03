// 周五作业第一题
import java.util.Arrays;
public class Wjx_homework1{
	public static void main(String[]args){
		String str = "统计一个字符在字符串中中的所有位置";
		int[] ary = countAll(str, '中');
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

