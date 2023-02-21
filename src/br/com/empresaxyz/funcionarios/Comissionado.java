package br.com.empresaxyz.funcionarios;

public class Comissionado extends Funcionario {
	private double salarioBase;
	private double comissao;

	public Comissionado(String nome, int funcional, double salarioBase, double comissao) {
		super(nome, funcional);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public String exibirRecibo() {
		return "================================\n       FOLHA DE PAGAMENTO      \n================================\nNome do colaborador: "
				+ nome + "\nFuncional: " + funcional + "\nFunção: Comissionado\n"
				+ String.format("Salário base: R$ %.2f%n", salarioBase) + "Comissão: " + comissao + "%\n"
				+ String.format("Total: R$ %.2f%n", salarioBase * comissao / 100 + salarioBase)
				+ "================================";
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
