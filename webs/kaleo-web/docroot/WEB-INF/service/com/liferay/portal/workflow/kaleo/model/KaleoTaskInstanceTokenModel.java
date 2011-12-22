/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoTaskInstanceToken service. Represents a row in the &quot;KaleoTaskInstanceToken&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskInstanceTokenModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskInstanceTokenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTaskInstanceToken
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskInstanceTokenImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskInstanceTokenModelImpl
 * @generated
 */
public interface KaleoTaskInstanceTokenModel extends BaseModel<KaleoTaskInstanceToken>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo task instance token model instance should use the {@link KaleoTaskInstanceToken} interface instead.
	 */

	/**
	 * Returns the primary key of this kaleo task instance token.
	 *
	 * @return the primary key of this kaleo task instance token
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo task instance token.
	 *
	 * @param primaryKey the primary key of this kaleo task instance token
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the kaleo task instance token ID of this kaleo task instance token.
	 *
	 * @return the kaleo task instance token ID of this kaleo task instance token
	 */
	public long getKaleoTaskInstanceTokenId();

	/**
	 * Sets the kaleo task instance token ID of this kaleo task instance token.
	 *
	 * @param kaleoTaskInstanceTokenId the kaleo task instance token ID of this kaleo task instance token
	 */
	public void setKaleoTaskInstanceTokenId(long kaleoTaskInstanceTokenId);

	/**
	 * Returns the group ID of this kaleo task instance token.
	 *
	 * @return the group ID of this kaleo task instance token
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo task instance token.
	 *
	 * @param groupId the group ID of this kaleo task instance token
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this kaleo task instance token.
	 *
	 * @return the company ID of this kaleo task instance token
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo task instance token.
	 *
	 * @param companyId the company ID of this kaleo task instance token
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this kaleo task instance token.
	 *
	 * @return the user ID of this kaleo task instance token
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this kaleo task instance token.
	 *
	 * @param userId the user ID of this kaleo task instance token
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this kaleo task instance token.
	 *
	 * @return the user uuid of this kaleo task instance token
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo task instance token.
	 *
	 * @param userUuid the user uuid of this kaleo task instance token
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this kaleo task instance token.
	 *
	 * @return the user name of this kaleo task instance token
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this kaleo task instance token.
	 *
	 * @param userName the user name of this kaleo task instance token
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this kaleo task instance token.
	 *
	 * @return the create date of this kaleo task instance token
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo task instance token.
	 *
	 * @param createDate the create date of this kaleo task instance token
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this kaleo task instance token.
	 *
	 * @return the modified date of this kaleo task instance token
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo task instance token.
	 *
	 * @param modifiedDate the modified date of this kaleo task instance token
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the kaleo definition ID of this kaleo task instance token.
	 *
	 * @return the kaleo definition ID of this kaleo task instance token
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition ID of this kaleo task instance token.
	 *
	 * @param kaleoDefinitionId the kaleo definition ID of this kaleo task instance token
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Returns the kaleo instance ID of this kaleo task instance token.
	 *
	 * @return the kaleo instance ID of this kaleo task instance token
	 */
	public long getKaleoInstanceId();

	/**
	 * Sets the kaleo instance ID of this kaleo task instance token.
	 *
	 * @param kaleoInstanceId the kaleo instance ID of this kaleo task instance token
	 */
	public void setKaleoInstanceId(long kaleoInstanceId);

	/**
	 * Returns the kaleo instance token ID of this kaleo task instance token.
	 *
	 * @return the kaleo instance token ID of this kaleo task instance token
	 */
	public long getKaleoInstanceTokenId();

	/**
	 * Sets the kaleo instance token ID of this kaleo task instance token.
	 *
	 * @param kaleoInstanceTokenId the kaleo instance token ID of this kaleo task instance token
	 */
	public void setKaleoInstanceTokenId(long kaleoInstanceTokenId);

	/**
	 * Returns the kaleo task ID of this kaleo task instance token.
	 *
	 * @return the kaleo task ID of this kaleo task instance token
	 */
	public long getKaleoTaskId();

	/**
	 * Sets the kaleo task ID of this kaleo task instance token.
	 *
	 * @param kaleoTaskId the kaleo task ID of this kaleo task instance token
	 */
	public void setKaleoTaskId(long kaleoTaskId);

	/**
	 * Returns the kaleo task name of this kaleo task instance token.
	 *
	 * @return the kaleo task name of this kaleo task instance token
	 */
	@AutoEscape
	public String getKaleoTaskName();

	/**
	 * Sets the kaleo task name of this kaleo task instance token.
	 *
	 * @param kaleoTaskName the kaleo task name of this kaleo task instance token
	 */
	public void setKaleoTaskName(String kaleoTaskName);

	/**
	 * Returns the class name of this kaleo task instance token.
	 *
	 * @return the class name of this kaleo task instance token
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this kaleo task instance token.
	 *
	 * @param className the class name of this kaleo task instance token
	 */
	public void setClassName(String className);

	/**
	 * Returns the class p k of this kaleo task instance token.
	 *
	 * @return the class p k of this kaleo task instance token
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this kaleo task instance token.
	 *
	 * @param classPK the class p k of this kaleo task instance token
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the completion user ID of this kaleo task instance token.
	 *
	 * @return the completion user ID of this kaleo task instance token
	 */
	public long getCompletionUserId();

	/**
	 * Sets the completion user ID of this kaleo task instance token.
	 *
	 * @param completionUserId the completion user ID of this kaleo task instance token
	 */
	public void setCompletionUserId(long completionUserId);

	/**
	 * Returns the completion user uuid of this kaleo task instance token.
	 *
	 * @return the completion user uuid of this kaleo task instance token
	 * @throws SystemException if a system exception occurred
	 */
	public String getCompletionUserUuid() throws SystemException;

	/**
	 * Sets the completion user uuid of this kaleo task instance token.
	 *
	 * @param completionUserUuid the completion user uuid of this kaleo task instance token
	 */
	public void setCompletionUserUuid(String completionUserUuid);

	/**
	 * Returns the completed of this kaleo task instance token.
	 *
	 * @return the completed of this kaleo task instance token
	 */
	public boolean getCompleted();

	/**
	 * Returns <code>true</code> if this kaleo task instance token is completed.
	 *
	 * @return <code>true</code> if this kaleo task instance token is completed; <code>false</code> otherwise
	 */
	public boolean isCompleted();

	/**
	 * Sets whether this kaleo task instance token is completed.
	 *
	 * @param completed the completed of this kaleo task instance token
	 */
	public void setCompleted(boolean completed);

	/**
	 * Returns the completion date of this kaleo task instance token.
	 *
	 * @return the completion date of this kaleo task instance token
	 */
	public Date getCompletionDate();

	/**
	 * Sets the completion date of this kaleo task instance token.
	 *
	 * @param completionDate the completion date of this kaleo task instance token
	 */
	public void setCompletionDate(Date completionDate);

	/**
	 * Returns the due date of this kaleo task instance token.
	 *
	 * @return the due date of this kaleo task instance token
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this kaleo task instance token.
	 *
	 * @param dueDate the due date of this kaleo task instance token
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the workflow context of this kaleo task instance token.
	 *
	 * @return the workflow context of this kaleo task instance token
	 */
	@AutoEscape
	public String getWorkflowContext();

	/**
	 * Sets the workflow context of this kaleo task instance token.
	 *
	 * @param workflowContext the workflow context of this kaleo task instance token
	 */
	public void setWorkflowContext(String workflowContext);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(KaleoTaskInstanceToken kaleoTaskInstanceToken);

	public int hashCode();

	public CacheModel<KaleoTaskInstanceToken> toCacheModel();

	public KaleoTaskInstanceToken toEscapedModel();

	public String toString();

	public String toXmlString();
}