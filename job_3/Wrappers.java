package job_3;

public class Wrappers {
    public static void main(String[] args) {
        task1();
        // todo: task 2 in a table
    }

    static void task1() {
        // 1
        Double d = Double.valueOf(1);
        Double dd = Double.valueOf('x');
        Double ddd = Double.valueOf("1.34");
        // 2
        double dddd = Double.parseDouble("1.1");
        // 3
        System.out.println(dd.doubleValue());
        System.out.println(dd.floatValue());
        System.out.println(booleanValue(dd));
        System.out.println(charValue(dd));
        System.out.println(dd.byteValue());
        System.out.println(dd.shortValue());
        System.out.println(dd.intValue());
        System.out.println(dd.longValue());
        // 4
        System.out.println(dd);
        // 5
        String s = dd.toString();
    }

    static char charValue(Double d) { return (char)(d.intValue()); }

    static boolean booleanValue(double d) { return d != 0; }
}