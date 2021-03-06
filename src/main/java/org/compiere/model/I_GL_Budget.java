package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_Budget
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_Budget {

  /** TableName=GL_Budget */
  public static final String Table_Name = "GL_Budget";

  /** AD_Table_ID=271 */
  public static final int Table_ID = 271;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name BudgetStatus */
  public static final String COLUMNNAME_BudgetStatus = "BudgetStatus";

  /** Set Budget Status. Indicates the current status of this budget */
  public void setBudgetStatus(String BudgetStatus);

  /** Get Budget Status. Indicates the current status of this budget */
  public String getBudgetStatus();

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

  /** Column name GL_Budget_ID */
  public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";

  /** Set Budget. General Ledger Budget */
  public void setGL_Budget_ID(int GL_Budget_ID);

  /** Get Budget. General Ledger Budget */
  public int getGL_Budget_ID();

  /** Column name GL_Budget_UU */
  public static final String COLUMNNAME_GL_Budget_UU = "GL_Budget_UU";

  /** Set GL_Budget_UU */
  public void setGL_Budget_UU(String GL_Budget_UU);

  /** Get GL_Budget_UU */
  public String getGL_Budget_UU();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsPrimary */
  public static final String COLUMNNAME_IsPrimary = "IsPrimary";

  /** Set Primary. Indicates if this is the primary budget */
  public void setIsPrimary(boolean IsPrimary);

  /** Get Primary. Indicates if this is the primary budget */
  public boolean isPrimary();

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
