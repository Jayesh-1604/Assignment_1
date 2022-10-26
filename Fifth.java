public class Fifth {
	public static void main(String[] args) {

		for(int i=0; i<15; i++)
		{
			for(int j=0; j<15; j++)
			{
				if(j==0 || i==0 || i==14 || i+j<=7 || i-j>=7)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}


