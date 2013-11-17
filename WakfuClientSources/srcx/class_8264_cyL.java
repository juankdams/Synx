import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class cyL
{
  private static final int ind = 1000;
  public static final int ine = 2147483647;
  private String[] inf = null;
  private String[] ing = null;
  private int inh = 2147483647;
  private nX ini;
  private final dbQ inj;
  private File ink = null;
  private FF aIn = null;
  private boolean inl = false;

  private boolean inm = true;

  private static String inn = System.getProperty("user.dir");
  private static Map ino = null;

  private static dE inp = new dE();

  private static boolean inq = false;

  public void hL(boolean paramBoolean)
  {
  }

  public static synchronized Map cvE()
  {
    if (ino != null) {
      return ino;
    }
    if (!aCt.gd("openvms")) {
      try {
        ino = System.getenv();
        return ino;
      } catch (Exception localException) {
        localException.printStackTrace();
      }
    }

    ino = new LinkedHashMap();
    try {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      cyL localcyL = new cyL(new bPW(localByteArrayOutputStream));
      localcyL.D(cvG());

      localcyL.hM(true);
      int i = localcyL.execute();
      if (i != 0);
      BufferedReader localBufferedReader = new BufferedReader(new StringReader(c(localByteArrayOutputStream)));

      if (aCt.gd("openvms")) {
        ino = a(localBufferedReader);
        return ino;
      }
      Object localObject = null;
      String str2 = bof.LINE_SEP;
      String str1;
      int j;
      while ((str1 = localBufferedReader.readLine()) != null) {
        if (str1.indexOf('=') == -1)
        {
          if (localObject == null)
            localObject = str2 + str1;
          else
            localObject = (String)localObject + str2 + str1;
        }
        else
        {
          if (localObject != null) {
            j = ((String)localObject).indexOf("=");
            ino.put(((String)localObject).substring(0, j), ((String)localObject).substring(j + 1));
          }

          localObject = str1;
        }
      }

      if (localObject != null) {
        j = ((String)localObject).indexOf("=");
        ino.put(((String)localObject).substring(0, j), ((String)localObject).substring(j + 1));
      }
    } catch (IOException localIOException) {
      localIOException.printStackTrace();
    }

    return ino;
  }

  public static synchronized Vector cvF()
  {
    Vector localVector = new Vector();
    for (Map.Entry localEntry : cvE().entrySet()) {
      localVector.add((String)localEntry.getKey() + "=" + (String)localEntry.getValue());
    }
    return localVector;
  }

  private static String[] cvG()
  {
    if (aCt.gd("os/2"))
    {
      return new String[] { "cmd", "/c", "set" };
    }if (aCt.gd("windows"))
    {
      if (aCt.gd("win9x"))
      {
        return new String[] { "command.com", "/c", "set" };
      }

      return new String[] { "cmd", "/c", "set" };
    }
    if ((aCt.gd("z/os")) || (aCt.gd("unix")))
    {
      String[] arrayOfString = new String[1];
      if (new File("/bin/env").canRead())
        arrayOfString[0] = "/bin/env";
      else if (new File("/usr/bin/env").canRead()) {
        arrayOfString[0] = "/usr/bin/env";
      }
      else {
        arrayOfString[0] = "env";
      }
      return arrayOfString;
    }if ((aCt.gd("netware")) || (aCt.gd("os/400")))
    {
      return new String[] { "env" };
    }if (aCt.gd("openvms")) {
      return new String[] { "show", "logical" };
    }

    return null;
  }

  public static String c(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (aCt.gd("z/os"))
      try {
        return paramByteArrayOutputStream.toString("Cp1047");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1) {
      }
    else if (aCt.gd("os/400"))
      try {
        return paramByteArrayOutputStream.toString("Cp500");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
      }
    return paramByteArrayOutputStream.toString();
  }

  public cyL()
  {
    this(new bPW(), null);
  }

  public cyL(nX paramnX)
  {
    this(paramnX, null);
  }

  public cyL(nX paramnX, dbQ paramdbQ)
  {
    a(paramnX);
    this.inj = paramdbQ;

    if (aCt.gd("openvms"))
      this.inm = false;
  }

  public void a(nX paramnX)
  {
    this.ini = paramnX;
  }

  public String[] aPt()
  {
    return this.inf;
  }

  public void D(String[] paramArrayOfString)
  {
    this.inf = paramArrayOfString;
  }

  public void hM(boolean paramBoolean)
  {
    this.inl = paramBoolean;
  }

  public String[] cvH()
  {
    return (this.ing == null) || (this.inl) ? this.ing : cvM();
  }

  public void E(String[] paramArrayOfString)
  {
    this.ing = paramArrayOfString;
  }

  public void R(File paramFile)
  {
    this.ink = ((paramFile == null) || (paramFile.getAbsolutePath().equals(inn)) ? null : paramFile);
  }

  public File cvI()
  {
    return this.ink == null ? new File(inn) : this.ink;
  }

  public void W(FF paramFF)
  {
    this.aIn = paramFF;
  }

  public void hN(boolean paramBoolean)
  {
    this.inm = paramBoolean;
  }

  public static Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2, File paramFile, boolean paramBoolean)
  {
    if ((paramFile != null) && (!paramFile.exists())) {
      throw new cJ(paramFile + " doesn't exist.");
    }

    dJY localdJY1 = dJY.ac(paramFF);
    dJY localdJY2 = (paramBoolean) && (localdJY1 != null) ? localdJY1 : dJY.ab(paramFF);

    return localdJY2.a(paramFF, paramArrayOfString1, paramArrayOfString2, paramFile);
  }

  public int execute()
  {
    if ((this.ink != null) && (!this.ink.exists())) {
      throw new cJ(this.ink + " doesn't exist.");
    }
    Process localProcess = a(this.aIn, aPt(), cvH(), this.ink, this.inm);
    try
    {
      this.ini.a(localProcess.getOutputStream());
      this.ini.b(localProcess.getInputStream());
      this.ini.a(localProcess.getErrorStream());
    } catch (IOException localIOException) {
      localProcess.destroy();
      throw localIOException;
    }
    this.ini.start();
    try
    {
      inp.a(localProcess);

      if (this.inj != null) {
        this.inj.e(localProcess);
      }
      c(localProcess);

      if (this.inj != null) {
        this.inj.stop();
      }
      this.ini.stop();
      d(localProcess);

      if (this.inj != null) {
        this.inj.cNz();
      }
      return getExitValue();
    }
    catch (ThreadDeath localThreadDeath) {
      localProcess.destroy();
      throw localThreadDeath;
    }
    finally
    {
      inp.b(localProcess);
    }
  }

  public void cvJ()
  {
    if ((this.ink != null) && (!this.ink.exists())) {
      throw new cJ(this.ink + " doesn't exist.");
    }
    Process localProcess = a(this.aIn, aPt(), cvH(), this.ink, this.inm);

    if (aCt.gd("windows")) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException localInterruptedException) {
        this.aIn.d("interruption in the sleep after having spawned a process", 3);
      }
    }

    aVV localaVV = new aVV(this);

    bPW localbPW = new bPW(localaVV);
    localbPW.a(localProcess.getErrorStream());
    localbPW.b(localProcess.getInputStream());
    localbPW.start();
    localProcess.getOutputStream().close();

    this.aIn.d("spawned process " + localProcess.toString(), 3);
  }

  protected void c(Process paramProcess)
  {
    try
    {
      paramProcess.waitFor();
      xg(paramProcess.exitValue());
    } catch (InterruptedException localInterruptedException) {
      paramProcess.destroy();
    }
  }

  protected void xg(int paramInt)
  {
    this.inh = paramInt;
  }

  public int getExitValue()
  {
    return this.inh;
  }

  public static boolean xh(int paramInt)
  {
    return paramInt % 2 == 0;
  }

  public boolean cvK()
  {
    return xh(getExitValue());
  }

  public boolean cvL()
  {
    return (this.inj != null) && (this.inj.cvL());
  }

  private String[] cvM()
  {
    if (aCt.gd("openvms")) {
      return this.ing;
    }
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(cvE());
    Object localObject2;
    for (int i = 0; i < this.ing.length; i++) {
      localObject1 = this.ing[i];
      localObject2 = ((String)localObject1).substring(0, ((String)localObject1).indexOf('='));

      if ((localLinkedHashMap.remove(localObject2) == null) && (inq))
      {
        for (String str : localLinkedHashMap.keySet())
        {
          if (str.toLowerCase().equals(((String)localObject2).toLowerCase()))
          {
            localObject2 = str;
            break;
          }
        }

      }

      localLinkedHashMap.put(localObject2, ((String)localObject1).substring(((String)localObject2).length() + 1));
    }

    ArrayList localArrayList = new ArrayList();
    for (Object localObject1 = localLinkedHashMap.entrySet().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localArrayList.add((String)((Map.Entry)localObject2).getKey() + "=" + (String)((Map.Entry)localObject2).getValue());
    }
    return (String[])localArrayList.toArray(new String[localLinkedHashMap.size()]);
  }

  public static void a(aGK paramaGK, String[] paramArrayOfString)
  {
    try
    {
      paramaGK.d(aDr.i(paramArrayOfString), 3);

      cyL localcyL = new cyL(new ih(paramaGK, 2, 0));

      localcyL.W(paramaGK.Ga());
      localcyL.D(paramArrayOfString);
      int i = localcyL.execute();
      if (xh(i))
        throw new cJ(paramArrayOfString[0] + " failed with return code " + i, paramaGK.gu());
    }
    catch (IOException localIOException)
    {
      throw new cJ("Could not launch " + paramArrayOfString[0] + ": " + localIOException, paramaGK.gu());
    }
  }

  public static void d(Process paramProcess)
  {
    wh.c(paramProcess.getInputStream());
    wh.b(paramProcess.getOutputStream());
    wh.c(paramProcess.getErrorStream());
  }

  private static Map a(BufferedReader paramBufferedReader)
  {
    HashMap localHashMap = new HashMap();
    Object localObject = null; String str1 = null;
    String str3 = null;

    while ((str3 = paramBufferedReader.readLine()) != null)
    {
      if (str3.startsWith("\t="))
      {
        if (localObject != null)
          str1 = str1 + "," + str3.substring(4, str3.length() - 1);
      }
      else if (str3.startsWith("  \""))
      {
        if (localObject != null) {
          localHashMap.put(localObject, str1);
        }
        int i = str3.indexOf('=');
        String str2 = str3.substring(3, i - 2);
        if (localHashMap.containsKey(str2))
        {
          localObject = null;
        } else {
          localObject = str2;
          str1 = str3.substring(i + 3, str3.length() - 1);
        }
      }

    }

    if (localObject != null) {
      localHashMap.put(localObject, str1);
    }
    return localHashMap;
  }

  static
  {
    if (aCt.gd("windows"))
      inq = true;
  }
}