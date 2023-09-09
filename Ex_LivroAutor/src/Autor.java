public class Autor {
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String email;
    private Autor []auxiliares;
    private int auxiliaresIndex;
    private Livro []livrosEscritos;
    private int livrosEscritosIndex;


    public Autor(String cpf, String nome, String dataNascimento, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        auxiliares = new Autor[10];
        livrosEscritos = new Livro[10];
        auxiliaresIndex=0;
        livrosEscritosIndex=0;
    }



    public void escrever(Livro livro){
        this.livrosEscritos[getLivrosEscritosIndex()]=livro;
        setLivrosEscritosIndex();
        livro.setAutores(this);
    }

    public void mostraLivros(){
        for(int i = 0; i<getLivrosEscritosIndex();i++){
            System.out.printf("Titulo: %s, isbn: %s, Ano de publicao: %d, Edicao: %d", livrosEscritos[i].getTitulo(),livrosEscritos[i].getIsbn(), livrosEscritos[i].getAnoPublicacao(),livrosEscritos[i].getEdicao() );
        }
    }

    public void coautora(Livro livro){
        livro.setAutores(this);
        Autor []autores = livro.getAutores();
        autores[0].setAuxiliares(this, getAuxiliaresIndex());
        setLivrosEscritos(livro);
    }

    public void mostraAuxiliares(){
        for(int i = 0; i<getAuxiliaresIndex();i++){
            auxiliares = getAuxiliares();
            System.out.printf("Nome: %s", auxiliares[i].getNome());
        }
    }

    /// getters e setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Autor[] getAuxiliares() {
        return auxiliares;
    }

    public void setAuxiliares(Autor auxiliar, int auxiliaresIndex) {
        this.auxiliares[auxiliaresIndex] = auxiliar;
        setAuxiliaresIndex();
    }

    public int getAuxiliaresIndex() {
        return auxiliaresIndex;
    }

    public void setAuxiliaresIndex() {
        this.auxiliaresIndex ++;
    }

    public Livro[] getLivrosEscritos() {
        return livrosEscritos;
    }

    public void setLivrosEscritos(Livro livro) {
        this.livrosEscritos[getLivrosEscritosIndex()] = livro;
        setLivrosEscritosIndex();
    }

    public int getLivrosEscritosIndex() {
        return livrosEscritosIndex;
    }

    public void setLivrosEscritosIndex(){
        this.livrosEscritosIndex ++;
    }
}
