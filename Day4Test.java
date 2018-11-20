package test;

import static org.junit.Assert.*;
import twenty17.*;

import org.junit.Test;

public class Day4Test {

	@Test
	public void test() {
		Day4 day4 = new Day4();
		
		assertEquals(0,day4.man_dist(1));
		assertEquals(1,day4.man_dist(2));
		assertEquals(1,day4.man_dist(4));
		assertEquals(1,day4.man_dist(6));
		assertEquals(1,day4.man_dist(8));
		assertEquals(2,day4.man_dist(3));
		assertEquals(2,day4.man_dist(5));
		assertEquals(2,day4.man_dist(7));
		assertEquals(2,day4.man_dist(9));
		assertEquals(3,day4.man_dist(10));
		assertEquals(2,day4.man_dist(11));
		assertEquals(3,day4.man_dist(12));
		assertEquals(2,day4.man_dist(23));
		assertEquals(6,day4.man_dist(49));
		
		assertEquals(8,day4.man_dist(81));
		assertEquals(31,day4.man_dist(1024));
	}

}
