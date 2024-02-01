public class furniture {
        String type;
        String material;
        int price;
        public furniture(String type,String material,int price){
            this.type=type;
            this.material=material;
            this.price=price;
        }
        void discount() {
            int discount = 0;
            if (material=="low") {
                discount += 2000;
            } else if (material=="medium") {
                discount += 4000;
            } else {
                discount += 5000;
            }
            price -= discount;
        }
        void bill(){
            System.out.println("Type of furniture: "+ type);
            System.out.println("material of furniture: " +material);
            System.out.println("Discounted Price: " +price);
        }
        public static void main(String[] args){
            furniture f1=new furniture("new","low",6000);
            f1.discount();
            f1.bill();
        }
    }


