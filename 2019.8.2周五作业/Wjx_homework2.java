// ������ҵ�ڶ���
import java.util.Arrays;
public class Wjx_homework2{
    public static void main(String[]args){
		char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
		char ch = '��';
		int[] ary = countAll(chs, ch);
		System.out.println(Arrays.toString(ary));
		}
		
	public static int[] countAll(char[] chs, char ch){
		int[] ary = {};
		for(int i=0; i<chs.length;i++){
			char c = chs[i];
			if(c==ch){
				ary = Arrays.copyOf(ary,ary.length+1);
				ary[ary.length-1] = i;
			}
		}
		return ary;
	}
}