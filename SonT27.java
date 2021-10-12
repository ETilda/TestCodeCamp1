package inheritance;

public class SonT27 extends FatherT27 {
    public static void main(String[] args) {
        FatherT27 father = new FatherT27();
        father.playRugby();
        father.readNovels();
        father.watchSoccer();

        SonT27 Adrien = new SonT27();
        Adrien.lovePainting();
        Adrien.techSavvy();
    }
    public void lovePainting(){
        System.out.println("Adrien loves nature painting");
    }
    public void techSavvy(){
        System.out.println("Adrien is proficient in the use of modern technology");
    }
}

