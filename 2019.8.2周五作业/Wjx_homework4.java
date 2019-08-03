// 周五作业第四题
public class Wjx_homework4{
	public static void main(String[]args){
		System.out.println("翻转56123为："+rev(56123));
	}
	public static int rev(int num){
		int num1 = 0;
		while(true){
			int last = num%10;
			num1 = num1*10+last;
			num = num/10;
			if(num==0){
				break;
			}
		}
		return num1;
	}
}