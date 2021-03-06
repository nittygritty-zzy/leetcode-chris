package happyNumber;

public class HappyNumebr {

	public static boolean isHappy(int n) {
		int x = n;
		int y = n;
		while (x > 1) {
			x = cal(x);
			if (x == 1)
				return true;
			y = cal(cal(y));

			if (y == 1)
				return true;

			if (x == y)
				return false;
		}
		return true;
	}

	public static int cal(int n) {
		int x = n;
		int s = 0;
		while (x > 0) {
			s = s + (x % 10) * (x % 10);
			x = x / 10;
		}
		System.out.println(s);
		return s;
	}

	static boolean isHappy2(int n) {
		while (n > 6) {
			int next = 0;
			while (n > 0) {
				next += (n % 10) * (n % 10);
				n /= 10;
				System.out.println(next);
			}
			
			n = next;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		// System.out.println(isHappy(3));
		System.out.println(isHappy(24143523));
	}

}
