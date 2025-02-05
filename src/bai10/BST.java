package bai10;

public class BST {
     Node root;
// tìm kiếm đệ quy
    public boolean searchTree(int value) {
        Node current = root;
        boolean flag = false;
        // lặp lại cho đến khi tìm thấy giá trị hoặc node hiện tại là null
        while (true) {
            if (value < current.value) {
                current = current.left;
            }
            if (value > current.value) {
                current = current.right;
            }
            if (current == null) {
                flag = false;
                break;
            } else if (value == current.value) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    // thêm mới đệ qui
    private Node addRecursive(Node current, int value) {
        if (current == null) { // node gốc
            return new Node(value); // tr về node về thêm mơi
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        this.root = addRecursive(root, value);
    }
}
