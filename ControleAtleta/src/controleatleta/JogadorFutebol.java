package controleatleta;

import java.util.ArrayList;

public class JogadorFutebol extends Atleta {

    private char categoria;// A=Amador P=Profissional
    private char posicao;
    private char estilo; // O=Ortodoxo(destro) S=Southpaw(canhoto)
    private ArrayList<Titulo> titulo;
    private ArrayList<EquipePassada> equipesPassada;
    private ArrayList<Lesao> lesoes;
    

    public JogadorFutebol(String nome) {
        super(nome);
    }
    
    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    public char getPosicao() {
        return posicao;
    }

    public void setPosicao(char posicao) {
        this.posicao = posicao;
    }

    public char getEstilo() {
        return estilo;
    }

    public void setEstilo(char estilo) {
        this.estilo = estilo;
    }

    public ArrayList<EquipePassada> getEquipesPassada() {
        return equipesPassada;
    }

    public void setEquipesPassada(ArrayList<EquipePassada> equipesPassada) {
        this.equipesPassada = equipesPassada;
    }
    
    public ArrayList<Titulo> getTitulo() {
        return titulo;
    }

    public void setTitulo(ArrayList<Titulo> titulo) {
        this.titulo = titulo;
    }
    
    public ArrayList<Lesao> getLesoes() {
        return lesoes;
    }

    public void setLesoes(ArrayList<Lesao> lesoes) {
        this.lesoes = lesoes;
    }

    void setCategoria(byte CATEGORIA_MIRIM_VALOR) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}