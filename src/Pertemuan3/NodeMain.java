package Pertemuan3;

public class NodeMain {
    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(5);

        node1.setNext(node2);
        node2.setNext(node3);

        Node p = node1;
        while (p != null) {
            System.out.println(p.getNilai());
            p = p.getNext();
        }
    }
}
