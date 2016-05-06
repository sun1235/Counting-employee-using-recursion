/**
 * Created by gravitational on 14/04/16.
 */
public class Linkedlist {
    Node left;
    Node right;
    Node root;

    public void insert(String data) {
        root = insert(root, data);
    }

    private Node insert(Node node, String data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (node.right != null) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public void print(String search) {
        int counter = 0;
        System.out.println("There are " + print(root, search, counter) + " people work in " + search);

    }

    private int print(Node root, String search, int counter) {
        if (root == null) {
            return counter;
        }

        if (root.name.equals(search)) {
            counter++;
            System.out.println(root.right.name);
        }
        counter = print(root.left, search, counter);
        counter = print(root.right, search, counter);

        return counter;
    }

//#######################Does Not Work #############################3333
//    public void Sort() {
////        int counter = 0;
////        System.out.println("There are " + print(root, search, counter) + " people work in " + search);
//        Sort(root);
//
//    }
//
//    private void Sort (Node root) {
//        String nameTemp;
//        String departmentTemp;
//        if (root == null) {
//            return;
//        }
//
//        if (root.right.name.toString().compareTo(root.left.right.name.toString()) > 0) {
//            nameTemp = root.right.name.toString();
//            root.right.name = root.left.right.name;
//            root.left.right.name = nameTemp;
//
//            departmentTemp = root.name.toString();
//            root.name = root.left.name;
//            root.left.name = departmentTemp;
//
//            System.out.println("Name: " + root.right.name + "\t \t Department: " + root.name);
//
//            Sort(root.left);
//
//
//        }
//
////        if (root.right != null) {
////            System.out.println("Name: " + root.right.name + "\t \t Department: " + root.name);
////        }
//        Sort(root.left);
////        Sort(root.right);
//    }
}


