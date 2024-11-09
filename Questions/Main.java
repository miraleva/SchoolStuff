package Questions;

public class Main {
    public static void main(String[] args) {
        String[] MyModels = { "Tofaş", "BMW" };
        CarGallery MyCarGallery = new CarGallery("Ahmet", "Ahmet Galeri", MyModels, 1991, 200000);
        CarGallery.rastgele();
        System.out.println(MyCarGallery.Slogan());
        System.out.println(MyCarGallery.OwnerName);
    }

}
