package list;

import java.util.Scanner;

public interface SimpleLinkedListNode {
    String getID();
    SimpleLinkedListNode getNext();
    void setNext(SimpleLinkedListNode node);
    void setNext(Scanner scan);

    void readAttributes(Scanner scan);

    void printAttributes();
}
