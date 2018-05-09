package at.refugeescode.theater_messenger.controller;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProblemFactory {

    public List<String> createProblem() {
        return Stream.of("Batteries", "Cable", "Antenna", "Frequency", "Clean Mic", "Change Mic", "Change Tape")
                .collect(Collectors.toList());
    }
}
