// ��ĩ��ҵ��(12)�� ��Ԫ��
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
							 System.out.println("������"+gj+"ֻ��ĸ����"+mj+"ֻ��С����"+xj+"ֻ");
						}
					}
				}
			}
		}
		System.out.println("һ��"+num+"�ַ���");
	}
}