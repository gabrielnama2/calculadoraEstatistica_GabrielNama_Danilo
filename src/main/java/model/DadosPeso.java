package model;
import java.util.ArrayList;

public class DadosPeso implements IDado{
    private ArrayList<Double> dadosPesos = new ArrayList<>();
    private ArrayList<Resultado> todosResultados = new ArrayList<>();
    
    //public DadosPeso(ArrayList<Double> dadosLista){
    //    this.dadosPesos = dadosLista;
    //}

    @Override
    public void addDados(double dado){
        this.dadosPesos.add(dado);
    }
    
    @Override
    public void addResultados(Resultado resultado){
        this.todosResultados.add(resultado);
    }
    
    @Override
    public ArrayList<Double> getDados(){
        return this.dadosPesos;
    }
    
    @Override
    public ArrayList<Resultado> getResultados(){
        return this.todosResultados;
    }
    
    @Override
    public String toString() {
        return "IDado{" + "dadosPesos=" + dadosPesos + ", resultados=" + todosResultados + '}';
    }
    
}
