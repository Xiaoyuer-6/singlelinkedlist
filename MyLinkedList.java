class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public  class MyLinkedList {

    public Node head;//普通引用，目的是让head一直指向当前列表的头

    public void createLinked() {
        this.head = new Node(12);
        Node node2 = new Node(22);
        Node node3 = new Node(32);
        Node node4 = new Node(42);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
    }

    public void display() {//打印一个链表
        Node cur = this.head;
        while (cur != null) {
            System.out.print (cur.val +" ");
            cur = cur.next;
        }
        System.out.println();
    }
   public  Node findLastNode() {//找到最后一个结点
       Node cur = this.head;
       while (cur.next != null) {
           cur = cur.next;
       }
       return cur;
   }
    public  Node findLastTwoNode() {//找到倒数第二个结点
        if (this.head == null)
            System.out.println("链表为空");
        if (this.head.next == null)
            System.out.println("链表中有一个结点");
        Node cur = this.head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }
    public  Node findN(int n) {
        if (this.head == null){
            System.out.println("链表为空");
            return null;
        }
        if (n <= 0){
            System.out.println("n的值不合理");
            return null;
        }
        if (n >size()){
            System.out.println("n太大了");
            return  null;
        }
        Node cur = this.head;
         int count =1;
            while (count != n ) {
            cur = cur.next;
            count ++;
        }
        return cur;
    }
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count =0;
        while (cur != null ) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur= this.head;
        while (cur!= null){
            if (cur.val == key ){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //头插法
    public void addFirst(int data) {
        Node node= new Node(data);//Node一个新的节点；
        if (this.head ==null){
           this.head= node;//链表为空，链表的头就等于要插入的节点；
        }else {
            node.next = this.head;//①（先绑定后面的）新节点的next=原来链表的head；
            this.head = node;//②链表的头等于要插入的节点；
        }
    }
    //尾插法
    public void addLast(int data){
        Node node= new Node(data);//Node一个新的节点；
        if (this.head == null){
            this.head =node;//节点为空，链表的头就是要插入的节点；
        }else{
            Node cur = this.head;
              while (cur.next!=null){
                  cur=cur.next;//遍历找到最后一个节点；
              }
              cur.next=node;//最后一个节点的next等于要插入的节点；
        }
    }
    public Node moveYiIndex (int index){//找到要插入节点的前一个
        Node cur = this.head;
        int count =0;
        while (count != index-1){
            cur= cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
   public void addIndex(int index,int data) {
       if (index < 0 || index > size()) {//不合法现象；
           System.out.println("index不合理");
           return;
       }
       if (index == 0) {//头插法
           addFirst(data);
           return;
       }
       if (index == size()){ //尾插法
           addLast(data);
           return;
       }
       Node cur =moveYiIndex(index);//调用moveYiIndex函数，找到index的前一个节点cur；
       Node node = new Node(data);//定义一个新的节点；
       node.next= cur.next;//插入节点的next等于原始cur的next；
       cur.next = node;//cur的next变成了node；
   }
    public Node searchCur(int key){//找到要删除节点的前驱
        Node cur = this.head;
        while (cur.next != null){
            if (cur.next.val == key){//找出key的节点的前一个
                return cur;
            }
            cur = cur.next;

        }
        return null;
    }
 //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
            if (this.head.val == key){
                this.head = this.head.next;
                return;
            }
        Node cur = searchCur(key);//调用searchCur，找出删除节点的前驱cur
        if (cur == null){
            System.out.println("未找到要删除的节点");
        }else{
            Node del = cur.next;//定义要删除的节点为key;
            cur.next =del.next;//让cur的next等于删除节点的next;
        }
    }
 //删除所有值为key的节点
     public void removeAllKey(int key){
        Node prev = this.head;//定义一个prev指向链表的头；
        Node cur = prev.next;//定义一个cur指向prev的next；
        while (cur != null){//遍历完条件；
            if (cur.val == key){//找到要删除的节点；
                prev.next = cur.next;//把该节点删掉；
            }else {
                prev = cur;//未找到
            }
            cur = cur.next;//cur继续往后走；
        }
        if (this.head.val == key){//头节点就是要删除的节点
            this.head = this.head.next;//删除头，链表的头直接是head的next；
        }
    }

    public void clear(){

    }

}
    /*测试
    public static void main(String[] args) {
        Node node = new Node(67);
        System.out.println(node.val);
        System.out.println(node.next);

    }
     */