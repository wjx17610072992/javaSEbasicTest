// ������ҵ������
public class Wjx_homework3{
	public static void main(String[]args){
		String str = "123456789012";
		//���� charAt();
		int oldNum = 0;
		int evenNum = 0;
		for(int i=0;i<str.length();i++){
			if(i%2==0){
				oldNum = oldNum + str.charAt(i)-'0';
			}else{
				evenNum += str.charAt(i)-'0';
			}
		}
		System.out.println("������:"+oldNum);
		System.out.println("ż����:"+evenNum);
	}
}