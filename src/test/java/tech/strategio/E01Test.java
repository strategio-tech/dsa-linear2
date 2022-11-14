package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E01Test {
    @DisplayName("Ransom Note")
    @ParameterizedTest(name = "{index} => {0} and {1} is {2}")
    @MethodSource("arrayToBoolean")
    void arrayToBoolean(String s, String t, Boolean result) {
        E01 exercise = new E01();
        boolean val = exercise.canConstruct(s,t);
        assertEquals(result, val);
    }
    private static Stream<Arguments> arrayToBoolean() {
        return Stream.of(
                Arguments.arguments("aa", "aab", true),
                Arguments.arguments("ab", "abb", true),
                Arguments.arguments("a", "b", false),
                Arguments.arguments("aa", "ab", false),
                Arguments.arguments("x", "y", false),
                Arguments.arguments("rat", "car", false),
                Arguments.arguments("bok", "book", true),
                Arguments.arguments("loot", "tool", true),
                Arguments.arguments("lot", "tool", true)
        );
    }

}
