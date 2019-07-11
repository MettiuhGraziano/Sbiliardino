package it.dstech.Model;

public class Partita {
	private Squadra s1;
	private Squadra s2;
	private int risultatos1;
	private int risultatos2;

	public Squadra getS1() {
		return s1;
	}

	public void setS1(Squadra s1) {
		this.s1 = s1;
	}

	public Squadra getS2() {
		return s2;
	}

	public void setS2(Squadra s2) {
		this.s2 = s2;
	}

	public int getRisultatos1() {
		return risultatos1;
	}

	public void setRisultatos1(int risultatos1) {
		this.risultatos1 = risultatos1;
	}

	public int getRisultatos2() {
		return risultatos2;
	}

	public void setRisultatos2(int risultatos2) {
		this.risultatos2 = risultatos2;
	}

	public Partita(Squadra s1, Squadra s2) throws GiocatoreInAltraSquadraException {
		if(s1.getG1()==s2.getG1() || s1.getG1()==s2.getG2() || s1.getG2()==s2.getG1() || s1.getG2()==s2.getG2()) {
			throw new GiocatoreInAltraSquadraException();
		}
		this.s1 = s1;
		this.s2 = s2;
		this.risultatos1 = 0;
		this.risultatos2 = 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partita other = (Partita) obj;
		if (risultatos1 != other.risultatos1)
			return false;
		if (risultatos2 != other.risultatos2)
			return false;
		if (s1 == null) {
			if (other.s1 != null)
				return false;
		} else if (!s1.equals(other.s1))
			return false;
		if (s2 == null) {
			if (other.s2 != null)
				return false;
		} else if (!s2.equals(other.s2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Partita [squadra 1=" + s1 + ", squadra 2=" + s2 + ", risultato squadra 1=" + risultatos1
				+ ", risultato squadra 2=" + risultatos2 + "]";
	}

	public Squadra giocaPartita() {

		while (risultatos1 != 10 && risultatos2 != 10) {
			double x = Math.random() * 10;
			int y = (int) x;
			if (y % 2 == 0) {
				risultatos1++;
			} else {
				risultatos2++;
			}
		}
		if (risultatos1 == 10) {
			return s1;
		}
		return s2;

	}
}
