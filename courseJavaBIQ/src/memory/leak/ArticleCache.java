package memory.leak;

import java.util.HashMap;

public class ArticleCache {
    private HashMap<ArticleId, Article> articleByIdMap = new HashMap<>();
    private ArticleDatabase articleDatabase;

    public ArticleCache(ArticleDatabase articleDatabase) {
        this.articleDatabase = articleDatabase;
    }

    public Article getArticleById(ArticleId articleId) {
        System.out.println("Cache size: " + articleByIdMap.size());
        return this.articleByIdMap.computeIfAbsent(articleId,
                (key) -> this.articleDatabase.findArticle(articleId));
    }
}
