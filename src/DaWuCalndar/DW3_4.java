package DaWuCalndar;

import java.util.ArrayList;
import java.util.Scanner;

public class DW3_4 implements DataProcessing 
{
	public static double D1,D2,D3,r,l,t,ny;
	public double g = 9.8;
	public double R = 0.05;
	Scanner s = new Scanner(System.in);
	public boolean DataCalndar(ArrayList<Double> x, boolean If) 
	{
		System.out.println("������С��ֱ��");
		D1 = s.nextDouble();
		if(D1==0)
			If = false;
		else 
		{
			System.out.println("������С��ֱ��");
			D2 = s.nextDouble();
			System.out.println("������С��ֱ��");
			D3 = s.nextDouble();
			r = (D1+D2+D3)/6;
			System.out.println("С��ƽ��ֱ��Ϊ"+2*r);
//			r = r*0.001;
			System.out.println("���������");
			l = s.nextDouble();
			System.out.println("������ʱ��");
			t = s.nextDouble();
//			ny=2*g*Math.pow(r, 2)*(7.80-0.97)*R*t/(R+2.4*r)*(l*9);
			ny=2*g*Math.pow(r, 2)*(7.80-0.97)*t/(l*9);
			System.out.println("С����ٶ�"+(l/t));
			System.out.println("ճ��ϵ��"+ny);
			x.add(ny);
		}
		return If;
	}
}
