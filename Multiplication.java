import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter the n value");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i = 1;i<11;i++)
			
		{
			int Table = n*i;
			System.out.println(n + "*"+ i + "=" + Table);

		}

	}

}
