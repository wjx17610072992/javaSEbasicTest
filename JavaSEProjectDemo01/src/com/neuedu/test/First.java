package game;
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
public class First {
	public static void main(String[] args){   //菜单
		System.out.println("这是一个RPG游戏");
		System.out.println("1.开始游戏");
		System.out.println("2.游戏规则");
		System.out.println("3.结束游戏");
		System.out.print("请输入您想进行的操作：(1-3)");
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();    
		switch(num){
		case 1:
			Start g=new Start();
			g.start();      //访问Start类中的start方法开始创建角色
			break;
		case 2:
			Rule r=new Rule();
			r.rule();     //访问Rule类中的rule方法查看规则
			break;
		default:
			System.out.println("游戏结束!");
			System.exit(0);  //游戏结束标识
		}		
}
}

//开始游戏
class Start{
	int occ=0;
	String name;
	public void start(){
		System.out.print("请输入您游戏角色的姓名：");
		Scanner a=new Scanner(System.in);
		String name=a.next();
		System.out.print("请选择您游戏角色的性别：(男或女)");
		Scanner b=new Scanner(System.in);
		String sex=b.next();
		System.out.print("请选择您游戏角色的种族：(1.人类,2.精灵,3.兽人,4.矮人,5.元素)");
		Scanner c=new Scanner(System.in);
		int race=c.nextInt();
		switch(race){  //职业选择
		case 1:   //种族为人类
			while(true){
				System.out.print("请选择您的职业：(1.狂战士,2.圣骑士,3.刺客,4.猎手,5.祭司,6.巫师)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ>=1&&occ<=6){      //验证输入正确性，正确则跳出循环，否则输出提示。
					break;
				}
				else
					System.out.println("请输入1-6之间的数字选择职业！！");
			}
			break;
		case 2:   //种族为精灵
			while(true){
				System.out.print("请选择您的职业：(1.狂战士,2.圣骑士,3.刺客,4.猎手,5.祭司,6.巫师)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ>=3&&occ<=6){      //验证输入正确性，正确则跳出循环，否则输出提示。
					break;
				}
				else
					System.out.println("请输入3-6之间的数字选择职业！！");
			}
			break;			
		case 3:   //种族为兽人
			while(true){
				System.out.print("请选择您的职业：(1.狂战士,2.圣骑士,3.刺客,4.猎手,5.祭司,6.巫师)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ==1||occ==4||occ==5){      //验证输入正确性，正确则跳出循环，否则输出提示。
					break;
				}
				else
					System.out.println("请输入1,4,5这三个数字任意一个选择职业！！");
			}
			break;			
		case 4:   //种族为矮人
			while(true){
				System.out.print("请选择您的职业：(1.狂战士,2.圣骑士,3.刺客,4.猎手,5.祭司,6.巫师)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ==1||occ==2||occ==5){      //验证输入正确性，正确则跳出循环，否则输出提示。
					break;
				}
				else
					System.out.println("请输入1,2,5这三个数字任意一个选择职业！！");
			}
			break;				
		case 5:   //种族为元素
			while(true){
				System.out.print("请选择您的职业：(1.狂战士,2.圣骑士,3.刺客,4.猎手,5.祭司,6.巫师)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ==5||occ==6){      //验证输入正确性，正确则跳出循环，否则输出提示。
					break;
				}
				else
					System.out.println("请输入5-6之间的数字选择职业！！");
			}
			break;	
		}
		Random r=new Random();
		r.n=name;    //将姓名、性别、种族对象引用到Random类中
		r.s=sex;
		r.ra=race;
		r.random(occ);//将职业传递到Random类的random方法中
		
}
}
//
class Random{
	String n;
	String s;
	int ra;
	int strength=0;   //力量
	int smart=0;      //敏捷
	int body=0;       //体力
	int talent=0;     //智力
	int wisdom=0;     //智慧
	int life=0;       //生命值
	int magic=0;      //魔法值
	public void random(int occ){   //随机函数生成各个值
		System.out.println(occ);
		if(occ==1)
		{
			strength=(int)(40+Math.random()*10-5);//随机函数生成符合题目条件的各个值
			smart=(int)(20+Math.random()*10-5);
			body=(int)(30+Math.random()*10-5);
			talent=(int)(5+Math.random()*10-5);
			wisdom=100-strength-smart-body-talent;
		}
		else if(occ==2){
			strength=(int)(25+Math.random()*10-5);
			smart=(int)(15+Math.random()*10-5);
			body=(int)(30+Math.random()*10-5);
			talent=(int)(20+Math.random()*10-5);
			wisdom=100-strength-smart-body-talent;
		}
		else if(occ==3){
			strength=(int)(20+Math.random()*10-5);
			smart=(int)(35+Math.random()*10-5);
			body=(int)(20+Math.random()*10-5);
			talent=(int)(15+Math.random()*10-5);
			wisdom=100-strength-smart-body-talent;		
		}
		else if(occ==4){
			strength=(int)(15+Math.random()*10-5);
			smart=(int)(40+Math.random()*10-5);
			body=(int)(15+Math.random()*10-5);
			talent=(int)(10+Math.random()*10-5);
			wisdom=100-strength-smart-body-talent;		
		}
		else if(occ==5){
			strength=(int)(15+Math.random()*10-5);
			smart=(int)(20+Math.random()*10-5);
			body=(int)(15+Math.random()*10-5);
			talent=(int)(35+Math.random()*10-5);
			wisdom=100-strength-smart-body-talent;		
		}
		else if(occ==6){
			strength=(int)(10+Math.random()*10-5);
			smart=(int)(20+Math.random()*10-5);
			body=(int)(10+Math.random()*10-5);
			talent=(int)(20+Math.random()*10-5);
			wisdom=100-strength-smart-body-talent;			
		}
		life=body*20;   //计算生命值和魔法值
		magic=(talent+wisdom)*10;		
		print(occ);  //调用打印方法
		try {        //调用写入文件方法
			REFile(occ);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	} 
	//打印
	public void print(int occ){ 
		System.out.println("* * * * * * * * * * * * *");
		System.out.println("*    姓名："+n+"         *");
		System.out.println("*    性别："+s+"         *");
		System.out.println("*    种族："+ra+"        *");
		System.out.println("*    职业："+occ+"       *");
		System.out.println("*    力量："+strength+"  *");
		System.out.println("*    敏捷："+smart+"     *");
		System.out.println("*    体力："+body+"      *");
		System.out.println("*    智力："+talent+"    *");
		System.out.println("*    智慧："+wisdom+"    *");
		System.out.println("*    生命值："+life+"     *");
		System.out.println("*    魔法值："+magic+"    *");
		System.out.println("* * * * * * * * * * * * *");
		
	}
	//写入文件
	public void REFile(int occ) throws IOException{  //throws IOException:异常处理
		 FileWriter writer=new FileWriter("message.txt",true);//存入信息，不会将以前的信息覆盖			
			try {
				writer.write("姓名: "+n+"\t");  //"\t"表示空格
				writer.write("性别 : "+s+"\t");
				writer.write("种族 : "+ra+"\t");
				writer.write("职业 : "+occ+"\t");
				writer.write("力量 : "+strength+"\t");
				writer.write("敏捷 : "+smart+"\t");
				writer.write("体力 : "+body+"\t");
				writer.write("智力 : "+talent+"\t");
				writer.write("智慧 : "+wisdom+"\t");
				writer.write("生命值: "+life+"\t");
				writer.write("魔法值: "+magic+"\r\n");//"\r\n"表示空行
				writer.flush();
				writer.close();  //关闭文件
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
			System.out.println("创建成功！");
		}
	}
//游戏规则
class Rule{
	public void rule(){ 
		System.out.println("很多职业会限制某些种族选择,种族和职业的限制情况如下：(下表均为不允许)");
		System.out.println("┎---------------------------------------------┒");
		System.out.println("│         种   类                   职   业                                │");
		System.out.println("│          精灵               狂战士、圣骑士                       │");
		System.out.println("│          兽人               圣骑士、刺客、巫师                │");
		System.out.println("│          矮人               刺客、猎手、巫师                   │");
		System.out.println("│          元素               狂战士、圣骑士、刺客、猎手  │");
		System.out.println("┖---------------------------------------------┚");
	}
}
