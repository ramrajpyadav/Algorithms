package fundamental;

public class MatrixMultiplication {
	
	// Method to multiply Matrix
	private static int[][] matMul(int a[][],int b[][]) {
		// a: mxn, b:nxp ==> c:mxp
		int m=a.length;
		int n=a[0].length;  // or n=b.length;
		int p=b[0].length;
		
		int c[][]=new int[a.length][b[0].length];
		for(int i=0;i<m;i++) {
			for(int j=0;j<p;j++) {
				for(int k=0;k<n;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
	
	// Method to print Matrix
	private static void printMatrix(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// a: 2x2
		int a[][]= {
				{2,3},
				{2,3}
		};
		
		// b: 2x3
		int b[][]= {
				{1,1,2},
				{1,1,0}
		};
		
		// c: 2x3
		int c[][]=matMul(a, b);
		
		printMatrix(a);
		printMatrix(b);
		printMatrix(c);
	}

}
