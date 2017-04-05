/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;
import com.twitter.poruke.TwitterPoruka;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author anadzudovic
 *
 */
/**
 * @author User
 *
 */
public class TwitterTest {
	private Twitter t;
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		t = new Twitter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		t=null;
		
	}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiSvePoruke()}.
	 */
	@Test
	public void testVratiSvePoruke(){
		LinkedList<TwitterPoruka> lista1= new LinkedList<TwitterPoruka>();
		TwitterPoruka tp1= new TwitterPoruka();
		tp1.setKorisnik("anadzudovic");
		tp1.setPoruka("ok");
		lista1.addLast(tp1);
		t.unesi(tp1.getKorisnik(), tp1.getPoruka());
		TwitterPoruka tp2= new TwitterPoruka();
		tp2.setKorisnik("anadzudovic11");
		tp2.setPoruka("ok je dan");
		lista1.addLast(tp2);
		t.unesi(tp2.getKorisnik(), tp2.getPoruka());
		TwitterPoruka tp3= new TwitterPoruka();
		tp3.setKorisnik("anac11");
		tp3.setPoruka("blab");
		lista1.addLast(tp3);
		t.unesi(tp3.getKorisnik(), tp3.getPoruka());
		TwitterPoruka tp4= new TwitterPoruka();
		tp4.setKorisnik("dzudovic2011");
		tp4.setPoruka("nije ok");
		lista1.addLast(tp4);
		t.unesi(tp4.getKorisnik(), tp4.getPoruka());
		TwitterPoruka tp5= new TwitterPoruka();
		tp5.setKorisnik("anadi11");
		tp5.setPoruka("hahahah");
		lista1.addLast(tp5);
		t.unesi(tp5.getKorisnik(), tp5.getPoruka());
		assertEquals(lista1,t.vratiSvePoruke());
		}
	 /**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUnesi() {
		int broj = t.vratiSvePoruke().size();
		TwitterPoruka tp1 = new TwitterPoruka();
		tp1.setKorisnik("anadzudovic");
		tp1.setPoruka("blabla");
		t.unesi(tp1.getKorisnik(), tp1.getPoruka());
		assertEquals(t.vratiSvePoruke().getLast(), tp1);
		assertTrue(broj+1== t.vratiSvePoruke().size());
	}
	

	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test(expected= java.lang.RuntimeException.class)
	public void testVratiPorukeNull() {
		t.vratiPoruke(0, null);
	}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test(expected= java.lang.RuntimeException.class)
	public void testVratiPorukePrazanString() {
		t.vratiPoruke(0,"");
	}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test
	public void testVratiPorukeOk() {
		TwitterPoruka[] niz1= new TwitterPoruka[5];
		TwitterPoruka tp1= new TwitterPoruka();
		tp1.setKorisnik("anadzudovic");
		tp1.setPoruka("ok");
		t.unesi(tp1.getKorisnik(), tp1.getPoruka());
		TwitterPoruka tp2= new TwitterPoruka();
		tp2.setKorisnik("anadzudovic11");
		tp2.setPoruka("ok je dan");
		t.unesi(tp2.getKorisnik(), tp2.getPoruka());
		TwitterPoruka tp3= new TwitterPoruka();
		tp3.setKorisnik("anac11");
		tp3.setPoruka("blab");
		t.unesi(tp3.getKorisnik(), tp3.getPoruka());
		TwitterPoruka tp4= new TwitterPoruka();
		tp4.setKorisnik("dzudovic2011");
		tp4.setPoruka("nije ok");
		t.unesi(tp4.getKorisnik(), tp4.getPoruka());
		TwitterPoruka tp5= new TwitterPoruka();
		tp5.setKorisnik("anadi11");
		tp5.setPoruka("hahahah");
		t.unesi(tp5.getKorisnik(), tp5.getPoruka());
		niz1[0]=tp1;
		niz1[1]=tp2;
		niz1[2]=tp4;
		assertArrayEquals(niz1,t.vratiPoruke(5, "ok"));
		}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test
	public void testVratiPorukePrekoMaxa() {
		TwitterPoruka[] niz1= new TwitterPoruka[2];
		TwitterPoruka tp1= new TwitterPoruka();
		tp1.setKorisnik("anadzudovic");
		tp1.setPoruka("ok");
		t.unesi(tp1.getKorisnik(), tp1.getPoruka());
		TwitterPoruka tp2= new TwitterPoruka();
		tp2.setKorisnik("anadzudovic11");
		tp2.setPoruka("ok je dan");
		t.unesi(tp2.getKorisnik(), tp2.getPoruka());
		TwitterPoruka tp3= new TwitterPoruka();
		tp3.setKorisnik("anac11");
		tp3.setPoruka("blab");
		t.unesi(tp3.getKorisnik(), tp3.getPoruka());
		TwitterPoruka tp4= new TwitterPoruka();
		tp4.setKorisnik("dzudovic2011");
		tp4.setPoruka("nije ok");
		t.unesi(tp4.getKorisnik(), tp4.getPoruka());
		TwitterPoruka tp5= new TwitterPoruka();
		tp5.setKorisnik("anadi11");
		tp5.setPoruka("hahahah");
		t.unesi(tp5.getKorisnik(), tp5.getPoruka());
		niz1[0]=tp1;
		niz1[1]=tp2;
		assertArrayEquals(niz1,t.vratiPoruke(2, "ok"));
		}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test
	public void testVratiPorukeMaxBrManjiOd0() {
		TwitterPoruka[] niz1= new TwitterPoruka[100];
		TwitterPoruka tp1= new TwitterPoruka();
		tp1.setKorisnik("anadzudovic");
		tp1.setPoruka("ok");
		t.unesi(tp1.getKorisnik(), tp1.getPoruka());
		TwitterPoruka tp2= new TwitterPoruka();
		tp2.setKorisnik("anadzudovic11");
		tp2.setPoruka("ok je dan");
		t.unesi(tp2.getKorisnik(), tp2.getPoruka());
		TwitterPoruka tp3= new TwitterPoruka();
		tp3.setKorisnik("anac11");
		tp3.setPoruka("blab");
		t.unesi(tp3.getKorisnik(), tp3.getPoruka());
		TwitterPoruka tp4= new TwitterPoruka();
		tp4.setKorisnik("dzudovic2011");
		tp4.setPoruka("nije ok");
		t.unesi(tp4.getKorisnik(), tp4.getPoruka());
		TwitterPoruka tp5= new TwitterPoruka();
		tp5.setKorisnik("anadi11");
		tp5.setPoruka("hahahah");
		t.unesi(tp5.getKorisnik(), tp5.getPoruka());
		niz1[0]=tp1;
		niz1[1]=tp2;
		niz1[2]=tp4;
		assertArrayEquals(niz1,t.vratiPoruke(-2, "ok"));
		}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test
	public void testVratiPorukeNemaPorSaTagom() {
		TwitterPoruka[] niz1= new TwitterPoruka[5];
		TwitterPoruka tp1= new TwitterPoruka();
		tp1.setKorisnik("anadzudovic");
		tp1.setPoruka("ok");
		t.unesi(tp1.getKorisnik(), tp1.getPoruka());
		TwitterPoruka tp2= new TwitterPoruka();
		tp2.setKorisnik("anadzudovic11");
		tp2.setPoruka("ok je dan");
		t.unesi(tp2.getKorisnik(), tp2.getPoruka());
		TwitterPoruka tp3= new TwitterPoruka();
		tp3.setKorisnik("anac11");
		tp3.setPoruka("blab");
		t.unesi(tp3.getKorisnik(), tp3.getPoruka());
		TwitterPoruka tp4= new TwitterPoruka();
		tp4.setKorisnik("dzudovic2011");
		tp4.setPoruka("nije ok");
		t.unesi(tp4.getKorisnik(), tp4.getPoruka());
		TwitterPoruka tp5= new TwitterPoruka();
		tp5.setKorisnik("anadi11");
		tp5.setPoruka("hahahah");
		t.unesi(tp5.getKorisnik(), tp5.getPoruka());
		assertArrayEquals(niz1,t.vratiPoruke(5, "55"));
		}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test
	public void testVratiPorukeSamo1Por() {
		TwitterPoruka[] niz1= new TwitterPoruka[15];
		TwitterPoruka tp1= new TwitterPoruka();
		tp1.setKorisnik("anadzudovic");
		tp1.setPoruka("ok");
		t.unesi(tp1.getKorisnik(), tp1.getPoruka());
		TwitterPoruka tp2= new TwitterPoruka();
		tp2.setKorisnik("anadzudovic11");
		tp2.setPoruka("ok je dan");
		t.unesi(tp2.getKorisnik(), tp2.getPoruka());
		TwitterPoruka tp3= new TwitterPoruka();
		tp3.setKorisnik("anac11");
		tp3.setPoruka("blab");
		t.unesi(tp3.getKorisnik(), tp3.getPoruka());
		TwitterPoruka tp4= new TwitterPoruka();
		tp4.setKorisnik("dzudovic2011");
		tp4.setPoruka("nije ok");
		t.unesi(tp4.getKorisnik(), tp4.getPoruka());
		TwitterPoruka tp5= new TwitterPoruka();
		tp5.setKorisnik("anadi11");
		tp5.setPoruka("hahahah");
		t.unesi(tp5.getKorisnik(), tp5.getPoruka());
		niz1[0]=tp5;
		assertArrayEquals(niz1,t.vratiPoruke(15, "hahahah"));
		}
	
	

}
