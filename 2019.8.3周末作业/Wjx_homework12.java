// 周末作业第(16)题 数据传递
import java.util.Scanner;
public class Wjx_homework12{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			int first = num%10;
			int sec = num/10%10;
			int thrid = num/100%10;
			int forth = num/1000;
			
			first = (first+5)%10;
			sec = (sec+5)%10;
			thrid = (thrid+5)%10;
			forth = (forth+5)%10;
			int result = first*1000+forth+sec*100+thrid*10;
			System.out.println(result);
		
		
		
	}
}