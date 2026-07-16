/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        if (node == null) {
            return null;
        }
        visited.put(node, new Node(node.val, new ArrayList<>()));
        queue.add(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            for (Node neighbor : curr.neighbors) {
                if (!visited.containsKey(neighbor)) {
                    visited.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }
                visited.get(curr).neighbors.add(visited.get(neighbor));
            }
        }

        return visited.get(node);
        
    }
}