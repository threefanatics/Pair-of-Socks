static int sockMerchant(int n, int[] ar) {
        
        int count[] = new int[100];
        int colors[] = new int[100];

        for(int i=0;i<100;i++){
            count[i] = colors[i] = 0;
        }

        for(int i=0;i< n;i++){
            count[ar[i]%100] += 1;
        }

        int sum = 0;
        for(int i=0;i<100;i++){
            sum += count[i]/2;
        }

        return sum;
    }
