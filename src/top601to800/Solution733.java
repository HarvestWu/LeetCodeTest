package top601to800;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 12:39
 **/
public class Solution733 {

    @Test
    public void test733() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int[][] result = {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        assertEquals(result, floodFill(image, 1, 1, 2));
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, color, newColor);
        }
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor;
            if (sr > 0) {
                dfs(image, sr - 1, sc, color, newColor);
            }
            if (sc > 0) {
                dfs(image, sr, sc - 1, color, newColor);
            }
            if (sr < image.length - 1) {
                dfs(image, sr + 1, sc, color, newColor);
            }
            if (sc < image[0].length - 1) {
                dfs(image, sr, sc + 1, color, newColor);
            }
        }
    }
}
