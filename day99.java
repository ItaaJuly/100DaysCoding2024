Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        double angka = in.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char ope = in.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka2 = in.nextDouble();
        double hasil = 0;
        boolean valid = true;
        if (ope == '+') {
            hasil = angka + angka2;
        }else if (ope == '-') {
            hasil = angka - angka2;
        }else if (ope == '*') {
            hasil = angka * angka2;
        }else if (ope == '/') {
            hasil = angka / angka2;
            if (angka2 != 0) {
                hasil = angka / angka2;
            }else{
                System.out.println("Eror: pembagian dengan nol tidak diperbolehkan.");
                valid = false;
            }
            if (valid) {
                System.out.println("Hasil: " + hasil);
            }
        }
    }
    

