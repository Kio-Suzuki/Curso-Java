package application;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Calculator implements ActionListener{

	static JFrame calc = new JFrame("Calculadora");
	
	static JButton b0 = new JButton("0");
	static JButton b1 = new JButton("1");
	static JButton b2 = new JButton("2");
	static JButton b3 = new JButton("3");
	static JButton b4 = new JButton("4");
	static JButton b5 = new JButton("5");
	static JButton b6 = new JButton("6");
	static JButton b7 = new JButton("7");
	static JButton b8 = new JButton("8");
	static JButton b9 = new JButton("9");
	static JButton bplus = new JButton("+");
	static JButton bmin = new JButton("-");
	static JButton bmult = new JButton("x");
	static JButton bdiv = new JButton("/");
	
	public static void main(String[] args) {
		
		criaCalc();
	}
	
	public static void criaCalc(){

		calc.setDefaultCloseOperation(calc.EXIT_ON_CLOSE);

		calc.setSize(300,500);

		JButton.setBounds(200,200);
		
		calc.add(b9);
		calc.add(b8);
		calc.add(b7);
		calc.add(b6);
		calc.add(b5);
		calc.add(b4);
		calc.add(b3);
		calc.add(b2);
		calc.add(b1);
		calc.add(b0);
		calc.add(bplus);
		calc.add(bmin);
		calc.add(bmult);
		calc.add(bdiv);

		calc.setLayout(new FlowLayout());
		calc.setVisible(true);
	}

}
