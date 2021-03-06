package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeSetExclude
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeSetExclude {

  /** TableName=M_AttributeSetExclude */
  public static final String Table_Name = "M_AttributeSetExclude";

  /** AD_Table_ID=809 */
  public static final int Table_ID = 809;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

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

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name IsSOTrx */
  public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

  /** Set Sales Transaction. This is a Sales Transaction */
  public void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  public boolean isSOTrx();

  /** Column name M_AttributeSetExclude_ID */
  public static final String COLUMNNAME_M_AttributeSetExclude_ID = "M_AttributeSetExclude_ID";

  /** Set Exclude Attribute Set. Exclude the ability to enter Attribute Sets */
  public void setM_AttributeSetExclude_ID(int M_AttributeSetExclude_ID);

  /** Get Exclude Attribute Set. Exclude the ability to enter Attribute Sets */
  public int getMAttributeSetExclude_ID();

  /** Column name M_AttributeSetExclude_UU */
  public static final String COLUMNNAME_M_AttributeSetExclude_UU = "M_AttributeSetExclude_UU";

  /** Set M_AttributeSetExclude_UU */
  public void setM_AttributeSetExclude_UU(String M_AttributeSetExclude_UU);

  /** Get M_AttributeSetExclude_UU */
  public String getMAttributeSetExclude_UU();

  /** Column name M_AttributeSet_ID */
  public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";

  /** Set Attribute Set. Product Attribute Set */
  public void setM_AttributeSet_ID(int M_AttributeSet_ID);

  /** Get Attribute Set. Product Attribute Set */
  public int getMAttributeSet_ID();

  public I_M_AttributeSet getMAttributeSet() throws RuntimeException;

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
