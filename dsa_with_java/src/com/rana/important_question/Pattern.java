package com.rana.important_question;

public class Pattern {
	
	
	void main()
	{
		p7();
	}
	
	public static void p7()
	{
		/*           #
		 *         # # #
		 *       # # # # #
		 *     # # # # # # #
		 *   # # # # # # # # #
		 *     # # # # # # #
		 *       # # # # #
		 *         # # #
		 *           #
  
		 *
		 * */
		int n=9;
		int x=n/2+1,y=n/2+1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=x&&j<=y)
					IO.print("# ");
				else
					IO.print("  ");
			}
			IO.println();
			if(i<n/2+1)
			{
               x--;
               y++;
			}
			else
			{
				x++;
				y--;
			}
		}
//		 x = 2;
//		 y = n * 2 - 2;
//
//		for(int i=1;i<=n-1;i++)
//		{
//			for(int j=1;j<=n*2-1;j++)
//			{
//				if(j>=x&&j<=y)
//					IO.print("# ");
//				else
//					IO.print("  ");
//			}
//			IO.println();
//			x++;
//			y--;
//		}
	}
	
	public static void p6()
	{
		/*           #
		 *         # # #
		 *       # # # # #
		 *     # # # # # # #
		 *   # # # # # # # # #
		
		 * */
		int n=5;
		int x=n,y=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(j>=x&&j<=y)
					IO.print("# ");
				else
					IO.print("  ");
			}
			IO.println();
			x--;
			y++;
		}
	}
	
	public static void p5()
	{
		/*
		 *   # # # # # # # # #
		 *     # # # # # # #
		 *       # # # # #
		 *         # # #
		 *           #
		 * */
		int n=5;
		int x=1,y=n*2-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(j>=x&&j<=y)
					IO.print("# ");
				else
					IO.print("  ");
			}
			IO.println();
			x++;
			y--;
		}
	}
	
	public static void p4()
	{
		/*
		 *         #
		 *       # #
		 *     # # #
		 *   # # # #
		 * # # # # #
		 * */
		int n=5,x=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=x)
					IO.print("# ");
				else
					IO.print("  ");
			}
			IO.println();
			x--;
		}
	}
	
	public static void p3()
	{
		/*
		 * # # # # #
		 * # # # #
		 * # # #
		 * # #
		 * #
		 * */
		int n=5,x=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=x)
					IO.print("# ");
				else
					break;
			}
			IO.println();
			x--;
		}
	}
	
	
	public static void p2()
	{
		/*
		 * # # # # #
		 *   # # # #
		 *     # # #
		 *       # # 
		 *         #
		 * */
		int n=5,x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=x)
					IO.print("# ");
				else
					IO.print("  ");
			}
			IO.println();
			x++;
		}
	}
	
	public static void p1()
	{
		/*
		 * #
		 * # #
		 * # # #
		 * # # # # 
		 * # # # # #
		 * */
		int n=5,x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=x)
					IO.print("# ");
				else
					break;
			}
			IO.println();
			x++;
		}
	}

}
