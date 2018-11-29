package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_WikiToken
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_WikiToken {

  /** TableName=CM_WikiToken */
  public static final String Table_Name = "CM_WikiToken";

  /** AD_Table_ID=905 */
  public static final int Table_ID = 905;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

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

  /** Column name CM_WikiToken_ID */
  public static final String COLUMNNAME_CM_WikiToken_ID = "CM_WikiToken_ID";

  /** Set Wiki Token. Wiki Token */
  public void setCM_WikiToken_ID(int CM_WikiToken_ID);

  /** Get Wiki Token. Wiki Token */
  public int getCM_WikiToken_ID();

  /** Column name CM_WikiToken_UU */
  public static final String COLUMNNAME_CM_WikiToken_UU = "CM_WikiToken_UU";

  /** Set CM_WikiToken_UU */
  public void setCM_WikiToken_UU(String CM_WikiToken_UU);

  /** Get CM_WikiToken_UU */
  public String getCM_WikiToken_UU();

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

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name Macro */
  public static final String COLUMNNAME_Macro = "Macro";

  /** Set Macro. Macro */
  public void setMacro(String Macro);

  /** Get Macro. Macro */
  public String getMacro();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name SelectClause */
  public static final String COLUMNNAME_SelectClause = "SelectClause";

  /** Set Sql SELECT. SQL SELECT clause */
  public void setSelectClause(String SelectClause);

  /** Get Sql SELECT. SQL SELECT clause */
  public String getSelectClause();

  /** Column name TokenType */
  public static final String COLUMNNAME_TokenType = "TokenType";

  /** Set TokenType. Wiki Token Type */
  public void setTokenType(String TokenType);

  /** Get TokenType. Wiki Token Type */
  public String getTokenType();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name WhereClause */
  public static final String COLUMNNAME_WhereClause = "WhereClause";

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  public void setWhereClause(String WhereClause);

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  public String getWhereClause();
}