public void deleteNode(ListNode node) {
        if(node.next == null){
            return;
        }
        ListNode current = node;
        ListNode prev = null;
        while(current.next != null){
            current.val = current.next.val;
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }