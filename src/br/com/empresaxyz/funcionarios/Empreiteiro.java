package br.com.empresaxyz.funcionarios;

public class Empreiteiro extends Funcionario {
	private double valorEmpreita;

	public Empreiteiro(String nome, int funcional, double valorEmpreita) {
		super(nome, funcional);
		this.valorEmpreita = valorEmpreita;
	}

	public String exibirRecibo() {
		return "================================\n       FOLHA DE PAGAMENTO      \n================================\nNome do colaborador: "
				+ nome + "\nFuncional: " + funcional + "\nFunção: Empreiteiro\n"
				+ String.format("Valor empreita: R$ %.2f%n", valorEmpreita)
				+ String.format("Total: R$ %.2f%n", valorEmpreita) + "================================";
	}

	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

}
