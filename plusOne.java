public int[] plusOne(int[] digits) {
        int carry = 0;
        int n = digits.length - 1; //largest index
        int pnt = n;
        
        do{
            
            if (digits[pnt] < 9){
                digits[pnt]++;
                pnt--;
                if (carry == 1){
                    carry = 0;
                }
            } else {
                digits[pnt] = 0;
                if (pnt == 0){
                    int[] newNumber = new int [n+2];
                    for(int i = 1; i < n+1; i++){
                        newNumber[i] = digits[i];
                    }
                    newNumber[0] = 1;
                    return newNumber;
                } else {
                    pnt--;
                }
                carry = 1;
            }
            
        } while (carry == 1);
        
        return digits;
    }