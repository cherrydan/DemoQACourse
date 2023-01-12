package JavaTutor;
//показывает разницу между StringBuilder и String Buffer
// получается что, в многопоточной среде Builder будет работать быстрее, но Buffer будет работать стабильнее
public class Difference {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("abc");
        builder.deleteCharAt(1);
        builder.setCharAt(0, 'w');
        System.out.println(builder);
        // в отличие от StringBuilder, StringBuffer синхронизирован, то есть он делает блокировку других потоков
        StringBuffer buffer = new StringBuffer();
        buffer.append("abc");
        buffer.deleteCharAt(1);
        buffer.setCharAt(0, 'q');
        System.out.println(buffer);
    }
}
