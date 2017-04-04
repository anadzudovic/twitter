/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author User
 *
 */
public class TwitterPorukaTest {
	private TwitterPoruka tp;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tp=new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tp=null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test (expected= java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		tp.setKorisnik(null);
		
	}
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test (expected= java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {
		tp.setKorisnik("");
		
	}
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test 
	public void testSetKorisnikOk() {
		tp.setKorisnik("anadzudovic");
		assertEquals("anadzudovic",tp.getKorisnik());
		
	}
	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
