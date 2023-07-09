
public class Pattern11 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("_");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==5||i==j)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print("_");
				}
				
			}
			System.out.println();
		}

	}
}
