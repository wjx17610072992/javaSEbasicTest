// 周五作业第二题
import java.util.Arrays;
public class Wjx_homework2{
    public static void main(String[]args){
		char[] chs = {'统','计','一','个','字','符','在','字','符','串','中'};
		char ch = '字';
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