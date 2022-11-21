import java.time.LocalDate;
import java.time.Month;

public class Driver extends Person implements PersonAble{
    private String car;

    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String car) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.car=car;
    }

    @Override
    public void favoriteSport() {
        System.out.println("Driving in the car");

    }

    @Override
    public String favoriteLanguage() {
        System.out.println("Spanish");
        return null;
    }

    @Override
    public Month favoriteMouth() {
        System.out.println("July");
        return null;
    }

    @Override
    public String getLastName() {
        System.out.println("Vladovich");
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
        return new long[0];
    }
}
