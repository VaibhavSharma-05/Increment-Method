import temp.First;

         int n = 5; // 0101
         int pos = 2;
         int bitMask = 1<<pos;
         int notBitMask = ~(bitMask);

        //operation 1
         int newNumber = notBitMask & n;
        System.out.print(newNumber);

    Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.print(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
} 