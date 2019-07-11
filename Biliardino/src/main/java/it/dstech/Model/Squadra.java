package it.dstech.Model;

public class Squadra {

	private Giocatore giocatore1;
	private Giocatore giocatore2;

	public Squadra(Giocatore giocatore1, Giocatore giocatore2) throws giocatoreException {
		if (giocatore1.getId() == giocatore2.getId()) {
			throw new giocatoreException();
		}
		this.giocatore1 = giocatore1;
		this.giocatore2 = giocatore2;
	}

	public Giocatore getGiocatore1() {
		return giocatore1;
	}

	public void setGiocatore1(Giocatore giocatore1) {
		this.giocatore1 = giocatore1;
	}

	public Giocatore getGiocatore2() {
		return giocatore2;
	}

	public void setGiocatore2(Giocatore giocatore2) {
		this.giocatore2 = giocatore2;
	}

	@Override
	public String toString() {
		return "Squadra [giocatore1=" + giocatore1 + ", giocatore2=" + giocatore2 + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Squadra other = (Squadra) obj;
		if (giocatore1 == null) {
			if (other.giocatore1 != null)
				return false;
		} else if (!giocatore1.equals(other.giocatore1))
			return false;
		if (giocatore2 == null) {
			if (other.giocatore2 != null)
				return false;
		} else if (!giocatore2.equals(other.giocatore2))
			return false;
		return true;
	}

}
