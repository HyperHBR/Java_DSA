public class _05_Flood_Fill {
    public void helper(int[][] image,int sr,int sc,int color,boolean[][] visited,int orgCol){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || visited[sr][sc] || image[sr][sc] = orgCol){
            return;
        }

        image[sr][sc] = color;

        //left
        helper(image, sr, sc+1, color, visited, orgCol);

        //right
        helper(image, sr, sc-1, color, visited, orgCol);
        
        //up
        helper(image, sr-1, sc, color, visited, orgCol);
        
        //down
        helper(image, sr+1, sc, color, visited, orgCol);
    }

    public int[][] floodFill(int[][] image,int sr,int sc,int color){
        boolean visited[][] = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,visited,image[sr][sc]);
        return image;
    }
}
