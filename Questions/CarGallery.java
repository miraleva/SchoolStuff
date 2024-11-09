package Questions;

public class CarGallery {
    public String OwnerName;
    public String Name;
    public String[] Model;
    public int year;
    private int CeoSallary;

    public CarGallery(String OwnerName, String Name, String[] Model, int year, int CeoSallary) {
        this.OwnerName = OwnerName;
        this.Name = Name;
        this.Model = Model;
        this.year = year;
        this.CeoSallary = CeoSallary;
    }

    public String Slogan() {
        return this.Name + "Hoşgeldiniz" + this.year + "Yılında kuruldu.";
    }

    public int CeoSallaryGetter() {
        return this.CeoSallary;

    }

    public void CeoSallarySetter(int x) {
        if (x > CeoSallary) {
            CeoSallary = x;
        } else {
            System.out.println("maaşım arttırılmadı");
        }

    }

    public static void rastgele() {
        System.out.println("Otogaleride bişiler alınır satılır.");
    }

}
