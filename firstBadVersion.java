    public int firstBadVersion(int n) {
        if(n==0) return 0;

        return find(1,n);
    }


    public int find(int start, int end) {
    
        if(start>=end)  return start;
        int mid = start+(end-start)/2;
    
        if(isBadVersion(mid)) {
            return find(start,mid);
        } else {
            return find(mid+1,end);
        }
    }