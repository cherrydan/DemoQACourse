package JavaTutor;
// метка outer - нужна для того, чтобы остановить внешний цикл for командой break из внутреннего цикла for

public class outer_demo {

    public static void main(String[] args) {
        int n = 5;

        outer:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.println(i + " " + j);
                if(j == 1) break outer;
            }
        }
    }
}
