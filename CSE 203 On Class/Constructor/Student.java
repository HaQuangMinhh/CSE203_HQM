public class Student {
    private String name;
    private double score;
    
    public Student(Student a) {
        name = a.getName();
        score = a.getScore();
    }
    public boolean equals(Student otherStudent){
        if(name.equals(otherStudent.getName()) && 
                score == otherStudent.getScore())
             return true;
        else
             return false;
    }
    

    private static int instanceCount = 0;
    public Student(String name, double score) {
        instanceCount ++;
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }
    
    
    
    
}
