package Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.ventanaContralodora;
public class Ventana extends JFrame {
    private JTextField txtR;
    private JTextField txtG;
    private JTextField txtB;
    private JPanel panelDibujo;
    private ventanaContralodora controlador;

    public Ventana() {
        setTitle("PARCIAL DE JUAN GUZMÁN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());
    }
}

