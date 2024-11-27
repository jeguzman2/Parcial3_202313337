package Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.ventanaContralodora;
public class Ventana extends JFrame {
    private JTextField textoR;
    private JTextField textoG;
    private JTextField textoB;
    private JPanel panel;
    private ventanaContralodora controlador;

    public Ventana() {
        setTitle("PARCIAL DE JUAN GUZMÁN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        controlador = new ventanaContralodora();
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new GridLayout(4, 2, 10, 10));
        panelIzquierdo.setPreferredSize(new Dimension(200, 0));
        JLabel labelR = new JLabel("R");
        JLabel labelG = new JLabel("G");
        JLabel labelB = new JLabel("B");
        textoR = new JTextField("0");
        textoG = new JTextField("0");
        textoB = new JTextField("0");
        panelIzquierdo.add(labelR);
        panelIzquierdo.add(textoR);
        panelIzquierdo.add(labelG);
        panelIzquierdo.add(textoG);
        panelIzquierdo.add(labelB);
        panelIzquierdo.add(textoB);
        JButton botonCuadrado = new JButton("Cuadrado");
        JButton botonCirculo = new JButton("Circulo");

        botonCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarFigura("Cuadrado");
            }
        });

        botonCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarFigura("Circulo");
            }
        });
        panelIzquierdo.add(botonCuadrado);
        panelIzquierdo.add(botonCirculo);

        add(panelIzquierdo, BorderLayout.WEST);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dibujarFigura(g);
            }
        };
        panel.setBackground(Color.WHITE);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void cambiarFigura(String tipo) {
        try {
            int r = Integer.parseInt(textoR.getText());
            int g = Integer.parseInt(textoG.getText());
            int b = Integer.parseInt(textoB.getText());
            controlador.cambiarATipo(tipo);
            controlador.cambiadorDeColor(r, g, b);
            panel.repaint();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para R, G y B.");
        }

    }

    

    }


