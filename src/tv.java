public class tv {
    String brand;
    double size;
    int price;
    public tv(String brand,double size,int price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }
    void discount() {
        int discount = 0;
        if (size <= 40) {
            discount += 2000;
        } else if (size >= 50 && size <= 60) {
            discount += 4000;
        } else {
            discount += 5000;
        }
        price -= discount;
    }
    void bill(){
        System.out.println("Brand of TV: "+brand);
        System.out.println("Size of TV: " +size);
        System.out.println("Discounted Price: " +price);
    }
    public static void main(String[] args){
        tv t1=new tv("sumsung",60,40000);
        t1.discount();
        t1.bill();
    }
}
