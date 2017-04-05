package com.twitter.poruke;
/**
 * Klasa koja predstavlja Twitter poruku.
 * @author anadzudovic
 * @version 1.0
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
		if (korisnik==null || korisnik.isEmpty()) 
			throw new RuntimeException( "Ime korisnika mora biti uneto");  
		this.korisnik = korisnik;
		}
	/**
	 * Metoda vraca vrednost atributa poruka.
	 * @return poruka kao String
	 */
	public String getPoruka() { 
		return poruka;
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
			if (poruka==null || poruka.isEmpty() || poruka.length()>140) 
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((korisnik == null) ? 0 : korisnik.hashCode());
		result = prime * result + ((poruka == null) ? 0 : poruka.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TwitterPoruka))
			return false;
		TwitterPoruka other = (TwitterPoruka) obj;
		if (korisnik == null) {
			if (other.korisnik != null)
				return false;
		} else if (!korisnik.equals(other.korisnik))
			return false;
		if (poruka == null) {
			if (other.poruka != null)
				return false;
		} else if (!poruka.equals(other.poruka))
			return false;
		return true;
	}  
	

}
