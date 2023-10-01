package W4CodingProject;

public class W4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
										
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code) Print the result to the console.  
			System.out.println(ages[0] - ages[ages.length-1]);
		
		//b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic 
		//(works for arrays of different lengths).
			int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93,77};
			System.out.println(ages2[0] - ages2[ages2.length-1]);
		
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			double sum = 0;
			for (int number : ages2) {
				sum += number;
			}
			double average = sum / ages2.length;
			System.out.println(average);
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			String[] names = new String[6];
			
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			int sumOfLetters = 0; 
			for (String name : names) {
				sumOfLetters += name.length();
			}
			int averageOfLetters = sumOfLetters / names.length;
			System.out.println(averageOfLetters);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			String namesTogether = " ";
			for (int i = 0; i < names.length; i++){
			namesTogether += names[i] + " ";
			}
			System.out.println(namesTogether + "");
			
		//3. How do you access the last element of any array?
			System.out.println(names[names.length-1]);
		
		//4. How do you access the first element of any array?
			System.out.println(names[0]);
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each 
		// name to the nameLengths array.
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			}
			
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sum += nameLengths[i];
			}
			System.out.println(sum); }
		
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			public static String multiplyString(String str, int num) {
				String result = " ";
				for (int i = 0; i < num; i++) {
					result += str;
				}
				return result; }
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first 
		//and the last name as a String separated by a space).
			public static String createFullName(String firstName, String lastName) {
				String fullName = firstName + " " + lastName;
				return fullName;
			}
			
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
				public static boolean arrGreaterThan(int[] arr) {
					for (int i = 0; i < arr.length; i ++) {
						if(arr[i] > 100)
							return true;
					}
					return false; 
					}
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
				public static double getAverage(double[] array) {
					double sum = 0;
					for (double number : array) {
						sum += number;
					}
					return sum / array.length;
				}
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than 
		//the average of the elements in the second array.
				public static boolean isFirstAverageGreater(double[] firstArray, double[] secondArray) {
					return getAverage(firstArray) > getAverage(secondArray);
				}
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is 
		//hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50; 
		}
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		// This method returns the sum of two products.
				public static double totalPrice(double num1, double num2) {
					double sum = 0;
					sum = num1 + num2;
					return sum; 
				
			
	}
}


