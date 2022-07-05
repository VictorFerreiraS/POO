package lesson4;

public class lesson4  {
  public static void main(String[] args) {
    Caneta c1 = new Caneta("bic", "amarelo", 0.3f);
    c1.status();
    System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
  }
}
