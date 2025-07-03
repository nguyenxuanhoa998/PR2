package Assignment07.ex1;

public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, double grade, String researchTopic) {
        super(name, age, grade);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Research Topic: " + researchTopic;
    }
}
