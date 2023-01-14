// good
public class Quadratic {
  public static void quad(int a, int b, int c){
    double disc = b * b - 4 * a * c;
// if the discriminant is less that 0 
    if (disc < 0 ){
      System.out.println("No real roots");
// if the discriminant == 0 then there is one real root
    } else if (disc == 0){
      System.out.println("one real root");
    } else {
// 2 real roots
        double root1 = (-b + Math.sqrt(disc)) / (2 * a);
        double root2 = (-b - Math.sqrt(disc)) / (2 * a);
        System.out.println(root1);
        System.out.println(root2);
    }
  }


  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);


    Quadratic.quad(a, b, c);
  }
}