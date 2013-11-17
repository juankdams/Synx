package com.ankamagames.wakfu.client;

import FL;
import QX;
import aIu;
import aUk;
import ak;
import ay;
import bZC;
import bjY;
import bkf;
import cRd;
import dCs;
import dqc;
import dwP;
import dzp;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import javax.swing.SwingUtilities;
import ku;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import tq;

public class WakfuClient
{
  private static Logger K = Logger.getLogger(WakfuClient.class);

  public static final WakfuClient ltB = new WakfuClient();
  private long bYL;
  private String ltC;
  private boolean ltD;

  private WakfuClient()
  {
    this.bYL = System.nanoTime();

    this.ltC = "";
    this.ltD = false;
  }

  public String cYd() {
    return this.ltC;
  }

  void start() {
    if ((!this.ltD) && (!ay.bd().bf())) {
      K.fatal("Echec du chargement de la configuration, WakfuConfiguration introuvable");
      return;
    }

    cYe();
  }

  private void configure() {
    bjY.bva();
    cYh();
    cYf();
  }

  private void cYe() {
    WakfuClientInstance localWakfuClientInstance = WakfuClientInstance.awy();
    SwingUtilities.invokeLater(new bZC(this, localWakfuClientInstance));

    bjY.bvb();
  }

  private void cYf() {
    tq.Bg().J(cRd.kDt.getDefaultScreenDevice().getAvailableAcceleratedMemory() / 1024.0F);

    dCs.dfa().a("JPG", new FL());
    dCs.dfa().a("PNG", new dwP());
    dCs.dfa().a("DDSM", new ku());
    dCs.dfa().a("DDS", new bkf());
    dCs.dfa().a("TGA", new aIu());
    dCs.dfa().a("TGAM", new ak());

    dqc.cXp().start();
  }

  private void cYg()
  {
    aUk.display();

    K.info("java.vm.vendor = " + System.getProperty("java.vm.vendor"));
    K.info("java.runtime.name = " + System.getProperty("java.runtime.name"));
    K.info("java.vm.name = " + System.getProperty("java.vm.name"));
    K.info("java.vm.version = " + System.getProperty("java.vm.version"));
    K.info("java.runtime.version = " + System.getProperty("java.runtime.version"));
    K.info("os.name = " + System.getProperty("os.name"));
    K.info("os.arch = " + System.getProperty("os.arch"));
    K.info("os.version = " + System.getProperty("os.version"));
    K.info("sun.os.patch.level = " + System.getProperty("sun.os.patch.level"));
    K.info("user.language = " + System.getProperty("user.language"));
    K.info("user.country = " + System.getProperty("user.country"));

    K.trace("Locale: " + Locale.getDefault().getDisplayName());
    Locale.setDefault(Locale.ENGLISH);

    K.info("log path=" + this.ltC);
  }

  private void K(String[] paramArrayOfString) {
    for (String str1 : paramArrayOfString)
    {
      if ((str1.length() > 1) && (str1.charAt(0) == '-')) {
        char c = str1.charAt(1);
        String str2;
        switch (c)
        {
        case 'c':
          str2 = str1.substring(2);

          this.ltD = ay.bd().load(str2);
          if (!this.ltD)
            K.error("Echec du chargement avec le fichier de config " + str2 + ", reprise du fichier par dï¿½faut"); break;
        case 'P':
          break;
        case 'T':
          break;
        case 'R':
          break;
        case 'M':
          break;
        case 'p':
          str2 = str1.substring(2);
          this.ltC = str2;

          String str3 = str2 + "/preferences";
          new File(str3).mkdirs();
          System.setProperty("preferenceStorePath", str3);
          break;
        case 'n':
          String str4 = str1.substring(2) + '/';
          System.setProperty("loginNewsCacheDirectory", str4);
          System.setProperty("almanachCacheDirectory", str4);
          break;
        case 't':
          break;
        case 'L':
          String str5 = str1.substring(2);
          System.setProperty("wakfu.language", str5);
          break;
        case 'C':
          String str6 = str1.substring(2);
          System.setProperty("wakfu.community", str6);
          break;
        case 'X':
          String str7 = str1.substring(2);
          bjY.bve();
          break;
        default:
          K.error("argument inconnu : '-" + c + "'");
        }
      }
    }
  }

  private void cYh()
  {
    Properties localProperties = new Properties();
    try
    {
      InputStream localInputStream = WakfuClient.class.getResourceAsStream("log4j.properties");
      localProperties.load(localInputStream);
      localInputStream.close();
    } catch (IOException localIOException) {
      System.err.println("Error: Cannot load configuration file ");
    }

    if (!dzp.qF(this.ltC)) {
      Enumeration localEnumeration = localProperties.propertyNames();
      while (localEnumeration.hasMoreElements()) {
        String str = (String)localEnumeration.nextElement();
        if (str.endsWith(".File"))
        {
          localProperties.setProperty(str, this.ltC + '/' + localProperties.getProperty(str));
        }
      }
    }
    LogManager.resetConfiguration();
    PropertyConfigurator.configure(localProperties);

    QX.setEnabled(true);
  }

  public long cYi() {
    return (System.nanoTime() - this.bYL) / 1000000L;
  }

  public static void main(String[] paramArrayOfString)
  {
    ltB.K(paramArrayOfString);
    ltB.configure();
    ltB.cYg();
    ltB.start();
  }
}