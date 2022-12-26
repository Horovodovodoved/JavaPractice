package list;

import java.util.Scanner;

class FilmCharacter implements SimpleLinkedListNode {
  FilmCharacter next;
  String name;
  String description;
  String temper;
  boolean isMarried;
  
  FilmCharacter(Scanner scan) { readAttributes(scan); }
  
  @Override
  public String getID() { return name; }
  
  @Override
  public FilmCharacter getNext() { return next; }
  
  @Override
  public void setNext(SimpleLinkedListNode filmCharacter) { next = (FilmCharacter) filmCharacter; }
  
  @Override
  public void setNext(Scanner scan) { setNext(new FilmCharacter(scan)); }
  
  @Override
  public String toString() { return name + "\n" + description + "\n" + temper +
      "\n" + (isMarried ? " Женат." : "Не женат."); }
  
  @Override
  public void readAttributes(Scanner scan) {
    name = scan.nextLine();
    description = scan.nextLine();
    temper = scan.nextLine();
    isMarried = scan.next().equalsIgnoreCase("женат");
  }
  @Override
  public void printAttributes() { System.out.println(this); }
}