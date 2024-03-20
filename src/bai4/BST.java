package bai4;

public class BST {
     Node root;
    // duyệt đệ quy
    public void readTree(Node current) {
        // duyệt khi node đó không phải là null
        if (current!=null){
            // duyệt node nếu node đấy là node lá
            if (current.left==null && current.right==null){
                // trả về giá trị của node
                System.out.println(current.value);
            }
            if (current.left!=null || current.right!=null){
                // đệ quy cây con trái
                readTree(current.left);
                //đệ quy cây con phải
                readTree(current.right);
                // trả về giá trị của node
                System.out.println(current.value);
            }
        }
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
