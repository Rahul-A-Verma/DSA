class Solution {
    private List<List<Integer>> getPermutations(List<Integer> list) {
        if (list.isEmpty()) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }

        List<List<Integer>> totalPermutations = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer current = list.get(i);
            
            List<Integer> remaining = new ArrayList<>(list);
            remaining.remove(i);

            for (List<Integer> perm : getPermutations(remaining)) {
                perm.add(0, current);
                totalPermutations.add(perm);
            }
        }
        return totalPermutations;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return getPermutations(list);
    }
}