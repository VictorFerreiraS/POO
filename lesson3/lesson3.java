package lesson3;
/**
 * lesson3
 */
public class lesson3 {


  public static void main(String[] args) {
    Caneta c1 =  new Caneta();
    c1.cor = "Azul";
    c1.modelo = "Bic Cristal";
    // c1.ponta = 0.5f;
    c1.carga = 100;
    // c1.tampada = true;

    c1.status();
    c1.rabiscar();
    c1.destampar();
    
}
}