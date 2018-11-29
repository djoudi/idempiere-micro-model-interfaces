package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for WS_WebServiceType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_WS_WebServiceType {

  /** TableName=WS_WebServiceType */
  public static final String Table_Name = "WS_WebServiceType";

  /** AD_Table_ID=53164 */
  public static final int Table_ID = 53164;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name AD_Table_ID */
  public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  public void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  public int getAD_Table_ID();

  public I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Column name Help */
  public static final String COLUMNNAME_Help = "Help";

  /** Set Comment/Help. Comment or Hint */
  public void setHelp(String Help);

  /** Get Comment/Help. Comment or Hint */
  public String getHelp();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

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

  /** Column name Value */
  public static final String COLUMNNAME_Value = "Value";

  /** Set Search Key. Search key for the record in the format required - must be unique */
  public void setValue(String Value);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  public String getValue();

  /** Column name WS_WebService_ID */
  public static final String COLUMNNAME_WS_WebService_ID = "WS_WebService_ID";

  /** Set Web Service */
  public void setWS_WebService_ID(int WS_WebService_ID);

  /** Get Web Service */
  public int getWS_WebService_ID();

  public I_WS_WebService getWS_WebService() throws RuntimeException;

  /** Column name WS_WebServiceMethod_ID */
  public static final String COLUMNNAME_WS_WebServiceMethod_ID = "WS_WebServiceMethod_ID";

  /** Set Web Service Method */
  public void setWS_WebServiceMethod_ID(int WS_WebServiceMethod_ID);

  /** Get Web Service Method */
  public int getWS_WebServiceMethod_ID();

  public I_WS_WebServiceMethod getWS_WebServiceMethod() throws RuntimeException;

  /** Column name WS_WebServiceType_ID */
  public static final String COLUMNNAME_WS_WebServiceType_ID = "WS_WebServiceType_ID";

  /** Set Web Service Type */
  public void setWS_WebServiceType_ID(int WS_WebServiceType_ID);

  /** Get Web Service Type */
  public int getWS_WebServiceType_ID();

  /** Column name WS_WebServiceType_UU */
  public static final String COLUMNNAME_WS_WebServiceType_UU = "WS_WebServiceType_UU";

  /** Set WS_WebServiceType_UU */
  public void setWS_WebServiceType_UU(String WS_WebServiceType_UU);

  /** Get WS_WebServiceType_UU */
  public String getWS_WebServiceType_UU();
}