public int myAtoi(String str) {
        int sign = 1, base = 0, i = 0, INT_MAX = 2147483647;
        char[] str_c = str.toCharArray();
        if (str_c.length == 0) return 0;
        
        // check
        while (str_c[i] == ' '&&i < str_c.length) { i++; }
        if (str_c[i] == '-') {
            sign = -1;
            i++;
        } else if (str_c[i] == '+'){
            sign = 1;
            i++;
        }
        
        while (i < str_c.length && str_c[i] >= '0' && str_c[i] <= '9') {
            if (base >  INT_MAX / 10 || (base == INT_MAX / 10 && str_c[i] - '0' > 7)) {
                if (sign == 1) return INT_MAX;
                else return -1-INT_MAX;
            }
            base  = 10 * base + (str_c[i++] - '0'); // str_c[i] shift unicode then move to right
            
        }
        return base * sign;
    }