package interfaces;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Font;
import java.awt.Cursor;

public class PanelBilleteFinal {

	JPanel panelBilleteFinal = new JPanel();
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldDNI;
	private JTextField textFieldParadaFin;
	private JTextField textFieldParadaInicio;
	private JTextField textFieldLinea;
	private JTextField textFieldTipoTrayecto;
	private JTextField textFieldFechaIda;
	private JTextField textFieldFechaVuelta;
	private JTextField textFieldPrecioBillete;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void HacerRegistro2() {
		panelBilleteFinal.setLayout(null);
		panelBilleteFinal.setBounds(0,0,800,600);
		
		JButton button = new JButton("Log out");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBounds(686, 11, 104, 35);
		panelBilleteFinal.add(button);
		
		JLabel label = new JLabel("USUARIO");
		label.setBounds(576, 11, 112, 35);
		panelBilleteFinal.add(label);
		
		JList listPersonas = new JList();
		listPersonas.setBounds(53, 100, 145, 35);
		panelBilleteFinal.add(listPersonas);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigo.setBounds(53, 158, 132, 35);
		panelBilleteFinal.add(lblCdigo);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(49, 193, 201, 35);
		panelBilleteFinal.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(53, 249, 112, 23);
		panelBilleteFinal.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(48, 278, 201, 35);
		panelBilleteFinal.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(53, 327, 104, 29);
		panelBilleteFinal.add(lblApellidos);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setBounds(49, 360, 201, 35);
		panelBilleteFinal.add(textFieldApellidos);
		textFieldApellidos.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(53, 411, 112, 23);
		panelBilleteFinal.add(lblDni);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(49, 445, 201, 35);
		panelBilleteFinal.add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		JLabel lblLnea = new JLabel("L\u00EDnea");
		lblLnea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLnea.setBounds(297, 161, 138, 29);
		panelBilleteFinal.add(lblLnea);
		
		textFieldLinea = new JTextField();
		textFieldLinea.setBounds(299, 193, 201, 35);
		panelBilleteFinal.add(textFieldLinea);
		textFieldLinea.setColumns(10);
		
		JLabel lblSalida = new JLabel("Salida:");
		lblSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalida.setBounds(297, 249, 118, 23);
		panelBilleteFinal.add(lblSalida);
		
		textFieldParadaInicio = new JTextField();
		textFieldParadaInicio.setBounds(297, 278, 201, 35);
		panelBilleteFinal.add(textFieldParadaInicio);
		textFieldParadaInicio.setColumns(10);
		
		JLabel lblLlegada = new JLabel("Llegada:");
		lblLlegada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLlegada.setBounds(297, 330, 167, 23);
		panelBilleteFinal.add(lblLlegada);
		
		textFieldParadaFin = new JTextField();
		textFieldParadaFin.setBounds(299, 360, 201, 35);
		panelBilleteFinal.add(textFieldParadaFin);
		textFieldParadaFin.setColumns(10);
		
		JLabel lblTipoDeTrayecto = new JLabel("Tipo de Trayecto:");
		lblTipoDeTrayecto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeTrayecto.setBounds(297, 411, 118, 23);
		panelBilleteFinal.add(lblTipoDeTrayecto);
		
		textFieldTipoTrayecto = new JTextField();
		textFieldTipoTrayecto.setBounds(299, 445, 201, 35);
		panelBilleteFinal.add(textFieldTipoTrayecto);
		textFieldTipoTrayecto.setColumns(10);
		
		textFieldFechaIda = new JTextField();
		textFieldFechaIda.setBounds(549, 193, 201, 35);
		panelBilleteFinal.add(textFieldFechaIda);
		textFieldFechaIda.setColumns(10);
		
		JLabel lblFechaIda = new JLabel("Fecha Ida:");
		lblFechaIda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaIda.setBounds(549, 164, 104, 23);
		panelBilleteFinal.add(lblFechaIda);
		
		JLabel lblFechaVuelta = new JLabel("Fecha Vuelta:");
		lblFechaVuelta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaVuelta.setBounds(549, 249, 84, 23);
		panelBilleteFinal.add(lblFechaVuelta);
		
		textFieldFechaVuelta = new JTextField();
		textFieldFechaVuelta.setBounds(546, 278, 205, 29);
		panelBilleteFinal.add(textFieldFechaVuelta);
		textFieldFechaVuelta.setColumns(10);
		
		JLabel lblPrecioBillete = new JLabel("Precio Billete:");
		lblPrecioBillete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecioBillete.setBounds(549, 330, 112, 23);
		panelBilleteFinal.add(lblPrecioBillete);
		
		textFieldPrecioBillete = new JTextField();
		textFieldPrecioBillete.setColumns(10);
		textFieldPrecioBillete.setBounds(549, 360, 201, 120);
		panelBilleteFinal.add(textFieldPrecioBillete);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setBounds(118, 511, 229, 59);
		panelBilleteFinal.add(btnCancelar);
		
		JButton btnImprimir = new JButton("Imprimir Billete");
		btnImprimir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImprimir.setBounds(465, 511, 217, 64);
		panelBilleteFinal.add(btnImprimir);
		
		JLabel lblPasajerosas = new JLabel("Pasajeros/as:");
		lblPasajerosas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPasajerosas.setBounds(53, 64, 91, 25);
		panelBilleteFinal.add(lblPasajerosas);
		

	}
}