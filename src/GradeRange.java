public class GradeRange {
    public static void main(String args[]) {
        String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
        int[] cutoff = {95,90,87,83,80,77,73,70,67,63,60,0};

        Grade gradeRange = new Grade(grades, cutoff);

        System.out.println(gradeRange.toString());
        System.out.println("Nathan Dilla");
    }

}