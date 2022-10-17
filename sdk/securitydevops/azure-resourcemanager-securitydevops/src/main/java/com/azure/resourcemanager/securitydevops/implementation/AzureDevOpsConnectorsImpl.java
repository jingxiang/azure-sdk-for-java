// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securitydevops.fluent.AzureDevOpsConnectorsClient;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsConnectorInner;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsConnector;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsConnectors;

public final class AzureDevOpsConnectorsImpl implements AzureDevOpsConnectors {
    private static final ClientLogger LOGGER = new ClientLogger(AzureDevOpsConnectorsImpl.class);

    private final AzureDevOpsConnectorsClient innerClient;

    private final com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager;

    public AzureDevOpsConnectorsImpl(
        AzureDevOpsConnectorsClient innerClient,
        com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AzureDevOpsConnector> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AzureDevOpsConnectorInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AzureDevOpsConnectorImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureDevOpsConnector> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AzureDevOpsConnectorInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AzureDevOpsConnectorImpl(inner1, this.manager()));
    }

    public Response<AzureDevOpsConnector> getByResourceGroupWithResponse(
        String resourceGroupName, String azureDevOpsConnectorName, Context context) {
        Response<AzureDevOpsConnectorInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, azureDevOpsConnectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureDevOpsConnectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureDevOpsConnector getByResourceGroup(String resourceGroupName, String azureDevOpsConnectorName) {
        AzureDevOpsConnectorInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, azureDevOpsConnectorName);
        if (inner != null) {
            return new AzureDevOpsConnectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String azureDevOpsConnectorName) {
        this.serviceClient().delete(resourceGroupName, azureDevOpsConnectorName);
    }

    public void delete(String resourceGroupName, String azureDevOpsConnectorName, Context context) {
        this.serviceClient().delete(resourceGroupName, azureDevOpsConnectorName, context);
    }

    public PagedIterable<AzureDevOpsConnector> list() {
        PagedIterable<AzureDevOpsConnectorInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AzureDevOpsConnectorImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureDevOpsConnector> list(Context context) {
        PagedIterable<AzureDevOpsConnectorInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AzureDevOpsConnectorImpl(inner1, this.manager()));
    }

    public AzureDevOpsConnector getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureDevOpsConnectorName = Utils.getValueFromIdByName(id, "azureDevOpsConnectors");
        if (azureDevOpsConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureDevOpsConnectors'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, azureDevOpsConnectorName, Context.NONE)
            .getValue();
    }

    public Response<AzureDevOpsConnector> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureDevOpsConnectorName = Utils.getValueFromIdByName(id, "azureDevOpsConnectors");
        if (azureDevOpsConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureDevOpsConnectors'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, azureDevOpsConnectorName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureDevOpsConnectorName = Utils.getValueFromIdByName(id, "azureDevOpsConnectors");
        if (azureDevOpsConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureDevOpsConnectors'.",
                                id)));
        }
        this.delete(resourceGroupName, azureDevOpsConnectorName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureDevOpsConnectorName = Utils.getValueFromIdByName(id, "azureDevOpsConnectors");
        if (azureDevOpsConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureDevOpsConnectors'.",
                                id)));
        }
        this.delete(resourceGroupName, azureDevOpsConnectorName, context);
    }

    private AzureDevOpsConnectorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager() {
        return this.serviceManager;
    }

    public AzureDevOpsConnectorImpl define(String name) {
        return new AzureDevOpsConnectorImpl(name, this.manager());
    }
}