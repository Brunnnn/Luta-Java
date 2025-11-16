public class lutador{
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //construtor
    public lutador(String no, String na, int id, float al, float pe, int vi, int der,int emp) {
        this.setNome(no);
        this.setNacionalidade(na); 
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe); 
        this.setVitorias(vi);
        this.setDerrotas(der); 
        this.setEmpates(emp); 
    }

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public float getPeso() {
        return peso;
    }


    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = " peso Invalido";
        } else if (this.getPeso() <=70.3){
            this.categoria = "Peso leve";
        } else if (this.getPeso() <=83.9){
            this.categoria = "Peso medio";
        } else if (this.getPeso() <= 120.2){
            this.categoria = "Peso pesado";
        } else {
            this.categoria = "Invalido";
        }

    }


    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }

    //metodos
    public void apresentar(){
        System.out.println("_______________________________________");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente do(a) " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    public void status(){
        System.out.println("_______________________________________");
        System.out.println(this.getNome() + " é um " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias() + " vezes");
        System.out.println("Perdeu: " + this.getDerrotas() + " vezes");
        System.out.println("Empatou: " + this.getEmpates() + " vezes");
    }
    public void ganharluta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderluta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarluta(){
        this.setEmpates(this.getEmpates() + 1);
    }


    

}