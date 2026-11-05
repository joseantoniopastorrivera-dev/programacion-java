//Autor: JAPR
//Fecha: 10/Mar/2026
//Calculadora.java

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;    

public class Calculadora extends JFrame {
    // Componentes
    private JTextField txtOp1, txtOp2, txtResultado;
    private JButton btnSuma, btnResta, btnMult, btnDiv, btnEuroDol, btnDolEuro;

    public Calculadora() {
        // 1. Configuración de la ventana
        setLayout(null);
        setTitle("Calculadora Swing - JAPR");
        setBounds(100, 100, 400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 2. Etiquetas y Cajas de texto
        JLabel lbl1 = new JLabel("Operando 1:");
        lbl1.setBounds(50, 50, 100, 30);
        add(lbl1);

        txtOp1 = new JTextField();
        txtOp1.setBounds(150, 50, 150, 30);
        add(txtOp1);

        JLabel lbl2 = new JLabel("Operando 2:");
        lbl2.setBounds(50, 100, 100, 30);
        add(lbl2);

        txtOp2 = new JTextField();
        txtOp2.setBounds(150, 100, 150, 30);
        add(txtOp2);

        // 3. Botones de Operación (Estilo Emerald)
        btnSuma = crearBoton("+", 50, 150, "#50C878");
        btnResta = crearBoton("-", 120, 150, "#50C878");
        btnMult = crearBoton("*", 190, 150, "#50C878");
        btnDiv = crearBoton("/", 260, 150, "#50C878");

        // 4. Resultado
        JLabel lblRes = new JLabel("RESULTADO:");
        lblRes.setBounds(50, 210, 100, 30);
        add(lblRes);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 210, 150, 30);
        txtResultado.setEditable(false); // Solo lectura
        add(txtResultado);

        // 5. Botones de Conversión (Estilo Pomerade)
        btnEuroDol = crearBoton("€ a $", 80, 270, "#F08080");
        btnEuroDol.setSize(100, 35);
        btnDolEuro = crearBoton("$ a €", 200, 270, "#F08080");
        btnDolEuro.setSize(100, 35);

        // --- LÓGICA DE EVENTOS ---
        btnSuma.addActionListener(e -> operar('+'));
        btnResta.addActionListener(e -> operar('-'));
        btnMult.addActionListener(e -> operar('*'));
        btnDiv.addActionListener(e -> operar('/'));
        
        btnEuroDol.addActionListener(e -> convertir(1.08)); // Tasa euro-dólar
        btnDolEuro.addActionListener(e -> convertir(0.93)); // Tasa dólar-euro
    }

    // Método para realizar los cálculos con control de errores
    private void operar(char op) {
        try {
            double n1 = Double.parseDouble(txtOp1.getText());
            double n2 = Double.parseDouble(txtOp2.getText());
            double res = 0;

            switch (op) {
                case '+': res = n1 + n2; break;
                case '-': res = n1 - n2; break;
                case '*': res = n1 * n2; break;
                case '/': 
                    if (n2 == 0) throw new ArithmeticException();
                    res = n1 / n2; 
                    break;
            }
            txtResultado.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Introduce números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertir(double tasa) {
        try {
            double valor = Double.parseDouble(txtResultado.getText());
            txtResultado.setText(String.format("%.2f", valor * tasa));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Realiza un cálculo primero", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Método auxiliar para crear botones rápido
    private JButton crearBoton(String texto, int x, int y, String colorHex) {
        JButton b = new JButton(texto);
        b.setBounds(x, y, 60, 35);
        b.setBackground(Color.decode(colorHex));
        b.setForeground(Color.WHITE);
        add(b);
        return b;
    }

    public static void main(String[] args) {
        new Calculadora().setVisible(true);
    }
}