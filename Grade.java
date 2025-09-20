public class Grade {
    public static String gradeFromScore(int score) {
        if (score >= 80) return "A+";
        if (score >= 70) return "A";
        if (score >= 60) return "A-";
        if (score >= 50) return "B";
        if (score >= 40) return "C";
        if (score >= 33) return "D";    
        return "F";
    }
}
