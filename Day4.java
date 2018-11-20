package twenty17;

public class Day4 {

	public int man_dist(int input) {
		int n = getN(input);
		if (n == 0) {
			return 0;
		}
		int x = n/2;
		int D = (n*n - (n-2)*(n-2) )/4;
		int y = (input - (n-2)*(n-2) +x) % D;
		y = Math.abs(y);
		if (y > x) {
			y = D - y;
		}
		return y + x;
	}
	
	public int getN(int input) {
		if (input == 1)
			return 0;
		else
			return getN(input, 3);
	}
	
	public int getN(int input, int lowBound) {
		int y = lowBound*lowBound;
		if (input <= y) {
			return lowBound;
		}
		else
			return getN(input, lowBound+2);
	}
}
