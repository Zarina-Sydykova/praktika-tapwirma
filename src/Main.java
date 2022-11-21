import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer(13457, "Bakyt NN", (byte) 15, 'M',"bakyt@gmail.com",
                "0505214514", 605.000, "Lenovo");
        System.out.println(programmer);
        programmer.favoriteSport();
        programmer.favoriteLanguage();
        programmer.favoriteMouth();
        programmer.getLastName();
        programmer.getPhoneNumberAndEmail();
        programmer.getDateOfBrith();
        programmer.getPeopleOfAllAges();
        Driver driver = new Driver(58748, "Baysal LL", (byte) 27, 'M',"baysal@mail.ru", "9087500",
                90.900, "Lexus");
        System.out.println(driver);
        driver.favoriteSport();
        driver.favoriteLanguage();
        driver.favoriteMouth();
        driver.getLastName();
        driver.getPhoneNumberAndEmail();
        driver.getDateOfBrith();
        driver.getPeopleOfAllAges();
        Doctor doctor = new Doctor(36987, "Anara Nurbekova", (byte) 25, 'F',"anara@mail.ru", "165465546",
                805.700, "She has many patients");
        System.out.println(doctor);
        doctor.favoriteSport();
        doctor.favoriteLanguage();
        doctor.favoriteMouth();
        doctor.getLastName();
        doctor.getPhoneNumberAndEmail();
        doctor.getDateOfBrith();
        doctor.getPeopleOfAllAges();
    }
}