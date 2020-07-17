package fundamental;

public class PrimeNumber {
	private static boolean isPrime(int n) {
		if(n<2)return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int x=22;
		System.out.println(x+" isPrime: "+isPrime(x));
		
		x=43;
		System.out.println(x+" isPrime: "+isPrime(x));
	}

}
