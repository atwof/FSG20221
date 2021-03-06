/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atwof.appcalculadora;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.event.MenuKeyListener;

/**
 *
 * @author fritzen.alisson
 */
public class appCalculadora extends javax.swing.JFrame
{
    private boolean isLigado = false;
    private String valor = "";
    private String current = "";
    private char operador;
    
    /**
     * Creates new form appCalculadora
     */
    public appCalculadora()
    {
        initComponents();
        txtResultado.setFont(new java.awt.Font(".SF NS Text", 1, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        btnAc = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnIgualdade = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnAc1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocation(new java.awt.Point(250, 250));
        setType(java.awt.Window.Type.UTILITY);

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(0, 204, 102));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtResultado.setFocusable(false);
        txtResultado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtResultadoActionPerformed(evt);
            }
        });

        btnAc.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAc.setText("AC");
        btnAc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAcActionPerformed(evt);
            }
        });

        btnPorcentagem.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnPorcentagem.setText("%");
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPorcentagemActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(0, 204, 102));
        btnDivisao.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(0, 0, 0));
        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setBackground(new java.awt.Color(0, 204, 102));
        btnMultiplicacao.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnMultiplicacao.setForeground(new java.awt.Color(0, 0, 0));
        btnMultiplicacao.setText("X");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnSubtracao.setBackground(new java.awt.Color(0, 204, 102));
        btnSubtracao.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        btnSubtracao.setForeground(new java.awt.Color(0, 0, 0));
        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnIgualdade.setBackground(new java.awt.Color(0, 204, 102));
        btnIgualdade.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        btnIgualdade.setForeground(new java.awt.Color(0, 0, 0));
        btnIgualdade.setText("=");
        btnIgualdade.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIgualdadeActionPerformed(evt);
            }
        });

        btnAdicao.setBackground(new java.awt.Color(0, 204, 102));
        btnAdicao.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        btnAdicao.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicao.setText("+");
        btnAdicao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnSete.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnSete.setText("7");
        btnSete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSeteActionPerformed(evt);
            }
        });

        btnOito.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnOito.setText("8");
        btnOito.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnNove.setText("9");
        btnNove.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNoveActionPerformed(evt);
            }
        });

        btnQuatro.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnQuatro.setText("4");
        btnQuatro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnQuatroActionPerformed(evt);
            }
        });

        btnCinco.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSeisActionPerformed(evt);
            }
        });

        btnUm.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnUm.setText("1");
        btnUm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnDois.setText("2");
        btnDois.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTresActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font(".SF NS Text", 1, 16)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnZeroActionPerformed(evt);
            }
        });

        btnPonto.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPontoActionPerformed(evt);
            }
        });

        btnAc1.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAc1.setText("C");
        btnAc1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnSete, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOito, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAc1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDivisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnIgualdade, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtResultadoActionPerformed
    {//GEN-HEADEREND:event_txtResultadoActionPerformed
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPontoActionPerformed
    {//GEN-HEADEREND:event_btnPontoActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, ".");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnAcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAcActionPerformed
    {//GEN-HEADEREND:event_btnAcActionPerformed
        isLigado = !isLigado ? true : false;

        if(!isLigado)
        {
            txtResultado.setText("");
        }
        else
        {
            txtResultado.setText("0");
        }
       
        current = "";
        valor = "";
    }//GEN-LAST:event_btnAcActionPerformed

    private void btnIgualdadeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIgualdadeActionPerformed
    {//GEN-HEADEREND:event_btnIgualdadeActionPerformed
        switch (operador)
        {
            case '+':
                txtResultado.setText(Operacoes.somar(valor, current));
                break;
            case '-':
                txtResultado.setText(Operacoes.subtrair(valor, current));
                break;
            case '/':
                txtResultado.setText(Operacoes.dividir(valor, current));
                break;
            case 'x':
                txtResultado.setText(Operacoes.multiplicar(valor, current));
                break;
            case ' ':
                current = "";
                valor = "";
                break;
        }
    }//GEN-LAST:event_btnIgualdadeActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSeteActionPerformed
    {//GEN-HEADEREND:event_btnSeteActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "7");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDivisaoActionPerformed
    {//GEN-HEADEREND:event_btnDivisaoActionPerformed
        if (isLigado)
        {
            operador = '/';
            valor = current;
            current = "";
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnZeroActionPerformed
    {//GEN-HEADEREND:event_btnZeroActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "0");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUmActionPerformed
    {//GEN-HEADEREND:event_btnUmActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "1");
            txtResultado.setText(current);
        }       
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOitoActionPerformed
    {//GEN-HEADEREND:event_btnOitoActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "8");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNoveActionPerformed
    {//GEN-HEADEREND:event_btnNoveActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "9");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnQuatroActionPerformed
    {//GEN-HEADEREND:event_btnQuatroActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "4");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCincoActionPerformed
    {//GEN-HEADEREND:event_btnCincoActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "5");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSeisActionPerformed
    {//GEN-HEADEREND:event_btnSeisActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "6");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDoisActionPerformed
    {//GEN-HEADEREND:event_btnDoisActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "2");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTresActionPerformed
    {//GEN-HEADEREND:event_btnTresActionPerformed
        if (isLigado)
        {
            current = Operacoes.adicionarValor(current, "3");
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplicacaoActionPerformed
    {//GEN-HEADEREND:event_btnMultiplicacaoActionPerformed
        if (isLigado)
        {
            operador = 'x';
            valor = current;
            current = "";
        }
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubtracaoActionPerformed
    {//GEN-HEADEREND:event_btnSubtracaoActionPerformed
        if (isLigado)
        {
            operador = '-';
            valor = current;
            current = "";
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAdicaoActionPerformed
    {//GEN-HEADEREND:event_btnAdicaoActionPerformed
        if (isLigado)
        {
            operador = '+';
            valor = current;
            current = "";
        }
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnAc1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAc1ActionPerformed
    {//GEN-HEADEREND:event_btnAc1ActionPerformed
        if (isLigado)
        {
            operador = ' ';
            current = "";
            valor = "";
            txtResultado.setText("0");
        }
    }//GEN-LAST:event_btnAc1ActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPorcentagemActionPerformed
    {//GEN-HEADEREND:event_btnPorcentagemActionPerformed
        if(isLigado)
        {
            current = Operacoes.porcentagem(current);
            txtResultado.setText(current);
        }
    }//GEN-LAST:event_btnPorcentagemActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(appCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(appCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(appCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(appCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new appCalculadora().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAc;
    private javax.swing.JButton btnAc1;
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgualdade;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}

