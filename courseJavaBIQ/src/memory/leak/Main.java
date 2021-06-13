package memory.leak;

import java.util.Random;

public class Main {
    private static ArticleController articleController = new ArticleController();

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Random rand = new Random();

            // Generate random integers in range 0 to 999
            long id = rand.nextInt(10);
            System.out.printf("Getting article by ID %d%n", id);
            Article article = articleController.getArticle(id);
            System.out.printf("Got article with ID %d%n", article.getArticleId().getId());
        }
    }
}
