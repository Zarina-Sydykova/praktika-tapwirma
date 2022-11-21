import java.time.LocalDate;
import java.time.Month;

public class Programmer extends Person implements PersonAble{
    private String computer;

    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String computer) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.computer=computer;
    }

    @Override
    public void favoriteSport() {
        System.out.println("internet game");

    }

    @Override
    public String favoriteLanguage() {
        System.out.println("english");
        return null;
    }

    @Override
    public Month favoriteMouth() {
        System.out.println("december");
        return null;
    }

    @Override
    public String getLastName() {
        System.out.println("Nurbekovich");
        return null;
    }

    @Override
    public LocalDate getDateOfBrith() {

        System.out.println(2022-getAge());
        return null;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        System.out.println(getEmail()+" "+getPhoneNumber());
        return null;
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }

        return new long[0];
    }
}
