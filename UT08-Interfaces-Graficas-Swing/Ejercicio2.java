//Autor: JAPR
//Fecha: 10/Mar/2026
//Mayúsculas, minúsculas y borrado

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Ejercicio2 extends JFrame {
    private JTextField cajaTexto;
    private JButton btnMayus, btnMinus, btnBorrar;

    public Ejercicio2() {
        // 1. Configuración de la ventana
        setLayout(null);
        setTitle("Conversor de Texto - JAPR");
        setBounds(100, 100, 450, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE); // Fondo limpio

        // 2. Componentes Visuales
        JLabel etiqueta = new JLabel("Introduce un texto:");
        etiqueta.setBounds(30, 20, 150, 30);
        add(etiqueta);

        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 370, 35);
        add(cajaTexto);

        // Botón Mayúsculas (Color Emerald)
        btnMayus = new JButton("MAYÚSCULAS");
        btnMayus.setBounds(30, 100, 120, 35);
        btnMayus.setBackground(Color.decode("#50C878")); 
        btnMayus.setForeground(Color.WHITE);
        add(btnMayus);

        // Botón Minúsculas (Color Emerald)
        btnMinus = new JButton("minúsculas");
        btnMinus.setBounds(155, 100, 120, 35);
        btnMinus.setBackground(Color.decode("#50C878"));
        btnMinus.setForeground(Color.WHITE);
        add(btnMinus);

        // Botón Borrar (Color Pomerade/Coral)
        btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(280, 100, 120, 35);
        btnBorrar.setBackground(Color.decode("#F08080"));
        btnBorrar.setForeground(Color.WHITE);
        add(btnBorrar);

        // 3. Eventos (Lógica)
        btnMayus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = cajaTexto.getText();
                if (texto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Escribe algo primero", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    cajaTexto.setText(texto.toUpperCase());
                }
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = cajaTexto.getText();
                if (texto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Escribe algo primero", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    cajaTexto.setText(texto.toLowerCase());
                }
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cajaTexto.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Ejercicio2 ventana = new Ejercicio2();
        ventana.setVisible(true);
    }
}