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

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoAction;
import com.liferay.portal.workflow.kaleo.model.KaleoActionModel;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the KaleoAction service. Represents a row in the &quot;KaleoAction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.workflow.kaleo.model.KaleoActionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoActionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoActionImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoAction
 * @see com.liferay.portal.workflow.kaleo.model.KaleoActionModel
 * @generated
 */
public class KaleoActionModelImpl extends BaseModelImpl<KaleoAction>
	implements KaleoActionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo action model instance should use the {@link com.liferay.portal.workflow.kaleo.model.KaleoAction} interface instead.
	 */
	public static final String TABLE_NAME = "KaleoAction";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoActionId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kaleoClassName", Types.VARCHAR },
			{ "kaleoClassPK", Types.BIGINT },
			{ "kaleoDefinitionId", Types.BIGINT },
			{ "kaleoNodeName", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "executionType", Types.VARCHAR },
			{ "script", Types.CLOB },
			{ "scriptLanguage", Types.VARCHAR },
			{ "priority", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table KaleoAction (kaleoActionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoClassName VARCHAR(200) null,kaleoClassPK LONG,kaleoDefinitionId LONG,kaleoNodeName VARCHAR(200) null,name VARCHAR(200) null,description STRING null,executionType VARCHAR(20) null,script TEXT null,scriptLanguage VARCHAR(75) null,priority INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table KaleoAction";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoAction.priority ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KaleoAction.priority ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoAction"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoAction"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.workflow.kaleo.model.KaleoAction"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long EXECUTIONTYPE_COLUMN_BITMASK = 2L;
	public static long KALEOCLASSNAME_COLUMN_BITMASK = 4L;
	public static long KALEOCLASSPK_COLUMN_BITMASK = 8L;
	public static long KALEODEFINITIONID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoAction"));

	public KaleoActionModelImpl() {
	}

	public long getPrimaryKey() {
		return _kaleoActionId;
	}

	public void setPrimaryKey(long primaryKey) {
		setKaleoActionId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_kaleoActionId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return KaleoAction.class;
	}

	public String getModelClassName() {
		return KaleoAction.class.getName();
	}

	public long getKaleoActionId() {
		return _kaleoActionId;
	}

	public void setKaleoActionId(long kaleoActionId) {
		_kaleoActionId = kaleoActionId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getKaleoClassName() {
		if (_kaleoClassName == null) {
			return StringPool.BLANK;
		}
		else {
			return _kaleoClassName;
		}
	}

	public void setKaleoClassName(String kaleoClassName) {
		_columnBitmask |= KALEOCLASSNAME_COLUMN_BITMASK;

		if (_originalKaleoClassName == null) {
			_originalKaleoClassName = _kaleoClassName;
		}

		_kaleoClassName = kaleoClassName;
	}

	public String getOriginalKaleoClassName() {
		return GetterUtil.getString(_originalKaleoClassName);
	}

	public long getKaleoClassPK() {
		return _kaleoClassPK;
	}

	public void setKaleoClassPK(long kaleoClassPK) {
		_columnBitmask |= KALEOCLASSPK_COLUMN_BITMASK;

		if (!_setOriginalKaleoClassPK) {
			_setOriginalKaleoClassPK = true;

			_originalKaleoClassPK = _kaleoClassPK;
		}

		_kaleoClassPK = kaleoClassPK;
	}

	public long getOriginalKaleoClassPK() {
		return _originalKaleoClassPK;
	}

	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_columnBitmask |= KALEODEFINITIONID_COLUMN_BITMASK;

		if (!_setOriginalKaleoDefinitionId) {
			_setOriginalKaleoDefinitionId = true;

			_originalKaleoDefinitionId = _kaleoDefinitionId;
		}

		_kaleoDefinitionId = kaleoDefinitionId;
	}

	public long getOriginalKaleoDefinitionId() {
		return _originalKaleoDefinitionId;
	}

	public String getKaleoNodeName() {
		if (_kaleoNodeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _kaleoNodeName;
		}
	}

	public void setKaleoNodeName(String kaleoNodeName) {
		_kaleoNodeName = kaleoNodeName;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getExecutionType() {
		if (_executionType == null) {
			return StringPool.BLANK;
		}
		else {
			return _executionType;
		}
	}

	public void setExecutionType(String executionType) {
		_columnBitmask |= EXECUTIONTYPE_COLUMN_BITMASK;

		if (_originalExecutionType == null) {
			_originalExecutionType = _executionType;
		}

		_executionType = executionType;
	}

	public String getOriginalExecutionType() {
		return GetterUtil.getString(_originalExecutionType);
	}

	public String getScript() {
		if (_script == null) {
			return StringPool.BLANK;
		}
		else {
			return _script;
		}
	}

	public void setScript(String script) {
		_script = script;
	}

	public String getScriptLanguage() {
		if (_scriptLanguage == null) {
			return StringPool.BLANK;
		}
		else {
			return _scriptLanguage;
		}
	}

	public void setScriptLanguage(String scriptLanguage) {
		_scriptLanguage = scriptLanguage;
	}

	public int getPriority() {
		return _priority;
	}

	public void setPriority(int priority) {
		_columnBitmask = -1L;

		_priority = priority;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public KaleoAction toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (KaleoAction)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					KaleoAction.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		KaleoActionImpl kaleoActionImpl = new KaleoActionImpl();

		kaleoActionImpl.setKaleoActionId(getKaleoActionId());
		kaleoActionImpl.setGroupId(getGroupId());
		kaleoActionImpl.setCompanyId(getCompanyId());
		kaleoActionImpl.setUserId(getUserId());
		kaleoActionImpl.setUserName(getUserName());
		kaleoActionImpl.setCreateDate(getCreateDate());
		kaleoActionImpl.setModifiedDate(getModifiedDate());
		kaleoActionImpl.setKaleoClassName(getKaleoClassName());
		kaleoActionImpl.setKaleoClassPK(getKaleoClassPK());
		kaleoActionImpl.setKaleoDefinitionId(getKaleoDefinitionId());
		kaleoActionImpl.setKaleoNodeName(getKaleoNodeName());
		kaleoActionImpl.setName(getName());
		kaleoActionImpl.setDescription(getDescription());
		kaleoActionImpl.setExecutionType(getExecutionType());
		kaleoActionImpl.setScript(getScript());
		kaleoActionImpl.setScriptLanguage(getScriptLanguage());
		kaleoActionImpl.setPriority(getPriority());

		kaleoActionImpl.resetOriginalValues();

		return kaleoActionImpl;
	}

	public int compareTo(KaleoAction kaleoAction) {
		int value = 0;

		if (getPriority() < kaleoAction.getPriority()) {
			value = -1;
		}
		else if (getPriority() > kaleoAction.getPriority()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		KaleoAction kaleoAction = null;

		try {
			kaleoAction = (KaleoAction)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = kaleoAction.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		KaleoActionModelImpl kaleoActionModelImpl = this;

		kaleoActionModelImpl._originalCompanyId = kaleoActionModelImpl._companyId;

		kaleoActionModelImpl._setOriginalCompanyId = false;

		kaleoActionModelImpl._originalKaleoClassName = kaleoActionModelImpl._kaleoClassName;

		kaleoActionModelImpl._originalKaleoClassPK = kaleoActionModelImpl._kaleoClassPK;

		kaleoActionModelImpl._setOriginalKaleoClassPK = false;

		kaleoActionModelImpl._originalKaleoDefinitionId = kaleoActionModelImpl._kaleoDefinitionId;

		kaleoActionModelImpl._setOriginalKaleoDefinitionId = false;

		kaleoActionModelImpl._originalExecutionType = kaleoActionModelImpl._executionType;

		kaleoActionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<KaleoAction> toCacheModel() {
		KaleoActionCacheModel kaleoActionCacheModel = new KaleoActionCacheModel();

		kaleoActionCacheModel.kaleoActionId = getKaleoActionId();

		kaleoActionCacheModel.groupId = getGroupId();

		kaleoActionCacheModel.companyId = getCompanyId();

		kaleoActionCacheModel.userId = getUserId();

		kaleoActionCacheModel.userName = getUserName();

		String userName = kaleoActionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			kaleoActionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			kaleoActionCacheModel.createDate = createDate.getTime();
		}
		else {
			kaleoActionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			kaleoActionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			kaleoActionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		kaleoActionCacheModel.kaleoClassName = getKaleoClassName();

		String kaleoClassName = kaleoActionCacheModel.kaleoClassName;

		if ((kaleoClassName != null) && (kaleoClassName.length() == 0)) {
			kaleoActionCacheModel.kaleoClassName = null;
		}

		kaleoActionCacheModel.kaleoClassPK = getKaleoClassPK();

		kaleoActionCacheModel.kaleoDefinitionId = getKaleoDefinitionId();

		kaleoActionCacheModel.kaleoNodeName = getKaleoNodeName();

		String kaleoNodeName = kaleoActionCacheModel.kaleoNodeName;

		if ((kaleoNodeName != null) && (kaleoNodeName.length() == 0)) {
			kaleoActionCacheModel.kaleoNodeName = null;
		}

		kaleoActionCacheModel.name = getName();

		String name = kaleoActionCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			kaleoActionCacheModel.name = null;
		}

		kaleoActionCacheModel.description = getDescription();

		String description = kaleoActionCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			kaleoActionCacheModel.description = null;
		}

		kaleoActionCacheModel.executionType = getExecutionType();

		String executionType = kaleoActionCacheModel.executionType;

		if ((executionType != null) && (executionType.length() == 0)) {
			kaleoActionCacheModel.executionType = null;
		}

		kaleoActionCacheModel.script = getScript();

		String script = kaleoActionCacheModel.script;

		if ((script != null) && (script.length() == 0)) {
			kaleoActionCacheModel.script = null;
		}

		kaleoActionCacheModel.scriptLanguage = getScriptLanguage();

		String scriptLanguage = kaleoActionCacheModel.scriptLanguage;

		if ((scriptLanguage != null) && (scriptLanguage.length() == 0)) {
			kaleoActionCacheModel.scriptLanguage = null;
		}

		kaleoActionCacheModel.priority = getPriority();

		return kaleoActionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{kaleoActionId=");
		sb.append(getKaleoActionId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", kaleoClassName=");
		sb.append(getKaleoClassName());
		sb.append(", kaleoClassPK=");
		sb.append(getKaleoClassPK());
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoNodeName=");
		sb.append(getKaleoNodeName());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", executionType=");
		sb.append(getExecutionType());
		sb.append(", script=");
		sb.append(getScript());
		sb.append(", scriptLanguage=");
		sb.append(getScriptLanguage());
		sb.append(", priority=");
		sb.append(getPriority());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoAction");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoActionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoActionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoClassName</column-name><column-value><![CDATA[");
		sb.append(getKaleoClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoClassPK</column-name><column-value><![CDATA[");
		sb.append(getKaleoClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNodeName</column-name><column-value><![CDATA[");
		sb.append(getKaleoNodeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>executionType</column-name><column-value><![CDATA[");
		sb.append(getExecutionType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>script</column-name><column-value><![CDATA[");
		sb.append(getScript());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scriptLanguage</column-name><column-value><![CDATA[");
		sb.append(getScriptLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = KaleoAction.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			KaleoAction.class
		};
	private long _kaleoActionId;
	private long _groupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _kaleoClassName;
	private String _originalKaleoClassName;
	private long _kaleoClassPK;
	private long _originalKaleoClassPK;
	private boolean _setOriginalKaleoClassPK;
	private long _kaleoDefinitionId;
	private long _originalKaleoDefinitionId;
	private boolean _setOriginalKaleoDefinitionId;
	private String _kaleoNodeName;
	private String _name;
	private String _description;
	private String _executionType;
	private String _originalExecutionType;
	private String _script;
	private String _scriptLanguage;
	private int _priority;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private KaleoAction _escapedModelProxy;
}