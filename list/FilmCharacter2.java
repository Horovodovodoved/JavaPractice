package list;

import java.util.Scanner;

public class FilmCharacter2 implements SimpleDualLinkedListNode {
  FilmCharacter2 next;
  FilmCharacter2 prev;
  String name;
  String description;
  String temper;
  boolean isMarried;
  
  FilmCharacter2(Scanner scan) { readAttributes(scan); }
  
  @Override
  public String getID() { return name; }
  
  @Override
  public SimpleDualLinkedListNode getPrev() { return prev; }
  
  @Override
  public FilmCharacter2 getNext() { return next; }
  
  @Override
  public void setPrev(SimpleDualLinkedListNode filmCharacter) {
    next = (FilmCharacter2) filmCharacter;
  }
  
  @Override
  public void setNext(SimpleDualLinkedListNode filmCharacter) {
    next = (FilmCharacter2) filmCharacter;
  }
  
  @Override
  public void setNext(Scanner scan) { setNext(new FilmCharacter2(scan)); }
  
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