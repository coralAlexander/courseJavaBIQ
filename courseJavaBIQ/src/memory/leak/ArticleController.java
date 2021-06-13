package memory.leak;

public class ArticleController {
    private ArticleCache articleCache = new ArticleCache(new ArticleDatabase());

    Article getArticle(long id) {
        Article article = this.articleCache.getArticleById(new ArticleId(id));
        return article;
    }
}
