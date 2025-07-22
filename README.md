# 3.-Longest-Substring-Without-Repeating-Characters
📌 Problem Statement:
Given a string s, find the length of the longest substring without repeating characters.

✅ Code Transcript:
java
Copy
Edit
public int lengthOfLongestSubstring(String s)
This function returns the length of the longest substring without repeating characters from the input string s.

java
Copy
Edit
char[] nums = s.toCharArray();
Convert the input string s into a character array for easy indexing.

java
Copy
Edit
int a = 0;
Variable a stores the final result — the length of the longest valid substring found so far.

java
Copy
Edit
int l = 0;
l is the left boundary (start index) of the sliding window.

java
Copy
Edit
int max = 0;
max keeps track of the current window length — the number of unique characters in the current window.

java
Copy
Edit
Set<Character> map = new HashSet<>();
A HashSet to store characters in the current window and ensure uniqueness (no repeats).

java
Copy
Edit
for(int r = 0; r < nums.length; r++) {
Iterate through the array using r as the right boundary of the sliding window.

java
Copy
Edit
    while(l < r && map.contains(nums[r])) {
If the current character nums[r] is already in the window (i.e., in the set), move the left pointer (l) to shrink the window until the duplicate is removed.

java
Copy
Edit
        max--;
        map.remove(nums[l]);
        l++;
Decrease the current length max, remove nums[l] from the set, and move l forward.

java
Copy
Edit
    map.add(nums[r]);
    max++;
After making sure there are no duplicates, add the current character to the set and increase the current window length.

java
Copy
Edit
    a = Math.max(max, a);
Update the final answer with the maximum seen so far.

java
Copy
Edit
return a;
Return the length of the longest valid substring without repeating characters.

⚙️ Time and Space Complexity
Time Complexity: O(n) — Each character is visited at most twice (once by r and once by l).

Space Complexity: O(k) — Where k is the number of unique characters (up to 26 for lowercase letters or 128 for ASCII).

📝 Notes
This is a sliding window approach using a HashSet to track the current window of unique characters.

A minor issue: instead of manually updating max, it would be clearer and more robust to calculate r - l + 1 when updating a.

