package memory.leak;

import java.util.Random;

public class ArticleDatabase {

    public static final int TARGET_STRING_LENGTH = 100000;

    public Article findArticle(ArticleId articleId) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        return new Article(new ArticleId(articleId.getId()),
                "John Doe",
                System.currentTimeMillis(),
                this.generateRandomString());
    }

    private String generateRandomString() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = TARGET_STRING_LENGTH;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
