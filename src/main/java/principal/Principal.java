package principal;
import services.calculoEstatistico.CalculadoraEstatisticaService;
import presenter.PrincipalPresenter;

public class Principal {

    public static void main(String[] args) {
        CalculadoraEstatisticaService calculadora = new CalculadoraEstatisticaService();
        new PrincipalPresenter(calculadora);
    }
    
}
