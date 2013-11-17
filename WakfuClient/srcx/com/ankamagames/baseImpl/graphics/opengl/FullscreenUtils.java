package com.ankamagames.baseImpl.graphics.opengl;

import cwl;
import org.apache.log4j.Logger;

public class FullscreenUtils
{
  private static final Logger K = Logger.getLogger(FullscreenUtils.class);

  public static final FullscreenUtils hfC = new FullscreenUtils();

  public native void showMenuAndDock(boolean paramBoolean);

  static
  {
    try
    {
      if (cwl.ctO() == cwl.ihJ)
        System.loadLibrary("fullscreenutils");
    } catch (Throwable localThrowable) {
      K.error("Impossible d'afficher le menu et le doc Mac", localThrowable);
    }
  }
}