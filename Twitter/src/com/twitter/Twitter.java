package com.twitter;

import java.util.LinkedList;

import com.twitter.poruke.TwitterPoruka;
/**
 * Klasa Twitter predstavlja listu twitter poruka.
 * @author anadzudovic
 *@version 1.0
 */

public class Twitter {
	/**
	 * Atribut poruke predstavlja listu Twitterporuka.
	 */
	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();
	/**
	 * Ova metoda vraca sve poruke iz liste poruka.
	 * @return poruke kao listu Twitterporuka.
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke(){ 
		return poruke; 
		} 
	/**
	 * Ova metoda ubacuje Twitterporuku na poslednje mesto u listi poruka.
	 * @param korisnik predstavlja korisnika koji unosi novu poruku 
	 * @param poruka predstavlja tekst poruke koja se unosi
	 */
	
	public void unesi(String korisnik, String poruka) { 
        TwitterPoruka tp = new TwitterPoruka(); 
        tp.setKorisnik("korisnik");
        tp.setPoruka(poruka);  
        poruke.addLast(tp); 
        }  
	/**
	 * Ova metoda pretrazuje listu poruka i vraca niz poruka koje sadrze odredjeni tag, koji se unesi kao parametar.
	 * Kapacitet ovog niza, tj koliko ce najvise poruka sa tagom ova metoda vratiti se takodje unosi kao parametar.
	 * @param maxBroj predstavlja kapacitet niza, tj koliko ce se najvise poruka vratiti
	 * @param tag predstavlja kriterijum na osnovu kojeg se pretrazuje lista poruka
	 * @return rezultat koji predstavlja niz poruka sa unetim tagom
	 * @throws java.lang.RuntimeException.class kada:
	 * <ul>
	 * <li> je tag null</li>
	 * <ll> je tag prazan String </li>
	 * </ul>
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) { 
		if (tag==null || tag.isEmpty()) throw new RuntimeException("Morate uneti tag");
		 if (maxBroj<=0) maxBroj = 100;     
		 int brojac = 0; 
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj]; 
		 for (int i = 0; i < poruke.size(); i++) 
			 if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
				 if (brojac < maxBroj){ 
					 rezultat[brojac+1]=poruke.get(i); brojac++; 
					 }
				 else break; 
		     return rezultat;
		} 

}
