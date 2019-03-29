package es.studium.primerEjercicioRepositorio;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;

public class VistaPalabras extends Frame {
	private static final long serialVersionUID = 1L; 
 
	/* Declaración de elementos gráficos */
	Label etiqueta = new Label("Nº Palabras");
	TextArea campoTexto = new TextArea("", 300, 250);
 
	Button contar = new Button(" Contar palabras ");
 
	/* Constructor */
	public VistaPalabras() { 
		setLayout(new GridLayout(3,2));
		setTitle("Contador de palabras");
		
		add(campoTexto);
		add(etiqueta);
		add(contar);
 
		setSize(450,150); 
		setResizable(false);
		setVisible(true);
	}

}
