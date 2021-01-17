package io.zipcoder;

/**
 * @author tariq
 */
public class StringsAndThings {

	/**
	 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y'
	 * in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case
	 * sensitive). We'll say that a y or z is at the end of a word if there is not
	 * an alphabetic letter immediately following it. (Note:
	 * Character.isLetter(char) tests if a char is an alphabetic letter.) example :
	 * countYZ("fez day"); // Should return 2 countYZ("day fez"); // Should return 2
	 * countYZ("day fyyyz"); // Should return 2
	 */
	public Integer countYZ(String input) {
		String wordArr[] = input.split(" ");
		Integer counter = 0;
		for (int i = 0; i < wordArr.length; i++) {
			if (wordArr[i].charAt(wordArr[i].length() - 1) == 'y' || wordArr[i].charAt(wordArr[i].length() - 1) == 'z'
					|| wordArr[i].charAt(wordArr[i].length() - 1) == 'Y'
					|| wordArr[i].charAt(wordArr[i].length() - 1) == 'Z') {
				counter++;
			}

		}
		return counter;
	}

	/**
	 * Given two strings, base and remove, return a version of the base string where
	 * all instances of the remove string have been removed (not case sensitive).
	 * You may assume that the remove string is length 1 or more. Remove only
	 * non-overlapping instances, so with "xxx" removing "xx" leaves "x".
	 *
	 * example : removeString("Hello there", "llo") // Should return "He there"
	 * removeString("Hello there", "e") // Should return "Hllo thr"
	 * removeString("Hello there", "x") // Should return "Hello there"
	 */
	public String removeString(String base, String remove) {
		String result = "";
        if(base.contains(remove)){
            result=base.replace(remove,"");
        } else result = base;

        return result;
	}

	/**
	 * Given a string, return true if the number of appearances of "is" anywhere in
	 * the string is equal to the number of appearances of "not" anywhere in the
	 * string (case sensitive)
	 *
	 * example : containsEqualNumberOfIsAndNot("This is not") // Should return false
	 * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
	 * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
	 */
	public Boolean containsEqualNumberOfIsAndNot(String input) {
		return (input.split("is", -1).length - 1) == (input.split("not", -1).length - 1);
	}

	/**
	 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
	 * immediately to its left or right. Return true if all the g's in the given
	 * string are happy. example : gHappy("xxggxx") // Should return true
	 * gHappy("xxgxx") // Should return false gHappy("xxggyygxx") // Should return
	 * false
	 */
	public Boolean gIsHappy(String input) {
		boolean result = false;
        char charToCheck = 'g';
        char[] characterArrayOfInput = input.toCharArray();
        for(int i = 0; i < input.length(); i++){
            if(characterArrayOfInput[i] == charToCheck){
                if ((characterArrayOfInput[i + 1] == charToCheck) || (characterArrayOfInput[i - 1] == charToCheck)) {
                    result = true;
                } else {result = false;}
            }
        }
        return result;
    }

	
	/**
	 * We'll say that a "triple" in a string is a char appearing three times in a
	 * row. Return the number of triples in the given string. The triples may
	 * overlap. example : countTriple("abcXXXabc") // Should return 1
	 * countTriple("xxxabyyyycd") // Should return 3 countTriple("a") // Should
	 * return 0
	 */
	public Integer countTriple(String input) {
		int result = 0;
		char[] characterArrayOfInput = input.toCharArray();
		for (int i = 0; i < input.length() - 1; i++) {

			if (i+2 < input.length()) {
				char currentChar = characterArrayOfInput[i];
				if (currentChar == characterArrayOfInput[i + 1] && currentChar == characterArrayOfInput[i + 2]) {
					result++;
				}
			}
		}
		return result;
	}
}
