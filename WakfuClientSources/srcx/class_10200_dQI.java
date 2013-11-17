import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Vector;
import org.apache.log4j.Logger;

public final class dQI
{
  private static final Logger K = Logger.getLogger(dQI.class);
  private static final dQI mll = new dQI();

  public static String[] mlm = null;

  private static dQI drJ()
  {
    return mll;
  }

  public static final boolean rN(String paramString)
  {
    try
    {
      Object localObject3;
      if ((mlm == null) || (mlm.length == 0)) {
        if (cwl.ctO() == cwl.ihJ) {
          boolean bool = false;
          Object localObject1;
          try
          {
            Class localClass1;
            if (new File("/System/Library/Java/com/apple/cocoa/application/NSWorkspace.class").exists())
            {
              localObject1 = new URLClassLoader(new URL[] { new File("/System/Library/Java").toURL() });
              localClass1 = Class.forName("com.apple.cocoa.application.NSWorkspace", true, (ClassLoader)localObject1);
            } else {
              localClass1 = Class.forName("com.apple.cocoa.application.NSWorkspace");
            }
            localObject1 = localClass1.getMethod("sharedWorkspace", new Class[0]);
            Object localObject2 = ((Method)localObject1).invoke(null, new Object[0]);
            localObject3 = localClass1.getMethod("openURL", new Class[] { Class.forName("java.net.URL") });
            bool = ((Boolean)((Method)localObject3).invoke(localObject2, new Object[] { new URL(paramString) })).booleanValue();
          }
          catch (Exception localException2) {
          }
          if (!bool)
            try {
              Class localClass2 = Class.forName("com.apple.mrj.MRJFileUtils");
              localObject1 = localClass2.getMethod("openURL", new Class[] { Class.forName("java.lang.String") });
              ((Method)localObject1).invoke(null, new Object[] { paramString });
            }
            catch (Exception localException3) {
              throw new IOException();
            }
        }
        else {
          throw new IOException();
        }

      }
      else
      {
        new URL(paramString);

        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = encode(paramString);
        String str1 = null;
        int i = 0;
        try
        {
          for (int j = 0; (j < mlm.length) && (i == 0); j++)
            try
            {
              str1 = MessageFormat.format(mlm[j], (Object[])arrayOfString1);

              localObject3 = new Vector();
              aD localaD = new aD(new StringReader(str1));
              String str2;
              while ((str2 = localaD.bC()) != null) {
                ((Vector)localObject3).add(str2);
              }
              String[] arrayOfString2 = new String[((Vector)localObject3).size()];
              arrayOfString2 = (String[])((Vector)localObject3).toArray(arrayOfString2);

              int k = 0;
              if ((arrayOfString2[0].equals("rundll32")) && (arrayOfString2[1].equals("url.dll,FileProtocolHandler"))) {
                if (arrayOfString2[2].startsWith("file:/")) {
                  if (arrayOfString2[2].charAt(6) != '/') {
                    arrayOfString2[2] = ("file://" + arrayOfString2[2].substring(6));
                  }
                  if (arrayOfString2[2].charAt(7) != '/') {
                    arrayOfString2[2] = ("file:///" + arrayOfString2[2].substring(7));
                  }
                  k = 1;
                } else if ((arrayOfString2[2].toLowerCase().endsWith("html")) || (arrayOfString2[2].toLowerCase().endsWith("htm"))) {
                  k = 1;
                }
              }
              if (k != 0) {
                localObject4 = File.createTempFile("OpenInBrowser", ".url");
                localObject4 = ((File)localObject4).getCanonicalFile();
                ((File)localObject4).deleteOnExit();
                PrintWriter localPrintWriter = new PrintWriter(new FileWriter((File)localObject4));
                localPrintWriter.println("[InternetShortcut]");
                localPrintWriter.println("URL=" + arrayOfString2[2]);
                localPrintWriter.close();
                arrayOfString2[2] = ((File)localObject4).getCanonicalPath();
              }

              Object localObject4 = Runtime.getRuntime().exec(arrayOfString2);

              for (int m = 0; m < 2; m++)
                try {
                  Thread.currentThread(); Thread.sleep(1000L);
                }
                catch (InterruptedException localInterruptedException) {
                }
              if (((Process)localObject4).exitValue() == 0)
              {
                i = 1;
              }
            }
            catch (IOException localIOException)
            {
            }
          if (i == 0)
          {
            throw new IOException();
          }
        }
        catch (IllegalThreadStateException localIllegalThreadStateException)
        {
        }
      }
    }
    catch (Exception localException1) {
      K.error("Impossible d'ouvrir l'url " + paramString + " dans un browser", localException1);
      return false;
    }
    return true;
  }

  public static String encode(String paramString) {
    StringBuffer localStringBuffer = new StringBuffer(paramString.length());
    for (int i = 0; i < paramString.length(); i++) {
      char c = paramString.charAt(i);
      if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || ((c >= '0') && (c <= '9')) || (c == '.') || (c == ':') || (c == '&') || (c == '@') || (c == '/') || (c == '?') || (c == '%') || (c == '+') || (c == '=') || (c == '#') || (c == '-') || (c == '\\'))
      {
        localStringBuffer.append(c);
      } else {
        c = (char)(c & 0xFF);
        if (c < '\020')
          localStringBuffer.append("%0" + Integer.toHexString(c));
        else {
          localStringBuffer.append("%" + Integer.toHexString(c));
        }
      }
    }
    return localStringBuffer.toString();
  }

  static
  {
    Object localObject;
    switch (dbM.kUd[cwl.ctO().ordinal()]) {
    case 1:
      mlm = new String[] { "rundll32 url.dll,FileProtocolHandler {0}" };

      break;
    case 2:
      localObject = new Vector();
      try {
        Process localProcess1 = Runtime.getRuntime().exec("which open");
        if (localProcess1.waitFor() == 0)
          ((Vector)localObject).add("open {0}");
      } catch (IOException localIOException1) {
      }
      catch (InterruptedException localInterruptedException1) {
      }
      if (((Vector)localObject).size() == 0)
        mlm = null;
      else {
        mlm = (String[])((Vector)localObject).toArray(new String[0]);
      }

      break;
    case 3:
      mlm = new String[] { "/usr/dt/bin/sdtwebclient {0}" };

      break;
    case 4:
      localObject = new ArrayList();
      try {
        Process localProcess2 = Runtime.getRuntime().exec("which x-www-browser");
        BufferedReader localBufferedReader1 = new BufferedReader(new InputStreamReader(localProcess2.getInputStream()));
        String str1 = null;
        String str2 = null;
        while ((str1 = localBufferedReader1.readLine()) != null) {
          str2 = str1;
        }
        int i = localProcess2.waitFor() == 0 ? 1 : 0;

        if (i == 0) {
          Process localProcess10 = Runtime.getRuntime().exec("which www-browser");
          BufferedReader localBufferedReader2 = new BufferedReader(new InputStreamReader(localProcess10.getInputStream()));
          while ((str1 = localBufferedReader2.readLine()) != null)
            str2 = str1;
          i = localProcess10.waitFor() == 0 ? 1 : 0;
        }

        if (i != 0)
          ((ArrayList)localObject).add(str2 + " {0}");
      } catch (IOException localIOException2) {
      }
      catch (InterruptedException localInterruptedException2) {
      }
      if (((ArrayList)localObject).isEmpty())
        mlm = null;
      else {
        mlm = (String[])((ArrayList)localObject).toArray(new String[((ArrayList)localObject).size()]);
      }

      break;
    default:
      localObject = new Vector();
      try {
        Process localProcess3 = Runtime.getRuntime().exec("which firebird");
        if (localProcess3.waitFor() == 0) {
          ((Vector)localObject).add("firebird -remote openURL({0})");
          ((Vector)localObject).add("firebird {0}");
        }
      } catch (IOException localIOException3) {
      } catch (InterruptedException localInterruptedException3) {
      }
      try {
        Process localProcess4 = Runtime.getRuntime().exec("which mozilla");
        if (localProcess4.waitFor() == 0) {
          ((Vector)localObject).add("mozilla -remote openURL({0})");
          ((Vector)localObject).add("mozilla {0}");
        }
      } catch (IOException localIOException4) {
      } catch (InterruptedException localInterruptedException4) {
      }
      try {
        Process localProcess5 = Runtime.getRuntime().exec("which opera");
        if (localProcess5.waitFor() == 0) {
          ((Vector)localObject).add("opera -remote openURL({0})");
          ((Vector)localObject).add("opera {0}");
        }
      } catch (IOException localIOException5) {
      } catch (InterruptedException localInterruptedException5) {
      }
      try {
        Process localProcess6 = Runtime.getRuntime().exec("which galeon");
        if (localProcess6.waitFor() == 0)
          ((Vector)localObject).add("galeon {0}");
      } catch (IOException localIOException6) {
      }
      catch (InterruptedException localInterruptedException6) {
      }
      try {
        Process localProcess7 = Runtime.getRuntime().exec("which konqueror");
        if (localProcess7.waitFor() == 0)
          ((Vector)localObject).add("konqueror {0}");
      } catch (IOException localIOException7) {
      }
      catch (InterruptedException localInterruptedException7) {
      }
      try {
        Process localProcess8 = Runtime.getRuntime().exec("which netscape");
        if (localProcess8.waitFor() == 0) {
          ((Vector)localObject).add("netscape -remote openURL({0})");
          ((Vector)localObject).add("netscape {0}");
        }
      } catch (IOException localIOException8) {
      } catch (InterruptedException localInterruptedException8) {
      }
      try {
        Process localProcess9 = Runtime.getRuntime().exec("which xterm");
        if (localProcess9.waitFor() == 0) {
          localProcess9 = Runtime.getRuntime().exec("which lynx");
          if (localProcess9.waitFor() == 0)
            ((Vector)localObject).add("xterm -e lynx {0}");
        }
      } catch (IOException localIOException9) {
      }
      catch (InterruptedException localInterruptedException9) {
      }
      if (((Vector)localObject).size() == 0)
        mlm = null;
      else
        mlm = (String[])((Vector)localObject).toArray(new String[0]);
      break;
    }
  }
}