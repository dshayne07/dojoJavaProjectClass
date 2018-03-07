public class Project{
    public String name;
    public String description;

    public Project(){
        this.name = "";
        this.description = "";
    }
    public Project(String name){
        this.name=name;
        this.description="";
    }
    public Project(String name, String description){
        this.name=name;
        this.description=description;
    }
    public String elevatorPitch(){
        return this.name+", "+this.description;
    }
}