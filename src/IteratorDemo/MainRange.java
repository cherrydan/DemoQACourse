package IteratorDemo;

//Настало твоё время - кастомный итератор на Java
public class MainRange {

    public static void main(String[] args) {
        for(int i: Range.fromTo(0, 100)) {
            System.out.print(i * 10 + " ");
        }
    }

    private static class Range implements Iterable<Integer> {

        private final int start;
        private final int end;

        public static Range fromTo(int from, int to) {
            return new Range(from, to);
        }

        private Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator iterator() {
            return new Iterator(start);
        }

        class Iterator implements java.util.Iterator<Integer> {
            int current;

            public Iterator(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}
