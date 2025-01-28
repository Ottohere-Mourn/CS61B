package Tests.lists;

public class SLList<Pineapple> {
    int size;
    private class IntNode {
        public Pineapple item;
        public IntNode next;
        public IntNode(Pineapple i,IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private IntNode first;
    public SLList(Pineapple x){
        sentinel = new IntNode(null,null);
        sentinel.next = new IntNode(x,null);
        first = sentinel.next;
        size=1;
    }
    public SLList(){
        sentinel = new IntNode(null,null);
        sentinel.next = first;
        size=0;
    }
    public  void addFirst(Pineapple x){
        sentinel.next = new IntNode(x,sentinel.next);
        size+=1;
    }
    public void addLast(Pineapple x){
        IntNode p =sentinel.next;
        while(p.next!=null){p=p.next;}
        p.next=new IntNode(x,null);
    }
    public int size(){
        return size(sentinel);
    }
    private int size(IntNode p){
        if(p==null){return  0;}
        else if(p.next == null){return 0;}
        return 1+size(p.next);
    }

    public Pineapple getFirst(){
        return this.sentinel.next.item;
    }

    public static void main(String[] args){
        SLList<String> L = new SLList<String>("Anno!");
        L.addFirst("Soyo!");
        System.out.println("The first node is");
        System.out.println(L.getFirst());
        System.out.println("The size is");
        System.out.println(L.size());

        SLList<Integer> L2 = new SLList<>();
        L2.addFirst(5);

    }
}
