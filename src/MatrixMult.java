
public class MatrixMult {
	
	public static void Mult(int x[][], int y[][]) {		
		int xrows = x.length;
		int xcolumns = x[0].length;
		
		int yrows = y.length;
		int ycolumns = y[0].length;
		
		if (xcolumns == yrows) {
			int z[][] = new int[xrows][ycolumns];
		
			int sum = 0;
			int xmult = 0;
			int ymult = 0;
				
			for (int i = 0; i < (xcolumns - 1); i++) {
				sum = 0;
				for (int ychanging = 0; ychanging < xcolumns; ychanging++) { //runs the program for however many columns are in row 0
					sum = sum + (x[i][0 + ychanging]*y[0 + ychanging][0]); //multiplies x[0][1] by y[1][0] and so on
				}
			z[i][0] = sum; //makes the answer the sum
		}	
			
			for (int e = 0; e < (xcolumns - 1); e++) {
				sum = 0;
				for (int ychanging2 = 0; ychanging2 < xcolumns; ychanging2++) {	
					sum = sum + (x[e][ychanging2]*y[ychanging2][1]);
				
					z[e][1] = sum;
				}
			}
		}
		else {
			System.out.println("Cannot compute.");
		}
		
		

	}
	
}
