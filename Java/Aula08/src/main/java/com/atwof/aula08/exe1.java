package com.atwof.aula08;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fritzen.alisson
 */
public class exe1 extends JFrame
{
    private static JTextField txtName = new JTextField(null);
    private static JTextField txtAddress = new JTextField(null);
    private static JTextField txtAge = new JTextField(null);
    
    public static void caixaDeLeitura()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        frame.setSize(300,300);
        frame.setLocation(500,200);
        
        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel lblName = new JLabel();
        lblName.setText("Digite seu nome");
        lblName.setFont(new Font("Verdana", Font.BOLD, 14));
        panel.add(lblName);
        txtName.setFont(new Font("Verdana", Font.BOLD, 12));
        txtName.setColumns(22);
        panel.add(txtName);
        
        JLabel lblAddress = new JLabel();
        lblAddress.setText("Digite seu endereço");
        lblAddress.setFont(new Font("Verdana", Font.BOLD, 14));
        panel.add(lblAddress);
        txtAddress.setFont(new Font("Verdana", Font.BOLD, 12));
        txtAddress.setColumns(22);
        panel.add(txtAddress);
        
        JLabel lblAge = new JLabel();
        lblAge.setText("Digite sua idade");
        lblAge.setFont(new Font("Verdana", Font.BOLD, 14));
        panel.add(lblAge);
        txtAge.setFont(new Font("Verdana", Font.BOLD, 12));
        txtAge.setColumns(22);
        panel.add(txtAge);
        
        JButton btnMostrar = new JButton();
        btnMostrar.setText("Mostrar");
        panel.add(btnMostrar);
        
        JButton btnCancelar= new JButton();
        btnCancelar.setText("Limpar");
        panel.add(btnCancelar);
        
        btnCancelar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                limparTela();
            }
        });
        
        btnMostrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtAge.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Informe todos os campos para prosseguir", "PROBLEMA", JOptionPane.ERROR_MESSAGE);
                }
                else if(Integer.parseInt(txtAge.getText()) > 120)
                {
                    JOptionPane.showMessageDialog(null, "A idade deve ser menor que 120 anos", "IDADE", JOptionPane.ERROR_MESSAGE);
                    txtAge.requestFocus();
                }
                else
                {
                    mostrarNome();
                }
            }
        });
        
        frame.setVisible(true);
    }
    
    private static void limparTela()
    {
        txtName.setText(null);
        txtAddress.setText(null);
        txtAge.setText(null);
    }
    
    private static void mostrarNome()
    {   
        
        String frase;
        
        frase = "<html><br>Nome: " + txtName.getText() + "<br>" 
              + "Endereço: " + txtAddress.getText() + "<br>" 
              + "Idade: " + txtAge.getText();
        
        JOptionPane.showMessageDialog(null, frase, "INFORMAÇÕES", JOptionPane.INFORMATION_MESSAGE);
    }
}
