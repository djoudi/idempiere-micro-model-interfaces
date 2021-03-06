package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for HR_PayrollConcept
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_PayrollConcept {

  /** TableName=HR_PayrollConcept */
  public static final String Table_Name = "HR_PayrollConcept";

  /** AD_Table_ID=53096 */
  public static final int Table_ID = 53096;

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

  /** Column name AD_Rule_ID */
  public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";

  /** Set Rule */
  public void setAD_Rule_ID(int AD_Rule_ID);

  /** Get Rule */
  public int getAD_Rule_ID();

  public org.compiere.model.I_AD_Rule getAD_Rule() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name HR_Concept_ID */
  public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";

  /** Set Payroll Concept */
  public void setHR_Concept_ID(int HR_Concept_ID);

  /** Get Payroll Concept */
  public int getHR_Concept_ID();

  public org.eevolution.model.I_HR_Concept getHR_Concept() throws RuntimeException;

  /** Column name HR_PayrollConcept_ID */
  public static final String COLUMNNAME_HR_PayrollConcept_ID = "HR_PayrollConcept_ID";

  /** Set Payroll Concept */
  public void setHR_PayrollConcept_ID(int HR_PayrollConcept_ID);

  /** Get Payroll Concept */
  public int getHR_PayrollConcept_ID();

  /** Column name HR_PayrollConcept_UU */
  public static final String COLUMNNAME_HR_PayrollConcept_UU = "HR_PayrollConcept_UU";

  /** Set HR_PayrollConcept_UU */
  public void setHR_PayrollConcept_UU(String HR_PayrollConcept_UU);

  /** Get HR_PayrollConcept_UU */
  public String getHR_PayrollConcept_UU();

  /** Column name HR_Payroll_ID */
  public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";

  /** Set Payroll */
  public void setHR_Payroll_ID(int HR_Payroll_ID);

  /** Get Payroll */
  public int getHR_Payroll_ID();

  public org.eevolution.model.I_HR_Payroll getHR_Payroll() throws RuntimeException;

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsDisplayed */
  public static final String COLUMNNAME_IsDisplayed = "IsDisplayed";

  /** Set Displayed. Determines, if this field is displayed */
  public void setIsDisplayed(boolean IsDisplayed);

  /** Get Displayed. Determines, if this field is displayed */
  public boolean isDisplayed();

  /** Column name IsInclude */
  public static final String COLUMNNAME_IsInclude = "IsInclude";

  /** Set Included. Defines whether this content / template is included into another one */
  public void setIsInclude(boolean IsInclude);

  /** Get Included. Defines whether this content / template is included into another one */
  public boolean isInclude();

  /** Column name IsPrinted */
  public static final String COLUMNNAME_IsPrinted = "IsPrinted";

  /** Set Printed. Indicates if this document / line is printed */
  public void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  public boolean isPrinted();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name SeqNo */
  public static final String COLUMNNAME_SeqNo = "SeqNo";

  /** Set Sequence. Method of ordering records; lowest number comes first */
  public void setSeqNo(int SeqNo);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  public int getSeqNo();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
