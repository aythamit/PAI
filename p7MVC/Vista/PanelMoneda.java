package Vista;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelMoneda extends JPanel {

	String euro;
	String moneda;
	JTextField top;
	JTextField botIzq;
	JTextField botDer;
	/**
	 * Create the panel.
	 */
	public PanelMoneda(String Moneda, String topt, String botI, String botD) {
		euro = "Euro";
		setMoneda(Moneda);
		top = new JTextField(15);
		botIzq = new JTextField(10);
		botDer = new JTextField(10);
		setTop(topt);
		setBotIzq(botI);
		setBotDer(botD);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), getMoneda()));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		System.out.println(this.getClass());
		add(new JLabel("1Euro is"));
		add(top);
		add(new JLabel(getMoneda()));
		add(new JLabel(getNombre()));
		add(new JLabel("                               " + getMoneda()));
		add(botIzq);
		add(botDer);
	}
	public String getNombre() {
		return euro;
	}
	public void setNombre(String nombre) {
		this.euro = nombre;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda =moneda;
	}
	public String getTop() {
		return top.getText();
	}
	public void setTop(String top) {
		this.top.setText(top);
	}
	public String getBotIzq() {
		return botIzq.getText();
	}
	public void setBotIzq(String botIzq) {
		this.botIzq.setText(botIzq);
	}
	public String getBotDer() {
		return botDer.getText();
	}
	public void setBotDer(String  botDer) {
		this.botDer.setText(botDer);
	}

}
/**

CuentaBancaria[ {0 - CuentaAhorro}, {1 - CuentaPersonal}, {2 - CuentaEmpresa}
*/