import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // 1. เพิ่มผู้ป่วย P001 ถึง P005 ลงใน Queue
        queue.offer("P001");
        queue.offer("P002");
        queue.offer("P003");
        queue.offer("P004");
        queue.offer("P005");

        System.out.println("1. เพิ่มผู้ป่วย P001 ถึง P005 ลงใน Queue");
        System.out.println("    " + queue);

        // 2. เรียกผู้ป่วยออกจากคิว 2 คน
        String patient1 = queue.remove();
        String patient2 = queue.remove();

        System.out.println("2. เรียกผู้ป่วยออกจากคิว 2 คน");
        System.out.println("    " + "ผู้ป่วยที่ได้รับบริการ : " + patient1);
        System.out.println("    " + "ผู้ป่วยที่ได้รับบริการ : " + patient2);

        // 3. เพิ่มผู้ป่วย P006 และ P007
        queue.offer("P006");
        queue.offer("P007");

        System.out.println("3. เพิ่มผู้ป่วย P006 และ P007 เข้า Queue");
        System.out.println("    " + queue);

        // 4. แสดงผู้ป่วยคนถัดไป
        System.out.println("4. แสดงผู้ป่วยคนถัดไปด้วย peek()");
        System.out.println("    " + queue.peek());

        // 5. แสดงจำนวนผู้ป่วยที่ยังรออยู่
        System.out.println("5. แสดงจำนวนผู้ป่วยที่ยังรออยู่ด้วย size()");
        System.out.println("    " + queue.size() + " คน");

        // 6. แสดงสถานะของ Queue
        System.out.println("6. แสดงสถานะของ Queue หลังจากดำเนินการทั้งหมด");
        System.out.println("    " + queue);

        // 7. ตรวจสอบก่อน remove()
        System.out.println("7. ตรวจสอบก่อน remove() ว่า Queue ว่างหรือไม่");
        if (queue.isEmpty()) {
            System.out.println("    " + "Queue ว่าง");
        } else {
            System.out.println("    " + "Queue ไม่ว่าง");
        }

        // 8. อธิบายหลักการ FIFO
        System.out.println("8. อธิบายหลักการ FIFO");
        System.out.println("    " + "FIFO (First In First Out) คือ ข้อมูลที่เข้ามาก่อน จะถูกนำออกก่อน");
    }
}