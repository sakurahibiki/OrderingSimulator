package backEnd;

public class Tree<Key extends Comparable, Data> {
    class Node {
        public Key key;
        public Data data;
        public Node left;
        public Node right;
        
        public Node(Key key, Data data){
            this.key = key;
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    private Node root;
    
    public Tree() {
        root = null;
    }
    public void insert(Key key,Data data) {
        root = insert(key, data, root);
    }
    private Node insert(Key k, Data d, Node r){
       if (r == null) {
           r = new Node(k, d);
       }
       else {
           int ct = k.compareTo(r.key);
           
           if (ct == 0) r.data = d;
           if(ct < 0) r.left = insert(k,d,r.left);
           if(ct > 0) r.right = insert(k,d, r.right);
       }
       return r;
    }
    public boolean contains(Key key) {return (retrieve(key) != null);}
    
    public Data retrieve(Key key) {
        return retrieve(key, root);
    }
    
    private Data retrieve(Key K, Node r) {
        
        Data d = null;
        
        if(r != null) {
            int ct = K.compareTo(r.key);

            if (ct == 0)d = r.data;
            if(ct < 0) d= retrieve(K,r.left);
            if(ct > 0) d = retrieve(K, r.right);

            }
        return d;
    }
    public Key smallest(){
        return smallest(root);
    }
    
    private Key smallest(Node r) {
        
        Key k = null;
        
        if(r != null) {
            if (r.left == null) k = r.key;
            else k = smallest(r.left);
        }
        return k;
    }
    public Key largest(){
        return largest(root);
    }
    
    private Key largest(Node r) {
        
        Key k = null;
        
        if(r != null) {
            if (r.right == null) k = r.key;
            else k = largest(r.right);
        }
        return k;
    }
    public boolean isEmpty() {return root == null;}
    
    
    
}




