package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Table(name = "My_Entity")
public class MyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "attribute1")
    private String attribute1;

    @Column(name = "attribute2")
    private String attribute2;

}
