class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();

        for(long row =0 ; row <=numRows; row++){
            List<Integer> numList  = new ArrayList<Integer>();
            for(long j = 0 ; j<= row; j++){
                numList.add((int) somethingCalledBinominlCoffie(row,j));
            }
            resList.add(numList);
        }
        if(resList.size() == 0) return Arrays.asList(1);
        return resList.get(resList.size()-1);
    }

        private long somethingCalledBinominlCoffie(long row , long j){
            long res = 1;
            if(j > row -j){
                j =  row - j;
            }

            for(long i = 0 ; i < j ; i++){
                res *= (row - i);
                res /= (i +1);
            }
            return res;
        }
}