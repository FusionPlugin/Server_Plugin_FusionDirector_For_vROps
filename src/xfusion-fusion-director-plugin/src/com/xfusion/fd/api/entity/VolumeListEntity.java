/*
 * Copyright (c) xFusion Digital Technologies Co., Ltd. 2019-2021. All rights reserved.
 */

package com.xfusion.fd.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * VolumeListEntity
 *
 * @since 2019-02-18
 */
public class VolumeListEntity extends BaseEntity {
    @JsonProperty(value = "Members")
    private List<VolumeEntity> members = new ArrayList<>();

    @JsonProperty(value = "Members@odata.count")
    private int count;

    @JsonProperty(value = "TotalCount")
    private int totalCount;

    public List<VolumeEntity> getMembers() {
        return members;
    }

    public void setMembers(List<VolumeEntity> members) {
        this.members = members;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
