class Solution {
    public void dfs(int[][] image,int sr,int sc,int color,int originalColor){
        if(sc<0 || sr<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=originalColor){
            return ;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,originalColor);
        dfs(image,sr-1,sc,color,originalColor);
        dfs(image,sr,sc+1,color,originalColor);
        dfs(image,sr,sc-1,color,originalColor);
          
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row=image.length;
        int col=image[0].length;
        int originalColor=image[sr][sc];
        if(originalColor==color){
            return image;
        }
        dfs(image,sr,sc,color,originalColor);
        return image;

        
    }
}