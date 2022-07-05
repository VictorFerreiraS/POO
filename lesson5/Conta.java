package lesson5;

public class Conta {
  public float numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  // constructor
  public void Conta() {
    setSaldo(0);
    setStatus(false);
  }

  // getters
  public float getNumConta() {
    return numConta;
  }

  public String getTipo() {
    return tipo;
  }

  public String getDono() {
    return dono;
  }

  public float getSaldo() {
    return saldo;
  }

  public boolean isStatus() {
    return status;
  }

  // setters
  public void setNumConta(float numConta) {
    this.numConta = numConta;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public void status() {
    if (isStatus()) {
         System.out.println("Numero da conta: " + getNumConta());
    System.out.println("Olá " + getDono());
    System.out.println("Saldo: " + getSaldo());
    System.out.println("Tipo: " + getTipo());
    System.out.println("Status: " + isStatus()); 
    } else {
      System.out.println("conta desativada");
      
    }

  }

  public void abrirConta(String tipo, String dono) {
    setNumConta(getNumConta() + 1);
    setTipo(tipo);
    setDono(dono);
    setStatus(true);

    if (getTipo() == "cp") {
      setSaldo(50);
    } else {
      setSaldo(150);
    }
  }

  public void fecharConta() {
    if (getSaldo() == 0) {
      setTipo("");
      setDono("");
      setSaldo(0);
      setStatus(false);
      System.out.println("Conta fechada com sucesso");
    } else {
      System.out.println("Não é possivel fechar a conta com saldo");
    }
  }

  public void depositar(float quantidade) {
    if (isStatus()) {
      
      setSaldo(getSaldo() + quantidade);
      System.out.println("Foi depositado " + quantidade);
      System.out.println("Saldo atual: " + getSaldo());
    } else {
      System.out.println("conta desativada");
    }
  }

  public void sacar(float quantidade) {
    if (quantidade < saldo && isStatus()) {
      setSaldo(this.saldo - quantidade);
    } else {
      System.out.println("Saldo insuficiente ou conta desativada");
    }

  }

  public void pagarMensalidade() {
    if (this.tipo == "cp") {
      setSaldo(getSaldo() - 12);
    } else {
      setSaldo(getSaldo() - 20);
    }
  }

}
