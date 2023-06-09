import java.util.Scanner;

public class 从单向链表中删除指定值的节点 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int head = scanner.nextInt();
        Node root = new Node(null, head);
        Node left = root;
        while (scanner.hasNextInt()){
            int i = scanner.nextInt();
            Node node = new Node(null, head);
            find(root, node,left);
            left = node;
        }
    }

    public static void find(Node root , Node c,   Node left){
         Node next = root;
         while (next.next != null){
             if (next.value == c.value) {
                 return;
             }

             // 处理完赋值
             next = next.next;
         }
    }

    public static class Node{

        Node next;
        Object value;

        public Node(Node next, Object value) {
            this.next = next;
            this.value = value;
        }
    }
}
