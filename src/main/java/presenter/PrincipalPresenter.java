package presenter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.DadosPeso;
import services.calculoEstatistico.CalculadoraEstatisticaService;
import services.calculoEstatistico.QuantidadeElementos;
import view.PrincipalView;

public class PrincipalPresenter {
    
    private PrincipalView viewPrincipal;
    private DadosPeso dadosPeso = new DadosPeso();
    CalculadoraEstatisticaService calculadora = new CalculadoraEstatisticaService();
    
    /*public PrincipalPresenter(PrincipalView view){
        this.viewPrincipal = view;
    }*/
    
    public void optImportarDados(PrincipalView view) {
        JFileChooser arquivo= new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos CSV", "csv");
        arquivo.setFileFilter(filtro);
        arquivo.showOpenDialog(view);
        Scanner leitor = null;
        leitor.useDelimiter(",");
        
        try {
            leitor = new Scanner(new File(arquivo.getSelectedFile().getPath()));
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro com o arquivo");
        }
        
        while (leitor.hasNextLine()) {
            double dado = Double.parseDouble(leitor.next());
            this.dadosPeso.addDados(dado);
        }
        
        leitor.close();

        System.out.println("Pesos: " + dadosPeso.getDados());
        //Exibir os dados na tabela da view
    }

    public void optCalcularEstatisticas(PrincipalView view) {
       
        calculadora.calcular(this.dadosPeso);
        System.out.println(this.dadosPeso.getResultados());
        
    }
    
    public void optVisualizarEstatisticas(PrincipalView view){
        
    }

}
