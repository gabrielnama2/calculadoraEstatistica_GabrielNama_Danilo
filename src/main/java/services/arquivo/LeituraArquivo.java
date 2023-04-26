package services.arquivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.DadosPeso;
import view.PrincipalView;

public class LeituraArquivo {
    
    DadosPeso dados = new DadosPeso();
    
    public DadosPeso lerArquivo(PrincipalView viewPrincipal){
        JFileChooser arquivo= new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos CSV", "csv");
        arquivo.setFileFilter(filtro);
        arquivo.showOpenDialog(viewPrincipal);
        Scanner leitor = null;
        try {
            leitor = new Scanner(new File(arquivo.getSelectedFile().getPath()));
            leitor.useDelimiter(",");
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro com o arquivo");
        }
        
        while (leitor.hasNextLine()) {
            double dado = Double.parseDouble(leitor.next());
            dados.addDados(dado);
        }
        leitor.close();
        return this.dados;
    }
}
