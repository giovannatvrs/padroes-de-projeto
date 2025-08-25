package singleton;

import model.Livro;

import java.util.ArrayList;

public class Biblioteca {
    private static Biblioteca instancia;
    private ArrayList<Livro> livros = new ArrayList<>();
    private Biblioteca() {
        super();

    }
    public static Biblioteca getInstancia() {
        if(instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}
