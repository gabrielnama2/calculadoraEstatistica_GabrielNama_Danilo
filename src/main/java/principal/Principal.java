package principal;
import calculo.CalculadoraService;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Double> numeros
                = new ArrayList<>(Arrays.asList(
                        10.0, 5.0, 6.0, 7.0, 8.0, 2.0
                ));

        CalculadoraService calculadora = new CalculadoraService();
        
        for(int i=1; i<=5; i++){
            double resultado = calculadora.calcular(i, numeros);
            System.out.println(resultado);
        }
        
        //double resultado = calculadora.calcular(5, numeros);
        //System.out.println(resultado);
    }
    
}
