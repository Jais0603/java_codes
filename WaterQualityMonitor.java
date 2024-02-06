

import java.util.HashMap;
import java.util.Map;

public class WaterQualityMonitor {

    // Map of water quality parameters and their ideal values for different fish species
    private static final Map<String, Double> idealValues = new HashMap<>();
    static {
        idealValues.put("pH", 7.0);
        idealValues.put("Dissolved Oxygen", 6.0);
        idealValues.put("Temperature", 25.0);
    }

    public static void main(String[] args) {
        // Sample sensor data for water quality parameters
        Map<String, Double> waterQualityData = new HashMap<>();
        waterQualityData.put("pH", 6.5);
        waterQualityData.put("Dissolved Oxygen", 5.5);
        waterQualityData.put("Temperature", 27.0);

        // Run water quality monitoring
        Map<String, Double> alerts = new HashMap<>();
        for (Map.Entry<String, Double> entry : waterQualityData.entrySet()) {
            String parameter = entry.getKey();
            Double value = entry.getValue();
            Double idealValue = idealValues.get(parameter);
            if (value < idealValue * 0.9 || value > idealValue * 1.1) {
                alerts.put(parameter, value);
            }
        }
    // Print the alerts for water quality parameters
    if (alerts.isEmpty()) {
        System.out.println("Water quality is within ideal range.");
    } else {
        System.out.println("Alerts for water quality parameters:");
        for (Map.Entry<String, Double> entry : alerts.entrySet()) {
            String parameter = entry.getKey();
            Double value = entry.getValue();
            System.out.println(parameter + ": " + value);
        }
    }
}
}