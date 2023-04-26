package presenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DadosPeso;
import model.Resultado;
import view.ResultadosCalculosEstatisticosView;

public class ResultadosCalculosEstatisticosPresenter {
    private ResultadosCalculosEstatisticosView viewResultados;
    
    public ResultadosCalculosEstatisticosPresenter(DadosPeso dadosPeso){
        viewResultados = new ResultadosCalculosEstatisticosView();
        this.atualizarTabela(dadosPeso);
        
        //Escuta o botão "Fechar"
        viewResultados.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fecharJanela();
            }
        });
        
    }
    
    public void atualizarTabela(DadosPeso dadosPeso) {
        DefaultTableModel tabelaCalculos = new DefaultTableModel();
        //Adiciona a coluna "Dados"
        tabelaCalculos.addColumn("Resultados"); 
        //Preenche as linhas com dados
        for (Resultado resultado : dadosPeso.getResultados()) {
            tabelaCalculos.addRow(new Object[]{resultado});
        }
        //Atualiza a tabela
        this.viewResultados.getTblCalculos().setModel(tabelaCalculos);
    }
    
    public void fecharJanela(){
        viewResultados.dispose();
    }
}
