Scanner in = new Scanner(System.in);
        System.out.print("Jumlah baris: ");
        int a = in.nextInt();
        System.out.print("Jumlah kolom: ");
        int b = in.nextInt();
        int[][] arr = new int[a][b]; //Membuat array 20 dengan ukuran sesuai input
        for (int i = 0; i < a; i++) { //Mengisi elemen array
            System.out.print("Input elemen baris ke " + (i + 1) + ": ");
            for (int j = 0; j < b; j++) {
               arr[i][j] = in.nextInt();
            }
        }
                int total = a * b; //Variabel untuk perhitungan
                int max  = arr[0][0]; //Jumlah total elemen dalam array
                int sum = 0; // Elemem terbesar
                
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        sum += arr[i][j];
                        if (arr[i][j] > max) {
                            max = arr[i][j];
                            System.out.println("-------------------------------------------------------------");
                        }
                        }
                    }
                System.out.println("Jumlah elemen adalah array: " + total);
                System.out.println("Elemen terbesar: " + max);
                System.out.println("Total penjumlahan semua elemen: " + sum);
        }
                
                
    
