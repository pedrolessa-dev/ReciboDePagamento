package br.com.empresaxyz.pagamento;

import java.util.Scanner;
import br.com.empresaxyz.funcionarios.Chefe;
import br.com.empresaxyz.funcionarios.Comissionado;
import br.com.empresaxyz.funcionarios.Empreiteiro;
import br.com.empresaxyz.funcionarios.Horista;

public class Recibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Chefe chefe = new Chefe("Pedro", 987654321, 0, 0, 0);
		Comissionado comissionado = new Comissionado("Jorge", 789456123, 0, 0);
		Horista horista = new Horista("João", 321654987, 0, 0);
		Empreiteiro empreiteiro = new Empreiteiro("José", 123456789, 0);
		System.out.println(
				"================================\n          EMPRESA XYZ          \n================================");
		int loop = 0;
		while (loop < 1) {
			System.out.println("Digite a funcional do colaborador");
			int funcional = sc.nextInt();
			switch (funcional) {
			case 123456789:
				System.out.println("Funcional localizada!\nDigite o valor empreita de " + empreiteiro.getNome());
				double valorEmpreita = sc.nextDouble();
				empreiteiro.setValorEmpreita(valorEmpreita);
				System.out.println(empreiteiro.exibirRecibo());
				loop++;
				break;
			case 321654987:
				System.out.println("Funcional localizada!\nDigite o valor da hora de " + horista.getNome());
				double valorHora = sc.nextDouble();
				horista.setValorHora(valorHora);
				System.out.println("Digite a quantidade de horas trabalhadas");
				int horasTrbalhadas = sc.nextInt();
				horista.setNumeroHoras(horasTrbalhadas);
				System.out.println(horista.exibirRecibo());
				loop++;
				break;
			case 789456123:
				System.out.println("Funcional localizada!\nDigite o salário base de " + comissionado.getNome());
				double salarioBase = sc.nextDouble();
				comissionado.setSalarioBase(salarioBase);
				System.out.println("Digite a comissão");
				double comissao = sc.nextDouble();
				comissionado.setComissao(comissao);
				System.out.println(comissionado.exibirRecibo());
				loop++;
				break;
			case 987654321:
				System.out.println("Funcional localizada!\nDigite o salário base de " + chefe.getNome());
				double salarioBaseChefe = sc.nextDouble();
				chefe.setSalarioBase(salarioBaseChefe);
				System.out.println("Digite o adicional da função");
				double adicionalFuncao = sc.nextDouble();
				chefe.setAdicionalFuncao(adicionalFuncao);
				System.out.println("Digite o benefício terno");
				double beneficioTerno = sc.nextDouble();
				chefe.setBeneficioTerno(beneficioTerno);
				System.out.println(chefe.exibirRecibo());
				loop++;
				break;
			default:
				System.out.println("Funcional não localizada");
				loop = 0;
			}
		}
		sc.close();
	}
}
