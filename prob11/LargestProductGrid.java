import java.util.Date;
public class LargestProductGrid{
	/*What is the greatest product of four adjacent numbers 
	  in the same direction (up, down, left, right, or diagonally) 
	  in the 20×20 grid? */

	public static void main(String[] args) {
		long lStartTime = new Date().getTime();
		String grid_str = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";

		int[][] grid = new int[20][20];
		long row_prod,col_prod,diag_prod;

		fillGrid(grid_str,grid);
	
		row_prod = searchRowWise(grid);
		col_prod = searchColumnWise(grid);
		diag_prod = searchDiagonalWise(grid);

		System.out.println(compare(row_prod,col_prod,diag_prod));
		
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed milliseconds: " + difference);

	}

	static void fillGrid(String str, int[][] arr){
		int idx = 0;
		String[] temp = str.split(" ");
		for (int row = 0; row <20; row++) {
			for (int col = 0;col<20 ;col++ ) {
				arr[row][col] = Integer.parseInt(temp[idx+col]);	
			}
			idx+=20;
		}	
	}

	static long searchRowWise(int[][] arr){
		long maxProduct = 0;
		for (int row = 0; row<20 ;row++ ) {
			for (int col = 0; col<17; col++ ) {
				long product = arr[row][col] * arr[row][col+1] * arr[row][col+2] * arr[row][col+3];
				if (product>maxProduct) {
				 	maxProduct = product;
				} 
			}
		}
		return maxProduct;
	}

	static long searchColumnWise(int[][] arr){
		long maxProduct = 0;
		for (int col = 0; col<20 ; col++ ) {
			for (int row = 0; row<17; row++ ) {
				long product = arr[row][col] * arr[row+1][col] * arr[row+2][col] * arr[row+3][col];
				if (product>maxProduct) {
				 	maxProduct = product;
				} 
			}
		}
		return maxProduct;
	}

	static long searchDiagonalWise(int[][] arr){

		long product1,product2;

		product1 = lrDiag(arr);
		product2 = rlDiag(arr);
	
		if (product1 > product2) {
			return product1;
		} 
		return product2;		
	}

	static long lrDiag(int[][] arr){
		// Applying y = mx + c where c = -(n-1) to (n-1)
		int c = - 16;	//top right 3 diagonals have less than 4 elements
		long maxProduct = 0;

		//topright diagonals
		for (int startpoint = 16; startpoint>=0 ;startpoint-- ) {		// row 0 elements as startpoint
			// traverse within a diagonal
			for (int x = startpoint; x <17 ; x ++ ) {
				long product = arr[x+c][x] * arr[x+1+c][x+1] * arr[x+2+c][x+2] * arr[x+3+c][x+3];
				if (product > maxProduct){
					maxProduct = product;
				}
			}
			c++;
		}

		//bottom left diagonals
		for (int startpoint = 1; startpoint < 17 ;startpoint++ ) {		// col 0 elements as startpoint
			for (int y = startpoint; y < 17 ; y++ ) {
				long product = arr[y][y-c] * arr[y+1][y-c+1] * arr[y+2][y-c+2] * arr[y+3][y-c+3];
				if (product > maxProduct){
					maxProduct = product;
				}
			}
			c++;
		}
		return maxProduct;
	}

	static long rlDiag(int[][] arr){
		// Applying y = -mx + c where c = 0 to 2(n-1)
		int c = 35;		//bottom right 3 diagonals have less than 4 elements
		long maxProduct = 0;

		//bottom right diagonals
		for (int startpoint = 16; startpoint>=0 ;startpoint--) {		// col 19 elements as startpoint
			// traverse within a diagonal
			for (int y = startpoint;y <17 ;y++ ) {
				long product = arr[y][c-y] * arr[y+1][c-y-1] * arr[y+2][c-y-2] * arr[y+3][c-y-3];
				if (product > maxProduct){
					maxProduct = product;
				}
			}
			c--;
		}

		// top left diagonals
		for (int startpoint = 18; startpoint>=0 ;startpoint--) {		// row 0 elements as startpoint
			// traverse within a diagonal
			for (int x = startpoint;x > 2 ; x-- ) {
				long product = arr[-x+c][x] * arr[-x+c+1][x-1] * arr[-x+c+2][x-2] * arr[-x+c+3][x-3];
				if (product > maxProduct){
					maxProduct = product;
				}
			}
			c--;
		}

		return maxProduct;
	}

	static long compare(long rowProd, long colProd, long diagProd ){
		if (rowProd > colProd) {
			if (rowProd > diagProd) {
				return rowProd;
			}
			return diagProd;
		}
		if (colProd > diagProd) {
			return colProd;
		}
		return diagProd;
	}

	static void display(int[][] arr){
		int count = 0;
		for (int[] e : arr ) {
			for (int x : e ) {
				System.out.println(x + " ");
				count++;	
			}
		}
		System.out.println(count);
	}
}