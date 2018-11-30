/*
 Given a string, count the number of words ending in 'y' or 'z' -- 
 so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
 (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter
 immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") ==> 2
countYZ("day fez") ==> 2
countYZ("day fyyyz") ==> 2
 */
public class CountYZ {

	public static void main(String[] args) {
		System.out.println(countYZ("aaz yyz my"));
	}

	public static int countYZ(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (i == str.length() - 1) {
				if (c == 'y' || c == 'z' || c == 'Y' || c == 'Z') {
					count++;
				}
				return count;
			}

			char c2 = str.charAt(i + 1);
			if ((c == 'y' || c == 'z' || c == 'Y' || c == 'Z') && !((int) c2 >= 97 && (int) c2 <= 122)
					&& !((int) c2 >= 65 && (int) c2 <= 90)) {
				count++;
			}
		}
		return count;
	}
}
