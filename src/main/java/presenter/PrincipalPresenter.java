package presenter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.DadosPeso;
import services.calculoEstatistico.CalculadoraEstatisticaService;
import view.PrincipalView;

public class PrincipalPresenter {
    
    private PrincipalView viewPrincipal;
    private DadosPeso dadosPeso = new DadosPeso();
    CalculadoraEstatisticaService calculadora = new CalculadoraEstatisticaService();
    
    public PrincipalPresenter(PrincipalView view){
        this.viewPrincipal = view;
    }
    
    public void optImportarDados() {
        JFileChooser arquivo= new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos CSV", "csv");
        arquivo.setFileFilter(filtro);
        arquivo.showOpenDialog(this.viewPrincipal);
        Scanner leitor = null;
        int tamanho = 0;
        try {
            leitor = new Scanner(new File(arquivo.getSelectedFile().getPath()));
            leitor.useDelimiter(",");
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro com o arquivo");
        }
        
        while (leitor.hasNextLine()) {
            double dado = Double.parseDouble(leitor.next());
            this.dadosPeso.addDados(dado);
            tamanho++;
        }
        leitor.close();

        System.out.println("Pesos: " + this.dadosPeso.getDados());
        
        this.atualizarTabela();
        this.viewPrincipal.getQtdDados().setText(Integer.toString(tamanho));
    }
    
    public void atualizarTabela() {
        DefaultTableModel tabelaPrincipal = new DefaultTableModel();
        //Adiciona a coluna "Dados"
        tabelaPrincipal.addColumn("Dados"); 
        //Preenche as linhas com dados
        for (Double dado : this.dadosPeso.getDados()) {
            tabelaPrincipal.addRow(new Object[]{dado});
        }
        //Atualiza a tabela
        this.viewPrincipal.getTblDados().setModel(tabelaPrincipal);
    }

    public void optCalcularEstatisticas() {
       
        calculadora.calcular(this.dadosPeso);
        System.out.println(this.dadosPeso.getResultados());
        
    }
    
    public void optVisualizarEstatisticas(){
        ResultadosCalculosEstatisticosPresenter resultadosCalculosPresenter = new ResultadosCalculosEstatisticosPresenter (this.dadosPeso);
    }
}
