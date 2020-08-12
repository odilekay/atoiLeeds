/* Odile Wolf
 * 8/12/2020
 * create atoi for base 10 only
 * dealing with overflow, underflow
 * leading with spaces allowed
 * stop at first alpha character
 */
package atoiLeeds;

public class atoiLeeds {
	public int myAtoi(String str) {
		int index = 0;
		int result =0;
		boolean isNegative = false; // is the number a negative
		boolean isOverflow = false;
		boolean isUnderflow = false;

		// discard all the leading white space
		while (index < str.length() && str.charAt(index)==' '){
			index ++;
		}

		// deal with sign
		if (index < str.length() && str.charAt(index) == '-'){
			isNegative = true;
			index ++;
		}
		
		
		// convert the digits
		while (index <str.length()
				&& !isOverflow // we need to stop as soon as there is a problem
				&& Character.isDigit(str.charAt(index) // stop on alpha 
			   )){

			try { //multiplyExact will throw an exception on overflow
				result = Math.multiplyExact(result, 10) + Character.getNumericValue(str.charAt(index));
				index ++; 
			} catch (ArithmeticException e) {
				// we went above the max
				isOverflow = true;
			}
		}
		
		// transform into negative number
		if (isNegative ){
			if (isOverflow) { // the overflow was an underflow in disguise
				isUnderflow = true;
			} else {
				result = -1 * result;   
			}
		}

		if (isUnderflow) {
			result = Integer.MIN_VALUE;
		} else if (isOverflow) {
			result = Integer.MAX_VALUE;
		}
		return result;
	}


}
