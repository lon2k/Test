import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tender {
    private HashMap<Skills,Integer> workSkills;
    private List<Bridage> bridages  = new ArrayList<>();

    public Tender(HashMap<Skills, Integer> workSkills, List<Bridage> bridages) {

        this.workSkills = workSkills;
        this.bridages = bridages;
    }

    private boolean checkWin(Bridage bridage){
        boolean answer = true;
        for(Skills skill : workSkills.keySet()){
            if(bridage.allSkill().get(skill) < workSkills.get(skill)){
                answer = false;
            }
        }
        return answer;
    }
   public String getWinner(){
        List<Bridage> winners= new ArrayList<>();
        String winner = "";

        for(Bridage bridage : bridages){
            if (checkWin(bridage)){
                winners.add(bridage);
            }
        }
        try {
            BigDecimal min = winners.get(0).getMoney();
            winner = winners.get(0).getName();
            for (Bridage bridage : winners) {
                if (bridage.getMoney().compareTo(min) < 0) {
                    min = bridage.getMoney();
                    winner = bridage.getName();
                }
            }
        }
        catch (IndexOutOfBoundsException e){
            return "Никто не победил";
        }
        return winner;
   }
}
