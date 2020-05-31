package ma.cdgk.cnss.entity;


import javax.persistence.*;

@Entity
@Table(name = "SousCodesOperation")
public class SousCodesOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String code;
    private String label;
}
