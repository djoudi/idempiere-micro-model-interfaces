package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DepositBatchLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DepositBatchLine {

  /** TableName=C_DepositBatchLine */
  public static final String Table_Name = "C_DepositBatchLine";

  /** AD_Table_ID=200057 */
  public static final int Table_ID = 200057;

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

  /** Column name C_DepositBatch_ID */
  public static final String COLUMNNAME_C_DepositBatch_ID = "C_DepositBatch_ID";

  /** Set Deposit Batch */
  public void setC_DepositBatch_ID(int C_DepositBatch_ID);

  /** Get Deposit Batch */
  public int getC_DepositBatch_ID();

  public I_C_DepositBatch getC_DepositBatch() throws RuntimeException;

  /** Column name C_DepositBatchLine_ID */
  public static final String COLUMNNAME_C_DepositBatchLine_ID = "C_DepositBatchLine_ID";

  /** Set Deposit Batch Line */
  public void setC_DepositBatchLine_ID(int C_DepositBatchLine_ID);

  /** Get Deposit Batch Line */
  public int getC_DepositBatchLine_ID();

  /** Column name C_DepositBatchLine_UU */
  public static final String COLUMNNAME_C_DepositBatchLine_UU = "C_DepositBatchLine_UU";

  /** Set C_DepositBatchLine_UU */
  public void setC_DepositBatchLine_UU(String C_DepositBatchLine_UU);

  /** Get C_DepositBatchLine_UU */
  public String getC_DepositBatchLine_UU();

  /** Column name C_Payment_ID */
  public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";

  /** Set Payment. Payment identifier */
  public void setC_Payment_ID(int C_Payment_ID);

  /** Get Payment. Payment identifier */
  public int getC_Payment_ID();

  public I_C_Payment getC_Payment() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name Line */
  public static final String COLUMNNAME_Line = "Line";

  /** Set Line No. Unique line for this document */
  public void setLine(int Line);

  /** Get Line No. Unique line for this document */
  public int getLine();

  /** Column name PayAmt */
  public static final String COLUMNNAME_PayAmt = "PayAmt";

  /** Set Payment amount. Amount being paid */
  public void setPayAmt(BigDecimal PayAmt);

  /** Get Payment amount. Amount being paid */
  public BigDecimal getPayAmt();

  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Process Now */
  public boolean isProcessing();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
