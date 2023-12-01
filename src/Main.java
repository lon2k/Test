import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<Skills> skils = new HashSet();
        skils.add(Skills.Tiler);
        skils.add(Skills.Mason);
        skils.add(Skills.Plasterer);
        Worker worker = new Worker(new BigDecimal(100), skils);
        HashSet<Skills> skils2 = new HashSet();
        skils2.add(Skills.Tiler);
        skils2.add(Skills.Mason);
        skils2.add(Skills.Welder);
        Worker worker2 = new Worker(new BigDecimal(100), skils2);
        HashSet<Skills> skils3 = new HashSet();
        skils3.add(Skills.Welder);
        skils3.add(Skills.Mason);
        skils3.add(Skills.Plasterer);
        Worker worker3 = new Worker(new BigDecimal(100), skils3);
        Worker worker11 = new Worker(new BigDecimal(200), skils);
        Worker worker22 = new Worker(new BigDecimal(200), skils2);
        Worker worker33 = new Worker(new BigDecimal(200), skils3);
        List<Worker> workers1 = new ArrayList<>();
        workers1.add(worker);
        workers1.add(worker2);
        workers1.add(worker3);
        List<Worker> workers2 = new ArrayList<>();
        workers2.add(worker11);
        workers2.add(worker22);
        workers2.add(worker33);
        Bridage bridage1 = new Bridage(workers1,"Чырвоная зорка");
        Bridage bridage2 = new Bridage(workers2,"Кинотеатр Октябрь");
        List<Bridage> bridages = new ArrayList<>();
        bridages.add(bridage1);
        bridages.add(bridage2);

        HashMap<Skills,Integer> skilsogr = new HashMap<>();
        skilsogr.put(Skills.Welder,4);
        skilsogr.put(Skills.Mason,4);
        skilsogr.put(Skills.Plasterer,4);
        Tender tender = new Tender(skilsogr,bridages);
        System.out.println(tender.getWinner());
    }
}