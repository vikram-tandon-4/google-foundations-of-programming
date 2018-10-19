

/*
 * The Challenge
Given a string S and a set of words D, find the longest word in D that is a subsequence of S.

Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.

Note: D can appear in any format (list, hash table, prefix tree, etc.

For example, given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"} the correct output would be "apple"

The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
The word "bale" is not a subsequence of S because even though S has all the right letters, they are not in the right order.
The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.
 */
public class Subsequence {

	public static void main(String arg[]) {
		String maxWord = "";
		String words[] = { "able", "ale", "apple", "bale", "kangaroo"};

		for (String word : words) {
			if (checkSubsequence(word)) {
				if (word.length() > maxWord.length()) {
					maxWord = word;
				}
			}
		}
		System.out.print(maxWord);
	}

	private static boolean checkSubsequence(String word) {

		String mainWord = "abppplee";
		boolean subseq = true;
		for (int i = 0; i < word.length(); i++) {
			// System.out.println("character picked : "+word.charAt(i) );
			if (mainWord.contains(String.valueOf(word.charAt(i)))) {
				if (mainWord.length() >= 1 && i != word.length() - 1) {
					mainWord = mainWord.substring(mainWord.indexOf(word.charAt(i)) + 1);
					// System.out.println("Main word = " + mainWord);
				}
			} else {
				subseq = false;
				break;
			}
		}

		if (subseq) {
			return true;
		} else {
			// System.out.println(word + ": Word not found");
			return false;
		}
	}

}
