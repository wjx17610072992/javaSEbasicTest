// ��ĩ��ҵ��(6)��
import java.util.*;
public class Wjx_homework3{
	public static void main(String[] args){
		int[] a={1,7,11,13,15,17,19};
		int[] b={2,4,6,8,10};
		// ����c�ĳ�����a�ĳ���+b�ĳ���
		int[] c=new int[a.length+b.length];
		// System.arraycopy(Դ����,ԭ���鿪ʼ���Ƶ�λ��,Ŀ������,Ŀ�����鿪ʼ���Ƶ�λ��,���Ƶĳ���)
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		// ������c�����������򡣾�̬��������ֱ���á�
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));	
	}
	
	
	
	
	
	
	
	
	
}