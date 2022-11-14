package list;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dossier implements SimpleLinkedList<FilmCharacter> {
  FilmCharacter zeroNode;
  
  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    FilmCharacter currNode = zeroNode;
    while (currNode.getNext() != null) {
      currNode = currNode.getNext();
      str.append(currNode.toString());
    }
    return str.toString();
  }
  
  @Override
  public void add(FilmCharacter filmCharacter) {
    filmCharacter.setNext(zeroNode.getNext());
    zeroNode.setNext(filmCharacter);
  }
  
  @Override
  public boolean remove(String name) {
    FilmCharacter prevNode = zeroNode;
    FilmCharacter currNode = zeroNode;
    while (currNode.getNext() != null) {
      currNode = currNode.getNext();
      if (currNode.name.equals(name)) {
        prevNode.setNext(currNode.getNext());
        return true;
      }
      prevNode = currNode;
    }
    return false;
  }
  
  @Override
  public boolean printNode(String name) {
    FilmCharacter currNode = zeroNode;
    while (currNode.getNext() != null) {
      currNode = currNode.getNext();
      if (currNode.name.equals(name)) {
        currNode.printAttributes();
        return true;
      }
    }
    return false;
  }
  
  @Override
  public void clear() { zeroNode.setNext(null); }
  
  @Override
  public boolean isEmpty() { return zeroNode.getNext() == null; }
  
  @Override
  public void printToFile(String filename) {
    try (FileWriter fw = new FileWriter(filename)) {
      fw.write(toString());
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
  
  @Override
  public void readFromFile(String filename) {
    try (FileReader fr = new FileReader(filename)) {
      Scanner fileScan = new Scanner(fr);
      FilmCharacter currNode = zeroNode;
      while (fileScan.hasNextLine()) {
        currNode.setNext(new FilmCharacter(fileScan));
        currNode = currNode.getNext();
      }
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
