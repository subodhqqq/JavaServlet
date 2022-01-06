package Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Subodh on 06/01/2022.
 */
public class CollectionInjection {

    private List<String> students;
    private Set<String> colleges;
    private Map<String,String> phone;


    public CollectionInjection(List<String> students, Set<String> colleges, Map<String, String> phone) {
        this.students = students;
        this.colleges = colleges;
        this.phone = phone;
    }

    public CollectionInjection() {
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public Set<String> getColleges() {
        return colleges;
    }

    public void setColleges(Set<String> colleges) {
        this.colleges = colleges;
    }

    public Map<String, String> getPhone() {
        return phone;
    }

    public void setPhone(Map<String, String> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CollectionInjection{" +
                "students=" + students +
                ", colleges=" + colleges +
                ", phone=" + phone +
                '}';
    }
}
