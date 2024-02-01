public class dog {
    String breed;
    int age;
    int weight;
    public dog(String breed,int age,int weight){
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }
    void detail(){
        System.out.println("Dog Breed is: "+ breed);
        System.out.println("Dog Age is: "+ age);
        System.out.println("Dog Weight is: "+ weight);

    }
    public static void main(String[] args){
        dog d1=new dog("abc",3,15);
        d1.detail();

    }
}
