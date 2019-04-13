package ch11;

/**
 * 二叉树
 */
public class Tree {
    //根节点
    public Node root;

    /**
     * 插入一个节点
     */
    public void insert(long value){
        //封装节点
        Node newNode = new Node(value);
        //引用当前节点
        Node current = root;
        //引用父节点
        Node parent;
        //如果 root为null，也就是第一个插入的时候
        if(root == null){
            root = newNode;
            return;
        }
        else{
            while (true){
                //父节点指向当前节点
                parent = current;
                //如果单亲啊指向的节点数据比插入的要大，则向左走
                if(current.data > value){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    /**
     * 查找一个节点
     */
    public Node find(long value){
        //引用当前节点，从根节点开始
        Node current = root;
        //循环，只要查找值不等于当前节点的数据项
        while(current.data != value){
            //进行比较，比较查找值和当前节点的大小
            if(current.data > value){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }
            if(current == null){
                return null;
            }
        }
        return current;
    }


    /**
     * 修改一个节点
     */


    /**
     * 删除一个节点
     */
}
