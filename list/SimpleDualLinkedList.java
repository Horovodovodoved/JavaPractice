package list;

public interface SimpleDualLinkedList<Node> {
  void addLast(Node node);
  void addFirst(Node node);
  boolean addAfter(Node node, String id);
  boolean remove(String name);
  boolean printNode(String name);
  void clear();
  boolean isEmpty();
  void writeToFile(String filename);
  void readFromFile(String filename);
}