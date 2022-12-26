package list;

import java.util.Scanner;

public class Tester {
  public static void main(String[] args) {
    Dossier dossier = new Dossier();
    String livesey_str = "Доктор Ливси\nОчень хороший и весёлый человек." +
        "\nОбщительный\nНе женат\n";
    FilmCharacter livesey = new FilmCharacter(new Scanner(livesey_str));
    String silver_str = "Джон Сильвер\nСамый страшный пират, но притворяется" +
        " добрым, что, впрочем, ему удаётся.\nСкрытный\nНе женат\n";
    FilmCharacter silver = new FilmCharacter(new Scanner((silver_str)));
    
    dossier.add(livesey);
    dossier.add(silver);
    dossier.printNode("Доктор Ливси");
    dossier.writeToFile("file");
    
    Dossier2 dossier2 = new Dossier2();
    dossier2.readFromFile("file");
    dossier2.printNode("Джон Сильвер");
  }
}