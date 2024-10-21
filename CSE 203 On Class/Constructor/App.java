public class App {
    public static void main(String[] args) throws Exception {
        Gender eGender = Gender.FEMALE;
        System.out.println(eGender.toString());
        Day da1 = Day.FRIDAY;
        Day da2 = Day.SATURDAY;
        System.out.println(da1.compareTo(da2));
        System.out.println(da1.name());
        
    }
}
