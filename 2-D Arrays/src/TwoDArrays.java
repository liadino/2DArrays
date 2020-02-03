import java.util.Scanner;

public class TwoDArrays
	{

		public static void main(String[] args)
			{
				solveChallenge1();
			    solveChallenge2();
				solveChallenge3();


			}
		private static void solveChallenge3()
			{
				int  [ ] [ ] array3 = new int [3] [3];
				int k = 0;
				for(int j = 0; j < 3; j++)
					{

						for(int i = 0; i < 3; i++) {
							k = k+1;
							array3[j][i] = k;
							System.out.print(array3 [j] [i] + " ");
						}
						System.out.println("   ");
					}
				System.out.println("     ");
				int sum = array3[0][0] + array3 [0][2] + array3 [2][0] + array3 [2][2];
				System.out.println(sum);
				 System.out.println("										");
				 System.out.println("_______________________________________");
				 System.out.println("										");

			}
		private static void solveChallenge2()
			{
				String  [ ] [ ] array2 = new String [4] [3];
				for(int j = 0; j < 4; j++)
					{
						for(int i = 0; i < 3; i++) {
							array2[j][i] = "MHS";
							System.out.print(array2 [j] [i] + " ");
						}
						System.out.println("   ");
					}
				 System.out.println("										");
				 System.out.println("_______________________________________");
				 System.out.println("										");

			}
		private static void solveChallenge1()
			{
				int array1 [ ] [ ] = { {10, 20}, {30, 40},{50, 60} };
					 System.out.println(array1[2][1]);
					 
					 System.out.println("										");
					 System.out.println("_______________________________________");
					 System.out.println("										");

			}

	}
