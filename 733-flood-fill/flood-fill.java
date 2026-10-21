
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        // If the starting pixel already has the target color
        if (originalColor == color) {
            return image;
        }

        fill(image, sr, sc, originalColor, color);

        return image;
    }

    private void fill(int[][] image, int r, int c, int originalColor, int color) {
        // Check boundaries
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) {
            return;
        }

        // Stop if the pixel does not match the original color
        if (image[r][c] != originalColor) {
            return;
        }

        // Change the pixel color
        image[r][c] = color;

        // Visit the four adjacent pixels
        fill(image, r - 1, c, originalColor, color); // Up
        fill(image, r + 1, c, originalColor, color); // Down
        fill(image, r, c - 1, originalColor, color); // Left
        fill(image, r, c + 1, originalColor, color); // Right
    }
}
