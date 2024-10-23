//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Fat2Fit extends JPanel implements ActionListener{
  private JButton botonEnviarDatos;
  private JLabel etiquetaPeso;
  private JLabel etiquetaAltura;
  private JLabel etiquetaEdad;
  private JLabel etiquetaGenero ;
  private JTextField campoTextoPeso;
  private JTextField campoTextoAltura;
  private JTextField campoTextoEdad;
  private JTextField campoTextoGenero;
  private JLabel etiquetaTitulo;
  private JLabel etiquetaRutinas;
  private JLabel etiquetaRecetas;
  private JLabel nombreApp;

  public Fat2Fit() {
    //construct components
    botonEnviarDatos = new JButton ("ENVIAR");
    etiquetaPeso = new JLabel ("Peso: ");
    etiquetaAltura = new JLabel ("Altura: ");
    etiquetaEdad = new JLabel ("Edad: ");
    etiquetaGenero  = new JLabel ("Genero: ");
    campoTextoPeso = new JTextField (5);
    campoTextoAltura = new JTextField (5);
    campoTextoEdad = new JTextField (5);
    campoTextoGenero = new JTextField (5);
    etiquetaTitulo = new JLabel ("Tus datos");
    etiquetaRutinas = new JLabel ("...");
    etiquetaRecetas = new JLabel ("...");
    nombreApp = new JLabel ("Fat2Fit");

    //adjust size and set layout
    setPreferredSize (new Dimension (1176, 609));
    setLayout (null);

    //add components
    add (botonEnviarDatos);
    botonEnviarDatos.addActionListener(this);
    add (etiquetaPeso);
    add (etiquetaAltura);
    add (etiquetaEdad);
    add (etiquetaGenero );
    add (campoTextoPeso);
    add (campoTextoAltura);
    add (campoTextoEdad);
    add (campoTextoGenero);
    add (etiquetaTitulo);
    add (etiquetaRutinas);
    add (etiquetaRecetas);
    add (nombreApp);

    //set component bounds (only needed by Absolute Positioning)
    botonEnviarDatos.setBounds (70, 325, 100, 20);
    etiquetaPeso.setBounds (45, 130, 100, 25);
    etiquetaAltura.setBounds (45, 175, 100, 25);
    etiquetaEdad.setBounds (45, 220, 100, 25);
    etiquetaGenero .setBounds (45, 265, 100, 25);
    campoTextoPeso.setBounds (115, 135, 100, 25);
    campoTextoAltura.setBounds (115, 180, 100, 25);
    campoTextoEdad.setBounds (115, 220, 100, 25);
    campoTextoGenero.setBounds (115, 265, 100, 25);
    etiquetaTitulo.setBounds (85, 90, 70, 25);
    etiquetaRutinas.setBounds (405, 110, 100, 25);
    etiquetaRecetas.setBounds (405, 335, 100, 25);
    nombreApp.setBounds (10, 10, 100, 25);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == botonEnviarDatos){ 

      String pesoStr = campoTextoPeso.getText();
      double pesoDbl = Double.parseDouble(pesoStr);
      
      String alturaStr = campoTextoAltura.getText();
      double alturaDbl = Double.parseDouble(alturaStr);
      
      String edadStr = campoTextoEdad.getText();
      int edadInt = Integer.parseInt(edadStr);

      String generoStr = campoTextoGenero.getText();
      
    }
  }

  public static void main (String[] args) {
    JFrame frame = new JFrame ("Fat2Fit");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add (new Fat2Fit());
    frame.pack();
    frame.setVisible (true);
  }
}