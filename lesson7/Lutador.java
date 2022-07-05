package lesson7;

public class Lutador {
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias, derrotas, empates;

  public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
      int empates) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    setPeso(peso);
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
  }

  public int getEmpates() {
    return empates;
  }

  public void setEmpates(int empates) {
    this.empates = empates;
  }

  public int getDerrotas() {
    return derrotas;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getVitorias() {
    return vitorias;
  }

  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public String getCategoria() {
    return categoria;
  }

  private void setCategoria(float categoria) {
    if (categoria < 52.2) {
      this.categoria = "Peso insuficiente";
    } else if (categoria <= 70.3) {
      this.categoria = "leve";
    } else if (categoria <= 83.9) {
      this.categoria = "medio";
    } else if (peso <= 120.2) {
      this.categoria = "pesado";
    } else {
      this.categoria = "Super Pesado";
    }
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
    setCategoria(peso);
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void apresentar() {
    System.out.println("---------------------------");
    System.out.println("CHEGOU A HORA! Apresentamos o lutador:" + getNome());
    System.out.println("Diretamente de " + getNacionalidade());
    System.out.println("com " + getIdade() + " anos e " + getAltura() + "m de altura");
    System.out.println("Pesando " + getPeso() + "Kg");
    System.out.println(getNome() + " é um peso " + getCategoria());
    System.out.println(getVitorias() + "vitórias");
    System.out.println(getDerrotas() + "Derrotas");
    System.out.println(getEmpates() + "Epates");
  }

  public void status() {
    if (getPeso() > 40)  {
      System.out.println(getNome() + " é um peso " + getCategoria());
      System.out.println("Ganhou: " + getVitorias());
      System.out.println("Derrotas: " + getDerrotas());
      System.out.println("Epates: " + getEmpates());    
    } else {
      System.out.println("Peso inválido");
    }
  }

  private void ganharLuta() {
    setVitorias(getVitorias() + 1);
  }

  private void perderLuta() {
    setDerrotas(getDerrotas() + 1);
  }

  private void empatarLuta() {
    setEmpates(getEmpates() + 1);
  }
}
