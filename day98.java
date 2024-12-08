int x = 10;
        int y = 20;
        int total = 0;
        for (int i = x; i <= y; i++) {
            if (i %2 == 0) {
                total += i;
            }
        }
        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
    
