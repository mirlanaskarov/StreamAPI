import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i=0; i< nums.length; i++){
            nums [i] = random.nextInt(5,25);
        }

        System.out.println("Массив чисел больше 10: ");
        Arrays.stream(nums).filter(num -> num > 10).forEach(System.out::println);

        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(new Phone(6.0, "white", "Iphone"));
        phones.add(new Phone(7.3, "blue", "Iphone"));
        phones.add(new Phone(7.0, "black", "LG"));
        phones.add(new Phone(6.5, "red", "Samsung"));
        phones.add(new Phone(7.2, "white", "Redmi"));
        phones.add(new Phone(6.9, "black", "Realmi"));
        phones.add(new Phone(7.5, "green", "Poco"));
        phones.add(new Phone(5.9, "yellow", "Nokia"));
        phones.add(new Phone(6.7, "white", "Iphone"));
        phones.add(new Phone(7.1, "violet", "Oppo"));

        List<Tablet> tablets = phones.stream()
                .filter(x -> x.getDisplay() > 7.0)
                .map(x -> new Tablet(x.getDisplay(), "Samsung"))
                .toList();

        System.out.println("Tablet c дисплеем больше 7: ");
        for (Tablet tablet : tablets) {
            System.out.println(tablet.getDisplay() + ", " + tablet.getMark() + ", " + tablet.getColor());
        }
    }
}