package day09;

public class ParentCat {

    private String breed = "샴 고양이";

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void methodParentCat(){
        System.out.println("어미 고양이 냐옹!");
    }
}



class  Kitten extends ParentCat{
    void methodKitten(){
        System.out.println("아기 고양이 미야옹!");
    }


    }

