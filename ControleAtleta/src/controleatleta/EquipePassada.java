package controleatleta;

public class EquipePassada {

    private String equipePassada;
    private int ano;

    public EquipePassada(String equipePassada, int ano) {
        this.equipePassada = equipePassada;
        this.ano = ano;
    }

    public String getEquipePassada() {
        return equipePassada;
    }

    public void setEquipePassada(String equipePassada) {
        this.equipePassada = equipePassada;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return this.ano + " - " + this.equipePassada;
    }
}
