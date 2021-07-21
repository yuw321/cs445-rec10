package cs445.rec10.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cs445.list.ArrayList;
import cs445.list.ListInterface;
import cs445.rec10.IterableUtils;


/**
 * A class that provides sample tests of the Singly-LinkedList
 * @author William C. Garrison III
 * @author Brian T. Nixon
 * @author Norhan Abbas
 */
public class IteratorTest {

    ListInterface<String> stringList;
    ListInterface<Integer> numList;

    // each string's length is the same as its position, starting from 1
    final String[] testStrings = {"1", "22", "333", "4444", "55555", "666666", "7777777"};

    @BeforeEach
    public void setup() {
        stringList = new ArrayList<String>();
        numList = new ArrayList<Integer>();
    }

    @AfterEach
    public void teardown() {
        stringList = null;
        numList = null;
    }

    @Test
    @DisplayName("Test removeShortStrings")
    void testRemoveShortStrings() {
        for (String str : testStrings) {
            stringList.add(str);
        }
        IterableUtils.removeShortStrings(stringList, 3);
        assertEquals(5, stringList.getSize(), "removeShortStrings method is not working properly");
    }

    @Test
    @DisplayName("Test findMode")
    void testFindMode() {
        for (String str : testStrings) {
            stringList.add(str);
        }
        stringList.add("1");
        assertEquals(IterableUtils.findMode(stringList), "1", "find mode method doesn't work for a list of strings");

        numList.add(14);
        numList.add(123);
        numList.add(41);
        numList.add(14);
        numList.add(87);
        numList.add(19);
        numList.add(41);
        numList.add(1);
        numList.add(35);
        numList.add(99);
        numList.add(41);
        numList.add(15);
        numList.add(41);
        numList.add(14);
        numList.add(35);

        assertEquals(IterableUtils.findMode(numList), 41, "find mode method doesn't work for a list of strings");
    }
}

