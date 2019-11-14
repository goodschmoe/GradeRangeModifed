public class Grade
{
    private String[] grades;
    private int[] cutoff;

    public Grade(String[] grades, int[] cutoff)
    {
    this.grades = grades;
    this.cutoff = cutoff;
    }

    public String toString() {
        String output = "";
        for(int level = 0; level < cutoff.length; level++) {
            output += grades[level] + "\t" + cutoff[level] + "\n";
        }
        return output;
    }
}
