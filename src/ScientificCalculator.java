package program;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ScientificCalculator extends JFrame {
	private static final long serialVersionUID = 128609292020710218L;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine,
			dot, clear, factorial, power, squareRoot, modulus, sin, cos, tan,
			asin, acos, atan, sinh, cosh, tanh, changeSign;
	private JTextArea text;
	private JPanel panel;
	private String result = "";
	private boolean hasDot = false;

	public ScientificCalculator() {
		initUI();
	}

	private void initUI() {

		setTitle("JCalculator");
		setResizable(false);
		panel = new JPanel(new FlowLayout());

		// 1 line, up to a total of 21 characters
		text = new JTextArea(1, 21);
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		dot = new JButton(".");
		clear = new JButton("CE");
		factorial = new JButton("n!");
		power = new JButton("x\u00B2");
		squareRoot = new JButton("\u221Ax");
		modulus = new JButton("|x|");
		sin = new JButton("sin");
		cos = new JButton("cos");
		tan = new JButton("tan");
		asin = new JButton("asin");
		acos = new JButton("acos");
		atan = new JButton("atan");
		sinh = new JButton("sinh");
		cosh = new JButton("cosh");
		tanh = new JButton("tanh");
		changeSign = new JButton("\u00B1");

		sin.setFont(new Font("Serif", Font.ITALIC, 14));
		cos.setFont(new Font("Serif", Font.ITALIC, 14));
		tan.setFont(new Font("Serif", Font.ITALIC, 14));
		asin.setFont(new Font("Serif", Font.ITALIC, 14));
		acos.setFont(new Font("Serif", Font.ITALIC, 14));
		atan.setFont(new Font("Serif", Font.ITALIC, 14));
		sinh.setFont(new Font("Serif", Font.ITALIC, 14));
		cosh.setFont(new Font("Serif", Font.ITALIC, 14));
		tanh.setFont(new Font("Serif", Font.ITALIC, 14));

		one.setPreferredSize(new Dimension(75, 25));
		two.setPreferredSize(new Dimension(75, 25));
		three.setPreferredSize(new Dimension(75, 25));
		four.setPreferredSize(new Dimension(75, 25));
		five.setPreferredSize(new Dimension(75, 25));
		six.setPreferredSize(new Dimension(75, 25));
		seven.setPreferredSize(new Dimension(75, 25));
		eight.setPreferredSize(new Dimension(75, 25));
		nine.setPreferredSize(new Dimension(75, 25));
		zero.setPreferredSize(new Dimension(75, 25));
		modulus.setPreferredSize(new Dimension(75, 25));
		dot.setPreferredSize(new Dimension(75, 25));
		clear.setPreferredSize(new Dimension(235, 25));
		factorial.setPreferredSize(new Dimension(75, 25));
		power.setPreferredSize(new Dimension(75, 25));
		squareRoot.setPreferredSize(new Dimension(75, 25));
		sin.setPreferredSize(new Dimension(75, 25));
		cos.setPreferredSize(new Dimension(75, 25));
		tan.setPreferredSize(new Dimension(75, 25));
		asin.setPreferredSize(new Dimension(75, 25));
		acos.setPreferredSize(new Dimension(75, 25));
		atan.setPreferredSize(new Dimension(75, 25));
		sinh.setPreferredSize(new Dimension(75, 25));
		cosh.setPreferredSize(new Dimension(75, 25));
		tanh.setPreferredSize(new Dimension(75, 25));
		changeSign.setPreferredSize(new Dimension(235, 25));

		panel.add(text);
		panel.add(clear);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(dot);
		panel.add(zero);
		panel.add(modulus);
		panel.add(factorial);
		panel.add(power);
		panel.add(squareRoot);
		panel.add(sin);
		panel.add(cos);
		panel.add(tan);
		panel.add(asin);
		panel.add(acos);
		panel.add(atan);
		panel.add(sinh);
		panel.add(cosh);
		panel.add(tanh);
		panel.add(changeSign);

		add(panel);
		// width, height
		setSize(250, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "1";
				text.setText(result);
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "2";
				text.setText(result);
			}
		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "3";
				text.setText(result);
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "4";
				text.setText(result);
			}
		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "5";
				text.setText(result);
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "6";
				text.setText(result);
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "7";
				text.setText(result);
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "8";
				text.setText(result);
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (result.equals("0"))
					result = "";
				text.setText("");
				result += "4";
				text.setText(result);
			}
		});

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (!result.equals("0")) {
					text.setText("");
					result += "0";
					text.setText(result);
				}
			}
		});

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				text.setText("");
				result = "";
			}
		});

		dot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (!hasDot) {
					hasDot = true;
					result += ".";
					text.setText(result);
				}
			}
		});

		factorial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				int fact = 1, limit, i;
				limit = Integer.parseInt(result);
				for (i = 2; i <= limit; i++)
					fact *= i;

				result = Integer.toString(fact);
				text.setText(result);
			}
		});

		power.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.pow(num, 2);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		squareRoot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.sqrt(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		modulus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				if (num < 0)
					num *= -1;
				result = Double.toString(num);
				text.setText(result);
			}
		});

		sin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.sin(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		cos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.cos(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		tan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.tan(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});
		
		asin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.asin(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		acos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.acos(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		atan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.atan(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});
		
		sinh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.sinh(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		cosh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.cosh(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		tanh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num = Math.tanh(num);
				result = Double.toString(num);
				text.setText(result);
			}
		});

		changeSign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				double num;
				num = Double.parseDouble(result);
				num *= -1;
				result = Double.toString(num);
				text.setText(result);
			}
		});
	}
}
