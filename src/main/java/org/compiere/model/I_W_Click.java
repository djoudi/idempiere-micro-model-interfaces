package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_Click
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_Click {

  /** TableName=W_Click */
  public static final String Table_Name = "W_Click";

  /** AD_Table_ID=550 */
  public static final int Table_ID = 550;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AcceptLanguage */
  public static final String COLUMNNAME_AcceptLanguage = "AcceptLanguage";

  /** Set Accept Language. Language accepted based on browser information */
  public void setAcceptLanguage(String AcceptLanguage);

  /** Get Accept Language. Language accepted based on browser information */
  public String getAcceptLanguage();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name AD_User_ID */
  public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  public void setAD_User_ID(int AD_User_ID);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  public int getAD_User_ID();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name EMail */
  public static final String COLUMNNAME_EMail = "EMail";

  /** Set EMail Address. Electronic Mail Address */
  public void setEMail(String EMail);

  /** Get EMail Address. Electronic Mail Address */
  public String getEMail();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Column name Referrer */
  public static final String COLUMNNAME_Referrer = "Referrer";

  /** Set Referrer. Referring web address */
  public void setReferrer(String Referrer);

  /** Get Referrer. Referring web address */
  public String getReferrer();

  /** Column name Remote_Addr */
  public static final String COLUMNNAME_Remote_Addr = "Remote_Addr";

  /** Set Remote Addr. Remote Address */
  public void setRemote_Addr(String Remote_Addr);

  /** Get Remote Addr. Remote Address */
  public String getRemote_Addr();

  /** Column name Remote_Host */
  public static final String COLUMNNAME_Remote_Host = "Remote_Host";

  /** Set Remote Host. Remote host Info */
  public void setRemote_Host(String Remote_Host);

  /** Get Remote Host. Remote host Info */
  public String getRemote_Host();

  /** Column name TargetURL */
  public static final String COLUMNNAME_TargetURL = "TargetURL";

  /** Set Target URL. URL for the Target */
  public void setTargetURL(String TargetURL);

  /** Get Target URL. URL for the Target */
  public String getTargetURL();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name UserAgent */
  public static final String COLUMNNAME_UserAgent = "UserAgent";

  /** Set User Agent. Browser Used */
  public void setUserAgent(String UserAgent);

  /** Get User Agent. Browser Used */
  public String getUserAgent();

  /** Column name W_ClickCount_ID */
  public static final String COLUMNNAME_W_ClickCount_ID = "W_ClickCount_ID";

  /** Set Click Count. Web Click Management */
  public void setW_ClickCount_ID(int W_ClickCount_ID);

  /** Get Click Count. Web Click Management */
  public int getW_ClickCount_ID();

  public I_W_ClickCount getW_ClickCount() throws RuntimeException;

  /** Column name W_Click_ID */
  public static final String COLUMNNAME_W_Click_ID = "W_Click_ID";

  /** Set Web Click. Individual Web Click */
  public void setW_Click_ID(int W_Click_ID);

  /** Get Web Click. Individual Web Click */
  public int getW_Click_ID();

  /** Column name W_Click_UU */
  public static final String COLUMNNAME_W_Click_UU = "W_Click_UU";

  /** Set W_Click_UU */
  public void setW_Click_UU(String W_Click_UU);

  /** Get W_Click_UU */
  public String getW_Click_UU();
}
