package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void mixedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[()]}"));
    }
    @Test
    public void incorrectOrderReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[(])}"));
    }
    @Test
    public void unmatchedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void nonBracketCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("hello world"));
    }
    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void complexNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{()}]"));
    }
    @Test
    public void extraClosingBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{}]}"));
    }
    @Test
    public void extraOpeningBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{]"));
    }

}