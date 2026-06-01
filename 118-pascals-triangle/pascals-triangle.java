class Solution {
    public List<List<Integer>> generate(int numRows) {
    if (numRows == 0){
         return List.of();
         }
 
   
 List<List<Integer>> result = new ArrayList<>();
     for (int row = 0; row < numRows; row++) {
        
        List<Integer> arr = new ArrayList<>();
        for (int col = 0; col <=row; col++) {
            if (col == 0 || col == row) {
                arr.add(1);
            } else {
                 List<Integer> prevRow = result.get(row - 1);
                 arr.add(prevRow.get(col - 1) + prevRow.get(col));
            }
        }
        result.add(arr);
    }
    return result;
    }
}