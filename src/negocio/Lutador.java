package negocio;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    // COMO AINDA NN SEI O TIPO VOU TIPAR INICIALMENTE COMO STRING
    private String categoria;

    private int vitoria;
    private int derrota;
    private int empate;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
     if (peso <52.2){
         categoria = "invalido";
     }else if(peso<= 70.3){
         categoria = "Leve";
     } else if (peso<= 83.9) {
         categoria="Medio";
     } else if (peso<=120.2) {
         categoria = "Pesado";
     }else {
         categoria = "invalido";
     }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    //meus metodos
    public void apresentarLutador(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+" cm");
        System.out.println(this.getPeso()+" KG");
        System.out.println("Vitórias: "+this.getVitoria());
        System.out.println("Empates: "+this.getEmpate());
        System.out.println("Derrotas: "+this.getDerrota());
    }
    public void statusDoLutador(){}
    public void ganharLuta(){
        this.setVitoria(getVitoria()+1);
    }
    public void perderLuta(){
        this.setDerrota(getDerrota()+1);
    }
    public void empatarLuta(){
        this.setEmpate(getEmpate()+1);
    }

}
