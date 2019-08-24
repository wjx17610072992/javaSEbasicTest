// 周末作业第(13)题 兔子总数
import java.util.Scanner;
public class Wjx_homework9{
	public static void main(String[] args){
		System.out.println();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("兔子总数:"+f(n));
	}
	public static int f(int n){
		if(n!=1&&n!=2){
			if(n!=3){
				return f(n-1)+f(n-3);
			}
			return 4;
		}else return 2;
		
		
		
		统计一个字符在字符串中的所有位置
		请输入查找的字符
	}雪中悍刀行北凉王徐凤年王仙芝李淳罡徐骁王嘉兴
}天之道损有余而补不足不足胜有余