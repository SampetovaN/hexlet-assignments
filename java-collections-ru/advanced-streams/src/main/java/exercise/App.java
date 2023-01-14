package exercise;

import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static void main() {

       // System.out.println(getForwardedVariables());
    }
    public static String getForwardedVariables(String str) {
        return List.of(str.split("\n")).stream()
                .filter(x -> x.startsWith("environment="))
                .flatMap(x -> Arrays.stream(x.replaceAll("\"", "").split("environment=")))
                .flatMap(x -> Arrays.stream(x.split(",")))
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replace("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
