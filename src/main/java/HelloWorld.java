import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloWorld {
    private String message;

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld("Hello, Lombok!");
        System.out.println(hello.getMessage());
    }
}
