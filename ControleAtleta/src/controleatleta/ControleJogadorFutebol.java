package controleatleta;

import java.util.ArrayList;

public class ControleJogadorFutebol {

    private ArrayList<JogadorFutebol> listaJogadores;

    public ControleJogadorFutebol() {
        this.listaJogadores = new ArrayList<JogadorFutebol>();
    }
    
    public ArrayList<JogadorFutebol> getListaJogadores() {
        return listaJogadores;
    }
    
    public void adicionar(JogadorFutebol umJogador) {
        listaJogadores.add(umJogador);
    }
    
    public void remover(JogadorFutebol umJogador) {
        listaJogadores.remove(umJogador);
    }
    
    public JogadorFutebol pesquisar(String nome) {
        for (JogadorFutebol b: listaJogadores) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}
