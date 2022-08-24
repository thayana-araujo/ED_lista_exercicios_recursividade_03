package view;

import javax.swing.JOptionPane;

import controller.ControllerSomatoria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Metodo construtor
		ControllerSomatoria cs = new ControllerSomatoria();
		
//		variavel que recebe e guarda o número para calcular aa soma de 1 até n
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

		double somaN = cs.somaN(num);
//		exibição do resultado
		System.out.println("A soma dos números é: "+somaN);

	}

}
