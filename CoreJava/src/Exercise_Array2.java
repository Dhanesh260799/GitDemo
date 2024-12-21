
public class Exercise_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the min number
		//then find the min number column row-i, column-j
		//in the min num column find the max num
		/*
		 * 23 1 33
		 * 1  9  12
		 */
		
		int c[][]= {{23,1,33},{1,9,12}};
		int min=c[0][0];
		int min_column = 0;
	
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				if(c[i][j]<min) {
					min=c[i][j];
					min_column=j;
				}
			}
		}
		System.out.println(min);
		System.out.println(min_column);
		//max_num
		int max_num= c[0][min_column];
		for(int k=0;k<2;k++) {
			if(c[k][min_column]>max_num) {
				max_num = c[k][min_column];
			}
		}
		System.out.println(max_num);
	}

}
