import java.util.ArrayList;

class ProjectClass {
    private String name;
    private String description;
    private static String defaultName = "This is a name";
    private static String defaultDescription = "This is a description.";

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String elevatorPitch() {
        return String.format("%s %s", name, description);
    }

    public ProjectClass(String name, String description) {
        this.name = name;
        this.description = description; 
    }

    public ProjectClass(String name) {
        this.name = name;
        this.description = defaultDescription;
    }

    public ProjectClass() {
        name = defaultName;
        description = defaultDescription;
    }
}