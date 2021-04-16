package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeValidatorTest {
	PalindromeValidator validator = new PalindromeValidator();

	@Test
	void Given_SingleLetterString_When_ValidatingPalindrome_Then_True() {
		// Given
		String string = "a";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void Given_2DifferentLettersString_When_ValidatingPalindrome_Then_False() {
		// Given
		String string = "ab";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = false;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void Given_2EqualLettersString_When_ValidatingPalindrome_Then_True() {
		// Given
		String string = "aa";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
    void Given_3LetterPalindromeString_When_ValidatingPalindrome_Then_True() {
        // Given
        String string = "aba";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);

    }
	
	@Test
    void Given_4LetterPalindromeString_When_ValidatingPalindrome_Then_True() {
        // Given
        String string = "abba";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);

    }
	
	@Test
    void Given_4LetterNotPalindromeString_When_ValidatingPalindrome_Then_False() {
        // Given
        String string = "abda";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);

    }
	
	@Test
    void Given_APalindromePhraseString_When_ValidatingPalindrome_Then_True() {
        // Given
        String string = "a man a plan a canal panama";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);

    }
	
	@Test
    void Given_ANotPalindromePhraseString_When_ValidatingPalindrome_Then_False() {
        // Given
        String string = "b man a plan a canal panama";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);

    }

}
