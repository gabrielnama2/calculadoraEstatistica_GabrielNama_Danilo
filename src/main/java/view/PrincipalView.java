package view;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import presenter.PrincipalPresenter;
import presenter.ResultadosCalculosEstatisticosPresenter;

public class PrincipalView extends javax.swing.JFrame {

    public PrincipalView() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(this.getParent());
        //this.setExtendedState(WIDTH);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbQuantidaDados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        mbPrincipal = new javax.swing.JMenuBar();
        mbOpcoes = new javax.swing.JMenu();
        optImportarDados = new javax.swing.JMenuItem();
        optCalcularEstatisticas = new javax.swing.JMenuItem();
        optVisualizarEstatisticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Estatística");

        lbQuantidaDados.setText("Quantidade de dados:");

        jScrollPane2.setViewportView(tblDados);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(604, Short.MAX_VALUE)
                .addComponent(lbQuantidaDados)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lbQuantidaDados)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private PrincipalPresenter principalPresenter = new PrincipalPresenter();
    
    private void optImportarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optImportarDadosActionPerformed
        this.principalPresenter.optImportarDados(this);
        
    }//GEN-LAST:event_optImportarDadosActionPerformed

    private void optVisualizarEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optVisualizarEstatisticasActionPerformed
        ResultadosCalculosEstatisticosPresenter presenterResultados = new ResultadosCalculosEstatisticosPresenter ();
    }//GEN-LAST:event_optVisualizarEstatisticasActionPerformed

    private void optCalcularEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCalcularEstatisticasActionPerformed
        this.principalPresenter.optCalcularEstatisticas(this);
    }//GEN-LAST:event_optCalcularEstatisticasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbQuantidaDados;
    private javax.swing.JMenu mbOpcoes;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem optCalcularEstatisticas;
    private javax.swing.JMenuItem optImportarDados;
    private javax.swing.JMenuItem optVisualizarEstatisticas;
    private javax.swing.JTable tblDados;
    // End of variables declaration//GEN-END:variables
}