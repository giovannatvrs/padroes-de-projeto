import model.Livro;
import model.Usuario;
import model.UsuarioFactory;
import singleton.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.getInstancia();
        biblioteca.adicionarLivro(new Livro("Clean Code", "Robert C. Martin", "Alta Books", 2009));
        biblioteca.adicionarLivro(new Livro("Padrões de Projetos: Soluções Reutilizáveis de Software Orientados a Objetos", ""
                , "Bookman", 200));

        // Factory + Strategy
        Usuario aluno = UsuarioFactory.criarUsuario("Maria", "aluno");
        Usuario professor = UsuarioFactory.criarUsuario("João", "professor");

        System.out.println(aluno.getNome() + " multa por 4 dias atraso: " + aluno.calcularMulta(4));
        System.out.println(professor.getNome() + " multa por 4 dias atraso: " + professor.calcularMulta(4));

        // Listar livros
        biblioteca.getLivros().forEach(System.out::println);
    }
}