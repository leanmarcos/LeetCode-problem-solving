package N257;

public class N257 {
}

public List<String> binaryTreePaths(TreeNode root) {
    List<String> tempResult = new ArrayList<>();
    List<String> result = new ArrayList<>();

    binaryTreePaths(root, tempResult, result);

    return result;

}

private void binaryTreePaths(TreeNode actual, List<String> tempResult, List<String> result){

    if(actual == null) return;

    String rr = String.valueOf(actual.val);
    tempResult.add(rr);

    if(actual.left == null && actual.right == null){
        String r = "";

        for(int i = 0; i < tempResult.size(); i++){
            r += tempResult.get(i);

            if(i < tempResult.size()-1){
                r += "->";
            }
        }

        result.add(r);
    }

    binaryTreePaths(actual.left, tempResult, result);

    binaryTreePaths(actual.right, tempResult, result);

    tempResult.remove(tempResult.size() - 1);

}