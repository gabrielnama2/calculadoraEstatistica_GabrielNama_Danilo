package presenter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import view.PrincipalView;

public class PrincipalPresenter {
    /*public PrincipalPresenter(){
        PrincipalView view = new PrincipalView();
    }*/
    private PrincipalView view;
    
    public void optImportarDados(PrincipalView view) {                                                 
        JFileChooser arquivoCSV = new JFileChooser();
        //Filtrar para apenas arquivos .csv
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos CSV", "csv");
        arquivoCSV.setFileFilter(filtro);
        arquivoCSV.showOpenDialog(view);
        //Armazena os dados do arquivo na Classes DadosPeso
    }
    
}
