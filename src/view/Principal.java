package view;

import javax.swing.JOptionPane;

import controller.ControllerSomatoria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Metodo construtor
		ControllerSomatoria cs = new ControllerSomatoria();
		
//		variavel que recebe e guarda o n�mero para calcular aa soma de 1 at� n
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));

		double somaN = cs.somaN(num);
//		exibi��o do resultado
		System.out.println("A soma dos n�meros �: "+somaN);

	}

}
