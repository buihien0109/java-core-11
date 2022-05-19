import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        boolean rs = StringUtils.isNumeric("1");
        System.out.println(rs);
    }
}
