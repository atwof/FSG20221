package com.atwof.aula09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author fritzen.alisson
 */
public class FechaJanelaListener implements ActionListener
{

    public FechaJanelaListener(JFrame janela)
    {
        janela.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
