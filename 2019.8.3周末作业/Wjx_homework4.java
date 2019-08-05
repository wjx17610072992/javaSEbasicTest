// 周末作业第(7)题 水仙花数
public class Wjx_homework4{
	public static void main(String[] args){
		System.out.println("100-999之间的水仙花数有:");
		for(int i=100;i<=999;i++){
			int ud=i%10;
			int td=i/10%10;
			int hd=i/100%10;
			if(i==(ud*ud*ud)+(td*td*td)+(hd*hd*hd)){
				System.out.println(i);
			}
		}	
		
		System.out.println("1000-9999之间的四叶玫瑰数有:");
		for(int i1=1000;i1<=9999;i1++){
			int ud1=i1%10;
			int td1=i1/10%10;
			int hd1=i1/100%10;
			int kd1=i1/1000%10;
			if(i1==(ud1*ud1*ud1*ud1)+(td1*td1*td1*td1)+(hd1*hd1*hd1*hd1)+(kd1*kd1*kd1*kd1)){
				System.out.println(i1);
			}
		}	
		
		
		
		
	}
}