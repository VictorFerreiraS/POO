package lesson4;

public class Caneta {
  protected String modelo;
  protected String cor;
  protected float ponta;
  protected boolean tampada;

  
  // Este é o método construtor
  public Caneta(String m, String c, float p) {
    this.modelo = m;
    this.cor = c;
    this.ponta = p;
    this.tampar();
  }

  public String getModelo() {
    return this.modelo;  
  }
  public void setModelo(String m) {
    this.modelo = m; 
  }

  public String getCor() {
    return this.cor;
  }
  public void  setCor(String c) {
    this.cor = c;
  }

  public float getPonta(){
    return this.ponta;
  }
  public float setPonta(float p) {
    return this.ponta = p;
  }

  public void tampar() {
    this.tampada = true; 
  }
  public void destampar() {
    this.tampada = false;
  }

  public void status() {
    System.out.println("SOBRE A CANETA:");
    System.out.println("Modelo: "  + this.modelo);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Cor: " + this.cor);
    System.out.println("A caneta está tampada? " + this.tampada);
  }

}

