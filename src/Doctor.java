import java.time.LocalDate;
import java.time.Month;

public class Doctor extends Person implements PersonAble{
    private String patient;

    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String patient) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.patient=patient;
    }

    @Override
    public void favoriteSport() {
        System.out.println("Hiking");

    }

    @Override
    public String favoriteLanguage() {
        System.out.println("French");
        return null;
    }

    @Override
    public Month favoriteMouth() {
        System.out.println("March");
        return null;
    }

    @Override
    public String getLastName() {
        System.out.println("Nurbekovna");
        return null;
    }

    @Override
    public LocalDate getDateOfBrith() {
        System.out.println(2022-getAge());
        return null;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        System.out.println(getPhoneNumber()+" "+getEmail());
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
