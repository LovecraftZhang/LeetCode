import java.util.ArrayList;

class AddTwoNumbers {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}



	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(1);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(1);

		Solution instance = new Solution();
		instance.addTwoNumbers(l1, l2);

	}

	public static class Solution {


		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			int sum1 = helper(l1);
			int sum2 = helper(l2);
			int sum = sum1 + sum2;
			int temp = sum;
			ArrayList<Integer> resultArray = new ArrayList<Integer>();

			while (temp != 0){
				resultArray.add(temp%10);
			}
			return makeListNode(resultArray);
		}

		public int helper(ListNode l) {
			int result = 0;
			int n = 1;
			while (l != null) {
				result+=l.val*((int)Math.pow(10, n));
				l=l.next;
				n++;
			}
			return result;
		}

		public ListNode makeListNode(ArrayList<Integer> array){
			if (array.size() == 0) {return null;}

			ListNode result = new ListNode(array.get(0));
			ListNode temp_parent = result;

			for (int n = 1; n<array.size(); n++){
				ListNode temp = new ListNode(array.get(n));
				temp_parent.next = temp;
				temp_parent = temp;
			}

			return result;
		}
	}


}
