// ��ĩ��ҵ��(10)�� 1-100�ۼ�ֵ
public class Wjx_homework7{
	public static void main(String[] args){
		//����һ:����
		int sum=0;
		int i=0;
		int sum3=3;
		int a=1;
		for(i=1;i<=100;i++){
			sum +=i;
		}
		for(a=1;a<=9;a++){
			sum3 +=3+10*a;
		}
		System.out.println(sum-sum3);
		
		//������:continue����ѭ��
		int num=0;
		for(int ii=1;ii<=100;ii++){
			if(ii%10==3){
				continue;
			}
			num +=ii;
		}
		System.out.println(num);
		
	}
}