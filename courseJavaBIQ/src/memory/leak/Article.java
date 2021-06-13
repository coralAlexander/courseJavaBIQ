package memory.leak;

public class Article {
    private ArticleId articleId;
    private String author;
    private long creationDate;
    private String articleText;

    public Article(ArticleId articleId, String author, long creationDate, String articleText) {
        this.articleId = articleId;
        this.author = author;
        this.creationDate = creationDate;
        this.articleText = articleText;
    }

    public ArticleId getArticleId() {
        return articleId;
    }

    public String getAuthor() {
        return author;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public String getArticleText() {
        return articleText;
    }
}
