class DoubleOps {
    public static void main(String[] args){
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double da = a + 0.0;
        double db = b + 0.0;
        System.out.println("The absolute value of a is: " + Math.abs(a));
        System.out.println("The absolute value of b is: " + Math.abs(b));
        System.out.println("The answer to a^b is: " + Math.pow(da, db));
        System.out.println("The Square root of b + an random number is: " + (Math.sqrt(b) + Math.random() + 1));

        
    }
}