package org.cheng;

/*
 * 图像渲染
 */
public class Solution {

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];
		if(color==newColor){
			return image;
		}

		image[sr][sc] = newColor;

		floodFill(image,sr,sc,color,newColor);
		return image;
	}

	private void floodFill(int[][] image, int sr, int sc, int color,int newColor){
		if(color==newColor){
			return;
		}

		if(sr-1>=0 && sc>=0 && image[sr-1][sc]==color){
			image[sr-1][sc] = newColor;
			floodFill(image,sr-1,sc,color,newColor);
		}

		if(sr+1< image.length && sc>=0 && image[sr+1][sc]==color){
			image[sr+1][sc] = newColor;
			floodFill(image,sr+1,sc,color,newColor);
		}

		if(sc-1>=0 && sr>=0 && image[sr][sc-1]==color){
			image[sr][sc-1] = newColor;
			floodFill(image,sr,sc-1,color,newColor);
		}

		if(sc+1< image[0].length && sr>=0 && image[sr][sc+1]==color){
			image[sr][sc+1] = newColor;
			floodFill(image,sr,sc+1,color,newColor);
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
		int sr = 1;
		int sc = 1;
		int newColor = 2;
		int[][] newImage = s.floodFill(image,sr,sc,newColor);
		for(int i=0;i<newImage.length;i++){
			for(int j=0;j<newImage[i].length;j++){
				System.out.print(newImage[i][j]);
			}
			System.out.println();
		}
		System.out.println(newImage);
	}
}
