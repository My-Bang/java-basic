package day09;

public class CatMain {
    public static void main(String[] args) {
        ParentCat momCat = new ParentCat();
        //String breed = momCat.breed;
        String breed = momCat.getBreed();
        System.out.println("아기 고양이 종은 " + breed);
        momCat.methodParentCat();

        //어미고양이 momCat1 한마리 더 생성해 보세요.
        ParentCat momCat1 = new ParentCat();
        momCat1.setBreed("점박이");
        //momCat1.breed = "점박이";
        //System.out.println(momCat1.breed);
        System.out.println(momCat1.getBreed());
        momCat1.methodParentCat();

        System.out.println();

        Kitten kitty1 = new Kitten();
       // kitty1.breed = "스핑크스 고양이";
        kitty1.setBreed("스핑크스 고양이");
        //System.out.println(kitty1.breed);
        System.out.println(kitty1.getBreed());
        kitty1.getBreed();
        kitty1.methodParentCat();
        kitty1.methodKitten();


    }
}