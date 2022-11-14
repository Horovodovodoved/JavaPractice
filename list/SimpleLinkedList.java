package list;

public interface SimpleLinkedList<Node> {
  void add(Node node);
  boolean remove(String name);
  boolean printNode(String name);
  void clear();
  boolean isEmpty();
  void printToFile(String filename);
  void readFromFile(String filename);
}
