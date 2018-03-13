    public int climbStairs(int n) {
        if (n < 0)  return 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        HashMap<Integer,Integer> store = new HashMap<Integer, Integer>();
        store.put(0, 0);
        store.put(1, 1);
        store.put(2, 2);
        return search(store, n, 3);
    } 
    
    public int search(HashMap<Integer,Integer> store, int target, int current){
        int temp = store.get(current - 1) + store.get(current - 2);
        store.put(current, temp);
        if (current == target) {
            return store.get(target);
        } else {
            return search(store, target, current + 1);
        }
    }