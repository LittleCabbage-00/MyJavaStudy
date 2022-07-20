package OOPHighLevel.ZexamplePetShop;

public class Demo {
    public static void main(String[] args) {
        PetShop petShop = new PetShop(5);
        petShop.add(new Cat("whiteCat","white",2));
        petShop.add(new Cat("blackCat","black",5));
        petShop.add(new Cat("flowerCat","flower",3));
        petShop.add(new Dog("littleDog","red",4));
        petShop.add(new Dog("hugeDog","green",6));
        petShop.add(new Dog("middleDog","yellow",4));
        print(petShop.search("white"));
    }
    public static void print(Pet p[]){
        for (int i = 0; i < p.length; i++) {
            if (p[i]!=null){
                System.out.println(p[i].getName()+","+p[i].getColor()+","+p[i].getAge());
            }
        }
    }
}
