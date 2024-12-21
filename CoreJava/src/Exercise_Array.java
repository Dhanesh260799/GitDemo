
public class Exercise_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * print minimum number from the above matrix
		 *  print maximum number from the above matrix

		 *  2 4 5
		 *  3 4 7
		 *  1 2 9
		 */
		int b[][]= {{1,45,12},{142,3,2},{123,3,1}};
		int min=b[0][0];
		int max=b[0][0];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(b[i][j]<min) {
					min =b[i][j];
				}
			}
			
		}
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(b[i][j]>max) {
					max =b[i][j];
				}
			}
			
		}
		
		System.out.println(min);
		System.out.println(max);

	}

}
