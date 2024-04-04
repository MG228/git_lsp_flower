package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerSetTest2 {
	
	private IntegerSet set;
	
	private void initializeSet() {
		set = new IntegerSet();
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	 @Test
	    public void testClear() {
	        set.add(5);
	        set.add(10);
	        set.clear();
	        set.add(6);
	        set.clear();
	        assert(set.Empty());
	    }

	    @Test
	    public void testLength() {
	        assertEquals(0, set.len());
	        set.add(1);
	        set.add(2);
	        assertEquals(2, set.len());
	    }

	    @Test
	    public void testEquals() {
	        IntegerSet setB = new IntegerSet();
	        set.add(1);
	        set.add(2);
	        setB.add(2);
	        setB.add(1);
	        assert(set.equals(setB));
	    }

	    @Test
	    public void testContains() {
	        set.add(1);
	        set.add(2);
	        assert(set.check(1));
	        assert(!set.check(3));
	    }

	    @Test
	    public void testLargest() {
	        set.add(1);
	        set.add(3);
	        set.add(2);
	        assertEquals(3, set.largest());
	    }

	    @Test
	    public void testLargestWithEmptySet() {
	        assertEquals(Integer.MIN_VALUE, set.largest());
	    }

	    @Test
	    public void testSmallest() {
	        set.add(1);
	        set.add(3);
	        set.add(2);
	        assertEquals(1, set.smallest());
	    }

	    @Test
	    public void testSmallestWithEmptySet() {
	        assertEquals(Integer.MAX_VALUE, set.smallest());
	    }

	    @Test
	    public void testAdd() {
	        set.add(56);
	        assert(set.check(56));
	    }

	    @Test
	    public void testRemove() {
	        set.add(11);
	        set.add(12);
	        set.add(13);
	        set.add(14);
	        set.add(15);
	        set.add(16);
	        set.add(17);
	        set.add(18);
	        set.remove(12);
	        set.remove(14);
	        set.remove(16);
	        set.remove(18);
	        assert(!set.check(12));
	    }

	    @Test
	    public void testUnion() {
	        set.add(0);
	        set.add(5);
	        IntegerSet setB = new IntegerSet();
	        setB.add(1);
	        setB.add(3);
	        set.union(setB);
	        assert(set.check(0));
	        assert(set.check(5));
	        assert(set.check(1));
	    }

	    @Test
	    public void testIntersect() {
	        set.add(1);
	        set.add(2);
	        IntegerSet setB = new IntegerSet();
	        setB.add(2);
	        setB.add(3);
	        set.intersect(setB);
	        assert(set.check(2));
	        assert(!set.check(1));
	        assert(!set.check(3));
	    }

	    @Test
	    public void testDifference() {
	        set.add(1);
	        set.add(2);
	        IntegerSet setB = new IntegerSet();
	        setB.add(2);
	        setB.add(3);
	        set.diffrence(setB);
	        assert(set.check(1));
	        assert(!set.check(2));
	        assert(!set.check(3));
	    }

	    @Test
	    public void testComplement() {
	        set.add(100);
	        set.add(200);
	        set.add(56);
	        set.add(90);
	        set.complement(null); 
	        assert(!set.check(1));
	        assert(!set.check(2));
	    }

	    @Test
	    public void testIsEmpty() {
	        assert(set.Empty());
	        set.add(1);
	        set.add(2);
	        set.add(3);
	        set.add(4);
	        set.add(5);
	        assert(!set.Empty());
	    }

	    @Test
	    public void testToString1() {
	        set.add(11);
	        set.add(-2);
	        assertEquals("[11, -2]", set.toString());
	        set.add(-12);
	        set.add(9);
	        set.add(6);
	        assertEquals("[-12, 9, 6]", set.toString());
	        
	    }

	}
	
