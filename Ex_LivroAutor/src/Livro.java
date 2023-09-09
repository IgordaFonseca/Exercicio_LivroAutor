public class Livro {
    private String titulo;
    private String isbn;
    private int anoPublicacao;
    private int edicao;
    private Autor []autores;
    private int autoresIndex;

    public Livro(String titulo, String isbn, int anoPublicacao, int edicao, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao;
        this.autores = new Autor[10];
        this.autoresIndex=0;
        setAutores(autor);
    }

    public Livro(String titulo, String isbn, int anoPublicacao, int edicao) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao;
        this.autores = new Autor[10];
        this.autoresIndex=0;
    }

    public void mostrar(){
        System.out.printf("Titulo: %s, isbn: %s, Ano de publicao: %d, Edicao: %d", getTitulo(), getIsbn(), getAnoPublicacao(),getEdicao());
    }

    public void mostrarAutores(){
        for(int i = 0; i<getAutoresIndex();i++){
            System.out.print(autores[i].getNome());
        }
    }

    public void mostrarPrimeiroAutor(){
        System.out.print(autores[0].getNome());
    }

    ///getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor autor) {
        this.autores[getAutoresIndex()] = autor;
        setAutoresIndex();
    }

    public int getAutoresIndex() {
        return autoresIndex;
    }

    public void setAutoresIndex() {
        this.autoresIndex ++;
    }
}
