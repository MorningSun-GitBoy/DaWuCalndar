package DaWuCalndar;

import java.util.ArrayList;
import java.util.Scanner;

public class DW3_2 implements DataProcessing 
{
	public static double B = 0;
	Scanner s = new Scanner(System.in);
	public DW3_2()
	{
		double i = 0,h = 0;
		double[] y = new double[7];
		double[] x = {0.005,0.010,0.015,0.020,0.025,0.030,0.035};
		double sum1 = 0;
		double sum2 = 0;
		for(int n=0;n<=6;n++)
		{
			System.out.println("请输入定标电压");
			y[n] = s.nextDouble();
			h = h+y[n];
			i = i+x[n];
		}
		h = h/7;
		i = i/7; 
		for(int n=0;n<=6;n++)
		{
			sum1 = (x[n]-i)*(y[n]-h);
			sum2 = Math.pow(x[n]-i,2);
		}
		B = sum1/sum2;
		System.out.println(B);
	}
	public boolean DataCalndar(ArrayList<Double> x, boolean If) 
	{
		System.out.println("请输入测量电压U1");
		double U1 = 0 ;
		U1 = s.nextDouble();
		if(U1==0)
			If = false;
		else 
		{
			System.out.println("请输入测量电压U2");
			double U2 = s.nextDouble();
			double e = (U1+U2)/(B*0.06806*Math.PI);
			System.out.println("表面张力系数为："+e);
			x.add(e);
		}
		return If;
	}
}
