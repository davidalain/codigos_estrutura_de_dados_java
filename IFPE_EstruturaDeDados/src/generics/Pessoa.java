package generics;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String login;
	private String senha;
	
	public Pessoa(String nome, String cpf, String login, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean equals(Object arg0) {
		
		//Verica se é a mesma instância
		if(this == arg0)
			return true;
		
		//Verifica se é um objeto Pessoa (se não for instância de Pessoa já é falso)
		if(!(arg0 instanceof Pessoa))
			return false;
		
		//Verifica se os dois objetos têm o mesmo CPF
		Pessoa p = (Pessoa) arg0;
		return this.cpf.equals(p.cpf);
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", login=" + login + ", senha=" + senha + "]";
	}
	
	

}
