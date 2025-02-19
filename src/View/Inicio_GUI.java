package View;

import javax.swing.JOptionPane;

public class Inicio_GUI extends javax.swing.JFrame {

    public Inicio_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("aprender?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tel_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Sair_btn = new javax.swing.JButton();
        Cadastrar_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cod001 = new javax.swing.JLabel();
        cod_txt = new javax.swing.JTextField();
        nome2_txt = new javax.swing.JTextField();
        nome001 = new javax.swing.JLabel();
        email2_txt = new javax.swing.JTextField();
        email001 = new javax.swing.JLabel();
        tel2_txt = new javax.swing.JTextField();
        tel001 = new javax.swing.JLabel();
        consultar_btn = new javax.swing.JButton();
        alterar_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cod2_txt = new javax.swing.JTextField();
        excluir_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Ticket_BTN = new javax.swing.JButton();
        Atestado_BTN = new javax.swing.JButton();
        RelatórioBD_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setText("Tel:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 140, 52, 27);
        jPanel1.add(tel_txt);
        tel_txt.setBounds(50, 140, 340, 30);

        jLabel2.setText("Email:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 90, 40, 30);
        jPanel1.add(nome_txt);
        nome_txt.setBounds(50, 40, 340, 30);

        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 40, 52, 27);
        jPanel1.add(email_txt);
        email_txt.setBounds(50, 90, 340, 30);

        jLabel4.setText("AGENDA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 0, 80, 30);

        Sair_btn.setText("Sair");
        Sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Sair_btn);
        Sair_btn.setBounds(230, 210, 100, 40);

        Cadastrar_btn.setText("Cadastrar");
        Cadastrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Cadastrar_btn);
        Cadastrar_btn.setBounds(90, 210, 100, 40);

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel2.setLayout(null);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEmail}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("Telelefone");
        columnBinding.setColumnClass(Long.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 395, 70);

        cod001.setText("Codigo:");
        jPanel2.add(cod001);
        cod001.setBounds(10, 80, 60, 20);

        cod_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_txtActionPerformed(evt);
            }
        });
        jPanel2.add(cod_txt);
        cod_txt.setBounds(50, 80, 90, 20);

        nome2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome2_txtActionPerformed(evt);
            }
        });
        jPanel2.add(nome2_txt);
        nome2_txt.setBounds(50, 110, 200, 30);

        nome001.setText("Nome:");
        jPanel2.add(nome001);
        nome001.setBounds(10, 110, 60, 30);

        email2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email2_txtActionPerformed(evt);
            }
        });
        jPanel2.add(email2_txt);
        email2_txt.setBounds(50, 150, 200, 30);

        email001.setText("Email:");
        jPanel2.add(email001);
        email001.setBounds(10, 150, 60, 30);

        tel2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel2_txtActionPerformed(evt);
            }
        });
        jPanel2.add(tel2_txt);
        tel2_txt.setBounds(50, 190, 160, 30);

        tel001.setText("Telefone:");
        jPanel2.add(tel001);
        tel001.setBounds(0, 190, 60, 30);

        consultar_btn.setText("Consultar");
        consultar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_btnActionPerformed(evt);
            }
        });
        jPanel2.add(consultar_btn);
        consultar_btn.setBounds(300, 80, 90, 30);

        alterar_btn.setText("Alterar");
        alterar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar_btnActionPerformed(evt);
            }
        });
        jPanel2.add(alterar_btn);
        alterar_btn.setBounds(300, 120, 90, 30);

        jTabbedPane1.addTab("Consultar/Alterar", jPanel2);

        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CODIGO");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(150, 20, 80, 30);
        jPanel3.add(cod2_txt);
        cod2_txt.setBounds(70, 60, 220, 30);

        excluir_btn.setText("Excluir");
        excluir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_btnActionPerformed(evt);
            }
        });
        jPanel3.add(excluir_btn);
        excluir_btn.setBounds(130, 100, 100, 40);

        jTabbedPane1.addTab("Excluir", jPanel3);

        Ticket_BTN.setText("Ticket");
        Ticket_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ticket_BTNActionPerformed(evt);
            }
        });

        Atestado_BTN.setText("Atestado");
        Atestado_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atestado_BTNActionPerformed(evt);
            }
        });

        RelatórioBD_BTN.setText("Relatório BD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Atestado_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RelatórioBD_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ticket_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Ticket_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Atestado_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RelatórioBD_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relatório", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Sair_btnActionPerformed

    private void Cadastrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_btnActionPerformed
        Controller.Funcoes_DAO.cadastrar();
    }//GEN-LAST:event_Cadastrar_btnActionPerformed

    private void cod_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_txtActionPerformed

    private void nome2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome2_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome2_txtActionPerformed

    private void email2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email2_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email2_txtActionPerformed

    private void tel2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel2_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel2_txtActionPerformed

    private void consultar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_btnActionPerformed
        Controller.Funcoes_DAO.consultar();
    }//GEN-LAST:event_consultar_btnActionPerformed

    private void alterar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar_btnActionPerformed
       Controller.Funcoes_DAO.alterar();
    }//GEN-LAST:event_alterar_btnActionPerformed

    private void excluir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_btnActionPerformed
        String x = JOptionPane.showInputDialog(null, "Deseja Apagar Registro? \n 1 - Sim \n 2 - Não" );
        int op = Integer.parseInt(x);
        if(op == 1){
            JOptionPane.showMessageDialog(null,"Exclusão Cancelada");
        }
    }//GEN-LAST:event_excluir_btnActionPerformed

    private void Ticket_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ticket_BTNActionPerformed
        
    }//GEN-LAST:event_Ticket_BTNActionPerformed

    private void Atestado_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atestado_BTNActionPerformed
        // TODO add your handling code here:
        
        try {
            
            Controller.Press_DAO.imprime();
            
        } catch (Exception ex){
            
            
            
        }
    }//GEN-LAST:event_Atestado_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atestado_BTN;
    private javax.swing.JButton Cadastrar_btn;
    private javax.swing.JButton RelatórioBD_BTN;
    private javax.swing.JButton Sair_btn;
    private javax.swing.JButton Ticket_BTN;
    private javax.swing.JButton alterar_btn;
    private java.util.List<View.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.swing.JLabel cod001;
    public static javax.swing.JTextField cod2_txt;
    public static javax.swing.JTextField cod_txt;
    private javax.swing.JButton consultar_btn;
    private javax.swing.JLabel email001;
    public static javax.swing.JTextField email2_txt;
    public static javax.swing.JTextField email_txt;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton excluir_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nome001;
    public static javax.swing.JTextField nome2_txt;
    public static javax.swing.JTextField nome_txt;
    private javax.swing.JLabel tel001;
    public static javax.swing.JTextField tel2_txt;
    public static javax.swing.JTextField tel_txt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
