/*
 * Copyright (c) xFusion Digital Technologies Co., Ltd. 2019-2021. All rights reserved.
 */

package com.xfusion.fd.api.wrapper;

import com.xfusion.fd.service.bean.FusionDirector;

/**
 * CatalogueApiWrapper
 *
 * @since 2019-02-18
 */
public class CatalogueApiWrapper extends AbstractApiWrapper {
    public CatalogueApiWrapper(FusionDirector fd) {
        super(fd);
    }

    @Override
    public String getResourcePath() {
        return "/redfish/v1/rich/Nodes/{0}/Catalogue";
    }
}
