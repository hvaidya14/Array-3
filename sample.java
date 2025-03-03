class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] hindex = new int[n+1];

        for (int i=0;i<n;i++) {
            if (citations[i] > (hindex.length-1)) {
                hindex[n]++;
            } else {
                hindex[citations[i]]++;
            }
        }
        int sum=0;
        for (int i=hindex.length-1; i>=0;i--) {
            sum = hindex[i] + sum;
            if(sum>=i) {
                return i;
            }
        }
        return 83831;
    }
}
