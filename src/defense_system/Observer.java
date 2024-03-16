package defense_system;

public interface Observer {
    String updateArea(String situation);
    void sendStrength(int strength);
    void update(String name, String text);
}