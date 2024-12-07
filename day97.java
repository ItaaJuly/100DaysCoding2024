Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i < n; i++) {
            boolean pri = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    pri = false;
                    break;
                }
            }
            if (pri) {
                System.out.print (i + " ");
            }
        }
                
                
    
