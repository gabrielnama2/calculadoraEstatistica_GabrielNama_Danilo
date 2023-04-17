package presenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ResultadosCalculosEstatisticosView;

public class ResultadosCalculosEstatisticosPresenter {
    private ResultadosCalculosEstatisticosView view;
    
    public ResultadosCalculosEstatisticosPresenter(){
        view = new ResultadosCalculosEstatisticosView();
        
        view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fecharJanela();
            }
        });
        //view.setVisible(true);
    }
    
    public void fecharJanela(){
        view.dispose();
    }
}
