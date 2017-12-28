package lista;

import java.util.Objects;

public class Pessoa {

	private String nome;
	private String datadenascimento;
	private String cpf;

	public Pessoa(String nome, String datadenascimento, String cpf) {
		super();
		this.nome = nome;
		this.datadenascimento = datadenascimento;
		this.cpf = cpf;
	}
	
	@Override
	public int hashCode() {
		final int primo = 31;
		int saida = 1;
		saida = primo * saida + Objects.hashCode(cpf);
		return saida;
	}

	@Override
	public boolean equals(Object obj) {

		if(!(obj instanceof Pessoa))
			return false;

		return this.cpf.equals(((Pessoa) obj).cpf);
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
//		return result;
//	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", datadenascimento=" + datadenascimento + ", cpf=" + cpf + "]";
	}




}
