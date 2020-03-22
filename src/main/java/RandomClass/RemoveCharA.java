package RandomClass;

public class RemoveCharA {
	public String removeCharAFromInput(String input) {
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(char c : input.toCharArray()) {
			if(cnt < 2 && c == 'A') {
				cnt++;
				continue;
			}
			sb.append(c);
			cnt++;
		}
		String output = new String(sb);
		return output;
	}
//	public static void main(String []args) {
//		RemoveCharA test = new RemoveChartA();
//		String []randomTestCases = {"ABCD",
//						"AACD",
//						"BACD",
//						"BBAA",
//						"AABAA"};
//		for(String s : randomTestCases) {
//			System.out.println(test.removeCharAFromInput(s));
//		}
//	}
}
