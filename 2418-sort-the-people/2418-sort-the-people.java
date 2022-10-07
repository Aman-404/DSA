class Solution {
     public String[] sortPeople(String[] names, int[] heights) {

        //Space: O(N)
        int[][] people = new int[names.length][2];
        for (int i = 0; i < names.length; i++)
            people[i]  = new int[] {heights[i], i};
         
         
       
        
        //Time: O(NlgN); Space: O(lgN)
        Arrays.sort(people, (a, b) -> b[0] - a[0]);
          for (int i = 0; i < names.length; i++)
            System.out.print(people[i][1]);

        String[] res = new String[names.length];
        //Time: O(N)
        for (int i = 0; i < names.length; i++)
            res[i] = names[people[i][1]];

        return res;
    }
}