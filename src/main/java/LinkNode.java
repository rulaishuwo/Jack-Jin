public class LinkNode {

    public int data;

    public  LinkNode next;

    public LinkNode(int value){
        this.data=value;
    }

    public static LinkNode createLinkList(int[] array,int length){
        if(array==null||length<1){
            return null;
        }
        LinkNode head=new LinkNode(array[0]);
        LinkNode tail=head;
        int len=array.length>length?length:array.length;
        for (int i=1;i<len;i++){
                int temp=array[i];
                LinkNode node=new LinkNode(temp);
                tail.next=node;
                tail=node;
        }
        return head;
    }

    public static LinkNode reverseLinkList(LinkNode head){
        if(head==null||head.next==null){
            return head;
        }
        LinkNode prev=null;
        LinkNode curr=head;
        while(curr!=null){
            LinkNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }

    public static void destoryLinkList(LinkNode head){
                if(head==null){
                    return;
                }
                while(head!=null){
                    LinkNode nextNode=head.next;
                    head=null;
                    head=nextNode;
                }
    }

}
