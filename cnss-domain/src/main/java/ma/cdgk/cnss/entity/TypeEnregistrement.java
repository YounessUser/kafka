package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Table(name = "TypeEnregistrement")
public class TypeEnregistrement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String code;
    private String label;

    public TypeEnregistrement() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "TypeEnregistrement{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
