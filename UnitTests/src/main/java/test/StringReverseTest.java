package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.StringReverse;

public class StringReverseTest {

	StringReverse sr = new StringReverse();

	@SuppressWarnings("static-access")
	@Test
	public void shouldDisplayTheReverse() {

		String a = "abc";

		assertEquals("cba", sr.revUsingSb(a));

	}

	@Test
	public void shouldReturnNullWhenEmpty() {

		assertNull(sr.revUsingSb(null));

	}

}
