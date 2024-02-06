
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FishDiseaseDetector {

    // Map of fish species to their respective disease symptoms
    private static final Map<String, List<String>> fishDiseases = new HashMap<>();
    static {
        fishDiseases.put("Tilapia", List.of("Abdominal swelling", "Lethargy", "Anorexia", "Skin discoloration"));
        fishDiseases.put("Salmon", List.of("Bloody patches", "Ulcers", "Fins clamped", "Swimming erratically"));
        fishDiseases.put("Trout", List.of("Red streaks on fins or body", "Swollen eyes", "Skin ulcers", "Cotton-like growths"));
    }

    public static void main(String[] args) {
        // Sample sensor data for fish health parameters
        Map<String, Double> fishHealthData = new HashMap<>();
        fishHealthData.put("pH", 7.5);
        fishHealthData.put("Dissolved Oxygen", 7.2);
        fishHealthData.put("Temperature", 26.0);

        // Run disease detection and diagnosis
        List<String> fishSymptoms = fishHealthData.entrySet().stream()
                .filter(e -> e.getKey().equals("pH") && e.getValue() < 7.0 || e.getValue() > 8.0)
                .map(e -> "Abnormal pH levels")
                .collect(Collectors.toList());

        String fishSpecies = "Tilapia"; // assume fish species is known
        List<String> knownDiseases = fishDiseases.get(fishSpecies);
        List<String> detectedDiseases = new ArrayList<>(knownDiseases); // initialize with all known diseases

        // Remove known diseases that don't match the detected symptoms
        detectedDiseases.removeAll(knownDiseases.stream().filter(symptom -> !fishSymptoms.contains(symptom)).collect(Collectors.toList()));

        // Print the detected diseases
        System.out.println("Detected diseases for " + fishSpecies + ": " + detectedDiseases);
    }
}


