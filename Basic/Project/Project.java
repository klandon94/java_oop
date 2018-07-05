
public class Project{
    private String name;
    private String description;
    private double initialCost;

    public Project(){
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double cost){
        this.name = name;
        this.description = description;
        this.initialCost = cost;
    }

    // Getter methods
    public String getName(){
        return name;
    }
    public String getDesc(){
        return description;
    }
    public double getCost(){
        return initialCost;
    }
    // Setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setDesc(String description){
        this.description = description;
    }
    public void setCost(double cost){
        this.initialCost = cost;
    }

    public void elevatorPitch(){
        System.out.println(name + " ($" + initialCost + "): " + description);
    }
}