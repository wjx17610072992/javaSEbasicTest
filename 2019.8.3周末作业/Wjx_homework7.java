// 周末作业第(10)题 1-100累加值
public class Wjx_homework7{
	public static void main(String[] args){
		//方法一:减法
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
		
		//方法二:continue跳出循环
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