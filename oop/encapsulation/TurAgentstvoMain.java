package oop.encapsulation;

public class TurAgentstvoMain {
    public static void main(String[] args) {
        TurAgentstvo agentstvo = new TurAgentstvo("Sayakat", "Kyrgysystan", "gid,perevod,eda", 1000, 5.0);
        System.out.println(agentstvo.name);
        System.out.println(agentstvo.getLocation());
        System.out.println(agentstvo.uslugi);
        System.out.println(agentstvo.getPrice());
        System.out.println(agentstvo.getRating());
    }
}
