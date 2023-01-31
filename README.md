# Atividade Aula Java SENAI 
## sa01aplicacao1


Este programa tem a finalidade de resolver a primeira atividade da lista de exercicios


1 - (vai somar o valor de dois aviões)

Prints da tela
Ao executar: 

![Print 1](https://user-images.githubusercontent.com/86980974/215861331-0da33303-a709-4abe-b66e-3344daacbeba.PNG)


![print2](https://user-images.githubusercontent.com/86980974/215861371-8a95113f-379a-411e-8bb6-928c8b05886c.PNG)

Resultado


![print3](https://user-images.githubusercontent.com/86980974/215861416-7d55be09-bd8b-4a96-8dfb-8f91c8055e1c.PNG)


----------------------------------------------------------------------------------

Código da classe principal

package br.com.senaitagua.sa1.app1;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro avião"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo avião"));
		
		CalculoBO cbo = new CalculoBO();
		
		double valort = cbo.Somar(valor1,valor2);
		
		JOptionPane.showMessageDialog(null, "O valor total dos aviões é "+ valort +" reais");
	}

}
    
----------------------------------------------------------------------------------

Código da classe CalculaBO

package br.com.senaitagua.sa1.app1;
public class CalculoBO {
	public double Somar(double n1, double n2) {
		return n1+n2;
	}

}
