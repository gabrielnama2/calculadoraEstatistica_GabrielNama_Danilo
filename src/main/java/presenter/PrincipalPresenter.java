package presenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DadosPeso;
import services.arquivo.LeituraArquivo;
import services.calculoEstatistico.CalculadoraEstatisticaService;
import view.PrincipalView;

public class PrincipalPresenter {
    
    private PrincipalView viewPrincipal;
    private DadosPeso dadosPeso;
    CalculadoraEstatisticaService calculadora;
    
    public PrincipalPresenter(CalculadoraEstatisticaService calculadora){
        this.viewPrincipal = new PrincipalView();
        this.calculadora = calculadora;
        
        //Escuta o botão "Importa os dados"
        viewPrincipal.getOptImportarDados().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               optImportarDados();
           }
        });
        //Escuta o botão "Calcular dados"
        viewPrincipal.getOptCalcularEstatisticas().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               optCalcularEstatisticas();
               optVisualizarEstatisticas();
           }
       });
        //Escuta o botão "Visualizar dados"
        viewPrincipal.getOptVisualizarEstatisticas().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               optVisualizarEstatisticas();
           }
       });
        
    }
    
    public void optImportarDados() {
        LeituraArquivo leitura = new LeituraArquivo();
        this.dadosPeso = leitura.lerArquivo(this.viewPrincipal);
        atualizarTabela(this.dadosPeso);
    }
    
    public void atualizarTabela(DadosPeso dadosPeso) {
        DefaultTableModel tabelaPrincipal = new DefaultTableModel();
        //Adiciona a coluna "Dados"
        tabelaPrincipal.addColumn("Dados"); 
        //Preenche as linhas com dados
        int quantidade = 0;
        for (Double resultado : dadosPeso.getDados()) {
            tabelaPrincipal.addRow(new Object[]{resultado});
            quantidade++;
        }
        //Atualiza a tabela
        this.viewPrincipal.getTblDados().setModel(tabelaPrincipal);
        this.viewPrincipal.getQtdDados().setText(String.valueOf(quantidade));
    }

    public void optCalcularEstatisticas() {
        this.calculadora = new CalculadoraEstatisticaService();
        calculadora.calcular(this.dadosPeso);
    }
    
    public void optVisualizarEstatisticas(){
        ResultadosCalculosEstatisticosPresenter resultadosCalculosPresenter = new ResultadosCalculosEstatisticosPresenter (this.dadosPeso);
    }
}
