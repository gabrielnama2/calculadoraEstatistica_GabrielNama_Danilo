package view;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class ResultadosCalculosEstatisticosView extends javax.swing.JFrame {

    //private ResultadosCalculosEstatisticosPresenter principalPresenter = new ResultadosCalculosEstatisticosPresenter();
    
    public ResultadosCalculosEstatisticosView() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(this.getParent());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalculos = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        sltDataResultadoCalculado = new javax.swing.JComboBox<>();
        lblSelecioneDataResultadoCalculado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultados Cálculos Estatísticos");
        setPreferredSize(new java.awt.Dimension(800, 500));

        tblCalculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCalculos);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        sltDataResultadoCalculado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSelecioneDataResultadoCalculado.setText("Selecione a data do resultado calculado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnFechar)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sltDataResultadoCalculado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelecioneDataResultadoCalculado, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblSelecioneDataResultadoCalculado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sltDataResultadoCalculado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnFechar)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        
    }//GEN-LAST:event_btnFecharActionPerformed

    public void setBtnFechar(JButton btnFechar) {
        this.btnFechar = btnFechar;
    }
    
    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JTable getTblCalculos() {
        return tblCalculos;
    }

    public JComboBox<String> getSltDataResultadoCalculado() {
        return sltDataResultadoCalculado;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelecioneDataResultadoCalculado;
    private javax.swing.JComboBox<String> sltDataResultadoCalculado;
    private javax.swing.JTable tblCalculos;
    // End of variables declaration//GEN-END:variables
}
