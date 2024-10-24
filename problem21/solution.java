package problem21;

public class solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;

        if (list1 == null) {
            return list2;
        } else  if (list2 == null) {
            return list1;
        }

        if(list1.val <= list2.val){
            result = list1;
            result.next = mergeTwoLists(list1.next, list2);
            System.out.println(list1.next.val);
        } else {
            result = list2;
            result.next = mergeTwoLists(list1, list2.next);
            System.out.println(list1.next.val);
        }    
        return result;
    }   
}
