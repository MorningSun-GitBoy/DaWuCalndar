package DaWuCalndar;

import java.util.ArrayList;
import java.util.Scanner;

public class DW3_1 implements DataProcessing 
{
	public static double t1 = 0.0;
	public static double t2 = 0.0;
	public static double m = 0.0;
	public static double g = 9.8;
	public static double r = 0;
	public Scanner s = new Scanner(System.in);
	public boolean DataCalndar(ArrayList<Double> x, boolean If) 
	{
		System.out.println("请输入质量");
		m = s.nextDouble();
		if (m==0) If=false;
		else
		{
			System.out.println("请输入时间");
			t1 = s.nextDouble();
			System.out.println("请再次输入时间");
			t2 = s.nextDouble();
			double i = m*g*r*t1*t2*(t2-t1)/(2*Math.PI*(2*t1-t2))-2*m*Math.pow(r, 2);
			x.add(i);
		}
		return If;
	}

}
