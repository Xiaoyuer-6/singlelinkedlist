import java.util.Arrays;
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(17);
        myLinkedList.addLast(29);
        myLinkedList.addLast(35);
        myLinkedList.display();
        System.out.println("================");
        myLinkedList.removeAllKey(29);
        myLinkedList.display();
    }
    public static void main5(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(17);
        myLinkedList.addLast(29);
        myLinkedList.addLast(35);
        myLinkedList.display();
        System.out.println("================");
        myLinkedList.remove(33);
        myLinkedList.display();
        System.out.println("================");
        myLinkedList.remove(17);
        myLinkedList.display();
        System.out.println("================");
        myLinkedList.remove(35);
        myLinkedList.display();
        System.out.println("================");

    }
    public static void main4(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(17);
        myLinkedList.addLast(29);
        myLinkedList.addLast(35);
        myLinkedList.display();
        System.out.println("================");
        myLinkedList.addIndex(0,18);
        myLinkedList.display();
        System.out.println("================");
        myLinkedList.addIndex(3,15);
        myLinkedList.display();
        System.out.println("================");
        myLinkedList.addIndex(2,22);
        myLinkedList.display();
        System.out.println("=================");
        myLinkedList.addIndex(9,18);

    }
    public static void main3(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(15);
        myLinkedList.addFirst(27);
        myLinkedList.display();
    }
   public static void main2(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.createLinked();
    myLinkedList.display();
    System.out.println("===================");
    int n=4;
    Node ret = myLinkedList.findN(n);
    System.out.println("第" +n+ "个结点是" + ret.val);
    System.out.println("===================");
    System.out.println(myLinkedList.size());
    System.out.println("===================");
    System.out.println(myLinkedList.contains(32));
    System.out.println("===================");
    myLinkedList.addFirst(15);
    myLinkedList.display();
  }






  public static void main1(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.createLinked();
    myLinkedList.display();
    Node ret = myLinkedList.findLastNode();
    System.out.println(ret.val);
  }
    /*
    数组的冒泡排序
     */
    /*
      public static void main(String[] args) {
          int[] arr = {3, 8, 6, 5};
          bubbleSort(arr);System.out.println(myLinkedList.size());
          System.out.println(Arrays.toString(arr));
      }
      public static void bubbleSort(int[] arr) {
          for (int bound = 0; bound < arr.length; bound++) {
              for (int cur = arr.length - 1; cur > bound; cur--) {
                  if (arr[cur - 1] > arr[cur]) {
                      int tmp = arr[cur - 1];
                      arr[cur - 1] = arr[cur];
                      arr[cur] = tmp;
                  }
              }
          }
      }
    /*
    判断数组是否有序
     */
    /*
      public static boolean isSorted(int[] arr) {
          for (int i = 0; i < arr.length - 1; i++) {
              if (arr[i] > arr[i + 1]) {
                  return false;
              }
          }return true;
      }
      public static void main(String[] args) {
          int[] arr = {1,4,7,10,9,6};
          System.out.println(isSorted(arr));
      }
  */
  }

