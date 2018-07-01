package questoesProvas.provaCopa;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Grupo {

	private List<Selecao> selecoes;
	
	public Grupo(Selecao s1, Selecao s2, Selecao s3, Selecao s4) {
		
		if(s1 == null)	throw new InvalidParameterException("Parâmetro não pode ser nulo");
		if(s2 == null)	throw new InvalidParameterException("Parâmetro não pode ser nulo");
		if(s3 == null)	throw new InvalidParameterException("Parâmetro não pode ser nulo");
		if(s4 == null)	throw new InvalidParameterException("Parâmetro não pode ser nulo");
		
		selecoes = new ArrayList<>();
		selecoes.add(s1);
		selecoes.add(s2);
		selecoes.add(s3);
		selecoes.add(s4);
	}

	public List<Selecao> getSelecoes() {
		return selecoes;
	}

	public void setSelecoes(List<Selecao> selecoes) {
		this.selecoes = selecoes;
	}

	//usando a lista de seleções para gerar o hash
	@Override
	public int hashCode() {
		return Objects.hash(selecoes);
	}
	
	//equals gerado pelo eclipse
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (selecoes == null) {
			if (other.selecoes != null)
				return false;
		} else if (!selecoes.equals(other.selecoes))
			return false;
		return true;
	}
	
	
	
}
