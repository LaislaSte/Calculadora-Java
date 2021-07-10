
package com.mycompany.calcinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame{
    JLabel Rotulo1, Rotulo2, exibir;
    JTextField texto1, texto2;
    JButton Somar, Subtrair, Dividir, Multiplicar;
    
    public Calculadora(){
        super("Exemplo Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        Rotulo1 = new JLabel ("1 Numero");
        Rotulo2 = new JLabel ("2 Numero");
        exibir = new JLabel ("");
        texto1 = new JTextField("");
        texto2 = new JTextField("");
        Somar = new JButton("Somar");
        Subtrair = new JButton("Subtrair");
        Dividir = new JButton("Dividir");
        Multiplicar = new JButton("Multiplicar");
        
        Rotulo1.setBounds(50,20,100,20); Rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
        exibir.setBounds(50,220,200,20);
        Somar.setBounds(150,100,95,20);
        Subtrair.setBounds(150,130,95,20);
        Dividir.setBounds(150,160,95,20);
        Multiplicar.setBounds(150,190,95,20);
        
        Somar.addActionListener((ActionEvent e) -> {
            int num1, num2, soma;
            soma = 0;
            num1 = Integer.parseInt(texto1.getText());
            num2 = Integer.parseInt(texto2.getText());
            soma = num1 + num2;
            exibir.setVisible(true);
            exibir.setText("A soma dos numeros é "+soma);
        });
        Subtrair.addActionListener((ActionEvent e) -> {
            int num1, num2, sub;
            sub = 0;
            num1 = Integer.parseInt(texto1.getText());
            num2 = Integer.parseInt(texto2.getText());
            sub = num1 - num2;
            exibir.setVisible(true);
            exibir.setText("A subtração dos numeros é "+sub);
        });
        Dividir.addActionListener((ActionEvent e) -> {
            int num1, num2, div;
            div = 0;
            num1 = Integer.parseInt(texto1.getText());
            num2 = Integer.parseInt(texto2.getText());
            div = num1 / num2;
            exibir.setVisible(true);
            exibir.setText("A divisão dos numeros é "+div);
        });
        Multiplicar.addActionListener((ActionEvent e) -> {
            int num1, num2, mult;
            mult = 0;
            num1 = Integer.parseInt(texto1.getText());
            num2 = Integer.parseInt(texto2.getText());
            mult = num1 * num2;
            exibir.setVisible(true);
            exibir.setText("A multiplicação dos numeros é "+mult);
        });
        
        exibir.setVisible(false);
        tela.add(Rotulo1); tela.add(Rotulo2);
        tela.add(texto1); tela.add(texto2);
        tela.add(exibir);
        tela.add(Somar); tela.add(Subtrair); tela.add(Dividir); tela.add(Multiplicar);
        
        setSize(500, 350);
        setVisible(true);
    }
    
    public static void main(String args[]){
        Calculadora teste = new Calculadora();
        teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
