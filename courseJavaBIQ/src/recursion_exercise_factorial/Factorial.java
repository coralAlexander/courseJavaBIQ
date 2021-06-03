package recursion_exercise_factorial;

class Factorial {
	//
	int fact(int n) {
		int result;
		if (n == 1) {
			return 1;
		} else {
			result = fact(n - 1) * n;
			return result;
		}
	}
}
