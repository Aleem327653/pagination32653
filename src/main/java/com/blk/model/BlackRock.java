package com.blk.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class BlackRock {
    @Id
    private Integer id;

    private String groupName;

    @ElementCollection
    private List<String> groupMemberName;

    public BlackRock() {
    }

    public BlackRock(Integer id, String groupName, List<String> groupMemberName) {
        this.id = id;
        this.groupName = groupName;
        this.groupMemberName = groupMemberName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getGroupMemberName() {
        return groupMemberName;
    }

    public void setGroupMemberName(List<String> groupMemberName) {
        this.groupMemberName = groupMemberName;
    }

    @Override
    public String toString() {
        return "BlackRock{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", groupMemberName=" + groupMemberName +
                '}';
    }
}
