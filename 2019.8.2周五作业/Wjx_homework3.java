// 周五作业第三题
public class Wjx_homework3{
	public static void main(String[]args){
		String str = "123456789012";
		//方法 charAt();
		int oldNum = 0;
		int evenNum = 0;
		for(int i=0;i<str.length();i++){
			if(i%2==0){
				oldNum = oldNum + str.charAt(i)-'0';
			}else{
				evenNum += str.charAt(i)-'0';
			}
		}
		System.out.println("奇数和:"+oldNum);
		System.out.println("偶数和:"+evenNum);
	}
}