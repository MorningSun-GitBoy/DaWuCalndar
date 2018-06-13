package DaWuCalndar;

import java.util.ArrayList;
import java.util.Scanner;

public class DW3_7 implements DataProcessing 
{
	public static double Es = 0.0;
	public static double Ex = 0.0;
	public static double t = 0.0;
	public Scanner s = new Scanner(System.in);
	public boolean DataCalndar(ArrayList<Double> x, boolean If) 
	{
		System.out.println("«Î ‰»Îls");
		double lS = s.nextDouble();
		if(lS==0)If = false;
		else
		{
		 System.out.println("«Î ‰»Îlx");
		 double lX = s.nextDouble();
		 System.out.println("«Î ‰»Ît");
		 t = s.nextDouble();
		 Es = 1.0186-39.94*0.0000001*(t-20)-0.929*0.0000001*Math.pow(t-20, 2)+0.0090*0.0000001*Math.pow(t-20, 3);
		 Ex = Es*lS/lX;
		 System.out.println(Es);
		 System.out.println(Ex);
		 x.add(Ex);
		}
		return If;
	}
}
