/*
 * Copyright (c) xFusion Digital Technologies Co., Ltd. 2019-2021. All rights reserved.
 */

package com.xfusion.fd.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * NetworkAdapterListEntity
 *
 * @since 2019-02-18
 */
public class NetworkAdapterListEntity extends BaseEntity {
    @JsonProperty(value = "Members")
    private List<NetworkAdapterEntity> members = new ArrayList<>();

    @JsonProperty(value = "Members@odata.count")
    private int count;

    @JsonProperty(value = "TotalCount")
    private int totalCount;

    public List<NetworkAdapterEntity> getMembers() {
        return members;
    }

    public void setMembers(List<NetworkAdapterEntity> members) {
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
