package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Table(name = "AnnexExchangFormat")
public class AnnexExchangFormat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "reference")
    private String reference;

    @Column(name = "label")
    private String label;

    @Column(name = "startPosition")
    private int startPosition;

    @Column(name = "endPosition")
    private int endPosition;

    @Column(name = "length")
    private int length;

    @Column(name = "type")
    private String type;

    @Column(name = "comment")
    private String comment;

    @Column(name = "required")
    private String required;

    @Column(name = "isControl")
    private String isControl;

    @Column(name = "controlType")
    private String controlType;

    public AnnexExchangFormat(
            String reference,
            String label,
            int startPosition,
            int endPosition,
            int length,
            String type,
            String comment,
            String required,
            String isControl,
            String controlType
    ) {
        this.reference = reference;
        this.label = label;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.length = length;
        this.type = type;
        this.comment = comment;
        this.required = required;
        this.isControl = isControl;
        this.controlType = controlType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String isRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String isControl() {
        return isControl;
    }

    public void setControl(String control) {
        isControl = control;
    }

    public String isControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    @Override
    public String toString() {
        return "AnnexExchangFormat{" +
                "reference='" + reference + '\'' +
                ", label='" + label + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}


