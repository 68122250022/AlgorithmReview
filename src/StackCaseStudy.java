import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // 1. เพิ่มคำสั่งทั้งหมดลงใน Stack
        stack.push("Type Data");
        stack.push("Type Structure");
        stack.push("Delete Structure");
        stack.push("Type Algorithm");
        stack.push("Type Java");

        System.out.println("1. เพิ่มคำสั่งทั้งหมดลงใน Stack");
        System.out.println(stack);

        // 2. แสดงคำสั่งทั้งหมดใน Stack
        System.out.println("2. แสดงคำสั่งทั้งหมดใน Stack");
        System.out.println(stack);

        // 3. Undo คำสั่งล่าสุด 2 ครั้ง
        String undo1 = stack.pop();
        String undo2 = stack.pop();

        System.out.println("3. Undo คำสั่งล่าสุด 2 ครั้ง");
        System.out.println("Undo ครั้งที่ 1 : " + undo1);
        System.out.println("Undo ครั้งที่ 2 : " + undo2);

        // 4. แสดงคำสั่งที่ถูก Undo
        System.out.println("4. แสดงคำสั่งที่ถูก Undo");
        System.out.println(undo1);
        System.out.println(undo2);

        // 5. แสดงสถานะของ Stack หลังจาก Undo
        System.out.println("5. แสดงสถานะของ Stack หลังจาก Undo");
        System.out.println(stack);

        // 6. ตรวจสอบก่อน pop() ว่า Stack ว่างหรือไม่
        System.out.println("6. ตรวจสอบก่อน pop() ว่า Stack ว่างหรือไม่");
        if (stack.isEmpty()) {
            System.out.println("Stack ว่าง");
        } else {
            System.out.println("Stack ไม่ว่าง");
        }

        // 7. อธิบายหลักการ LIFO
        System.out.println("7. อธิบายหลักการ LIFO");
        System.out.println("LIFO (Last In First Out) คือ ข้อมูลที่เพิ่มเข้ามาล่าสุด จะถูกนำออกก่อน");
    }
}