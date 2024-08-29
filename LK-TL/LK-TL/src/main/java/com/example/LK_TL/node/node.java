package com.example.LK_TL.node;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
/*import javax.persistence.Id;*/

@Entity
@Table
public class node {
    @Id
    /*@SequenceGenerator(
            name ="node_sequence",
            sequenceName = "node_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "node_sequence"
    )*/
    private String nodeId;

    @NotBlank(message = "Node name is mandatory")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Node name cannot contain special characters")
    private String nodeName;

    private String description;
    private String memo;

    @NotBlank(message = "Node type is mandatory")
    private String nodeType;

    private String parentNodeGroupName;
    private String parentNodeGroupId;
    private String parentNodeDescription;

    public node() {
    }

    public node(String nodeId,
                String nodeName,
                String description,
                String memo,
                String nodeType,
                String parentNodeGroupName,
                String parentNodeGroupId,
                String parentNodeDescription) {
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        this.description = description;
        this.memo = memo;
        this.nodeType = nodeType;
        this.parentNodeGroupName = parentNodeGroupName;
        this.parentNodeGroupId = parentNodeGroupId;
        this.parentNodeDescription = parentNodeDescription;
    }

    public node(String nodeName,
                String description,
                String memo,
                String nodeType,
                String parentNodeGroupName,
                String parentNodeGroupId,
                String parentNodeDescription) {
        this.nodeName = nodeName;
        this.description = description;
        this.memo = memo;
        this.nodeType = nodeType;
        this.parentNodeGroupName = parentNodeGroupName;
        this.parentNodeGroupId = parentNodeGroupId;
        this.parentNodeDescription = parentNodeDescription;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public @NotBlank(message = "Node name is mandatory") @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Node name cannot contain special characters") String getNodeName() {
        return nodeName;
    }

    public void setNodeName(@NotBlank(message = "Node name is mandatory") @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Node name cannot contain special characters") String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public @NotBlank(message = "Node type is mandatory") String getNodeType() {
        return nodeType;
    }

    public void setNodeType(@NotBlank(message = "Node type is mandatory") String nodeType) {
        this.nodeType = nodeType;
    }

    public String getParentNodeGroupName() {
        return parentNodeGroupName;
    }

    public void setParentNodeGroupName(String parentNodeGroupName) {
        this.parentNodeGroupName = parentNodeGroupName;
    }

    public String getParentNodeGroupId() {
        return parentNodeGroupId;
    }

    public void setParentNodeGroupId(String parentNodeGroupId) {
        this.parentNodeGroupId = parentNodeGroupId;
    }

    public String getParentNodeDescription() {
        return parentNodeDescription;
    }

    public void setParentNodeDescription(String parentNodeDescription) {
        this.parentNodeDescription = parentNodeDescription;
    }

    @Override
    public String toString() {
        return "node{" +
                "nodeId='" + nodeId + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", description='" + description + '\'' +
                ", memo='" + memo + '\'' +
                ", nodeType='" + nodeType + '\'' +
                ", parentNodeGroupName='" + parentNodeGroupName + '\'' +
                ", parentNodeGroupId='" + parentNodeGroupId + '\'' +
                ", parentNodeDescription='" + parentNodeDescription + '\'' +
                '}';
    }
}
