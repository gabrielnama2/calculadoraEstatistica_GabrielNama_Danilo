package view;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import presenter.PrincipalPresenter;
import presenter.ResultadosCalculosEstatisticosPresenter;

public class PrincipalView extends javax.swing.JFrame {

    private PrincipalPresenter principalPresenter = new PrincipalPresenter(this);
    
    public PrincipalView() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(this.getParent());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbQuantidaDados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        qtdDados = new javax.swing.JLabel();
        mbPrincipal = new javax.swing.JMenuBar();
        mbOpcoes = new javax.swing.JMenu();
        optImportarDados = new javax.swing.JMenuItem();
        optCalcularEstatisticas = new javax.swing.JMenuItem();
        optVisualizarEstatisticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Estatística");

        lbQuantidaDados.setText("Quantidade de dados:");

        jScrollPane2.setViewportView(tblDados);

        qtdDados.setText("0");

        mbOpcoes.setText("Opções");

        optImportarDados.setText("Importar dados");
        optImportarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optImportarDadosActionPerformed(evt);
            }
        });
        mbOpcoes.add(optImportarDados);

        optCalcularEstatisticas.setText("Calcular estatísticas");
        optCalcularEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCalcularEstatisticasActionPerformed(evt);
            }
        });
        mbOpcoes.add(optCalcularEstatisticas);

        optVisualizarEstatisticas.setText("Visualizar estatísticas");
        optVisualizarEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optVisualizarEstatisticasActionPerformed(evt);
            }
        });
        mbOpcoes.add(optVisualizarEstatisticas);

        mbPrincipal.add(mbOpcoes);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbQuantidaDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qtdDados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidaDados)
                    .addComponent(qtdDados))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optImportarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optImportarDadosActionPerformed
        this.principalPresenter.optImportarDados();
        
    }//GEN-LAST:event_optImportarDadosActionPerformed

    private void optVisualizarEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optVisualizarEstatisticasActionPerformed
        //ResultadosCalculosEstatisticosPresenter resultadosCalculosPresenter = new ResultadosCalculosEstatisticosPresenter ();
        //ResultadosCalculosEstatisticosView ResultadosView = new ResultadosCalculosEstatisticosView();
        this.principalPresenter.optVisualizarEstatisticas();
    }//GEN-LAST:event_optVisualizarEstatisticasActionPerformed

    private void optCalcularEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCalcularEstatisticasActionPerformed
        this.principalPresenter.optCalcularEstatisticas();
    }//GEN-LAST:event_optCalcularEstatisticasActionPerformed

    public JTable getTblDados() {
        return tblDados;
    }
    
    public JLabel getQtdDados() {
        return qtdDados;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbQuantidaDados;
    private javax.swing.JMenu mbOpcoes;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem optCalcularEstatisticas;
    private javax.swing.JMenuItem optImportarDados;
    private javax.swing.JMenuItem optVisualizarEstatisticas;
    private javax.swing.JLabel qtdDados;
    private javax.swing.JTable tblDados;
    // End of variables declaration//GEN-END:variables
}
