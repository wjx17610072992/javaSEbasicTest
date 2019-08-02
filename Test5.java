public class Test5{
	public static void main (String[]args){
		double base = 7.7/100;   //基本年利率
		int years = 5;           //贷款年限
		double rate = base;      //实际利率
		if(years<=1){
			rate = 0.5*base;
		}else if(years<=3){
			rate = 0.7*base;
		}else if(years<=5){
			rate = base;
		}else{
			rate = 1.1*base;
		}
		System.out.println("实际利率(%):"+rate);
	}
	
	
}
