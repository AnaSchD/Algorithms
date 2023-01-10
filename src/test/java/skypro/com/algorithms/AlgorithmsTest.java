package skypro.com.algorithms;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmsTest {

    private IntegerListImpl expected;
    private IntegerListImpl actual;

    @BeforeEach
    public void setUp() {
        expected = new IntegerListImpl(10);
        Integer string1 = Integer.valueOf("s1");
        Integer string2 = Integer.valueOf("s2");
        Integer string3 = Integer.valueOf("s3");
        Integer string4 = Integer.valueOf("s4");
        expected.add(string1);
        expected.add(string2);
        expected.add(string3);
        expected.add(string4);
        actual = new IntegerListImpl(10);
        actual.add(string1);
        actual.add(string2);
        actual.add(string3);
        actual.add(string4);
    }

    @Test
    public void addString() {
        IntegerListImpl stringList = new IntegerListImpl(10);
        Integer string1 = Integer.valueOf("s1");
        Integer string2 = Integer.valueOf("s2");
        Integer string3 = Integer.valueOf("s3");
        Integer string4 = Integer.valueOf("s4");
        stringList.add(Integer.valueOf(string1));
        stringList.add(string2);
        stringList.add(string3);
        stringList.add(string4);
        assertEquals(expected, actual);
    }

}
