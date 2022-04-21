import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cat {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;
}
