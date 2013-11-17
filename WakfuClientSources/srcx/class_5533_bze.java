import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class bze
  implements dRZ
{
  private static final Set gmE = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "-lib", "-cp", "-noclasspath", "--noclasspath", "-nouserlib", "-main" })));
  public static final String gmF = "build.xml";
  private int bdb = 2;
  private File bap;
  private static PrintStream out = System.out;

  private static PrintStream err = System.err;

  private Vector gmG = new Vector();

  private Properties gmH = new Properties();

  private Vector listeners = new Vector(1);

  private Vector gmI = new Vector(1);

  private boolean gmJ = true;

  private boolean bNG = false;

  private String gmK = null;

  private String gmL = null;

  private boolean bdd = false;

  private boolean gmM = false;

  private boolean gmN = false;

  private boolean gmO = false;

  private static boolean gmP = false;

  private Integer gmQ = null;

  private boolean gmR = false;

  private Map gmS = new HashMap();

  private static final Yb gmT = new aDy();

  private static String gmU = null;

  private static void f(Throwable paramThrowable)
  {
    String str = paramThrowable.getMessage();
    if (str != null)
      System.err.println(str);
  }

  public static void a(String[] paramArrayOfString, Properties paramProperties, ClassLoader paramClassLoader)
  {
    bze localbze = new bze();
    localbze.b(paramArrayOfString, paramProperties, paramClassLoader);
  }

  public void b(String[] paramArrayOfString, Properties paramProperties, ClassLoader paramClassLoader)
  {
    try
    {
      u(paramArrayOfString);
    } catch (Throwable localThrowable1) {
      bHI();
      f(localThrowable1);
      exit(1);
      return;
    }

    if (paramProperties != null) {
      Enumeration localEnumeration = paramProperties.keys();
      while (localEnumeration.hasMoreElements()) {
        String str1 = (String)localEnumeration.nextElement();
        String str2 = paramProperties.getProperty(str1);
        this.gmH.put(str1, str2);
      }

    }

    int i = 1;
    try {
      try {
        e(paramClassLoader);
        i = 0;
      } catch (dQo localdQo) {
        i = localdQo.getStatus();
        if (i != 0)
          throw localdQo;
      }
    }
    catch (cJ localcJ) {
      if (err != System.err)
        f(localcJ);
    }
    catch (Throwable localThrowable2) {
      localThrowable2.printStackTrace();
      f(localThrowable2);
    } finally {
      bHI();
    }
    exit(i);
  }

  protected void exit(int paramInt)
  {
    System.exit(paramInt);
  }

  private static void bHI()
  {
    if (gmP) {
      wh.b(out);
      wh.b(err);
    }
  }

  public static void main(String[] paramArrayOfString)
  {
    a(paramArrayOfString, null, null);
  }

  public bze()
  {
  }

  protected bze(String[] paramArrayOfString)
  {
    u(paramArrayOfString);
  }

  private void u(String[] paramArrayOfString)
  {
    String str1 = null;
    int i = 0;
    PrintStream localPrintStream = null;

    int j = 0;
    int k = 0;
    int m = 0;

    bIB localbIB = bIB.bPH();
    Object localObject2;
    for (int n = 0; n < paramArrayOfString.length; n++) {
      localObject2 = paramArrayOfString[n];

      if ((((String)localObject2).equals("-help")) || (((String)localObject2).equals("-h"))) {
        j = 1;
      } else if (((String)localObject2).equals("-version")) {
        k = 1;
      } else if (((String)localObject2).equals("-diagnostics")) {
        m = 1;
      } else if ((((String)localObject2).equals("-quiet")) || (((String)localObject2).equals("-q"))) {
        this.bdb = 1;
      } else if ((((String)localObject2).equals("-verbose")) || (((String)localObject2).equals("-v"))) {
        this.bdb = 3;
      } else if ((((String)localObject2).equals("-debug")) || (((String)localObject2).equals("-d"))) {
        this.bdb = 4;
      } else if ((((String)localObject2).equals("-silent")) || (((String)localObject2).equals("-S"))) {
        this.gmM = true;
      } else if (((String)localObject2).equals("-noinput")) {
        this.gmJ = false;
      }
      else
      {
        Object localObject3;
        if ((((String)localObject2).equals("-logfile")) || (((String)localObject2).equals("-l"))) {
          try {
            File localFile = new File(paramArrayOfString[(n + 1)]);
            n++;
            localPrintStream = new PrintStream(new FileOutputStream(localFile));
            gmP = true;
          } catch (IOException localIOException) {
            localObject3 = "Cannot write on the specified log file. Make sure the path exists and you have write permissions.";

            throw new cJ((String)localObject3);
          } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
            localObject3 = "You must specify a log file when using the -log argument";

            throw new cJ((String)localObject3);
          }
        } else if ((((String)localObject2).equals("-buildfile")) || (((String)localObject2).equals("-file")) || (((String)localObject2).equals("-f")))
        {
          n = b(paramArrayOfString, n);
        } else if (((String)localObject2).equals("-listener")) {
          n = c(paramArrayOfString, n);
        } else if (((String)localObject2).startsWith("-D")) {
          n = d(paramArrayOfString, n);
        } else if (((String)localObject2).equals("-logger")) {
          n = e(paramArrayOfString, n);
        } else if (((String)localObject2).equals("-inputhandler")) {
          n = f(paramArrayOfString, n);
        } else if ((((String)localObject2).equals("-emacs")) || (((String)localObject2).equals("-e"))) {
          this.bdd = true;
        } else if ((((String)localObject2).equals("-projecthelp")) || (((String)localObject2).equals("-p")))
        {
          this.gmO = true;
        } else if ((((String)localObject2).equals("-find")) || (((String)localObject2).equals("-s"))) {
          i = 1;

          if (n < paramArrayOfString.length - 1)
            str1 = paramArrayOfString[(++n)];
        }
        else if (((String)localObject2).startsWith("-propertyfile")) {
          n = g(paramArrayOfString, n);
        } else if ((((String)localObject2).equals("-k")) || (((String)localObject2).equals("-keep-going"))) {
          this.bNG = true;
        } else if (((String)localObject2).equals("-nice")) {
          n = h(paramArrayOfString, n); } else {
          if (gmE.contains(localObject2))
          {
            String str2 = "Ant's Main method is being handed an option " + (String)localObject2 + " that is only for the launcher class." + "\nThis can be caused by a version mismatch between " + "the ant script/.bat file and Ant itself.";

            throw new cJ(str2);
          }if (((String)localObject2).equals("-autoproxy")) {
            this.gmR = true;
          } else if (((String)localObject2).startsWith("-")) {
            int i1 = 0;
            for (localObject3 = localbIB.bPI().iterator(); ((Iterator)localObject3).hasNext(); ) { bLW localbLW = (bLW)((Iterator)localObject3).next();
              int i2 = localbLW.i(paramArrayOfString, n);
              if (i2 != -1) {
                Object localObject4 = (List)this.gmS.get(localbLW.getClass());
                if (localObject4 == null) {
                  localObject4 = new ArrayList();
                  this.gmS.put(localbLW.getClass(), localObject4);
                }
                for (; (n < i2) && (n < paramArrayOfString.length); n++) {
                  ((List)localObject4).add(paramArrayOfString[n]);
                }
                i1 = 1;
                break;
              }
            }
            if (i1 == 0)
            {
              localObject3 = "Unknown argument: " + (String)localObject2;
              System.err.println((String)localObject3);
              printUsage();
              throw new cJ("");
            }
          }
          else {
            this.gmG.addElement(localObject2);
          }
        }
      }
    }
    if ((this.bdb >= 3) || (k != 0)) {
      rG(this.bdb);
    }

    if ((j != 0) || (k != 0) || (m != 0)) {
      if (j != 0) {
        printUsage();
      }
      if (m != 0)
        sN.a(System.out, this.bdb);
      return;
    }
    Object localObject1;
    if (this.bap == null)
    {
      if (i != 0) {
        if (str1 != null) {
          this.bap = ah(System.getProperty("user.dir"), str1);
          if (this.bap == null)
            throw new cJ("Could not locate a build file!");
        }
        else
        {
          localObject1 = azA.aLs().aLv();
          do {
            localObject2 = (dhB)((Iterator)localObject1).next();
            str1 = ((dhB)localObject2).cQk();
            if (this.bdb >= 3) {
              System.out.println("Searching the default build file: " + str1);
            }
            this.bap = ah(System.getProperty("user.dir"), str1);
          }while ((this.bap == null) && (((Iterator)localObject1).hasNext()));
          if (this.bap == null)
            throw new cJ("Could not locate a build file!");
        }
      }
      else
      {
        localObject1 = azA.aLs().aLv();
        do {
          localObject2 = (dhB)((Iterator)localObject1).next();
          this.bap = new File(((dhB)localObject2).cQk());
          if (this.bdb >= 3)
            System.out.println("Trying the default build file: " + this.bap);
        }
        while ((!this.bap.exists()) && (((Iterator)localObject1).hasNext()));
      }

    }

    if (!this.bap.exists()) {
      System.out.println("Buildfile: " + this.bap + " does not exist!");
      throw new cJ("Build failed");
    }

    if (this.bap.isDirectory()) {
      localObject1 = new File(this.bap, "build.xml");
      if (((File)localObject1).isFile()) {
        this.bap = ((File)localObject1);
      } else {
        System.out.println("What? Buildfile: " + this.bap + " is a dir!");
        throw new cJ("Build failed");
      }

    }

    this.bap = wh.Fo().aS(this.bap.getAbsolutePath());

    bHJ();

    if (this.bdb >= 2) {
      System.out.println("Buildfile: " + this.bap);
    }

    if (localPrintStream != null) {
      out = localPrintStream;
      err = localPrintStream;
      System.setOut(out);
      System.setErr(err);
    }
    this.gmN = true;
  }

  private int b(String[] paramArrayOfString, int paramInt)
  {
    try
    {
      this.bap = new File(paramArrayOfString[(++paramInt)].replace('/', File.separatorChar));
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      throw new cJ("You must specify a buildfile when using the -buildfile argument");
    }

    return paramInt;
  }

  private int c(String[] paramArrayOfString, int paramInt)
  {
    try {
      this.listeners.addElement(paramArrayOfString[(paramInt + 1)]);
      paramInt++;
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      String str = "You must specify a classname when using the -listener argument";

      throw new cJ(str);
    }
    return paramInt;
  }

  private int d(String[] paramArrayOfString, int paramInt)
  {
    String str1 = paramArrayOfString[paramInt];
    String str2 = str1.substring(2, str1.length());
    String str3 = null;
    int i = str2.indexOf("=");
    if (i > 0) {
      str3 = str2.substring(i + 1);
      str2 = str2.substring(0, i);
    } else if (paramInt < paramArrayOfString.length - 1) {
      str3 = paramArrayOfString[(++paramInt)];
    } else {
      throw new cJ("Missing value for property " + str2);
    }

    this.gmH.put(str2, str3);
    return paramInt;
  }

  private int e(String[] paramArrayOfString, int paramInt)
  {
    if (this.gmK != null) {
      throw new cJ("Only one logger class may be specified.");
    }
    try
    {
      this.gmK = paramArrayOfString[(++paramInt)];
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      throw new cJ("You must specify a classname when using the -logger argument");
    }

    return paramInt;
  }

  private int f(String[] paramArrayOfString, int paramInt)
  {
    if (this.gmL != null) {
      throw new cJ("Only one input handler class may be specified.");
    }
    try
    {
      this.gmL = paramArrayOfString[(++paramInt)];
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      throw new cJ("You must specify a classname when using the -inputhandler argument");
    }

    return paramInt;
  }

  private int g(String[] paramArrayOfString, int paramInt)
  {
    try {
      this.gmI.addElement(paramArrayOfString[(++paramInt)]);
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      String str = "You must specify a property filename when using the -propertyfile argument";

      throw new cJ(str);
    }
    return paramInt;
  }

  private int h(String[] paramArrayOfString, int paramInt)
  {
    try {
      this.gmQ = Integer.decode(paramArrayOfString[(++paramInt)]);
    } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      throw new cJ("You must supply a niceness value (1-10) after the -nice option");
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new cJ("Unrecognized niceness value: " + paramArrayOfString[paramInt]);
    }

    if ((this.gmQ.intValue() < 1) || (this.gmQ.intValue() > 10))
    {
      throw new cJ("Niceness value is out of the range 1-10");
    }

    return paramInt;
  }

  private void bHJ()
  {
    for (String str1 : this.gmI) {
      Properties localProperties = new Properties();
      FileInputStream localFileInputStream = null;
      try {
        localFileInputStream = new FileInputStream(str1);
        localProperties.load(localFileInputStream);
      } catch (IOException localIOException) {
        System.out.println("Could not load property file " + str1 + ": " + localIOException.getMessage());
      }
      finally {
        wh.c(localFileInputStream);
      }

      Enumeration localEnumeration = localProperties.propertyNames();
      while (localEnumeration.hasMoreElements()) {
        String str2 = (String)localEnumeration.nextElement();
        if (this.gmH.getProperty(str2) == null)
          this.gmH.put(str2, localProperties.getProperty(str2));
      }
    }
  }

  private File m(File paramFile)
  {
    File localFile = paramFile.getParentFile();

    if ((localFile != null) && (this.bdb >= 3)) {
      System.out.println("Searching in " + localFile.getAbsolutePath());
    }

    return localFile;
  }

  private File ah(String paramString1, String paramString2)
  {
    if (this.bdb >= 2) {
      System.out.println("Searching for " + paramString2 + " ...");
    }

    File localFile1 = new File(new File(paramString1).getAbsolutePath());
    File localFile2 = new File(localFile1, paramString2);

    while (!localFile2.exists())
    {
      localFile1 = m(localFile1);

      if (localFile1 == null) {
        return null;
      }

      localFile2 = new File(localFile1, paramString2);
    }

    return localFile2;
  }

  private void e(ClassLoader paramClassLoader)
  {
    if (!this.gmN) {
      return;
    }

    bIB localbIB = bIB.bPH();

    for (Object localObject1 = localbIB.bPI().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bLW)((Iterator)localObject1).next();
      localObject3 = (List)this.gmS.get(localObject2.getClass());
      if ((localObject3 != null) && 
        (((bLW)localObject2).z((List)localObject3)))
        return;
    }
    Object localObject3;
    localObject1 = new FF();
    ((FF)localObject1).b(paramClassLoader);

    Object localObject2 = null;
    try
    {
      G((FF)localObject1);
      H((FF)localObject1);

      localObject3 = System.err;
      PrintStream localPrintStream = System.out;
      InputStream localInputStream = System.in;

      SecurityManager localSecurityManager = null;
      localSecurityManager = System.getSecurityManager();
      try
      {
        if (this.gmJ) {
          ((FF)localObject1).d(System.in);
        }
        System.setIn(new dNX((FF)localObject1));
        System.setOut(new PrintStream(new bBl((FF)localObject1, false)));
        System.setErr(new PrintStream(new bBl((FF)localObject1, true)));

        if (!this.gmO) {
          ((FF)localObject1).PS();
        }

        if (this.gmQ != null) {
          try {
            ((FF)localObject1).d("Setting Ant's thread priority to " + this.gmQ, 3);

            Thread.currentThread().setPriority(this.gmQ.intValue());
          }
          catch (SecurityException localSecurityException) {
            ((FF)localObject1).log("A security manager refused to set the -nice value");
          }
        }

        F((FF)localObject1);

        ((FF)localObject1).aC(this.bNG);
        if (this.gmR)
        {
          localObject4 = new dvh((FF)localObject1);
          ((dvh)localObject4).daS();
        }

        for (Object localObject4 = localbIB.bPI().iterator(); ((Iterator)localObject4).hasNext(); ) { localbLW = (bLW)((Iterator)localObject4).next();
          localList = (List)this.gmS.get(localbLW.getClass());
          if (localList != null)
            localbLW.a((FF)localObject1, localList);  } bLW localbLW;
        List localList;
        dhB.a((FF)localObject1, this.bap);

        for (localObject4 = localbIB.bPI().iterator(); ((Iterator)localObject4).hasNext(); return) { localbLW = (bLW)((Iterator)localObject4).next();
          localList = (List)this.gmS.get(localbLW.getClass());
          if ((localList != null) && 
            (localbLW.b((FF)localObject1, localList)))
          {
            if (localSecurityManager != null) {
              System.setSecurityManager(localSecurityManager);
            }

            System.setOut(localPrintStream);
            System.setErr((PrintStream)localObject3);
            System.setIn(localInputStream);
          }
        }
        if (this.gmO) {
          I((FF)localObject1);
          a((FF)localObject1, this.bdb > 2, this.bdb > 3);

          if (localSecurityManager != null) {
            System.setSecurityManager(localSecurityManager);
          }

          System.setOut(localPrintStream);
          System.setErr((PrintStream)localObject3);
          System.setIn(localInputStream);
        }
        else
        {
          if ((this.gmG.size() == 0) && 
            (((FF)localObject1).PC() != null)) {
            this.gmG.addElement(((FF)localObject1).PC());
          }

          ((FF)localObject1).a(this.gmG);
        }
      }
      finally {
        if (localSecurityManager != null) {
          System.setSecurityManager(localSecurityManager);
        }

        System.setOut(localPrintStream);
        System.setErr((PrintStream)localObject3);
        System.setIn(localInputStream);
      }
    } catch (RuntimeException localRuntimeException) {
      localObject2 = localRuntimeException;
      throw localRuntimeException;
    } catch (Error localError) {
      localObject2 = localError;
      throw localError;
    } finally {
      if (!this.gmO)
        try {
          ((FF)localObject1).b((Throwable)localObject2);
        }
        catch (Throwable localThrowable4)
        {
          System.err.println("Caught an exception while logging the end of the build.  Exception was:");

          localThrowable4.printStackTrace();
          if (localObject2 != null) {
            System.err.println("There has been an error prior to that:");

            ((Throwable)localObject2).printStackTrace();
          }
          throw new cJ(localThrowable4);
        }
      else if (localObject2 != null)
        ((FF)localObject1).d(((Throwable)localObject2).toString(), 0);
    }
  }

  private void F(FF paramFF)
  {
    paramFF.init();

    afR localafR = afR.t(paramFF);

    HashMap localHashMap1 = new HashMap(this.gmH);

    HashMap localHashMap2 = localHashMap1;

    bkZ localbkZ = new bkZ(paramFF, gmT, localafR.arj());

    localbkZ.a(localHashMap2, null, false);

    for (Map.Entry localEntry : localHashMap2.entrySet()) {
      String str = (String)localEntry.getKey();
      Object localObject = localEntry.getValue();
      paramFF.q(str, String.valueOf(localObject));
    }

    paramFF.q("ant.file", this.bap.getAbsolutePath());

    paramFF.q("ant.file.type", "file");
  }

  protected void G(FF paramFF)
  {
    paramFF.a(bHK());

    int i = this.listeners.size();
    for (int j = 0; j < i; j++) {
      String str = (String)this.listeners.elementAt(j);
      bXm localbXm = (bXm)bmR.a(str, bze.class.getClassLoader(), bXm.class);

      paramFF.G(localbXm);

      paramFF.a(localbXm);
    }
  }

  private void H(FF paramFF)
  {
    Object localObject = null;
    if (this.gmL == null) {
      localObject = new daN();
    } else {
      localObject = (aKd)bmR.a(this.gmL, bze.class.getClassLoader(), aKd.class);

      paramFF.G(localObject);
    }
    paramFF.a((aKd)localObject);
  }

  private bXz bHK()
  {
    Object localObject = null;
    if (this.gmM) {
      localObject = new oY();
      this.bdb = 1;
      this.bdd = true;
    } else if (this.gmK != null) {
      try {
        localObject = (bXz)bmR.a(this.gmK, bze.class.getClassLoader(), bXz.class);
      }
      catch (cJ localcJ)
      {
        System.err.println("The specified logger class " + this.gmK + " could not be used because " + localcJ.getMessage());

        throw new RuntimeException();
      }
    } else {
      localObject = new tf();
    }

    ((bXz)localObject).cQ(this.bdb);
    ((bXz)localObject).m(out);
    ((bXz)localObject).n(err);
    ((bXz)localObject).Y(this.bdd);

    return localObject;
  }

  private static void printUsage()
  {
    System.out.println("ant [options] [target [target2 [target3] ...]]");
    System.out.println("Options: ");
    System.out.println("  -help, -h              print this message");
    System.out.println("  -projecthelp, -p       print project help information");
    System.out.println("  -version               print the version information and exit");
    System.out.println("  -diagnostics           print information that might be helpful to");
    System.out.println("                         diagnose or report problems.");
    System.out.println("  -quiet, -q             be extra quiet");
    System.out.println("  -silent, -S            print nothing but task outputs and build failures");
    System.out.println("  -verbose, -v           be extra verbose");
    System.out.println("  -debug, -d             print debugging information");
    System.out.println("  -emacs, -e             produce logging information without adornments");
    System.out.println("  -lib <path>            specifies a path to search for jars and classes");
    System.out.println("  -logfile <file>        use given file for log");
    System.out.println("    -l     <file>                ''");
    System.out.println("  -logger <classname>    the class which is to perform logging");
    System.out.println("  -listener <classname>  add an instance of class as a project listener");
    System.out.println("  -noinput               do not allow interactive input");
    System.out.println("  -buildfile <file>      use given buildfile");
    System.out.println("    -file    <file>              ''");
    System.out.println("    -f       <file>              ''");
    System.out.println("  -D<property>=<value>   use value for given property");
    System.out.println("  -keep-going, -k        execute all targets that do not depend");
    System.out.println("                         on failed target(s)");
    System.out.println("  -propertyfile <name>   load all properties from file with -D");
    System.out.println("                         properties taking precedence");
    System.out.println("  -inputhandler <class>  the class which will handle input requests");
    System.out.println("  -find <file>           (s)earch for buildfile towards the root of");
    System.out.println("    -s  <file>           the filesystem and use it");
    System.out.println("  -nice  number          A niceness value for the main thread:                         1 (lowest) to 10 (highest); 5 is the default");

    System.out.println("  -nouserlib             Run ant without using the jar files from                         ${user.home}/.ant/lib");

    System.out.println("  -noclasspath           Run ant without using CLASSPATH");
    System.out.println("  -autoproxy             Java1.5+: use the OS proxy settings");
    System.out.println("  -main <class>          override Ant's normal entry point");
    for (bLW localbLW : bIB.bPH().bPI())
      localbLW.o(System.out);
  }

  private static void rG(int paramInt)
  {
    System.out.println(bHL());
  }

  public static synchronized String bHL()
  {
    if (gmU == null) {
      try {
        Properties localProperties = new Properties();
        InputStream localInputStream = bze.class.getResourceAsStream("/org/apache/tools/ant/version.txt");

        localProperties.load(localInputStream);
        localInputStream.close();

        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("Apache Ant(TM) version ");
        localStringBuffer.append(localProperties.getProperty("VERSION"));
        localStringBuffer.append(" compiled on ");
        localStringBuffer.append(localProperties.getProperty("DATE"));
        gmU = localStringBuffer.toString();
      } catch (IOException localIOException) {
        throw new cJ("Could not load the version information:" + localIOException.getMessage());
      }
      catch (NullPointerException localNullPointerException) {
        throw new cJ("Could not load the version information.");
      }
    }
    return gmU;
  }

  private static void I(FF paramFF)
  {
    if (paramFF.getDescription() != null)
      paramFF.log(paramFF.getDescription());
  }

  private static Map i(Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    for (Object localObject1 = paramMap.entrySet().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      wZ localwZ1 = (wZ)((Map.Entry)localObject2).getValue();
      wZ localwZ2 = (wZ)localHashMap.get(localwZ1.gu());

      if ((localwZ2 == null) || (localwZ2.getName().length() > ((String)localObject3).length()))
      {
        localHashMap.put(localwZ1.gu(), localwZ1);
      }
    }
    Object localObject3;
    localObject1 = new HashMap();
    for (Object localObject2 = localHashMap.values().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (wZ)((Iterator)localObject2).next();
      ((Map)localObject1).put(((wZ)localObject3).getName(), localObject3);
    }
    return localObject1;
  }

  private static void a(FF paramFF, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    Map localMap = i(paramFF.PN());

    Vector localVector1 = new Vector();
    Vector localVector2 = new Vector();
    Vector localVector3 = new Vector();
    Vector localVector4 = new Vector();
    Vector localVector5 = new Vector();

    for (Object localObject = localMap.values().iterator(); ((Iterator)localObject).hasNext(); ) { wZ localwZ = (wZ)((Iterator)localObject).next();
      String str1 = localwZ.getName();
      if (!str1.equals(""))
      {
        String str2 = localwZ.getDescription();
        int j;
        if (str2 == null) {
          j = a(localVector4, str1);
          localVector4.insertElementAt(str1, j);
          if (paramBoolean2)
            localVector5.insertElementAt(localwZ.Gc(), j);
        }
        else {
          j = a(localVector1, str1);
          localVector1.insertElementAt(str1, j);
          localVector2.insertElementAt(str2, j);
          if (str1.length() > i) {
            i = str1.length();
          }
          if (paramBoolean2) {
            localVector3.insertElementAt(localwZ.Gc(), j);
          }
        }
      }
    }
    a(paramFF, localVector1, localVector2, localVector3, "Main targets:", i);

    if (localVector1.size() == 0) {
      paramBoolean1 = true;
    }
    if (paramBoolean1) {
      a(paramFF, localVector4, null, localVector5, "Other targets:", 0);
    }

    localObject = paramFF.PC();
    if ((localObject != null) && (!"".equals(localObject)))
    {
      paramFF.log("Default target: " + (String)localObject);
    }
  }

  private static int a(Vector paramVector, String paramString)
  {
    int i = paramVector.size();
    int j = i;
    for (int k = 0; (k < i) && (j == i); k++) {
      if (paramString.compareTo((String)paramVector.elementAt(k)) < 0) {
        j = k;
      }
    }
    return j;
  }

  private static void a(FF paramFF, Vector paramVector1, Vector paramVector2, Vector paramVector3, String paramString, int paramInt)
  {
    String str1 = System.getProperty("line.separator");

    String str2 = "    ";
    while (str2.length() <= paramInt) {
      str2 = str2 + str2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString + str1 + str1);
    int i = paramVector1.size();
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(" ");
      localStringBuilder.append((String)paramVector1.elementAt(j));
      if (paramVector2 != null) {
        localStringBuilder.append(str2.substring(0, paramInt - ((String)paramVector1.elementAt(j)).length() + 2));

        localStringBuilder.append((String)paramVector2.elementAt(j));
      }
      localStringBuilder.append(str1);
      if (!paramVector3.isEmpty()) {
        Enumeration localEnumeration = (Enumeration)paramVector3.elementAt(j);
        if (localEnumeration.hasMoreElements()) {
          localStringBuilder.append("   depends on: ");
          while (localEnumeration.hasMoreElements()) {
            localStringBuilder.append((String)localEnumeration.nextElement());
            if (localEnumeration.hasMoreElements()) {
              localStringBuilder.append(", ");
            }
          }
          localStringBuilder.append(str1);
        }
      }
    }
    paramFF.d(localStringBuilder.toString(), 1);
  }
}