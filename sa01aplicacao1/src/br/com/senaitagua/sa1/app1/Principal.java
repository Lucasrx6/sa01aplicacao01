package br.com.senaitagua.sa1.app1;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro avião"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo avião"));
		
		CalculoBO cbo = new CalculoBO();
		
		cbo.Somar(valor1,valor2);
	}

}