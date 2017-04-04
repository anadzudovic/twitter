package com.twitter.poruke;
/**
 * Klasa koja predstavlja Twitter poruku.
 * @author anadzudovic
 * @version 0.0.1
 *
 */
public class TwitterPoruka {
	/**
	 * Korisnika kao String vrednost.
	 */
	private String korisnik; 
	/**
	 * Poruka kao String vrednost.
	 */
	private String poruka; 
	/**
	 * Metoda koja vraca vrednost atributa korisnik.
	 * @return korisnika kao String
	 */
	public String getKorisnik() {
		return korisnik; 
		}
	/**
	 * Postavlja novu vrednost za atribut korisnik.
	 * @param korisnik novi korisnik
	 * throws java.lang.RuntimeException ako je uneto:
	 * <ul>
	 * <li> null vrednost </li>
	 * <li> prazan String</li>
	 * </ul>
	 */
	public void setKorisnik(String korisnik) { 
		if (korisnik==null || !korisnik.isEmpty()) 
			throw new RuntimeException( "Ime korisnika mora biti uneto");  
		this.korisnik = korisnik;
		}
	/**
	 * Metoda vraca vrednost atributa poruka.
	 * @return poruka kao String
	 */
	public String getPoruka() { 
		return "poruka";
		} 
	/**
	 * Postavlja novu vrednost za atribut poruka.
	 * @param poruka nova poruka
	 * throws java.lang.RuntimeException ako je uneto:
	 * <ul>
	 * <li> null vrednost </li>
	 * <li> prazan String</li>
	 * <li> poruka duza od 140 karaktera </li>
	 * </ul>
	 */
	public void setPoruka(String poruka) { 
			if (this.poruka==null || this.poruka == new String("") || this.poruka.length()>140) 
				throw new RuntimeException( "Poruka mora biti uneta i mora imati najvise 140 znakova"); 
			this.poruka = poruka; 
			} 
	/**
	 * Metoda vraca String sa korisnikom i porukom u adekvatnoj formi.
	 * return korisnik i poruka uz odgovarajucu poruku
	 */
	public String toString(){ 
			return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
			}  
	

}
