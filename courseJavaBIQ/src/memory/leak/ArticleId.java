package memory.leak;

import java.util.Objects;

public class ArticleId {

    private long id;

    public ArticleId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleId articleId = (ArticleId) o;
        return id == articleId.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
