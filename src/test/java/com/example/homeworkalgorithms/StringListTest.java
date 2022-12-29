package com.example.homeworkalgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringListTest {

    StringList stringList = new StringListImpl();

    @Test
    public void whenItemAddedThenItCanBeFoundItList() {
        this.stringList.add("Test");
        Assertions.assertEquals(1, this.stringList.size());
    }

    @Test
    public void whenItemAddedToSpecificIndexWhenElementsIsShiftedRight() {
        this.stringList.add("Test");
        this.stringList.add(0, "Test1");
        this.stringList.add(1, "Test2");
        this.stringList.add(3, "Test10");

        Assertions.assertEquals(4, this.stringList.size());
        Assertions.assertEquals("Test1", this.stringList.get(0));
        Assertions.assertEquals("Test2", this.stringList.get(1));
        Assertions.assertEquals("Test10", this.stringList.get(3));
    }

    @Test
    public void whenValueIsSetWhenGetReturnsThisValue() {
        this.stringList.add("Test");
        this.stringList.add("Test1");
        this.stringList.add("Test2");

        this.stringList.set(1, "NEW_VALUE");
        Assertions.assertEquals(3, this.stringList.size());
        Assertions.assertEquals("NEW_VALUE", this.stringList.get(1));
    }

    @Test
    public void whenTwoElementsInListThenIndexOfReturnsFirst() {
        this.stringList.add("Test");
        this.stringList.add("Test");
        Assertions.assertEquals(0, this.stringList.indexOf("Test"));
    }

    @Test
    public void whenTwoElementsInListThenIndexOfUnknownReturnsFirstMinusOne() {
        this.stringList.add("Test");
        this.stringList.add("Test");
        Assertions.assertEquals(-1, this.stringList.indexOf("NON_EXISTING_VALUE"));
    }

    @Test
    public void whenTwoElementsInListThenLastIndexOfReturnSecond() {
        this.stringList.add("Test");
        this.stringList.add("Test");
        Assertions.assertEquals(0, this.stringList.indexOf("Test"));
    }

    @Test
    public void whenTwoElementsInListThenLastIndexOfUnknownReturnsFirstMinusOne() {
        this.stringList.add("Test");
        this.stringList.add("Test");
        Assertions.assertEquals(-1, this.stringList.indexOf("NON_EXISTING_VALUE"));
    }

    @Test
    public void whenTwoElementsAddedAndSecondRemovedTheSizeIsOne() {
        this.stringList.add("Test");
        this.stringList.add("Test1");
        this.stringList.remove(1);
        Assertions.assertEquals(1, this.stringList.size());
        Assertions.assertEquals("Test", this.stringList.get(0));
    }

    @Test
    public void whenTwoElementsAddedAndFirstRemovedTheSizeIsOne() {
        this.stringList.add("Test");
        this.stringList.add("Test1");
        this.stringList.remove(0);
        Assertions.assertEquals(1, this.stringList.size());
        Assertions.assertEquals("Test1", this.stringList.get(0));
    }

    @Test
    public void whenThreeElementsAddedAndSecondRemovedTheSizeIsOne() {
        this.stringList.add("Test");
        this.stringList.add("Test1");
        this.stringList.add("Test2");
        this.stringList.remove(1);
        Assertions.assertEquals(2, this.stringList.size());
        Assertions.assertEquals("Test", this.stringList.get(0));
        Assertions.assertEquals("Test2", this.stringList.get(1));
    }
    @Test
    public void whenElementsAddedAndClearIsCalledThenListIsEmpty() {
        this.stringList.add("Test");
        this.stringList.add("Test1");
        this.stringList.add("Test2");
        this.stringList.clear();
        Assertions.assertTrue(this.stringList.isEmpty());
        Assertions.assertEquals(0, this.stringList.size());
    }

}
