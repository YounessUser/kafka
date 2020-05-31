package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
public class AnnexExchangFormat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String reference;

    private String label;

    private int startPosition;

    private int endPosition;

    private int length;

    private String type;

    private String comment;

    private String required;

    private String isControl;

    private String controlType;

    private String remise;

    private String section;

    public AnnexExchangFormat() {
    }

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
            String controlType,
            String remise,
            String section
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
        this.remise = remise;
        this.section = section;
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

    public String getRequired() {
        return required;
    }

    public String getIsControl() {
        return isControl;
    }

    public void setIsControl(String isControl) {
        this.isControl = isControl;
    }

    public String getControlType() {
        return controlType;
    }

    public String getRemise() {
        return remise;
    }

    public void setRemise(String remise) {
        this.remise = remise;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
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

    

