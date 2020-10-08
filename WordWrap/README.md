# Word wrap kata

## References

https://codingdojo.org/kata/WordWrap/

## Origin
This kata is from Robert Martin and his blog includes a solution in Java [1] .

## Problem Description
You write a class called Wrapper, that has a single static function named wrap that takes two arguments, a string, and a column number. The function returns the string, but with line breaks inserted at just the right places to make sure that no line is longer than the column number. You try to break lines at word boundaries.

Like a word processor, break the line by replacing the last space in a line with a newline.

Comments from those who are working on this Kata
Here you could write some thoughts about what you have learnt from this Kata. If you want to discuss your approach and give some code samples, you might want to link to a new page “KataXByY “. You don’t have to post all the code of your solution, or claim that it is the best possible solution. What is interesting is your insights into the problem, and decisions you made in the past.

## Different Languages
Python classic recursive solution, code and some discussion [2]
Ruby styled Regular Expression solution, code [3]
Forth, code [4] and feedback in the newsgroup [5]
Java various solutions, code together with discussion [6]
Different Algorithms
I (PeterKofler ) did the kata several times in Java and tried a different variants each time. The different algorithms have increased complexity in code but reduce the number of allocations. See [6] for a detailed analysis of the variants together with code. It’s nice to see how the solution changes from recursive to tail recursive to a loop which can be optimised even further.
