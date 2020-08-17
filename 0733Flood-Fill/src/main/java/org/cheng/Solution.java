package org.cheng;

/*
 * 图像渲染
 */
public class Solution {

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr-1][sc-1];
		
		return image;
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

			}
		}
		System.out.println(newImage);
	}
}
