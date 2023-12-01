import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;

public class Worker {
    private BigDecimal money;
    private HashSet<Skills> workerSkills;
    public HashMap<Skills, Integer> getWorkerSkills() {
        HashMap<Skills,Integer> hash = new HashMap<>();
        for(Skills skill : workerSkills){
            hash.put(skill,0);
        }
        return hash;
    }

    public Worker(BigDecimal money, HashSet<Skills> workerSkills) {
        this.money = money;
        this.workerSkills = workerSkills;
    }

    public BigDecimal getMoney() {
        return money;
    }

}
