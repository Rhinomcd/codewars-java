package io.r2n;

/*
https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java

You live in the city of Cartesia where all roads are laid out in a perfect grid. 
You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
The city provides its citizens with a Walk Generating App on their phones -- 
everytime you press the button it sends you an array of one-letter strings 
representing directions to walk (eg. ['n', 's', 'w', 'e']).

You always walk only a single block in a direction and you know it takes you one minute to traverse one city block,
 so create a function that will return true if the walk the app gives you will 
 take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point.
 Return false otherwise.

Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only).
 It will never give you an empty array (that's not a walk, that's standing still!).
*/
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        return walk.length == 10 && isVerticalBalanced(walk) && isHorizontalBalanced(walk);
    }

    private static boolean isVerticalBalanced(char[] walk) {
        return isBalanced(walk, 'n', 's');
    }

    private static boolean isHorizontalBalanced(char[] walk) {
        return isBalanced(walk, 'e', 'w');
    }

    private static boolean isBalanced(char[] walk, char open, char close) {
        int counter = 0;
        for (char direction : walk) {
            if (direction == open) {
                counter++;
            } else if (direction == close) {
                counter--;
            }
        }
        return counter == 0;
    }
}