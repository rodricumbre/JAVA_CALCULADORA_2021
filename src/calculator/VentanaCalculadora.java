/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author rodri
 */
public class VentanaCalculadora extends javax.swing.JFrame {
    
    //Aquí van las variables de instancia
    double operando1 = 0; //Almacena la información del primer número
    double operando2 = 0; //Almacena la información del segundo número
    String resultado = ""; //almacena la operación que hemos pulsado

    /**
     * Creates new form VentanaCalculadora
     */
    public VentanaCalculadora() {
        initComponents();
    }
    
    public void escribeNumeroEnPantalla(String numero){
        if (Display.getText().equals("0") ){
            Display.setText(numero);
        }else{
        Display.setText(Display.getText() + numero);
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Display = new javax.swing.JLabel();
        BotonCE = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        BotonX = new javax.swing.JButton();
        BotonMenos = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonMas = new javax.swing.JButton();
        BotonDivision = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonComa = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Display.setBackground(new java.awt.Color(0, 0, 0));
        Display.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        Display.setForeground(new java.awt.Color(56, 210, 195));
        Display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Display.setText("0");
        Display.setOpaque(true);

        BotonCE.setBackground(new java.awt.Color(255, 0, 0));
        BotonCE.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BotonCE.setText("CE");
        BotonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCEActionPerformed(evt);
            }
        });

        Boton7.setBackground(new java.awt.Color(255, 255, 255));
        Boton7.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Boton4.setBackground(new java.awt.Color(255, 255, 255));
        Boton4.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton1.setBackground(new java.awt.Color(255, 255, 255));
        Boton1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setBackground(new java.awt.Color(255, 255, 255));
        Boton2.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton8.setBackground(new java.awt.Color(255, 255, 255));
        Boton8.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton5.setBackground(new java.awt.Color(255, 255, 255));
        Boton5.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        BotonX.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BotonX.setText("x");
        BotonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXActionPerformed(evt);
            }
        });

        BotonMenos.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BotonMenos.setText("-");
        BotonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosActionPerformed(evt);
            }
        });

        Raiz.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Raiz.setText("√");
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });

        Boton9.setBackground(new java.awt.Color(255, 255, 255));
        Boton9.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        Boton6.setBackground(new java.awt.Color(255, 255, 255));
        Boton6.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Boton3.setBackground(new java.awt.Color(255, 255, 255));
        Boton3.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        BotonMas.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BotonMas.setText("+");
        BotonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMasActionPerformed(evt);
            }
        });

        BotonDivision.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BotonDivision.setText("/");
        BotonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivisionActionPerformed(evt);
            }
        });

        BotonIgual.setBackground(new java.awt.Color(55, 210, 195));
        BotonIgual.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });

        BotonComa.setBackground(new java.awt.Color(255, 255, 255));
        BotonComa.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BotonComa.setText(",");

        Boton0.setBackground(new java.awt.Color(255, 255, 255));
        Boton0.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Boton0.setText("0");
        Boton0.setActionCommand("0");
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonCE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Raiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonComa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonComa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
        escribeNumeroEnPantalla("0");
    }//GEN-LAST:event_Boton0ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        escribeNumeroEnPantalla("1");
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        escribeNumeroEnPantalla("2");
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        escribeNumeroEnPantalla("3");
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        escribeNumeroEnPantalla("4");
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        escribeNumeroEnPantalla("5");
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        escribeNumeroEnPantalla("6");
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        escribeNumeroEnPantalla("7");
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        escribeNumeroEnPantalla("8");
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        escribeNumeroEnPantalla("9");
    }//GEN-LAST:event_Boton9ActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
        Display.setText(resultado);
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMasActionPerformed
        escribeNumeroEnPantalla("+");
        resultado = String.valueOf(operando1 + operando2);
    }//GEN-LAST:event_BotonMasActionPerformed

    private void BotonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosActionPerformed
        escribeNumeroEnPantalla("-");
    }//GEN-LAST:event_BotonMenosActionPerformed

    private void BotonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXActionPerformed
        escribeNumeroEnPantalla("x");
    }//GEN-LAST:event_BotonXActionPerformed

    private void BotonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivisionActionPerformed
        escribeNumeroEnPantalla("/");
    }//GEN-LAST:event_BotonDivisionActionPerformed

    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
        escribeNumeroEnPantalla("√");
    }//GEN-LAST:event_RaizActionPerformed

    private void BotonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCEActionPerformed
        Display.setText("0");
    }//GEN-LAST:event_BotonCEActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonCE;
    private javax.swing.JButton BotonComa;
    private javax.swing.JButton BotonDivision;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMas;
    private javax.swing.JButton BotonMenos;
    private javax.swing.JButton BotonX;
    private javax.swing.JLabel Display;
    private javax.swing.JButton Raiz;
    // End of variables declaration//GEN-END:variables

    private void escribeNumeroEnPantalla(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
