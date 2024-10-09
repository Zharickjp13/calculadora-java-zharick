/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Color;

/**
 *
 * @author USER
 */
public class CalculadoraSena extends javax.swing.JFrame {

    /**
     * Creates new form Operacion
     */
    public CalculadoraSena() {
        initComponents();
    }

   //Variables
    int num1;
    int num2;
    double resultado;
    int operacion;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCalc = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnPromedio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Zharick <3");
        setBackground(new java.awt.Color(204, 255, 255));

        txtCalc.setBackground(new java.awt.Color(218, 243, 245));
        txtCalc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCalc.setEnabled(false);

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn7MouseReleased(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn8MouseReleased(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn9MouseReleased(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(204, 102, 255));
        btnDividir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn4MouseReleased(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn5MouseReleased(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn6MouseReleased(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn1MouseReleased(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn2MouseReleased(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn3MouseReleased(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnMult.setBackground(new java.awt.Color(204, 102, 255));
        btnMult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMult.setText("X");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn0.setText("0");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn0MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn0MouseReleased(evt);
            }
        });
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(204, 255, 255));
        btnIgual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnComa.setBackground(new java.awt.Color(204, 255, 255));
        btnComa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnComa.setText(",");
        btnComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComaActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(204, 102, 255));
        btnResta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(204, 102, 255));
        btnSuma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(204, 255, 255));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setText("C");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRaiz.setBackground(new java.awt.Color(204, 102, 255));
        btnRaiz.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRaiz.setText("√");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnPorcentaje.setBackground(new java.awt.Color(204, 102, 255));
        btnPorcentaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });

        btnLog.setBackground(new java.awt.Color(204, 102, 255));
        btnLog.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLog.setText("Log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnPromedio.setBackground(new java.awt.Color(204, 102, 255));
        btnPromedio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPromedio.setText("Pro");
        btnPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCalc))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn3.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        num1 = Integer.parseInt(txtCalc.getText());
       txtCalc.setText("");
       operacion = 8;
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtCalc.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn1.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn2.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn4.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn5.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn6.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn7.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn8.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn9.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComaActionPerformed
        String IngreseNum = txtCalc.getText()+ btnComa.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btnComaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String IngreseNum = txtCalc.getText()+ btn0.getText();
        txtCalc.setText(IngreseNum);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
       num1 = Integer.parseInt(txtCalc.getText()); //El "getText" devuelve la cadena que el usuario ingresó, el metodo integer convierte la cadena en un valor entero y lo alamcena en la variable num1
       txtCalc.setText(""); //borra el texto, después de haberlo analizado en num1
       operacion = 1;  //Establece la operación actual a suma
        
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
       num1 = Integer.parseInt(txtCalc.getText());
       txtCalc.setText("");
       operacion = 2;
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
       num1 = Integer.parseInt(txtCalc.getText());
       txtCalc.setText("");
       operacion = 3;
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
       num1 = Integer.parseInt(txtCalc.getText());
       txtCalc.setText("");
       operacion = 4;
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try{
                num2 = Integer.parseInt(txtCalc.getText());
                txtCalc.setText("");
        }
        catch(Exception e){
        num2 = 0;
        }

        switch (operacion) {
            case 1: // para la accion de suma
                int suma = num1 + num2;
                txtCalc.setText(Integer.toString(suma));
            default:
                break;
                
            case 2: // para la accion de resta
                int resta = num1 - num2;
                txtCalc.setText(Integer.toString(resta));
                break;
                
            case 3: // para la accion de multiplicar
                int multiplicacion = num1 * num2;
                txtCalc.setText(Integer.toString(multiplicacion));
                break;    
                
            case 4: // para la accion de dividir
                int division = num1 / num2;
                txtCalc.setText(Integer.toString(division));
                break;
                
            case 5: // para la accion de porcentaje
                int porcentaje = (num1*num2)/100;
                txtCalc.setText(Integer.toString(porcentaje));
                break;
                
             case 6: // para la accion de la raíz
                double raiz = Math.sqrt(num1);
                txtCalc.setText(Integer.toString((int) raiz));
                break;
                
             case 7: // para la accion de promedio
                double promedio = (num1+num2)/2;
                txtCalc.setText(Integer.toString((int) promedio));
                break; 
                
             case 8: // para la accion de promedio
                double logaritmo = Math.log(num1);
                txtCalc.setText(Integer.toString((int)logaritmo));
                break;   
           
        }
        
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
       num1 = Integer.parseInt(txtCalc.getText());
       txtCalc.setText("");
       operacion = 5;
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
       num1 = Integer.parseInt(txtCalc.getText());
       txtCalc.setText("");
       operacion = 6;
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioActionPerformed
       num1 = Integer.parseInt(txtCalc.getText());
       txtCalc.setText("");
       operacion = 7;
    }//GEN-LAST:event_btnPromedioActionPerformed

    private void btn0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MousePressed
        btn0.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn0MousePressed

    private void btn0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseReleased
        btn0.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn0MouseReleased

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
        btn1.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn1MousePressed

    private void btn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseReleased
        btn1.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn1MouseReleased

    private void btn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MousePressed
        btn2.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn2MousePressed

    private void btn2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseReleased
        btn2.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn2MouseReleased

    private void btn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MousePressed
       btn3.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn3MousePressed

    private void btn3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseReleased
        btn3.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn3MouseReleased

    private void btn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MousePressed
        btn4.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn4MousePressed

    private void btn4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseReleased
        btn4.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn4MouseReleased

    private void btn5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MousePressed
        btn5.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn5MousePressed

    private void btn5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseReleased
        btn5.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn5MouseReleased

    private void btn6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MousePressed
        btn6.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn6MousePressed

    private void btn6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseReleased
        btn6.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn6MouseReleased

    private void btn7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MousePressed
        btn7.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn7MousePressed

    private void btn7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseReleased
        btn7.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn7MouseReleased

    private void btn8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MousePressed
        btn8.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn8MousePressed

    private void btn8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseReleased
        btn8.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn8MouseReleased

    private void btn9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MousePressed
        btn9.setBackground(new Color(242, 203, 252));
    }//GEN-LAST:event_btn9MousePressed

    private void btn9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseReleased
        btn9.setBackground(new Color(186, 255, 224));
    }//GEN-LAST:event_btn9MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraSena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPromedio;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JTextField txtCalc;
    // End of variables declaration//GEN-END:variables
}
