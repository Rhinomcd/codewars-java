package io.r2n;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TenMinWalkTest {

    @Test
    void shouldReturnFalseIfEmpty() {
        var input = new char[] {};
        assertFalse(TenMinWalk.isValid(input));
    }

    @Test
    void shouldReturnFalseIfOnlyOneDirection() {
        var input = new char[] { 'w' };
        assertFalse(TenMinWalk.isValid(input));
    }

    @Test
    void validLengthTooFarNorth() {
        assertFalse(TenMinWalk.isValid(new char[] { 'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
    }

    @Test
    void validWalkVerticalOnly() {
        assertTrue(TenMinWalk.isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
    }

    @Test
    void validWalkHorizontalOnly() {
        assertTrue(TenMinWalk.isValid(new char[] { 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w' }));
    }

    @Test
    void validWalkAllDirections() {
        assertTrue(TenMinWalk.isValid(new char[] { 'e', 'e', 'w', 'w', 'n', 'n', 's', 's', 'n', 's' }));
    }

}