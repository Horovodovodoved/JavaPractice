package list;

import java.util.Scanner;

public interface SimpleDualLinkedListNode {
  SimpleDualLinkedListNode getPrev();
  String getID();
  SimpleDualLinkedListNode getNext();
  void setNext(SimpleDualLinkedListNode node);
  void setNext(Scanner scan);
  void setPrev(SimpleDualLinkedListNode node);
  void readAttributes(Scanner scan);
  void printAttributes();
}