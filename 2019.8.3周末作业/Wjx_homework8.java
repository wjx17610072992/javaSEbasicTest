// 周末作业第(12)题 百元买鸡
public class Wjx_homework8{
	public static void main(String[] args){
		int gj;
		int mj;
		int xj;
		int num=0;
		for(gj=0;gj<=20;gj++){
			for(mj=0;mj<=33;mj++){
				for(xj=0;xj<=100;xj++){
					if(xj%3==0){
						if((gj+mj+xj==100)&&(gj*5+mj*3+xj/3==100)){
							num++;
							 System.out.println("公鸡："+gj+"只，母鸡："+mj+"只，小鸡："+xj+"只");
						}
					}
				}
			}
		}
		System.out.println("一共"+num+"种方法");
	}
}