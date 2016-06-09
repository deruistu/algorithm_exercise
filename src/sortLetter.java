public class sortLetter {

	public static String sort(String str) {
		String sortedStr = "";
		String[] arrayWord = str.split(" ");
		char exchangeChar;
		int str_flag = 0;

		for (String word : arrayWord) {
			
			char[] arrayStr = word.toCharArray();
			
			for (int i = 0; i < arrayStr.length; i++) {

				for (int j = 0; j < arrayStr.length; j++) {

					if (arrayStr[i] < arrayStr[j]) {
						exchangeChar = arrayStr[i];
						arrayStr[i] = arrayStr[j];
						arrayStr[j] = exchangeChar;
					}
				}
			}
			
			for(int i=0;i<arrayStr.length;i++)
			{
				sortedStr+=arrayStr[i];
			}
			sortedStr+=" ";
		}
		return sortedStr;
	}

	public static void main(String[] argv) {
		String test_input = "hackajob is great";
		String test_output;
		test_output = sortLetter.sort(test_input);
		System.out.println(test_output);
	}
}
