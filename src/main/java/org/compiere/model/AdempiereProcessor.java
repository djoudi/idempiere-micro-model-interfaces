package org.compiere.model;

import java.sql.Timestamp;
import java.util.Properties;
import org.idempiere.common.exceptions.AdempiereException;

/**
 * Processor Interface
 *
 * @author Jorg Janke
 * @version $Id: AdempiereProcessor.java,v 1.2 2006/07/30 00:51:03 jjanke Exp $
 */
public interface AdempiereProcessor {

  /**
   * Get Name
   *
   * @return Name
   */
  public String getName();

  /**
   * Get Description
   *
   * @return Description
   */
  public String getDescription();

  /**
   * Get Context
   *
   * @return context
   */
  public Properties getCtx();

  /**
   * Get the frequency type
   *
   * @return frequency type
   */
  public String getFrequencyType();

  /**
   * Get the schedule type
   *
   * @return schedule type
   */
  public String getScheduleType();

  /**
   * Get the cron pattern
   *
   * @return cron pattern
   */
  public String getCronPattern();

  /**
   * Get the frequency
   *
   * @return frequency
   */
  public int getFrequency();

  /**
   * Get Unique ID
   *
   * @return Unique ID
   */
  public String getServerID();

  /**
   * Get the date Next run
   *
   * @param requery requery database
   * @return date next run
   */
  public Timestamp getDateNextRun(boolean requery);

  /**
   * Set Date Next Run
   *
   * @param dateNextWork next work
   */
  public void setDateNextRun(Timestamp dateNextWork);

  /**
   * Get the date Last run
   *
   * @return date lext run
   */
  public Timestamp getDateLastRun();

  /**
   * Set Date Last Run
   *
   * @param dateLastRun last run
   */
  public void setDateLastRun(Timestamp dateLastRun);

  /**
   * Save
   *
   * @return true if saved
   */
  public boolean save();

  /**
   * Save throwing exception
   *
   * @throws AdempiereException
   * @see #save()
   */
  public void saveEx() throws AdempiereException;

  /**
   * Get Processor Logs
   *
   * @return logs
   */
  public AdempiereProcessorLog[] getLogs();

  int getClientId();
} //	AdempiereProcessor
