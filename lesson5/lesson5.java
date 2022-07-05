package lesson5;

public class lesson5 {
 
  public static void main(String[] args) {
    Conta contaJubileu = new Conta();
    contaJubileu.sacar(150.0f);
    contaJubileu.fecharConta();
    contaJubileu.depositar(100);
    contaJubileu.status();
  }
}
 