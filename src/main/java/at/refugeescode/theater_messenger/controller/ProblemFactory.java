package at.refugeescode.theater_messenger.controller;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProblemFactory {

    public List<String> createProblem() {
        return Stream.of("CHANGE BATTERIES", "CHECK CABLE", "CHECK ANTENNA", "CHECK FREQUENCY",
                "CLEAN MIC", "CHANGE MIC", "CHANGE TAPE", "UNKNOWN PROBLEM")
                .collect(Collectors.toList());
    }
}
