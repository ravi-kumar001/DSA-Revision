public class Demo {
    public static void main(String[] args) {
        String str = "Ravi ";
        str.concat("Kumar");
        System.out.println(str); // its show String class object is immutable but StringBuilder class object is mutable

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Rahul ");
        sb.append("Kumar");
        System.out.println(sb);
    }
}
