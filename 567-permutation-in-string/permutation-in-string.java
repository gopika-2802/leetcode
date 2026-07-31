class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int freqs1[] = new int[26];

        for(char ch : s1.toCharArray())
        {
            freqs1[ch-'a']++;
        }

        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            int freqs2[] = new int[26];

            String str = s2.substring(i,i+s1.length());

            for(char ch : str.toCharArray())
            {
                freqs2[ch-'a']++;
            }

            if(Arrays.equals(freqs1,freqs2))
            {
                return true;
            }
        }

        return false;
    }
}