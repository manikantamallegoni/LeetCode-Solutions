class Solution {

    Set<String> ans = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {

        int leftRemove = 0;
        int rightRemove = 0;

        // Find minimum number of removals
        for (char c : s.toCharArray()) {

            if (c == '(') {
                leftRemove++;
            }

            else if (c == ')') {

                if (leftRemove > 0) {
                    leftRemove--;
                }
                else {
                    rightRemove++;
                }
            }
        }

        StringBuilder current = new StringBuilder();

        dfs(s, 0, 0, leftRemove, rightRemove, current);

        return new ArrayList<>(ans);
    }


    void dfs(String s,
             int i,
             int balance,
             int leftRemove,
             int rightRemove,
             StringBuilder current) {

        // End of string
        if (i == s.length()) {

            if (leftRemove == 0 &&
                rightRemove == 0 &&
                balance == 0) {

                ans.add(current.toString());
            }

            return;
        }


        char c = s.charAt(i);


        // REMOVE '('
        if (c == '(' && leftRemove > 0) {

            dfs(s,
                i + 1,
                balance,
                leftRemove - 1,
                rightRemove,
                current);
        }


        // REMOVE ')'
        if (c == ')' && rightRemove > 0) {

            dfs(s,
                i + 1,
                balance,
                leftRemove,
                rightRemove - 1,
                current);
        }


        // KEEP '('
        if (c == '(') {

            current.append(c);

            dfs(s,
                i + 1,
                balance + 1,
                leftRemove,
                rightRemove,
                current);

            current.deleteCharAt(current.length() - 1);
        }


        // KEEP ')'
        else if (c == ')' && balance > 0) {

            current.append(c);

            dfs(s,
                i + 1,
                balance - 1,
                leftRemove,
                rightRemove,
                current);

            current.deleteCharAt(current.length() - 1);
        }


        // KEEP normal character
        else if (c != ')') {

            current.append(c);

            dfs(s,
                i + 1,
                balance,
                leftRemove,
                rightRemove,
                current);

            current.deleteCharAt(current.length() - 1);
        }
    }
}