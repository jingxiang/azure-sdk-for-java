// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.SupportTicketDetailsInner;
import com.azure.resourcemanager.support.models.Consent;
import com.azure.resourcemanager.support.models.ContactProfile;
import com.azure.resourcemanager.support.models.QuotaTicketDetails;
import com.azure.resourcemanager.support.models.SecondaryConsent;
import com.azure.resourcemanager.support.models.ServiceLevelAgreement;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.Status;
import com.azure.resourcemanager.support.models.SupportEngineer;
import com.azure.resourcemanager.support.models.SupportTicketDetails;
import com.azure.resourcemanager.support.models.TechnicalTicketDetails;
import com.azure.resourcemanager.support.models.UpdateContactProfile;
import com.azure.resourcemanager.support.models.UpdateSupportTicket;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class SupportTicketDetailsImpl
    implements SupportTicketDetails, SupportTicketDetails.Definition, SupportTicketDetails.Update {
    private SupportTicketDetailsInner innerObject;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String supportTicketId() {
        return this.innerModel().supportTicketId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String problemClassificationId() {
        return this.innerModel().problemClassificationId();
    }

    public String problemClassificationDisplayName() {
        return this.innerModel().problemClassificationDisplayName();
    }

    public SeverityLevel severity() {
        return this.innerModel().severity();
    }

    public String enrollmentId() {
        return this.innerModel().enrollmentId();
    }

    public Boolean require24X7Response() {
        return this.innerModel().require24X7Response();
    }

    public Consent advancedDiagnosticConsent() {
        return this.innerModel().advancedDiagnosticConsent();
    }

    public String problemScopingQuestions() {
        return this.innerModel().problemScopingQuestions();
    }

    public String supportPlanId() {
        return this.innerModel().supportPlanId();
    }

    public ContactProfile contactDetails() {
        return this.innerModel().contactDetails();
    }

    public ServiceLevelAgreement serviceLevelAgreement() {
        return this.innerModel().serviceLevelAgreement();
    }

    public SupportEngineer supportEngineer() {
        return this.innerModel().supportEngineer();
    }

    public String supportPlanType() {
        return this.innerModel().supportPlanType();
    }

    public String supportPlanDisplayName() {
        return this.innerModel().supportPlanDisplayName();
    }

    public String title() {
        return this.innerModel().title();
    }

    public OffsetDateTime problemStartTime() {
        return this.innerModel().problemStartTime();
    }

    public String serviceId() {
        return this.innerModel().serviceId();
    }

    public String serviceDisplayName() {
        return this.innerModel().serviceDisplayName();
    }

    public String status() {
        return this.innerModel().status();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public OffsetDateTime modifiedDate() {
        return this.innerModel().modifiedDate();
    }

    public String fileWorkspaceName() {
        return this.innerModel().fileWorkspaceName();
    }

    public TechnicalTicketDetails technicalTicketDetails() {
        return this.innerModel().technicalTicketDetails();
    }

    public QuotaTicketDetails quotaTicketDetails() {
        return this.innerModel().quotaTicketDetails();
    }

    public List<SecondaryConsent> secondaryConsent() {
        List<SecondaryConsent> inner = this.innerModel().secondaryConsent();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SupportTicketDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }

    private String supportTicketName;

    private UpdateSupportTicket updateUpdateSupportTicket;

    public SupportTicketDetails create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSupportTickets()
                .create(supportTicketName, this.innerModel(), Context.NONE);
        return this;
    }

    public SupportTicketDetails create(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getSupportTickets().create(supportTicketName, this.innerModel(), context);
        return this;
    }

    SupportTicketDetailsImpl(String name, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerObject = new SupportTicketDetailsInner();
        this.serviceManager = serviceManager;
        this.supportTicketName = name;
    }

    public SupportTicketDetailsImpl update() {
        this.updateUpdateSupportTicket = new UpdateSupportTicket();
        return this;
    }

    public SupportTicketDetails apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSupportTickets()
                .updateWithResponse(supportTicketName, updateUpdateSupportTicket, Context.NONE)
                .getValue();
        return this;
    }

    public SupportTicketDetails apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSupportTickets()
                .updateWithResponse(supportTicketName, updateUpdateSupportTicket, context)
                .getValue();
        return this;
    }

    SupportTicketDetailsImpl(
        SupportTicketDetailsInner innerObject, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.supportTicketName = Utils.getValueFromIdByName(innerObject.id(), "supportTickets");
    }

    public SupportTicketDetails refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSupportTickets()
                .getWithResponse(supportTicketName, Context.NONE)
                .getValue();
        return this;
    }

    public SupportTicketDetails refresh(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getSupportTickets().getWithResponse(supportTicketName, context).getValue();
        return this;
    }

    public SupportTicketDetailsImpl withSupportTicketId(String supportTicketId) {
        this.innerModel().withSupportTicketId(supportTicketId);
        return this;
    }

    public SupportTicketDetailsImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public SupportTicketDetailsImpl withProblemClassificationId(String problemClassificationId) {
        this.innerModel().withProblemClassificationId(problemClassificationId);
        return this;
    }

    public SupportTicketDetailsImpl withSeverity(SeverityLevel severity) {
        if (isInCreateMode()) {
            this.innerModel().withSeverity(severity);
            return this;
        } else {
            this.updateUpdateSupportTicket.withSeverity(severity);
            return this;
        }
    }

    public SupportTicketDetailsImpl withRequire24X7Response(Boolean require24X7Response) {
        this.innerModel().withRequire24X7Response(require24X7Response);
        return this;
    }

    public SupportTicketDetailsImpl withAdvancedDiagnosticConsent(Consent advancedDiagnosticConsent) {
        if (isInCreateMode()) {
            this.innerModel().withAdvancedDiagnosticConsent(advancedDiagnosticConsent);
            return this;
        } else {
            this.updateUpdateSupportTicket.withAdvancedDiagnosticConsent(advancedDiagnosticConsent);
            return this;
        }
    }

    public SupportTicketDetailsImpl withProblemScopingQuestions(String problemScopingQuestions) {
        this.innerModel().withProblemScopingQuestions(problemScopingQuestions);
        return this;
    }

    public SupportTicketDetailsImpl withSupportPlanId(String supportPlanId) {
        this.innerModel().withSupportPlanId(supportPlanId);
        return this;
    }

    public SupportTicketDetailsImpl withContactDetails(ContactProfile contactDetails) {
        this.innerModel().withContactDetails(contactDetails);
        return this;
    }

    public SupportTicketDetailsImpl withServiceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement) {
        this.innerModel().withServiceLevelAgreement(serviceLevelAgreement);
        return this;
    }

    public SupportTicketDetailsImpl withSupportEngineer(SupportEngineer supportEngineer) {
        this.innerModel().withSupportEngineer(supportEngineer);
        return this;
    }

    public SupportTicketDetailsImpl withTitle(String title) {
        this.innerModel().withTitle(title);
        return this;
    }

    public SupportTicketDetailsImpl withProblemStartTime(OffsetDateTime problemStartTime) {
        this.innerModel().withProblemStartTime(problemStartTime);
        return this;
    }

    public SupportTicketDetailsImpl withServiceId(String serviceId) {
        this.innerModel().withServiceId(serviceId);
        return this;
    }

    public SupportTicketDetailsImpl withFileWorkspaceName(String fileWorkspaceName) {
        this.innerModel().withFileWorkspaceName(fileWorkspaceName);
        return this;
    }

    public SupportTicketDetailsImpl withTechnicalTicketDetails(TechnicalTicketDetails technicalTicketDetails) {
        this.innerModel().withTechnicalTicketDetails(technicalTicketDetails);
        return this;
    }

    public SupportTicketDetailsImpl withQuotaTicketDetails(QuotaTicketDetails quotaTicketDetails) {
        this.innerModel().withQuotaTicketDetails(quotaTicketDetails);
        return this;
    }

    public SupportTicketDetailsImpl withSecondaryConsent(List<SecondaryConsent> secondaryConsent) {
        if (isInCreateMode()) {
            this.innerModel().withSecondaryConsent(secondaryConsent);
            return this;
        } else {
            this.updateUpdateSupportTicket.withSecondaryConsent(secondaryConsent);
            return this;
        }
    }

    public SupportTicketDetailsImpl withStatus(Status status) {
        this.updateUpdateSupportTicket.withStatus(status);
        return this;
    }

    public SupportTicketDetailsImpl withContactDetails(UpdateContactProfile contactDetails) {
        this.updateUpdateSupportTicket.withContactDetails(contactDetails);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
