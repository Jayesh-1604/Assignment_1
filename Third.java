import java.util.*;
public class Third {

	public static void main(String[] args) {

		for(int i=0; i<15; i++)
		{
			for(int j=0; j<15; j++)
			{
				if(i==0 || j==0 || i==14 || j==14 || (j<=7 && i<=7 && ((i+j)<=7)) || (j>=7 && i<=7 && (j-i)>=7))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
