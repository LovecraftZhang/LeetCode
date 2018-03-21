public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        // if there is a cycle, the while loop will not end.
        // since runner is faster than walker, it will eventually meet walker
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
        if(walker==runner) return true;
        }
        return false;
    }