package principal;
import services.calculoEstatistico.CalculadoraEstatisticaService;
import java.util.ArrayList;
import java.util.Arrays;
import model.DadosPeso;

public class Principal {

    public static void main(String[] args) {
        DadosPeso dadosPeso = new DadosPeso(new ArrayList<Double>(Arrays.asList(10.0, 5.0, 6.0, 7.0, 8.0, 2.0)));
        System.out.println("Pesos: " + dadosPeso.getPesos());
        CalculadoraEstatisticaService calculadora = new CalculadoraEstatisticaService();
        calculadora.calcular(dadosPeso);
        System.out.println(dadosPeso.getResultados());
    }
    
}
