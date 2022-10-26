import java.util.*;
public class Fourth {
	public static void main(String[] args) {

		for(int i=0; i<15; i++)
		{
			for(int j=0; j<15; j++)
			{
				if((j==0 && i>=8) || i==14 || (j==14 && i>=8) || (j<=7 && i>=7 && i-j>=7) || (j>=7 && i>=7 && i+j>=21))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}


