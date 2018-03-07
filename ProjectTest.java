public class ProjectTest extends Project{
    public static void main(String[] args){
        Project proj = new Project("Test", "A test project");
        System.out.println(proj.elevatorPitch());
    }
}