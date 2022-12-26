package list;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dossier2 implements SimpleDualLinkedList<FilmCharacter2> {
  FilmCharacter2 zeroNode = new FilmCharacter2(new Scanner("-\n-\n-\n-\n"));
  
  Dossier2() {
    zeroNode.setNext(zeroNode);
    zeroNode.setPrev(zeroNode);
  }
  
  @Override
  public void addLast(FilmCharacter2 node) {
    node.setNext(zeroNode);
    node.setPrev(zeroNode.getPrev());
    zeroNode.setPrev(node);
    node.getPrev().setNext(node);
  }
  
  @Override
  public void addFirst(FilmCharacter2 node) {
    node.setNext(zeroNode.getNext());
    node.setPrev(zeroNode);
    zeroNode.setNext(node);
    node.getNext().setPrev(node);
  }
  
  private FilmCharacter2 getById(String id) {
    FilmCharacter2 currNode = zeroNode;
    while (currNode.getNext() != zeroNode) {
      currNode = currNode.getNext();
      if (currNode.getID().equals(id)) {
        return currNode;
      }
    }
    return null;
  }
  
  @Override
  public boolean addAfter(FilmCharacter2 node_to_add,
                          String previous_node_id) {
    FilmCharacter2 previous_node = getById(previous_node_id);
    if (previous_node == null) {
      return false;
    }
    node_to_add.setNext(previous_node.getNext());
    previous_node.setNext(node_to_add);
    node_to_add.setPrev(previous_node);
    node_to_add.getNext().setPrev(node_to_add);
    return true;
  }
  
  @Override
  public boolean remove(String id) {
    FilmCharacter2 node_to_remove = getById(id);
    if (node_to_remove == null) {
      return false;
    }
    node_to_remove.getPrev().setNext(node_to_remove.getNext());
    node_to_remove.getNext().setPrev(node_to_remove.getPrev());
    return true;
  }
  
  @Override
  public boolean printNode(String id) {
    FilmCharacter2 node = getById(id);
    if (node != null) {
      node.printAttributes();
      return true;
    }
    return false;
  }
  
  @Override
  public void clear() {
    zeroNode.setNext(zeroNode);
    zeroNode.setPrev(zeroNode);
  }
  
  @Override
  public boolean isEmpty() { return zeroNode.getNext() == zeroNode; }
  
  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    FilmCharacter2 currNode = zeroNode;
    while (currNode.getNext() != zeroNode) {
      currNode = currNode.getNext();
      str.append(currNode.toString());
      if (currNode.getNext() != zeroNode) {
        str.append("\n");
      }
    }
    return str.toString();
  }
  
  @Override
  public void writeToFile(String filename) {
    try (FileWriter fw = new FileWriter(filename)) {
      fw.write(this.toString());
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
  
  @Override
  public void readFromFile(String filename) {
    try (FileReader fr = new FileReader(filename)) {
      Scanner fileScan = new Scanner(fr);
      FilmCharacter2 currNode = zeroNode;
      while (fileScan.hasNextLine()) {
        currNode.setNext(fileScan);
        currNode.getNext().setPrev(currNode);
        currNode = currNode.getNext();
      }
      currNode.setNext(zeroNode);
      zeroNode.setPrev(currNode);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}