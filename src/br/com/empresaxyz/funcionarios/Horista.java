package br.com.empresaxyz.funcionarios;

public class Horista extends Funcionario {
	private double valorHora;
	private int numeroHoras;

	public Horista(String nome, int funcional, double valorHora, int numeroHoras) {
		super(nome, funcional);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}

	public String exibirRecibo() {
		return "==================================\n       FOLHA DE PAGAMENTO      \n================================\nNome do colaborador: "
				+ nome + "\nFuncional: " + funcional + "\nFunção: Horista\nHoras trabalhadas: " + numeroHoras
				+ String.format("%nValor da hora: R$ %.2f%n", valorHora)
				+ String.format("Total: R$ %.2f%n", valorHora * numeroHoras) + "================================";
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

}
