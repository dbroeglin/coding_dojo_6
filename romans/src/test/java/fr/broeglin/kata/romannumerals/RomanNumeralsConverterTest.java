package fr.broeglin.kata.romannumerals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumeralsConverterTest {

	private RomanNumeralsConverter converter = new RomanNumeralsConverter();

	@Test
	public void should_convert_1_to_I() {
		assertThat(converter.convert(1), equalTo("I"));
	}
}
