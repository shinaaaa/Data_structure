import java.util.*;

public class ExOpenHashing<K, V> {
  public static void main(String[] args) {
    class Node<K,V> {
      private K key;
      private V data;
      private Node<K,V> next;
    }
    Node(K key, V data, Node<K,V>, next) {
      this.key = key;
      this.data = data;
      this.next = next;
    }
  }
}