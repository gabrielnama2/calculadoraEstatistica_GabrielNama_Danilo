package model;
import java.util.ArrayList;

public interface IDado {
    public void addDados(double dado);
    public void addResultados(Resultado resultado);
    public ArrayList<Double> getDados();
    public ArrayList<Resultado> getResultados();
}
