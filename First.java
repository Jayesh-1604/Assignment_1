import java.util.*;
public class First {

	public static void main(String[] args) {

		for(int i=0; i<7; i++)
		{
			// for I
			for(int j=0; j<1; j++)
			{
				System.out.print("%");
			}
			
			//Space
			for(int j=1; j<2; j++)
			{
				System.out.print(" ");
			}
			
			
			//For N
			for(int j=2;j<9;j++)
			{
				if(j==2 || j==8 || (j-i==2))
				{
					System.out.print("%");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//Space
			for(int j=9; j<10; j++)
			{
				System.out.print(" ");
			}
			
			
			
			// For E
			for(int j=10; j<17; j++)
			{
				if(j==10 || i==0 || i==6 || (i==3 && j<=15))
				{
					System.out.print("%");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			//Space
			for(int j=17; j<18; j++)
			{
				System.out.print(" ");
			}
			
			// For U
			for(int j=18; j<25; j++)
			{
				if((j==18 && i<6) || (j==24 && i<6) || (i==6 && j>=20 &&j<=23))
				{
					System.out.print("%");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//Space
			for(int j=25; j<26; j++)
			{
				System.out.print(" ");
			}

			// For R
			for(int j=26; j<33; j++)
			{
				if(j==26 || i==0 || (i<=3 && j==32) ||(i==3 && j>=26) 
						|| (i>=4 && i<=6 && j>=27 && j<=29 && j-i==23) || (i==6 && j>29) )
				{
					System.out.print("%");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//Space
			for(int j=33; j<34; j++)
			{
				System.out.print(" ");
			}
			
			// For O
			for(int j=34; j<41; j++)
			{
				if((i==0 && j>=35 && j<=39) || (j==34 && i>=1 && i<=5) || (i==6 && j>=35 && j<=39) || (j==40 && i>=1 && i<=5))
				{
					System.out.print("%");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
		
			//Space
			for(int j=41; j<42; j++)
			{
				System.out.print(" ");
			}
			
			
			//For N
			for(int j=42;j<49;j++)
			{
				if(j==42 || j==48 || (j-i==42))
				{
					System.out.print("%");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}

}
