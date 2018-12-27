package io.github.batenzar;

import org.junit.Assert;
import org.junit.Test;

public class ReadTest {

	@Test
	public void testEmpty() {
		Assert.assertEquals(0, Util.countTag(""));
	}

	@Test
	public void testOne() {
		Assert.assertEquals(1, Util.countTag("#AAA"));
	}
	
	@Test
	public void testSpace() {
		Assert.assertEquals(1, Util.countTag("#AA A"));
		Assert.assertEquals(2, Util.countTag("#AA A #BB"));
	}
}
