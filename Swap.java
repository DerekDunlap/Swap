//Name: Derek Dunlap
//Date: 1/20/2021
//Due Date: Jan 23
//Program accepts user's PantherID and swaps the digits for the ID. Also, program accepts a string input and swaps 
//the elements of the string that was entered by the user and outputs both new values.
//===============================================================================
package task1;
import java.util.*;//Imports Scanner.
public class Swap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//Ask the user to input a valid integer to be swapped.
		System.out.print("Please input a number to be swapped: ");
		int number=input.nextInt();
		
		//Ask the user to input a valid string to be swapped.
		System.out.print("Please input a string to be swapped: ");
		String str=input.next();
		System.out.println(); //Improves readability.
		
		//Calls SwapDigit & SwapLetter function and displays their return values.
		System.out.println("The swapped result is: "+ swapDigitPairs(number));
		System.out.print("The swapped result is: "+ swapLetterPairs(str));	
		input.close(); //Closes the scanner at the end of the program.
		}
		
	//Method to swap a pair of digits and return an integer value to main method.
		public static int swapDigitPairs(int n) {
			int result=0;
			int i=1;
			while(n>9) {
				result+= (n%10)*10*i;
				n=n/10;
				result+= (n%10)*i;
				n=n/10;
				i*=100;
			}
			//Perform the below equation to swap the group of numbers and returns to main method.
			return result+i*n;
		}
		
		//Method to perform the swapping of a pair of letters and return a string value to main method.
		public static String swapLetterPairs(String str) {
			//Accepts the value stored in str & converts it into a char array.
			char[] letter=str.toCharArray();
			
			//for-loop that iterates throught the array based on the length.
			for(int i=0;i<letter.length-1;i+=2) {
				
				char temp=letter[i];//Temporarily holds the letter in temp based on element of array.
				letter[i]=letter[i+1];//Assigns next letter to current array element.
				letter[i+1]=temp;//Assigns letter stored in temp to the next element's position.
			}
			//Creates new string with swapped letters and returns to main method.
			return new String(letter);
		}
}