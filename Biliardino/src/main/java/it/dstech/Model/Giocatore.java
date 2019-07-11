package it.dstech.Model;

public class Giocatore
{

	  private int id;
	  private String nome;
	  private String cognome;
	  
	  
	  public Giocatore (String nome, String cognome)
	  {
	    this.nome = nome;
	    this.cognome = cognome;
	  }
	  public int getId()
	  {
	    return id;
	  }
	  public void setId(int id)
	  {
	    this.id = id;
	  }
	  public String getNome()
	  {
	    return nome;
	  }
	  public void setNome(String nome)
	  {
	    this.nome = nome;
	  }
	  public String getCognome()
	  {
	    return cognome;
	  }
	  public void setCognome(String cognome)
	  {
	    this.cognome = cognome;
	  }
	@Override
	  public boolean equals(Object obj)
	  {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Giocatore other = (Giocatore) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	  }
}