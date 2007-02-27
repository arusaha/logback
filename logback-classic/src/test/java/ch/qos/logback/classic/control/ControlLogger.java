/** 
 * LOGBack: the reliable, fast and flexible logging library for Java.
 *
 * Copyright (C) 1999-2005, QOS.ch, LOGBack.com
 *
 * This library is free software, you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation.
 */
package ch.qos.logback.classic.control;

import org.slf4j.helpers.MarkerIgnoringBase;

import ch.qos.logback.classic.Level;

/**
 * See javadoc for ControlLoggerContext.
 */
public class ControlLogger extends MarkerIgnoringBase {
  final ControlLogger parent;
  final String name;
  Level level;


  public ControlLogger(String name, ControlLogger parent) {
    if(name == null){
     throw new IllegalArgumentException("name cannot be null");
    }
    this.name = name;
    this.parent = parent;
  }
  public String getName() {
    return name;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public final Level getEffectiveLevel() {
    for(ControlLogger cl = this; cl != null; cl=cl.parent) {
      if(cl.level != null)
        return cl.level;
    }
    return null; // If reached will cause an NullPointerException.
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ControlLogger)) return false;

    final ControlLogger controlLogger = (ControlLogger) o;
    return name.equals(controlLogger.name);
  }

  public int hashCode() {
    return name.hashCode();
  }

  public final void debug(String o) {
    if(getEffectiveLevel().levelInt <= Level.DEBUG_INT ) {
      throw new UnsupportedOperationException("not yet implemented");
    }
  }

  public void debug(String msg, Throwable t) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void debug(String parameterizedMsg, Object param1) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void debug(String parameterizedMsg, Object param1, Object param2) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void error(String msg) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void error(String msg, Throwable t) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void error(String parameterizedMsg, Object param1) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void error(String parameterizedMsg, Object param1, Object param2) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void info(String msg) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void info(String msg, Throwable t) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void info(String parameterizedMsg, Object param1) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void info(String parameterizedMsg, Object param1, Object param2) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public boolean isDebugEnabled() {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public boolean isErrorEnabled() {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public boolean isInfoEnabled() {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public boolean isWarnEnabled() {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public void warn(String msg) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void warn(String msg, Throwable t) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void warn(String parameterizedMsg, Object param1) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void warn(String parameterizedMsg, Object param1, Object param2) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void debug(String format, Object[] argArray) {
  }
  public void info(String format, Object[] argArray) {
  }
  public void warn(String format, Object[] argArray) {
  }
  public void error(String format, Object[] argArray) {
  }

}
