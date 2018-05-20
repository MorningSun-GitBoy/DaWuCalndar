package DaWuCalndar;

import java.util.ArrayList;

public class CalndarU 
{
	public static double xA = 0.0;
	public static double uA = 0.0;
	public static double uR = 0.0;
	public static void Calndar(ArrayList <Double> x , int n)
	{
		double sum = 0;
		double sumI = 0;
		for(double i:x)
			sum = sum+i;
		xA = sum/n;
		for(double i:x)
		{
			i = i-xA;
			sumI = sumI+Math.pow(i,2);
		}
		int k = n*(n-1);
		uA = Math.sqrt(sumI/k);
		uR = 100*uA/xA;
		System.out.println("平均数为:"+xA);
		System.out.println("A类不确定度为:"+uA);
		System.out.println("总不确定度为:"+uR);
	}
}
