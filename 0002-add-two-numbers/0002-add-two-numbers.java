/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode cur = null;
        int sum=0,carry=0;
        while(l1!=null || l2!=null){ 
            int a = (l1==null)? 0 : l1.val;
            int b = (l2==null)? 0 : l2.val;
            sum = carry + a + b;
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            if(head==null){
                head = newNode;
                cur = head;
            }
            else{ 
                cur.next = newNode;
                cur = cur.next;
            }
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }if(carry>0){
        int a = (l1==null)? 0 : l1.val;
        int b = (l2==null)? 0 : l2.val;
        ListNode newNode = new ListNode(carry);
        cur.next = newNode;
        }
        return head;
    }
}