package DaWuCalndar;

import java.util.Scanner;

public class DW4_1
{
	public static int P0 = 10130000;
	public static double P  = 0;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		P = Math.log10(P0);
		Scanner r = new Scanner(System.in);
		System.out.println("U1");
		double U1 = r.nextDouble();
		U1=one(U1);
		System.out.println("U2");
		double U2 = r.nextDouble();
		U2=two(U2);
		System.out.println(U1/(U1-U2));
		r.close();
	}
	public static double one(double U1)
	{
		double one = Math.log10(P0+50*U1)-P;
		return one;
	}
	public static double two(double U2)
	{
		double two = Math.log10(P0+50*U2)-P;
		return two;
	}
}
