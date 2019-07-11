package it.dstech.Model;

public class Partita {

	private Squadra squadra1;
	private Squadra squadra2;
	private int risultatoS1;
	private int risultatoS2;

	public Partita(Squadra squadra1, Squadra squadra2) {
		super();
		this.squadra1 = squadra1;
		this.squadra2 = squadra2;
		this.risultatoS1 = 0;
		this.risultatoS2 = 0;
	}

	public Squadra getSquadra1() {
		return squadra1;
	}

	public void setSquadra1(Squadra squadra1) {
		this.squadra1 = squadra1;
	}

	public Squadra getSquadra2() {
		return squadra2;
	}

	public void setSquadra2(Squadra squadra2) {
		this.squadra2 = squadra2;
	}

	public int getRisultatoS1() {
		return risultatoS1;
	}

	public void setRisultatoS1(int risultatoS1) {
		this.risultatoS1 = risultatoS1;
	}

	public int getRisultatoS2() {
		return risultatoS2;
	}

	public void setRisultatoS2(int risultatoS2) {
		this.risultatoS2 = risultatoS2;
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
		if (risultatoS1 != other.risultatoS1)
			return false;
		if (risultatoS2 != other.risultatoS2)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Partita [risultatoS1=" + risultatoS1 + ", risultatoS2=" + risultatoS2 + "]";
	}

	public Squadra giocaPartita() {
		while (this.risultatoS1 == 10 && this.risultatoS2 == 10) {
			int x = (int) Math.random() * 10;
			if (x % 2 == 0) {
				this.risultatoS1++;

			} else {
				this.risultatoS2++;
			}

		}
		if (this.risultatoS1 == 10) {
			return this.squadra1;

		} else {
			return this.squadra2;
		}

	}
}
