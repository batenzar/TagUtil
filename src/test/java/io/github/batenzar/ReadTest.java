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
		Assert.assertEquals("#AAA", Util.getTags("#AAA").get(0));
	}
	
	@Test
	public void testSpace() {
		Assert.assertEquals(1, Util.countTag("#AA A"));
		Assert.assertEquals("#AA", Util.getTags("#AA A").get(0));
		
		Assert.assertEquals(2, Util.countTag("#AA A #BB"));
		Assert.assertEquals("#AA", Util.getTags("#AA A #BB").get(0));
		Assert.assertEquals("#BB", Util.getTags("#AA A #BB").get(1));
	}
	
	// TODO
//	@Test
//	public void testSharp() {
//		Assert.assertEquals(1, Util.countTag("#AA#A"));
//		Assert.assertEquals("#AA", Util.getTags("#AA#A").get(0));
//	}
}
