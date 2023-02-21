package br.com.empresaxyz.funcionarios;

public class Chefe extends Funcionario {
	private double salarioBase;
	private double adicionalFuncao;
	private double beneficioTerno;

	public Chefe(String nome, int funcional, double salarioBase, double adicionalFuncao, double beneficioTerno) {
		super(nome, funcional);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	public String exibirRecibo() {
		return "================================\n       FOLHA DE PAGAMENTO      \n================================\nNome do colaborador: "
				+ nome + "\nFuncional: " + funcional + "\nFunção: Chefe\n"
				+ String.format("Salário base: R$ %.2f%n", salarioBase) + "Adicional da função: " + adicionalFuncao
				+ "%\n" + String.format("Benefício terno: R$ %.2f%n", beneficioTerno)
				+ String.format("Total: R$ %.2f%n", salarioBase * adicionalFuncao / 100 + beneficioTerno + salarioBase)
				+ "================================";
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

}
