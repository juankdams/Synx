import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class bqf
  implements bnA, cHc, ek
{
  private static final boolean fKC = aCt.gd("openvms");

  protected static final String[] fKD = { "**/*~", "**/#*#", "**/.#*", "**/%*%", "**/._*", "**/CVS", "**/CVS/**", "**/.cvsignore", "**/SCCS", "**/SCCS/**", "**/vssver.scc", "**/.svn", "**/.svn/**", "**/.git", "**/.git/**", "**/.gitattributes", "**/.gitignore", "**/.gitmodules", "**/.hg", "**/.hg/**", "**/.hgignore", "**/.hgsub", "**/.hgsubstate", "**/.hgtags", "**/.bzr", "**/.bzr/**", "**/.bzrignore", "**/.DS_Store" };
  public static final int fKE = 5;
  public static final String fKF = " does not exist.";
  private static final wh aIk = wh.Fo();

  private static final dtA fKG = dtA.cZN();

  private static final Set fKH = new HashSet();
  protected File bGO;
  protected String[] fKI;
  protected String[] fKJ;
  protected ank[] fKK = null;
  protected Vector fKL;
  protected Vector fKM;
  protected Vector fKN;
  protected Vector fKO;
  protected Vector fKP;
  protected Vector fKQ;
  protected Vector fKR;
  protected Vector fKS;
  protected boolean fKT = false;

  protected boolean fKU = true;

  protected boolean fCA = true;

  private boolean fCz = true;

  protected boolean fKV = true;

  private Set fKW = new HashSet();

  private Map fKX = new HashMap();

  private Map fKY = new HashMap();
  private dmj[] fKZ;
  private dmj[] fLa;
  private boolean fLb = false;

  private boolean fLc = false;

  private Object fLd = new Object();

  private boolean fLe = false;

  private Object fLf = new Object();

  private IllegalStateException fLg = null;

  private int fCB = 5;

  private Set fLh = new HashSet();

  protected static boolean ad(String paramString1, String paramString2)
  {
    return dvA.ad(paramString1, paramString2);
  }

  protected static boolean d(String paramString1, String paramString2, boolean paramBoolean)
  {
    return dvA.d(paramString1, paramString2, paramBoolean);
  }

  protected static boolean ae(String paramString1, String paramString2)
  {
    return dvA.ae(paramString1, paramString2);
  }

  protected static boolean e(String paramString1, String paramString2, boolean paramBoolean)
  {
    return dvA.e(paramString1, paramString2, paramBoolean);
  }

  public static boolean af(String paramString1, String paramString2)
  {
    return dvA.af(paramString1, paramString2);
  }

  protected static boolean f(String paramString1, String paramString2, boolean paramBoolean)
  {
    return dvA.f(paramString1, paramString2, paramBoolean);
  }

  public static String[] bzd()
  {
    synchronized (fKH) {
      return (String[])fKH.toArray(new String[fKH.size()]);
    }
  }

  public static boolean iA(String paramString)
  {
    synchronized (fKH) {
      return fKH.add(paramString);
    }
  }

  public static boolean iB(String paramString)
  {
    synchronized (fKH) {
      return fKH.remove(paramString);
    }
  }

  public static void bze()
  {
    synchronized (fKH) {
      fKH.clear();
      for (int i = 0; i < fKD.length; i++)
        fKH.add(fKD[i]);
    }
  }

  public void K(String paramString)
  {
    d(paramString == null ? (File)null : new File(paramString.replace('/', File.separatorChar).replace('\\', File.separatorChar)));
  }

  public synchronized void d(File paramFile)
  {
    this.bGO = paramFile;
  }

  public synchronized File kQ()
  {
    return this.bGO;
  }

  public synchronized boolean isCaseSensitive()
  {
    return this.fKU;
  }

  public synchronized void setCaseSensitive(boolean paramBoolean)
  {
    this.fKU = paramBoolean;
  }

  public void eR(boolean paramBoolean)
  {
    this.fCA = paramBoolean;
  }

  public synchronized boolean bwF()
  {
    return this.fCz;
  }

  public synchronized void cw(boolean paramBoolean)
  {
    this.fCz = paramBoolean;
  }

  public void qd(int paramInt)
  {
    this.fCB = paramInt;
  }

  public synchronized void b(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null) {
      this.fKI = null;
    } else {
      this.fKI = new String[paramArrayOfString.length];
      for (int i = 0; i < paramArrayOfString.length; i++)
        this.fKI[i] = iC(paramArrayOfString[i]);
    }
  }

  public synchronized void a(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null) {
      this.fKJ = null;
    } else {
      this.fKJ = new String[paramArrayOfString.length];
      for (int i = 0; i < paramArrayOfString.length; i++)
        this.fKJ[i] = iC(paramArrayOfString[i]);
    }
  }

  public synchronized void r(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      if ((this.fKJ != null) && (this.fKJ.length > 0)) {
        String[] arrayOfString = new String[paramArrayOfString.length + this.fKJ.length];

        System.arraycopy(this.fKJ, 0, arrayOfString, 0, this.fKJ.length);

        for (int i = 0; i < paramArrayOfString.length; i++) {
          arrayOfString[(this.fKJ.length + i)] = iC(paramArrayOfString[i]);
        }

        this.fKJ = arrayOfString;
      } else {
        a(paramArrayOfString);
      }
  }

  private static String iC(String paramString)
  {
    String str = paramString.replace('/', File.separatorChar).replace('\\', File.separatorChar);

    if (str.endsWith(File.separator)) {
      str = str + "**";
    }
    return str;
  }

  public synchronized void a(ank[] paramArrayOfank)
  {
    this.fKK = paramArrayOfank;
  }

  public synchronized boolean bzf()
  {
    return this.fKV;
  }

  public void kX()
  {
    synchronized (this.fLd) {
      if (this.fLc) {
        while (this.fLc)
          try {
            this.fLd.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        if (this.fLg != null) {
          throw this.fLg;
        }
        return;
      }
      this.fLc = true;
    }
    ??? = this.bGO;
    try {
      synchronized (this) {
        this.fLg = null;
        bzh();

        int i = this.fKI == null ? 1 : 0;
        this.fKI = (i != 0 ? new String[] { "**" } : this.fKI);

        int j = this.fKJ == null ? 1 : 0;
        this.fKJ = (j != 0 ? new String[0] : this.fKJ);

        if ((this.bGO != null) && (!this.fCz) && (fKG.ad(this.bGO)))
        {
          this.fLh.add(this.bGO.getAbsolutePath());
          this.bGO = null;
        }

        if (this.bGO == null)
        {
          if (i == 0);
        }
        else
        {
          if (!this.bGO.exists()) {
            if (this.fCA) {
              this.fLg = new IllegalStateException("basedir " + this.bGO + " does not exist.");
            }

          }
          else if (!this.bGO.isDirectory()) {
            this.fLg = new IllegalStateException("basedir " + this.bGO + " is not a" + " directory.");
          }

          if (this.fLg != null) {
            throw this.fLg;
          }
        }
        if (a(dfT.laA)) {
          if (!d(dfT.laA)) {
            if (c("", this.bGO))
              this.fKO.addElement("");
            else
              this.fKS.addElement("");
          }
          else
            this.fKQ.addElement("");
        }
        else {
          this.fKP.addElement("");
        }
        bzg();
        clearCaches();
        this.fKI = (i != 0 ? null : this.fKI);
        this.fKJ = (j != 0 ? null : this.fKJ);
      }
    } catch (IOException localIOException) {
      throw new cJ(localIOException);
    } finally {
      this.bGO = ((File)???);
      synchronized (this.fLd) {
        this.fLc = false;
        this.fLd.notifyAll();
      }
    }
  }

  private void bzg()
  {
    bzp();
    HashMap localHashMap = new HashMap();
    Object localObject2;
    for (int i = 0; i < this.fKZ.length; i++) {
      localObject2 = this.fKZ[i].toString();
      if (!iD((String)localObject2)) {
        localHashMap.put(this.fKZ[i].cTZ(), localObject2);
      }
    }

    for (Object localObject1 = this.fKX.entrySet().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      if (!iD((String)localObject3))
        localHashMap.put(((Map.Entry)localObject2).getValue(), localObject3);
    }
    Object localObject3;
    Iterator localIterator;
    if ((localHashMap.containsKey(dfT.laA)) && (this.bGO != null))
    {
      a(this.bGO, "", true);
    } else {
      localObject1 = null;
      if (this.bGO != null) {
        try {
          localObject1 = this.bGO.getCanonicalFile();
        } catch (IOException localIOException1) {
          throw new cJ(localIOException1);
        }

      }

      for (localIterator = localHashMap.entrySet().iterator(); localIterator.hasNext(); ) { localObject3 = (Map.Entry)localIterator.next();
        dfT localdfT = (dfT)((Map.Entry)localObject3).getKey();
        String str1 = localdfT.toString();
        if ((this.bGO != null) || (wh.isAbsolutePath(str1)))
        {
          Object localObject4 = new File(this.bGO, str1);

          if (((File)localObject4).exists())
          {
            try
            {
              String str2 = this.bGO == null ? ((File)localObject4).getCanonicalPath() : aIk.c((File)localObject1, ((File)localObject4).getCanonicalFile());

              if ((!str2.equals(str1)) || (fKC)) {
                localObject4 = localdfT.c(this.bGO, true);
                if ((localObject4 != null) && (this.bGO != null)) {
                  str1 = aIk.c(this.bGO, (File)localObject4);

                  if (!localdfT.toString().equals(str1))
                  {
                    localdfT = new dfT(str1);
                  }
                }
              }
            }
            catch (IOException localIOException2) {
              throw new cJ(localIOException2);
            }
          }
          Object localObject5;
          if (((localObject4 == null) || (!((File)localObject4).exists())) && (!isCaseSensitive())) {
            localObject5 = localdfT.c(this.bGO, false);
            if ((localObject5 != null) && (((File)localObject5).exists()))
            {
              str1 = this.bGO == null ? ((File)localObject5).getAbsolutePath() : aIk.c(this.bGO, (File)localObject5);

              localObject4 = localObject5;
              localdfT = new dfT(str1);
            }
          }

          if ((localObject4 != null) && (((File)localObject4).exists()))
            if ((!this.fCz) && (localdfT.W(this.bGO))) {
              if (!d(localdfT)) {
                this.fLh.add(((File)localObject4).getAbsolutePath());
              }

            }
            else if (((File)localObject4).isDirectory()) {
              if ((a(localdfT)) && (str1.length() > 0))
              {
                a(localdfT, (File)localObject4, true);
              }
              else a((File)localObject4, localdfT, true); 
            }
            else
            {
              localObject5 = (String)((Map.Entry)localObject3).getValue();
              boolean bool = isCaseSensitive() ? ((String)localObject5).equals(str1) : ((String)localObject5).equalsIgnoreCase(str1);

              if (bool)
                a(localdfT, (File)localObject4);
            }
        }
      }
    }
  }

  private boolean iD(String paramString)
  {
    if (wh.isAbsolutePath(paramString))
    {
      if ((this.bGO != null) && (!dvA.d(paramString, this.bGO.getAbsolutePath(), isCaseSensitive())))
      {
        return true;
      }
    } else if (this.bGO == null)
    {
      return true;
    }
    return false;
  }

  protected synchronized void bzh()
  {
    this.fKL = new Wm();
    this.fKM = new Wm();
    this.fKN = new Wm();
    this.fKR = new Wm();
    this.fKO = new Wm();
    this.fKP = new Wm();
    this.fKQ = new Wm();
    this.fKS = new Wm();
    this.fKV = (this.bGO != null);
    this.fKW.clear();
    this.fLh.clear();
  }

  protected void bzi()
  {
    synchronized (this.fLf) {
      if (this.fKT) {
        return;
      }
      if (this.fLe) {
        while (this.fLe)
          try {
            this.fLf.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        return;
      }
      this.fLe = true;
    }
    try {
      synchronized (this)
      {
        int i = this.fKI == null ? 1 : 0;
        this.fKI = (i != 0 ? new String[] { "**" } : this.fKI);

        int j = this.fKJ == null ? 1 : 0;
        this.fKJ = (j != 0 ? new String[0] : this.fKJ);

        String[] arrayOfString1 = new String[this.fKQ.size()];
        this.fKQ.copyInto(arrayOfString1);

        String[] arrayOfString2 = new String[this.fKP.size()];
        this.fKP.copyInto(arrayOfString2);

        bzp();

        s(arrayOfString1);
        s(arrayOfString2);
        clearCaches();
        this.fKI = (i != 0 ? null : this.fKI);
        this.fKJ = (j != 0 ? null : this.fKJ);
      }
    } finally {
      synchronized (this.fLf) {
        this.fKT = true;
        this.fLe = false;
        this.fLf.notifyAll();
      }
    }
  }

  private void s(String[] paramArrayOfString) {
    for (int i = 0; i < paramArrayOfString.length; i++) {
      dfT localdfT = new dfT(paramArrayOfString[i]);
      if ((!b(localdfT)) || (c(localdfT)))
        a(new File(this.bGO, paramArrayOfString[i]), localdfT, false);
    }
  }

  protected void a(File paramFile, String paramString, boolean paramBoolean)
  {
    a(paramFile, new dfT(paramString), paramBoolean);
  }

  private void a(File paramFile, dfT paramdfT, boolean paramBoolean)
  {
    if (paramFile == null) {
      throw new cJ("dir must not be null.");
    }
    String[] arrayOfString = paramFile.list();
    if (arrayOfString == null) {
      if (!paramFile.exists())
        throw new cJ(paramFile + " does not exist.");
      if (!paramFile.isDirectory()) {
        throw new cJ(paramFile + " is not a directory.");
      }
      throw new cJ("IO error scanning directory '" + paramFile.getAbsolutePath() + "'");
    }

    a(paramFile, paramdfT, paramBoolean, arrayOfString, new LinkedList());
  }

  private void a(File paramFile, dfT paramdfT, boolean paramBoolean, String[] paramArrayOfString, LinkedList paramLinkedList)
  {
    String str1 = paramdfT.toString();
    if ((str1.length() > 0) && (!str1.endsWith(File.separator))) {
      str1 = str1 + File.separator;
    }

    if ((paramBoolean) && (iI(str1)))
      return;
    Object localObject;
    if (!this.fCz) {
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; j < paramArrayOfString.length; j++) {
        try {
          if (fKG.f(paramFile, paramArrayOfString[j])) {
            String str3 = str1 + paramArrayOfString[j];
            localObject = new File(paramFile, paramArrayOfString[j]);
            (((File)localObject).isDirectory() ? this.fKQ : this.fKN).addElement(str3);

            if (!iH(str3))
              this.fLh.add(((File)localObject).getAbsolutePath());
          }
          else {
            localArrayList.add(paramArrayOfString[j]);
          }
        } catch (IOException localIOException) {
          localObject = "IOException caught while checking for links, couldn't get canonical path!";

          System.err.println((String)localObject);
          localArrayList.add(paramArrayOfString[j]);
        }
      }
      paramArrayOfString = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    } else {
      paramLinkedList.addFirst(paramFile.getName());
    }

    for (int i = 0; i < paramArrayOfString.length; i++) {
      String str2 = str1 + paramArrayOfString[i];
      dfT localdfT = new dfT(paramdfT, paramArrayOfString[i]);
      localObject = new File(paramFile, paramArrayOfString[i]);
      String[] arrayOfString = ((File)localObject).list();
      if ((arrayOfString == null) || ((arrayOfString.length == 0) && (((File)localObject).isFile()))) {
        if (a(localdfT)) {
          a(localdfT, (File)localObject);
        } else {
          this.fKV = false;
          this.fKM.addElement(str2);
        }

      }
      else if ((this.fCz) && (a(paramArrayOfString[i], paramFile, paramLinkedList)))
      {
        System.err.println("skipping symbolic link " + ((File)localObject).getAbsolutePath() + " -- too many levels of symbolic" + " links.");

        this.fLh.add(((File)localObject).getAbsolutePath());
      }
      else
      {
        if (a(localdfT)) {
          a(localdfT, (File)localObject, paramBoolean, arrayOfString, paramLinkedList);
        }
        else {
          this.fKV = false;
          this.fKP.addElement(str2);
          if ((paramBoolean) && (b(localdfT)) && (!c(localdfT)))
          {
            a((File)localObject, localdfT, paramBoolean, arrayOfString, paramLinkedList);
          }
        }

        if (!paramBoolean) {
          a((File)localObject, localdfT, paramBoolean, arrayOfString, paramLinkedList);
        }
      }
    }

    if (this.fCz)
      paramLinkedList.removeFirst();
  }

  private void a(dfT paramdfT, File paramFile)
  {
    a(paramdfT, paramFile, this.fKL, this.fKN, this.fKR);
  }

  private void a(dfT paramdfT, File paramFile, boolean paramBoolean)
  {
    a(paramdfT, paramFile, this.fKO, this.fKQ, this.fKS);
    if ((paramBoolean) && (b(paramdfT)) && (!c(paramdfT)))
      a(paramFile, paramdfT, paramBoolean);
  }

  private void a(dfT paramdfT, File paramFile, boolean paramBoolean, String[] paramArrayOfString, LinkedList paramLinkedList)
  {
    a(paramdfT, paramFile, this.fKO, this.fKQ, this.fKS);
    if ((paramBoolean) && (b(paramdfT)) && (!c(paramdfT)))
      a(paramFile, paramdfT, paramBoolean, paramArrayOfString, paramLinkedList);
  }

  private void a(dfT paramdfT, File paramFile, Vector paramVector1, Vector paramVector2, Vector paramVector3)
  {
    String str = paramdfT.toString();
    if ((paramVector1.contains(str)) || (paramVector2.contains(str)) || (paramVector3.contains(str))) {
      return;
    }

    int i = 0;
    if (d(paramdfT)) {
      paramVector2.add(str);
    } else if (c(str, paramFile)) {
      i = 1;
      paramVector1.add(str);
    } else {
      paramVector3.add(str);
    }
    this.fKV &= i;
  }

  protected boolean iE(String paramString)
  {
    return a(new dfT(paramString));
  }

  private boolean a(dfT paramdfT)
  {
    bzp();

    if (isCaseSensitive() ? this.fKX.containsKey(paramdfT.toString()) : this.fKX.containsKey(paramdfT.toString().toUpperCase()))
    {
      return true;
    }
    for (int i = 0; i < this.fKZ.length; i++) {
      if (this.fKZ[i].a(paramdfT, isCaseSensitive())) {
        return true;
      }
    }
    return false;
  }

  protected boolean iF(String paramString)
  {
    return b(new dfT(paramString));
  }

  private boolean b(dfT paramdfT)
  {
    for (int i = 0; i < this.fKZ.length; i++) {
      if (a(paramdfT, this.fKZ[i])) {
        return true;
      }
    }
    Iterator localIterator = this.fKX.values().iterator();
    while (localIterator.hasNext()) {
      if (a(paramdfT, ((dfT)localIterator.next()).cPx()))
      {
        return true;
      }
    }
    return false;
  }

  private boolean a(dfT paramdfT, dmj paramdmj)
  {
    return (paramdmj.b(paramdfT, isCaseSensitive())) && (iG(paramdfT.toString())) && (a(paramdmj, paramdfT));
  }

  private boolean a(dmj paramdmj, dfT paramdfT)
  {
    return (paramdmj.pw("**")) || (paramdmj.depth() > paramdfT.depth());
  }

  private boolean iG(String paramString)
  {
    String str = paramString + File.separatorChar + "**";

    for (int i = 0; i < this.fLa.length; i++) {
      if (this.fLa[i].toString().equals(str)) {
        return false;
      }
    }
    return true;
  }

  boolean c(dfT paramdfT)
  {
    for (int i = 0; i < this.fLa.length; i++) {
      if ((this.fLa[i].endsWith("**")) && (this.fLa[i].cUa().a(paramdfT, isCaseSensitive())))
      {
        return true;
      }
    }
    return false;
  }

  protected boolean iH(String paramString)
  {
    return d(new dfT(paramString));
  }

  private boolean d(dfT paramdfT)
  {
    bzp();

    if (isCaseSensitive() ? this.fKY.containsKey(paramdfT.toString()) : this.fKY.containsKey(paramdfT.toString().toUpperCase()))
    {
      return true;
    }
    for (int i = 0; i < this.fLa.length; i++) {
      if (this.fLa[i].a(paramdfT, isCaseSensitive())) {
        return true;
      }
    }
    return false;
  }

  protected boolean c(String paramString, File paramFile)
  {
    if (this.fKK != null) {
      for (int i = 0; i < this.fKK.length; i++) {
        if (!this.fKK[i].a(this.bGO, paramString, paramFile)) {
          return false;
        }
      }
    }
    return true;
  }

  public String[] kU()
  {
    String[] arrayOfString;
    synchronized (this) {
      if (this.fKL == null) {
        throw new IllegalStateException("Must call scan() first");
      }
      arrayOfString = new String[this.fKL.size()];
      this.fKL.copyInto(arrayOfString);
    }
    Arrays.sort(arrayOfString);
    return arrayOfString;
  }

  public synchronized int bzj()
  {
    if (this.fKL == null) {
      throw new IllegalStateException("Must call scan() first");
    }
    return this.fKL.size();
  }

  public synchronized String[] kW()
  {
    bzi();
    String[] arrayOfString = new String[this.fKM.size()];
    this.fKM.copyInto(arrayOfString);
    return arrayOfString;
  }

  public synchronized String[] kS()
  {
    bzi();
    String[] arrayOfString = new String[this.fKN.size()];
    this.fKN.copyInto(arrayOfString);
    return arrayOfString;
  }

  public synchronized String[] bzk()
  {
    bzi();
    String[] arrayOfString = new String[this.fKR.size()];
    this.fKR.copyInto(arrayOfString);
    return arrayOfString;
  }

  public String[] kT()
  {
    String[] arrayOfString;
    synchronized (this) {
      if (this.fKO == null) {
        throw new IllegalStateException("Must call scan() first");
      }
      arrayOfString = new String[this.fKO.size()];
      this.fKO.copyInto(arrayOfString);
    }
    Arrays.sort(arrayOfString);
    return arrayOfString;
  }

  public synchronized int bzl()
  {
    if (this.fKO == null) {
      throw new IllegalStateException("Must call scan() first");
    }
    return this.fKO.size();
  }

  public synchronized String[] kV()
  {
    bzi();
    String[] arrayOfString = new String[this.fKP.size()];
    this.fKP.copyInto(arrayOfString);
    return arrayOfString;
  }

  public synchronized String[] kR()
  {
    bzi();
    String[] arrayOfString = new String[this.fKQ.size()];
    this.fKQ.copyInto(arrayOfString);
    return arrayOfString;
  }

  public synchronized String[] bzm()
  {
    bzi();
    String[] arrayOfString = new String[this.fKS.size()];
    this.fKS.copyInto(arrayOfString);
    return arrayOfString;
  }

  public synchronized String[] bzn()
  {
    String[] arrayOfString;
    synchronized (this) {
      arrayOfString = (String[])this.fLh.toArray(new String[this.fLh.size()]);
    }

    Arrays.sort(arrayOfString);
    return arrayOfString;
  }

  public synchronized void kP()
  {
    int i = this.fKJ == null ? 0 : this.fKJ.length;

    String[] arrayOfString2 = bzd();
    String[] arrayOfString1 = new String[i + arrayOfString2.length];
    if (i > 0) {
      System.arraycopy(this.fKJ, 0, arrayOfString1, 0, i);
    }
    for (int j = 0; j < arrayOfString2.length; j++) {
      arrayOfString1[(j + i)] = arrayOfString2[j].replace('/', File.separatorChar).replace('\\', File.separatorChar);
    }

    this.fKJ = arrayOfString1;
  }

  public synchronized bFe bS(String paramString)
  {
    return new WO(this.bGO, paramString);
  }

  private boolean iI(String paramString)
  {
    return !this.fKW.add(paramString);
  }

  Set bzo()
  {
    return this.fKW;
  }

  private synchronized void clearCaches()
  {
    this.fKX.clear();
    this.fKY.clear();
    this.fKZ = null;
    this.fLa = null;
    this.fLb = false;
  }

  synchronized void bzp()
  {
    if (!this.fLb) {
      this.fKZ = a(this.fKX, this.fKI);
      this.fLa = a(this.fKY, this.fKJ);
      this.fLb = true;
    }
  }

  private dmj[] a(Map paramMap, String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfString.length);
    for (int i = 0; i < paramArrayOfString.length; i++) {
      if (!dvA.qw(paramArrayOfString[i])) {
        String str = isCaseSensitive() ? paramArrayOfString[i] : paramArrayOfString[i].toUpperCase();

        paramMap.put(str, new dfT(str));
      } else {
        localArrayList.add(new dmj(paramArrayOfString[i]));
      }
    }
    return (dmj[])localArrayList.toArray(new dmj[localArrayList.size()]);
  }

  private boolean a(String paramString, File paramFile, LinkedList paramLinkedList)
  {
    try
    {
      ArrayList localArrayList;
      File localFile;
      String str1;
      String str2;
      if ((paramLinkedList.size() >= this.fCB) && (dst.frequency(paramLinkedList, paramString) >= this.fCB) && (fKG.f(paramFile, paramString)))
      {
        localArrayList = new ArrayList();
        localFile = aIk.e(paramFile, paramString);
        str1 = localFile.getCanonicalPath();
        localArrayList.add(str1);

        str2 = "";
        for (String str3 : paramLinkedList) {
          str2 = str2 + "../";
          if (paramString.equals(str3)) {
            localFile = aIk.e(paramFile, str2 + str3);
            localArrayList.add(localFile.getCanonicalPath());
            if ((localArrayList.size() > this.fCB) && (dst.frequency(localArrayList, str1) > this.fCB))
            {
              return true;
            }
          }
        }
      }

      return false;
    } catch (IOException localIOException) {
      throw new cJ("Caught error while checking for symbolic links", localIOException);
    }
  }

  static
  {
    bze();
  }
}