import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Bridage {
    private List<Worker> workers = new ArrayList<>();
    private String name;

    public List<Worker> getWorkers() {
        return workers;
    }

    public BigDecimal getMoney(){
        BigDecimal money = new BigDecimal(0);
        for(Worker work : workers){
            money.add(work.getMoney());
        }
        return money;
    }
    public HashMap<Skills,Integer> allSkill(){
        HashMap<Skills,Integer> allSkills = new HashMap<>();
        for (Skills skill : Skills.values()){
            allSkills.put(skill,0);
        }
        for(Worker work : workers){
            for(Skills skill : work.getWorkerSkills().keySet()){
                allSkills.put(skill, allSkills.get(skill)+1);
            }
        }
        return allSkills;
    }

    public String getName() {
        return name;
    }

    public Bridage(List<Worker> workers, String name) {
        this.workers = workers;
        this.name = name;



    }
}
