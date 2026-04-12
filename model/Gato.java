public class Gato {
    
    private String nome;  // Atributo privado, acessível somente dentro da classe Pessoa
    private int idade;  // Atributo privado, acessível somente dentro da classe Pessoa
    private double altura;
    private String raca;

    // Construtor que recebe nome e idade como parâmetros
    public Gato() {
        this.nome = "Tom";
        this.idade = 4;
        this.altura = 0.1;
        this.raca = "siames";
    }

    // Construtor que inclui altura
    public Gato(String nome, int idade, double altura, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.raca = raca;
    }

    // Método que exibe uma mensagem de saudação com o nome e idade da pessoa
    public void saudacao() {
        System.out.println("Olá, " + nome + "!" + " Você tem " + idade + " anos," + "Seu gato é da raça" + raca);
    }
     // Método que exibe uma mensagem de saudação com o nome e idade da pessoa
    public void miado() {
        System.out.println("miauuu miauu");
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    
    // Retorna o nome da pesso
    public String getNome() {
        return nome;
    }

    // Retorna a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Retorna a altura da pessoa
    public double getAltura() {
        return altura;
    }

    public String getRaca() {
        return raca;
    }


    // Define um novo nome para a pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define uma nova idade para a pessoa
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Define uma nova altura para a pessoa (em metros)
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", raca=" + raca + "]";
    }
}