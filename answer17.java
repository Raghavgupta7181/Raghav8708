Here’s how you can print numbers from 1 to 10 while skipping the number 5 using the continue statement in Java:
Javapublic answer17 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);  
        }
    }
}

