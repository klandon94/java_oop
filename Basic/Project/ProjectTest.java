
public class ProjectTest{
    public static void main(String[] args){
        Project proj = new Project();
        proj.setName("whoa");
        proj.setDesc("whoa there bro");
        proj.setCost(920.54);
        // proj.elevatorPitch();

        Project proj2 = new Project("construction", "building a new building yo");
        proj2.setCost(300);
        // proj2.elevatorPitch();

        Project proj3 = new Project("building", "building something", 500.70);
        // proj3.elevatorPitch();

        Portfolio port = new Portfolio();
        port.addProj(proj);
        port.addProj(proj2);
        port.addProj(proj3);
        port.showPortfolio();
    }
}