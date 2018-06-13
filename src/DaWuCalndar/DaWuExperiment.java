package DaWuCalndar;

import java.util.ArrayList;

public class DaWuExperiment 
{
	public static ArrayList <Double> x = new ArrayList<Double>();
	public static int n = 0;
	public static boolean If = true;
	public static void main (String[] sh)
	{
		DataProcessing dp = new DW3_1();
		while(If)
		{
			If = dp.DataCalndar(x,If);
			n++;
		}
		n--;
		CalndarU.Calndar(x,n);
	}
}
