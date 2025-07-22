class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] nums = s.toCharArray();
        int a = 0;
        int l = 0;
        int max = 0;
        Set<Character> map = new HashSet<>();
        for(int r = 0;r<nums.length;r++){
            while(l<r && map.contains(nums[r])){
                max--;
                map.remove(nums[l]);
                l++;
            }
            map.add(nums[r]);
            max++;
            a = Math.max(max,a);
        }
        return a;
    }
}
