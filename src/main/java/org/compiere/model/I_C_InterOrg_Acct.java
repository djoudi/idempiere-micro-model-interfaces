package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_InterOrg_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InterOrg_Acct {

  /** TableName=C_InterOrg_Acct */
  public static final String Table_Name = "C_InterOrg_Acct";

  /** AD_Table_ID=397 */
  public static final int Table_ID = 397;

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

  /** Column name AD_OrgTo_ID */
  public static final String COLUMNNAME_AD_OrgTo_ID = "AD_OrgTo_ID";

  /** Set Inter-Organization. Organization valid for intercompany documents */
  public void setAD_OrgTo_ID(int AD_OrgTo_ID);

  /** Get Inter-Organization. Organization valid for intercompany documents */
  public int getAD_OrgTo_ID();

  /** Column name C_AcctSchema_ID */
  public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

  /** Set Accounting Schema. Rules for accounting */
  public void setC_AcctSchema_ID(int C_AcctSchema_ID);

  /** Get Accounting Schema. Rules for accounting */
  public int getC_AcctSchema_ID();

  public I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Column name C_InterOrg_Acct_UU */
  public static final String COLUMNNAME_C_InterOrg_Acct_UU = "C_InterOrg_Acct_UU";

  /** Set C_InterOrg_Acct_UU */
  public void setC_InterOrg_Acct_UU(String C_InterOrg_Acct_UU);

  /** Get C_InterOrg_Acct_UU */
  public String getC_InterOrg_Acct_UU();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name IntercompanyDueFrom_Acct */
  public static final String COLUMNNAME_IntercompanyDueFrom_Acct = "IntercompanyDueFrom_Acct";

  /** Set Intercompany Due From Acct. Intercompany Due From / Receivables Account */
  public void setIntercompanyDueFrom_Acct(int IntercompanyDueFrom_Acct);

  /** Get Intercompany Due From Acct. Intercompany Due From / Receivables Account */
  public int getIntercompanyDueFrom_Acct();

  public I_C_ValidCombination getIntercompanyDueFrom_A() throws RuntimeException;

  /** Column name IntercompanyDueTo_Acct */
  public static final String COLUMNNAME_IntercompanyDueTo_Acct = "IntercompanyDueTo_Acct";

  /** Set Intercompany Due To Acct. Intercompany Due To / Payable Account */
  public void setIntercompanyDueTo_Acct(int IntercompanyDueTo_Acct);

  /** Get Intercompany Due To Acct. Intercompany Due To / Payable Account */
  public int getIntercompanyDueTo_Acct();

  public I_C_ValidCombination getIntercompanyDueTo_A() throws RuntimeException;

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
