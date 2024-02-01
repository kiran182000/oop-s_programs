public class circle {
    int radius;
    public circle(int radius){
        this.radius=radius;
    }
    void area(){
        System.out.println("Area of circle is: "+ (3.14*radius*radius));
    }
    void circumferance(){
        System.out.println("Circumferance of circle is: " + (2*3.14*radius));
    }
    public static void main(String[] args){
        circle c1=new circle(4);
        c1.area();
        c1.circumferance();
    }
}
