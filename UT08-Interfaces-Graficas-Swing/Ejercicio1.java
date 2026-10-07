//Autor: JAPR
//Fecha: 10/Mar/2026
//Copiar y Borrar

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio1 extends JFrame {
    // Definimos los componentes
    private JTextField cajaTexto;
    private JButton botonCopiar, botonBorrar;
    private JLabel etiquetaResultado;

    public Ejercicio1() {
        // Configuración de la ventana
        setLayout(null); // Usamos diseño libre para posicionar con coordenadas
        setTitle("Botones Texto");
        setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 1. Etiqueta de instrucción
        JLabel instruccion = new JLabel("Introduce un texto y pulsa Copiar:");
        instruccion.setBounds(30, 20, 250, 30);
        add(instruccion);

        // 2. Caja de texto
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 60, 200, 30);
        add(cajaTexto);

        // 3. Botón Copiar
        botonCopiar = new JButton("Copiar");
        botonCopiar.setBounds(30, 110, 100, 30);
        add(botonCopiar);

        // 4. Botón Borrar
        botonBorrar = new JButton("Borrar");
        botonBorrar.setBounds(140, 110, 100, 30);
        add(botonBorrar);

        // 5. Etiqueta donde se copiará el texto
        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(30, 160, 300, 30);
        add(etiquetaResultado);

        // --- EVENTOS (Lo que hacen los botones) ---

        // Evento Copiar
        botonCopiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = cajaTexto.getText();
                etiquetaResultado.setText(texto);
            }
        });

        // Evento Borrar
        botonBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cajaTexto.setText("");
                etiquetaResultado.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Ejercicio1 ventana = new Ejercicio1();
        ventana.setVisible(true);
    }
}