package skypro.com.algorithms;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmsTest {

    private StringListImpl expected;
    private StringListImpl actual;

    @BeforeEach
    public void setUp() {
        expected = new StringListImpl(10);
        String string1 = "s1";
        String string2 = "s2";
        String string3 = "s3";
        String string4 = "s4";
        expected.add(string1);
        expected.add(string2);
        expected.add(string3);
        expected.add(string4);
        actual = new StringListImpl(10);
        actual.add(string1);
        actual.add(string2);
        actual.add(string3);
        actual.add(string4);
    }

    @Test
    public void addString() {
        StringListImpl stringList = new StringListImpl(10);
        String string1 = "s1";
        String string2 = "s2";
        String string3 = "s3";
        String string4 = "s4";
        stringList.add(string1);
        stringList.add(string2);
        stringList.add(string3);
        stringList.add(string4);
        assertEquals(expected, actual);
    }

}
