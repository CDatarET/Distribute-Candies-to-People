# Distribute-Candies-to-People
Leetcode Problem #1103. Distribute candies to n people.

#  Candy Distribution Problem

## Problem Description

We distribute a given number of candies among a row of `n` people in a specific order:

1. In the first round, we give 1 candy to the first person, 2 candies to the second person, ..., until we give `n` candies to the `n`-th person.
2. Then we start over from the first person, but this time giving out candies starting from `n+1`, `n+2`, and so on.
3. This continues until we run out of candies. If the remaining candies are less than what a person is supposed to get in that turn, we give them all the remaining candies.

### Goal

Return an array of length `num_people` representing how many candies each person gets in the final distribution.

---
