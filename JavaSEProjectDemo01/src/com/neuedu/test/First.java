package game;
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
public class First {
	public static void main(String[] args){   //�˵�
		System.out.println("����һ��RPG��Ϸ");
		System.out.println("1.��ʼ��Ϸ");
		System.out.println("2.��Ϸ����");
		System.out.println("3.������Ϸ");
		System.out.print("������������еĲ�����(1-3)");
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();    
		switch(num){
		case 1:
			Start g=new Start();
			g.start();      //����Start���е�start������ʼ������ɫ
			break;
		case 2:
			Rule r=new Rule();
			r.rule();     //����Rule���е�rule�����鿴����
			break;
		default:
			System.out.println("��Ϸ����!");
			System.exit(0);  //��Ϸ������ʶ
		}		
}
}

//��ʼ��Ϸ
class Start{
	int occ=0;
	String name;
	public void start(){
		System.out.print("����������Ϸ��ɫ��������");
		Scanner a=new Scanner(System.in);
		String name=a.next();
		System.out.print("��ѡ������Ϸ��ɫ���Ա�(�л�Ů)");
		Scanner b=new Scanner(System.in);
		String sex=b.next();
		System.out.print("��ѡ������Ϸ��ɫ�����壺(1.����,2.����,3.����,4.����,5.Ԫ��)");
		Scanner c=new Scanner(System.in);
		int race=c.nextInt();
		switch(race){  //ְҵѡ��
		case 1:   //����Ϊ����
			while(true){
				System.out.print("��ѡ������ְҵ��(1.��սʿ,2.ʥ��ʿ,3.�̿�,4.����,5.��˾,6.��ʦ)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ>=1&&occ<=6){      //��֤������ȷ�ԣ���ȷ������ѭ�������������ʾ��
					break;
				}
				else
					System.out.println("������1-6֮�������ѡ��ְҵ����");
			}
			break;
		case 2:   //����Ϊ����
			while(true){
				System.out.print("��ѡ������ְҵ��(1.��սʿ,2.ʥ��ʿ,3.�̿�,4.����,5.��˾,6.��ʦ)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ>=3&&occ<=6){      //��֤������ȷ�ԣ���ȷ������ѭ�������������ʾ��
					break;
				}
				else
					System.out.println("������3-6֮�������ѡ��ְҵ����");
			}
			break;			
		case 3:   //����Ϊ����
			while(true){
				System.out.print("��ѡ������ְҵ��(1.��սʿ,2.ʥ��ʿ,3.�̿�,4.����,5.��˾,6.��ʦ)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ==1||occ==4||occ==5){      //��֤������ȷ�ԣ���ȷ������ѭ�������������ʾ��
					break;
				}
				else
					System.out.println("������1,4,5��������������һ��ѡ��ְҵ����");
			}
			break;			
		case 4:   //����Ϊ����
			while(true){
				System.out.print("��ѡ������ְҵ��(1.��սʿ,2.ʥ��ʿ,3.�̿�,4.����,5.��˾,6.��ʦ)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ==1||occ==2||occ==5){      //��֤������ȷ�ԣ���ȷ������ѭ�������������ʾ��
					break;
				}
				else
					System.out.println("������1,2,5��������������һ��ѡ��ְҵ����");
			}
			break;				
		case 5:   //����ΪԪ��
			while(true){
				System.out.print("��ѡ������ְҵ��(1.��սʿ,2.ʥ��ʿ,3.�̿�,4.����,5.��˾,6.��ʦ)");  
				Scanner d=new Scanner(System.in);
				occ=d.nextInt();
				if(occ==5||occ==6){      //��֤������ȷ�ԣ���ȷ������ѭ�������������ʾ��
					break;
				}
				else
					System.out.println("������5-6֮�������ѡ��ְҵ����");
			}
			break;	
		}
		Random r=new Random();
		r.n=name;    //���������Ա�����������õ�Random����
		r.s=sex;
		r.ra=race;
		r.random(occ);//��ְҵ���ݵ�Random���random������
		
}
}
//
class Random{
	String n;
	String s;
	int ra;
	int strength=0;   //����
	int smart=0;      //����
	int body=0;       //����
	int talent=0;     //����
	int wisdom=0;     //�ǻ�
	int life=0;       //����ֵ
	int magic=0;      //ħ��ֵ
	public void random(int occ){   //����������ɸ���ֵ
		System.out.println(occ);
		if(occ==1)
		{
			strength=(int)(40+Math.random()*10-5);//����������ɷ�����Ŀ�����ĸ���ֵ
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
		life=body*20;   //��������ֵ��ħ��ֵ
		magic=(talent+wisdom)*10;		
		print(occ);  //���ô�ӡ����
		try {        //����д���ļ�����
			REFile(occ);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	} 
	//��ӡ
	public void print(int occ){ 
		System.out.println("* * * * * * * * * * * * *");
		System.out.println("*    ������"+n+"         *");
		System.out.println("*    �Ա�"+s+"         *");
		System.out.println("*    ���壺"+ra+"        *");
		System.out.println("*    ְҵ��"+occ+"       *");
		System.out.println("*    ������"+strength+"  *");
		System.out.println("*    ���ݣ�"+smart+"     *");
		System.out.println("*    ������"+body+"      *");
		System.out.println("*    ������"+talent+"    *");
		System.out.println("*    �ǻۣ�"+wisdom+"    *");
		System.out.println("*    ����ֵ��"+life+"     *");
		System.out.println("*    ħ��ֵ��"+magic+"    *");
		System.out.println("* * * * * * * * * * * * *");
		
	}
	//д���ļ�
	public void REFile(int occ) throws IOException{  //throws IOException:�쳣����
		 FileWriter writer=new FileWriter("message.txt",true);//������Ϣ�����Ὣ��ǰ����Ϣ����			
			try {
				writer.write("����: "+n+"\t");  //"\t"��ʾ�ո�
				writer.write("�Ա� : "+s+"\t");
				writer.write("���� : "+ra+"\t");
				writer.write("ְҵ : "+occ+"\t");
				writer.write("���� : "+strength+"\t");
				writer.write("���� : "+smart+"\t");
				writer.write("���� : "+body+"\t");
				writer.write("���� : "+talent+"\t");
				writer.write("�ǻ� : "+wisdom+"\t");
				writer.write("����ֵ: "+life+"\t");
				writer.write("ħ��ֵ: "+magic+"\r\n");//"\r\n"��ʾ����
				writer.flush();
				writer.close();  //�ر��ļ�
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
			System.out.println("�����ɹ���");
		}
	}
//��Ϸ����
class Rule{
	public void rule(){ 
		System.out.println("�ܶ�ְҵ������ĳЩ����ѡ��,�����ְҵ������������£�(�±��Ϊ������)");
		System.out.println("��---------------------------------------------��");
		System.out.println("��         ��   ��                   ְ   ҵ                                ��");
		System.out.println("��          ����               ��սʿ��ʥ��ʿ                       ��");
		System.out.println("��          ����               ʥ��ʿ���̿͡���ʦ                ��");
		System.out.println("��          ����               �̿͡����֡���ʦ                   ��");
		System.out.println("��          Ԫ��               ��սʿ��ʥ��ʿ���̿͡�����  ��");
		System.out.println("��---------------------------------------------��");
	}
}
