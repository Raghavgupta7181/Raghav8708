Here is a simple Java program that prints numbers from 1 to 10 but stops at 7 using the break statement:
Javapublic class answer16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; 
            }
            System.out.println(i);
        }
    }
}