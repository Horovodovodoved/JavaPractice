package list;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// TODO: 4 methods: addFirst(elem), addLast(elem)
// TodO: #22, #23, #24, List_2
public class Dossier implements SimpleLinkedList<SimpleLinkedListNode> {
    SimpleLinkedListNode zeroNode;

    @Override
    public SimpleLinkedListNode getById(String id) {
        SimpleLinkedListNode currNode = zeroNode;
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
            if (currNode.getID().equals(id)) {
                return currNode;
            }
        }
        return currNode;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        SimpleLinkedListNode currNode = zeroNode;
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
            str.append(currNode.toString());
        }
        return str.toString();
    }

    @Override
    public void add(SimpleLinkedListNode node) {
        node.setNext(zeroNode.getNext());
        zeroNode.setNext(node);
    }

    @Override
    public boolean addAfter(SimpleLinkedListNode node_to_add, String previous_node_id) {
        SimpleLinkedListNode previous_node = getById(previous_node_id);
        if (previous_node == null) {
            return false;
        }
        node_to_add.setNext(previous_node.getNext());
        previous_node.setNext(node_to_add);
        return true;
    }

    @Override
    public boolean remove(String id) {
        SimpleLinkedListNode prevNode = zeroNode;
        SimpleLinkedListNode currNode = zeroNode;
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
            if (currNode.getID().equals(id)) {
                prevNode.setNext(currNode.getNext());
                return true;
            }
            prevNode = currNode;
        }
        return false;
    }

    @Override
    public boolean printNode(String id) {
        SimpleLinkedListNode node = getById(id);
        if (node != null) {
            node.printAttributes();
            return true;
        }
        return false;
    }

    @Override
    public void clear() { zeroNode.setNext((SimpleLinkedListNode) null); }

    @Override
    public boolean isEmpty() { return zeroNode.getNext() == null; }

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
            SimpleLinkedListNode currNode = zeroNode;
            while (fileScan.hasNextLine()) {
                currNode.setNext(fileScan);
                currNode = currNode.getNext();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
