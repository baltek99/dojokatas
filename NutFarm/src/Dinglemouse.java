public class Dinglemouse {

    public static int[] shakeTree(final char[][] tree) {
        int[] result = new int[tree[0].length];
        for (int i = 0; i < tree.length; i++) {
            int counter = i;
            for (int j = 0; j < tree[counter].length; j++)  {
                if (tree[counter][j] == 'o') {
                    if (j == tree[counter].length - 1) {
                        result[counter]++;
                    }
                    else if (tree[counter][j+1] == '/') {
                        tree[counter-1][j+1] = 'o';
                        tree[counter][j] = '.';
                        counter -= 1;
                    }
                    else if (tree[counter][j+1] == '\\') {
                        tree[counter+1][j+1] = 'o';
                        tree[counter][j] = '.';
                        counter += 1;
                    }
                    else if (tree[counter][j+1] == '_') {
                        tree[counter][j] = '.';
                    }
                    else {
                        tree[counter][j] = '.';
                        tree[counter][j+1] = 'o';
                    }
                }
            }
            //counter = i;
        }


        return result;
    }

}