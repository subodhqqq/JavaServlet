package AutoWriteAssigmnment;

import java.util.Map;

/**
 * Created by Subodh on 06/01/2022.
 */
public class CollectionAssignment {
    private Map<String,String> student;


    @Override
    public String toString() {
        return "CollectionAssignment{" +
                "student=" + student +
                '}';
    }

    public CollectionAssignment() {
    }

    public CollectionAssignment(Map<String, String> student) {
        this.student = student;
    }

    public Map<String, String> getStudent() {
        return student;
    }

    public void setStudent(Map<String, String> student) {
        this.student = student;
    }
}
