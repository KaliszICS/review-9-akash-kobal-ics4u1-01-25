public class PracticeProblem {

	public static void main(String args[]) {

	}
	//Question 1
	public static int lettersToFive(String str, char ch) {
		int count = 0;
		int index = 0;
		while (index < str.length()) {
			if (str.charAt(index) == ch) {
				count++;
			}
		index++;
		if(count == 5) {
			return index;	}
		}
		return(-1);
	}
	//Question 2
	public static int countLetter(String str1, char ch1) {
		int count2 = 0;
		for (char c : str1.toCharArray()) {
			if (c == ch1)
			count2++; 
		}
		return count2;
	}

	//Question 3
	public static int oddSum(int i1, int i2) {
		int sum = 0;
		int start = Math.min(i1, i2);
		int end = Math.max(i1, i2);
		for (int number = start; number <= end; number++) {
		if (number % 2 != 0) {
			sum += number;
		}
	}
		return sum;
		
}
}



	



	

