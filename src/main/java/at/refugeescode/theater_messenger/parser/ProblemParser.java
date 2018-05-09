//package at.refugeescode.theater_messenger.parser;
//
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Stream;
//
//import static java.util.Arrays.asList;
//
//@Service
//public class ProblemParser {
//
//    private final ResourceLoader resourceLoader;
//
//    public ProblemParser(ResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }
//
//    public List<String> getProblem() {
//        List<String> problems = new ArrayList<>();
//
//        Resource resource = resourceLoader.getResource("classpath:problems.txt");
////        try {
////            Stream<String> line = Files.lines(resource.getFile().toPath());
////            return Stream.of(line)
////                    .flatMap(e -> e)
////                    .collect(Collectors.toList());
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return problems;
//
//
//        try {
//            Stream<String> lines = Files.lines(resource.getFile().toPath());
//
//            if (!lines.findFirst().isPresent()) return null;
//            problems = asList(lines.findFirst().get().split(","));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return problems;
//    }
//
//}
