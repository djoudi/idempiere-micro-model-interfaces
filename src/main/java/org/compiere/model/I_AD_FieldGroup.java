package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_FieldGroup
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_FieldGroup {

  /** TableName=AD_FieldGroup */
  public static final String Table_Name = "AD_FieldGroup";

  /** AD_Table_ID=414 */
  public static final int Table_ID = 414;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_FieldGroup_ID */
  public static final String COLUMNNAME_AD_FieldGroup_ID = "AD_FieldGroup_ID";

  /** Set Field Group. Logical grouping of fields */
  public void setAD_FieldGroup_ID(int AD_FieldGroup_ID);

  /** Get Field Group. Logical grouping of fields */
  public int getAD_FieldGroup_ID();

  /** Column name AD_FieldGroup_UU */
  public static final String COLUMNNAME_AD_FieldGroup_UU = "AD_FieldGroup_UU";

  /** Set AD_FieldGroup_UU */
  public void setAD_FieldGroup_UU(String AD_FieldGroup_UU);

  /** Get AD_FieldGroup_UU */
  public String getAD_FieldGroup_UU();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name EntityType */
  public static final String COLUMNNAME_EntityType = "EntityType";

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  public void setEntityType(String EntityType);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  public String getEntityType();

  /** Column name FieldGroupType */
  public static final String COLUMNNAME_FieldGroupType = "FieldGroupType";

  /** Set Field Group Type */
  public void setFieldGroupType(String FieldGroupType);

  /** Get Field Group Type */
  public String getFieldGroupType();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsCollapsedByDefault */
  public static final String COLUMNNAME_IsCollapsedByDefault = "IsCollapsedByDefault";

  /** Set Collapsed By Default. Flag to set the initial state of collapsible field group. */
  public void setIsCollapsedByDefault(boolean IsCollapsedByDefault);

  /** Get Collapsed By Default. Flag to set the initial state of collapsible field group. */
  public boolean isCollapsedByDefault();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
