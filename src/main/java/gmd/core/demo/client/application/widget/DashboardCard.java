package gmd.core.demo.client.application.widget;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gmd.core.demo.client.application.navigation.Dashboard;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;

public class DashboardCard extends Composite {

    private static DashboardCardUiBinder uiBinder = GWT.create(DashboardCardUiBinder.class);

    interface DashboardCardUiBinder extends UiBinder<Widget, DashboardCard> {
    }

    @UiField
    MaterialImage image;

    @UiField
    MaterialLabel title, description;

    @UiField
    MaterialLink link;

    private Dashboard dashboard;

    public DashboardCard(Dashboard dashboard) {
        initWidget(uiBinder.createAndBindUi(this));

        this.dashboard = dashboard;
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        image.setUrl(dashboard.getImage());
        title.setText(dashboard.getTitle());
        description.setText(dashboard.getDescription());
        link.setHref(dashboard.getUrl());
    }
}