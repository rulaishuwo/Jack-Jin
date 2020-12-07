public class Main {


    public static void main(String[] args) {

        int[] array=new int[]{1,2,3,4,5};
        LinkNode head=LinkNode.createLinkList(array,3);
        LinkNode tail=LinkNode.reverseLinkList(head);
        LinkNode.destoryLinkList(tail);


    }
}
