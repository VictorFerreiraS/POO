package lesson7;

public class UltraEmogiCombat {
  public static void main(String[] args) {
    Lutador l[] = new Lutador[6];
    l[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
    l[1]= new Lutador("Putstcript", "Brasil", 29, 1.68f, 57.8f, 14, 2 , 3);
    l[2] = new Lutador("SnapShadow", "EUA", 35, 1.65f, 81.6f, 13, 0,2);
    l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0 , 2);
    l[4] = new Lutador("UFOCobol" , "brasil", 37, 1.70f, 119.3f, 5, 4, 3);
    l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

    l[3].status();

  }
}
