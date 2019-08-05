// 周末作业第(9)题 小球落体
public class Wjx_homework6{
	public static void main(String[] args){
		double s=100;
		double starHeight=100;
		for(int i=1;i<=9;i++){
			starHeight=starHeight/2;
			s +=starHeight*2;
		}
		
		System.out.println("第10次落地经过米数:"+s);
		System.out.println("第10次反弹高度:"+starHeight/2);
		
		
		
	}
}