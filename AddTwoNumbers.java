import java.util.ArrayList;

class AddTwoNumbers {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}



	public static void main(String[] args) {
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

		ListNode l1 = new ListNode(9);

		Solution instance = new Solution();
		ListNode result = instance.addTwoNumbers(l1, l2);
		ListNode temp = result;
		
		// check
		while (temp !=null) {
			System.out.print(temp.val);
			temp=temp.next;
		} 

	}

	public static class Solution {


		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			long sum1 = helper(l1);
			long sum2 = helper(l2);
			long sum = sum1 + sum2;
			long temp = sum;
			
			ArrayList<Long> resultArray = new ArrayList<Long>();
			
			if(temp != 0){
			while (temp != 0){
			resultArray.add(temp%10);
				temp=temp/10;
			}
			return makeListNode(resultArray);
			} else {
				return new ListNode(0);
			}
		}

		public long helper(ListNode l) {
			long result = 0;
			int n = 0;
			while (l != null) {
				result+=l.val*((long)Math.pow(10, n));
				l=l.next;
				n++;
			}
			return result;
		}

		public ListNode makeListNode(ArrayList<Long> array){
			if (array.size() == 0) {return null;}
			
			
			ListNode result = new ListNode(array.get(0).intValue());
			ListNode temp_parent = result;

			for (int n = 1; n<array.size(); n++){
				ListNode temp = new ListNode(array.get(n).intValue());
				temp_parent.next = temp;
				temp_parent = temp;
			}

			return result;
		}
	}


}
