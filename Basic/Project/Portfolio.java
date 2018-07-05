import java.util.ArrayList;

public class Portfolio{
    private ArrayList<Project> projects;
    
    public Portfolio(){
        projects = new ArrayList<Project>();
    }

    public void addProj(Project proj){
        projects.add(proj);
    }

    public void getPortfolioCost(){
        double total = 0;
        for (Project x : projects){
            total += x.getCost();
        }
        System.out.println("Total cost: $" + total);
    }

    public void showPortfolio(){
        for (Project x : projects){
            x.elevatorPitch();
        }
        getPortfolioCost();
    }

}