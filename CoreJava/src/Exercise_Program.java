
public class Exercise_Program {
	public static void main(String[] args) {
		/*1 2 3 4
		  5 6 7 
		  8 9
		  10
		  	 */
		int k=1;
		int l =1;
		for(int i=0;i<4;i++) {
			//System.out.println("outer loop starts");
			for(int j=1;j<=4-i;j++) {
				//System.out.println(j);
			System.out.print(k);
			System.out.print("\t");
				k++;
				
			}
			System.out.println("");

		}
		/*
		 * 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		for(int i=0;i<4;i++) {
			//System.out.println("outer loop starts");
			for(int j=1;j<=1+i;j++) {
				//System.out.println(j);
			System.out.print(l);
			System.out.print("\t");
				l++;
				
			}
			System.out.println("");

		}
		/*
		 * 1 
		 * 2 3 
		 * 4 5 6
		 * 7 8 9 10
		 */
		for(int i=0;i<4;i++) {
			//System.out.println("outer loop starts");
			for(int j=1;j<=1+i;j++) {
				//System.out.println(j);
			System.out.print(j);
			System.out.print("\t");
				
				
			}
			System.out.println("");

		}
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
		int b=3;
		int a=2;
		for(int i=1;i<4;i++) {
			//System.out.println("outer loop starts");
			for(int j=1;j<=i;j++) {
				//System.out.println(j);
			System.out.print(b);
			System.out.print("\t");
			b=b+3;
			
				
			}
			System.out.println("");
			
			
				
		}
			
		
		
	}
}
