package kz.alfabank.statement;

/**
 * Created by Kuan on 25.06.2017.
 */
public class Statement {


    private final long id;
    private final String content;

    public Statement(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
