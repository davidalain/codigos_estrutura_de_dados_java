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

	public String toString() {
		return "Pessoa {nome=" + nome + ", cpf=" + cpf + ", login=" + login + ", senha=" + senha + "}";
	}
	
	public boolean equals(Object o) {
		if(o instanceof Pessoa) {
			Pessoa p = (Pessoa) o;
			return this.cpf.equals(p.cpf);
		}
		return false;
	}
	

}
