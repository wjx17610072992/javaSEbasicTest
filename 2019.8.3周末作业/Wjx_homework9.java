// ��ĩ��ҵ��(13)�� ��������
import java.util.Scanner;
public class Wjx_homework9{
	public static void main(String[] args){
		System.out.println();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("��������:"+f(n));
	}
	public static int f(int n){
		if(n!=1&&n!=2){
			if(n!=3){
				return f(n-1)+f(n-3);
			}
			return 4;
		}else return 2;
		
		
		
		ͳ��һ���ַ����ַ����е�����λ��
		��������ҵ��ַ�
	}ѩ�к����б��������������֥������������
}��֮��������������㲻��ʤ����