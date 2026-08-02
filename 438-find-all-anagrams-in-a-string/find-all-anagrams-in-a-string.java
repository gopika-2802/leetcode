class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length())
            return ans;

        HashMap<Character, Integer> pat = new HashMap<>();
        HashMap<Character, Integer> win = new HashMap<>();

        for (char c : p.toCharArray())
            pat.put(c, pat.getOrDefault(c, 0) + 1);

        // First window
        for (int i = 0; i < p.length(); i++)
            win.put(s.charAt(i), win.getOrDefault(s.charAt(i), 0) + 1);

        if (win.equals(pat))
            ans.add(0);

        // Slide the window
        for (int i = p.length(); i < s.length(); i++) {

            char add = s.charAt(i);
            char remove = s.charAt(i - p.length());

            win.put(add, win.getOrDefault(add, 0) + 1);

            win.put(remove, win.get(remove) - 1);
            if (win.get(remove) == 0)
                win.remove(remove);

            if (win.equals(pat))
                ans.add(i - p.length() + 1);
        }

        return ans;
    }
}