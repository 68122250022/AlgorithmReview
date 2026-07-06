public class ArrayCaseStudy {
    public static void main(String[] args) {

        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }

            if (scores[i] >= 7) {
                count++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("1. คะแนนรวมของนักศึกษาทั้งหมด : " + sum);
        System.out.println("2. คะแนนเฉลี่ย : " + average);
        System.out.println("3. คะแนนสูงสุด : " + max);
        System.out.println("4. คะแนนต่ำสุด : " + min);
        System.out.println("5. จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป : " + count + " คน");

        System.out.print("6. นักศึกษาที่ควรได้รับการทบทวนเพิ่มเติม : นักศึกษาคนที่ ");

        boolean first = true;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                if (!first) {
                    if (i == scores.length - 1) {
                        System.out.print(" และ ");
                    } else {
                        System.out.print(", ");
                    }
                }
                System.out.print(i + 1);
                first = false;
            }
        }

        System.out.println();
    }
}