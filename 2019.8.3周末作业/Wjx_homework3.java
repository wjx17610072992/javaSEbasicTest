// 周末作业第(6)题
import java.util.*;
public class Wjx_homework3{
	public static void main(String[] args){
		int[] a={1,7,11,13,15,17,19};
		int[] b={2,4,6,8,10};
		// 数组c的长度是a的长度+b的长度
		int[] c=new int[a.length+b.length];
		// System.arraycopy(源数组,原数组开始复制的位置,目标数组,目标数组开始复制的位置,复制的长度)
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		// 给数组c进行升序排序。静态方法可以直接用。
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));	
	}
	
	
	
	
	
	
	
	
	
}