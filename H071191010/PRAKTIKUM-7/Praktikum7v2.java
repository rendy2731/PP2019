 import java.util.LinkedList;
import java.util.List;

class Praktikum7v2 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> rst = new LinkedList<>();
        for (int num = left; num <= right; num++) {
            int i = num;
            for (; i > 0; i /= 10) {
                if ((i % 10 == 0) || (num % (i % 10) != 0)) {
                    break;
                }
            }
            if (i == 0) {
                rst.add(num);
            }
        }
        return rst;
    }
    public static void main(String[] args) {
        
    }
}