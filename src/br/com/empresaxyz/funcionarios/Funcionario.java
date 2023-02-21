package br.com.empresaxyz.funcionarios;

public class Funcionario {
	protected String nome;
	protected int funcional;

	public Funcionario(String nome, int funcional) {
		super();
		this.nome = nome;
		this.funcional = funcional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFuncional() {
		return funcional;
	}

	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}

}
