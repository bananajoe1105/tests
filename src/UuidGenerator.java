import java.util.UUID;

public class UuidGenerator {

    public static void main(String[] args) {
        UUID testid = UUID.randomUUID();
        String convert = testid.toString();
        System.out.print(convert);
        System.out.print("Hello");
    }

}
