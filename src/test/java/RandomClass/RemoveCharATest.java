package RandomClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCharATest {

	@Test
	void testRemoveCharAFromInput() {
		String []expectedResult = {"BCD",
				"CD",
				"BCD",
				"BBAA",
				"BAA"};
		String []actualTestCases = {"ABCD",
				"AACD",
				"BACD",
				"BBAA",
				"AABAA"};
		RemoveCharA test = new RemoveCharA();
		int n = expectedResult.length;
		for(int i=0; i<n; i++) {
			assertEquals(expectedResult[i], test.removeCharAFromInput(actualTestCases[i]));
		}
	}

}
