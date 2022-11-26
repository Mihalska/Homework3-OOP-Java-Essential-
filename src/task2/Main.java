package task2;

public class Main {
    public static void main(String[] args) {
        ExcelentPupil a = new ExcelentPupil();
        GoodPupil b = new GoodPupil();
        BadPupil c = new BadPupil();
        ClassRoom class1 = new ClassRoom(a , b, c, c);
        ClassRoom class2 = new ClassRoom(a, b, c); // для виведення інформації щодо трьох утнів, відповідні конструктори сворені у класі ClassRoom;
        ClassRoom class3 = new ClassRoom(a,b);// для виведення інформації щодо двох утнів; відповідні конструктори сворені у класі ClassRoom;
        System.out.print("Перший учень навчається: "  );
        class1.pupil1.study();
        System.out.print("читає: ");
        class1.pupil1.read();
        System.out.print("пише: ");
        class1.pupil1.write ();
        System.out.print("та відпочиває:");
        class1.pupil1.relax  ();
        System.out.print("Другий учень навчається: " );
        class1.pupil2.study();
        System.out.print("читає: ");
        class1.pupil2.read();
        System.out.print("пише: ");
        class1.pupil2.write ();
        System.out.print("та відпочиває:");
        class1.pupil2.relax  ();
        System.out.print("Третій учень навчається:" );
        class1.pupil3.study();
        System.out.print("читає:");
        class1.pupil3.read();
        System.out.print("пише:");
        class1.pupil3.write ();
        System.out.print("та відпочиває:");
        class1.pupil3.relax  ();
        System.out.print("Четвертий учень навчається:" );
        class1.pupil4.study();
        System.out.print("читає:");
        class1.pupil4.read();
        System.out.print("пише:");
        class1.pupil4.write ();
        System.out.print("та відпочиває:");
        class1.pupil4.relax  ();
//аналогічно можемо вивести інформація окремо для  трьох чи двох  утнів, відповідно використавши class2 та class3 - посилання на створені екземпляри класу.
    }
}