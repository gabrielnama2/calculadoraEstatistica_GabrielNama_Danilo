package model;
import java.util.ArrayList;

public class DadosPeso {
    private ArrayList<Double> dadosPesos = new ArrayList<>();
    private ArrayList<Resultado> todosResultados = new ArrayList<>();
    
    public DadosPeso(ArrayList<Double> dados){
        this.dadosPesos = dados;
    }
    
    public ArrayList<Double> getPesos(){
        return this.dadosPesos;
    }
    
    public ArrayList<Resultado> getResultados(){
        return this.todosResultados;
    }

    public void addResultados(Resultado resultado){
        this.todosResultados.add(resultado);
    }
    
    @Override
    public String toString() {
        return "IDado{" + "dadosPesos=" + dadosPesos + ", resultados=" + todosResultados + '}';
    }
    
}
