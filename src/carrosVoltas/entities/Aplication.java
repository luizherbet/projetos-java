package carrosVoltas.entities;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados! ");
		
		System.out.print("Nome do primeiro carro: ");
		String nomeUm = sc.next();
		System.out.print("Modelo do primeiro carro: ");
		String modeloUm = sc.next();
		System.out.print("Temppo para dar uma volta no primeiro carro: ");
		int tempoVoltaUm = sc.nextInt();	
		
		System.out.print("Nome do segundo carro: ");
		String nomeDois = sc.next();
		System.out.print("Modelo do segundo carro: ");
		String modeloDois = sc.next();
		System.out.print("Temppo para dar uma volta no segundo carro: ");
		int tempoVoltaDois = sc.nextInt();
		
		Carro carroUm = new Carro(nomeUm, modeloUm, tempoVoltaUm);
		Carro carroDois = new Carro(nomeDois, modeloDois, tempoVoltaDois);


		
		if (carroUm.getTempoPorVolta() > carroDois.getTempoPorVolta()) {
			int diferenca = carroUm.getTempoPorVolta() - carroDois.getTempoPorVolta();
			int voltas = carroUm.getTempoPorVolta()/diferenca;
			System.out.print("O carro "+ carroDois.getNome() + " precisa dar "+ voltas + " voltas para ficar com uma volta de vantagem sobre o carro " + carroUm.getNome());
		}
		else {
			int diferenca = carroDois.getTempoPorVolta() - carroUm.getTempoPorVolta();
			int voltas = carroDois.getTempoPorVolta()/diferenca;
			System.out.print("O carro "+ carroUm.getNome() + " precisa dar "+ voltas + " voltas para ficar com uma volta de vantagem sobre o carro " + carroDois.getNome());
		}
		
		sc.close();
	}
}
