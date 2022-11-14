package list;

import java.util.Scanner;

class FilmCharacter {
  FilmCharacter next;
  String name;
  String description;
  String temper;
  boolean isMarried;
  
  FilmCharacter() {}
  
  FilmCharacter(Scanner scan) { readAttributes(scan); }
  
  FilmCharacter getNext() { return next; }
  
  void setNext(FilmCharacter filmCharacter) { next = filmCharacter; }
  
  @Override
  public String toString() { return name + "\n" + description + "\n" + temper +
      "\n" + (isMarried ? " Женат." : "Не женат."); }
  
  void readAttributes(Scanner scan) {
    name = scan.nextLine();
    description = scan.nextLine();
    temper = scan.nextLine();
    isMarried = scan.next().equalsIgnoreCase("женат");
  }
  
  void printAttributes() { System.out.println(this); }
}
