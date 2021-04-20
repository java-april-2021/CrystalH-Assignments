import java.util.ArrayList;

public class ProjectClassTest {
    public ArrayList<ProjectClass> ProjectClass;
    public ProjectClassTest() {
        this.ProjectClass = new ArrayList<ProjectClass>();
    }

    public void AddToProjectClassTest(ProjectClass p) {
        ProjectClass.add(p);
    }

    public String getProjectClassTest() {
        return ProjectClass.toString();
    }

    public void showProjectClass() {
        System.out.println("All projects in portfolio: ");
        for(Project p : ProjectClass) {
            System.out.println(p.ElevatorPitch());
        }
        
    }
}
