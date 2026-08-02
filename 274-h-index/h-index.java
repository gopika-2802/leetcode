class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] f = new int[n + 1];

        for (int citation : citations) {
            f[Math.min(citation, n)]++;
        }

        int i = 0;
        for (int h = n ; h >= 0; h--) {
            i += f[h];
            if (i >= h) {
                return h;
            }
        }
        return 0;        
    }
}