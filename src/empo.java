import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)

@Target(ElementType.METHOD)
@interface MyAnnotation {
    String name();

    int age();

    String address();

    String email();

    String phone();

}

public class empo {
    @MyAnnotation(name = "Darshana Toke", age = 22, address = "chinchwad pune ",
            email = "darshanatoke21@gmail.com", phone = "9359405219")
    public void sayHello() {
        System.out.println("hello annotation");
    }
}

class annotation1 {
    public static void main(String args[]) throws Exception {
        empo h = new empo();
        Method m = h.getClass().getMethod("sayHello");
        MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
        System.out.println("name is: " + manno.name());
        System.out.println("age is: " + manno.age());
        System.out.println("address is: " + manno.address());
        System.out.println("email is: " + manno.email());
        System.out.println("phone no is: " + manno.phone());
    }
}
