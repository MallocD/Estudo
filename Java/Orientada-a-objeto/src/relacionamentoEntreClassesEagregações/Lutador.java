package relacionamentoEntreClassesEagregações;

public class Lutador {
    //Agragação entre objetos e Relacionamento de classes

    private String nome, categoria,nacionalidade;
    private int idade, empates, derrotas, vitorias;
    private float peso;
    private float altura;

    public Lutador(String no, String na,int id, float al, float pe, int em, int de, int vt){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setEmpates(em);
        setDerrotas(de);
        setVitorias(vt);
        setPeso(pe);
        setAltura(al);
//        setCategoria();
    }

    public void apresentar(){
        System.out.println("----------------------------------------");
        System.out.println("Chegou a horaaa!! Apresentamos o lutador " + getNome());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println("com " + getIdade()+ " anos e "+getAltura()+ " de altura");
        System.out.println("pesando " + getPeso()+ "kg");
        System.out.println( getVitorias()+ " Vitórias");
        System.out.println( getDerrotas()+ " Derrotas e");
        System.out.println(getEmpates() + " empates");
        status();

    }

    public void status(){
        System.out.println("======STATUS COMPETIDOR======");
        System.out.println(this.getNome()+ " é um peso "+ categoria);
        System.out.println("Ganhou "+ vitorias+ " vezes");
        System.out.println("Empatou "+ empates+ " vezes");
        System.out.println("Perdeu "+ derrotas+ " vezes");


    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

     public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    private  void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso<=52.2f){
            categoria = "Inválida";
        }else if(peso<=72.3){
            categoria = "Leve";
        }else if(peso<=83.9){
            categoria = "Médio";
        }else if(peso<=120.2){
            categoria="Pesado";
        }else categoria = "Inválido";
    }

    public int getVitorias() {
        return vitorias;
    }

    private  void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private  void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    public  void setEmpates(int empates) {
        this.empates = empates;
    }
}
