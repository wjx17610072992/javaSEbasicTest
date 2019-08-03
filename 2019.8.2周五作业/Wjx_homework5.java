// 周五作业第五题(复习练习8)
public class Wjx_homework5{
	public static void main(String[]args){
		String str = "692116851128";
		int c1 = 0;
		int c2 = 0;
		for(int i=0;i<str.length();i++){
			if(i%2==0){
				c1 += str.charAt(i)-'0';
			}else{
				c2 += str.charAt(i)-'0';
			}
		}
		int cc = c1+c2*3;
		int num1 = cc%10;
		int code = (10-cc)%10;
		
		
		
		
		
		
		System.out.println("校验码:"+code);
	}
}