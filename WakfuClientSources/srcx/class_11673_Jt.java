import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class Jt extends cwV
  implements Cloneable
{
  public static final String bTF = "@";
  public static final String bTG = "@";
  private String bTH = "@";
  private String bTI = "@";
  private Vector bTJ;
  private boolean bTK = false;

  private boolean bTL = true;
  private Hashtable bTM = null;
  private Vector bTN = new Vector();
  private cRC bTO = cRC.kDP;
  private boolean bTP = false;

  private int bTQ = 0;

  private Vector bTR = new Vector();

  public Jt()
  {
  }

  protected Jt(Jt paramJt)
  {
    Vector localVector = (Vector)paramJt.TB().clone();
    this.bTR = localVector;
  }

  protected synchronized Vector TB()
  {
    if (cum()) {
      return TC().TB();
    }
    cuo();

    if (!this.bTP) {
      this.bTP = true;
      int i = this.bTN.size();
      for (int j = 0; j < i; j++) {
        y((File)this.bTN.get(j));
      }
      this.bTN.clear();
      this.bTP = false;
    }
    return this.bTR;
  }

  protected Jt TC()
  {
    return (Jt)i(Jt.class, "filterset");
  }

  public synchronized Hashtable TD()
  {
    if (cum()) {
      return TC().TD();
    }
    cuo();
    Enumeration localEnumeration;
    if (this.bTM == null) {
      this.bTM = new Hashtable(TB().size());
      for (localEnumeration = TB().elements(); localEnumeration.hasMoreElements(); ) {
        bCX localbCX = (bCX)localEnumeration.nextElement();
        this.bTM.put(localbCX.bI(), localbCX.getValue());
      }
    }
    return this.bTM;
  }

  public void x(File paramFile)
  {
    if (cum()) {
      throw cuq();
    }
    this.bTN.add(paramFile);
  }

  public void cu(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    if ((paramString == null) || ("".equals(paramString))) {
      throw new cJ("beginToken must not be empty");
    }
    this.bTH = paramString;
  }

  public String TE()
  {
    if (cum()) {
      return TC().TE();
    }
    return this.bTH;
  }

  public void cv(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    if ((paramString == null) || ("".equals(paramString))) {
      throw new cJ("endToken must not be empty");
    }
    this.bTI = paramString;
  }

  public String TF()
  {
    if (cum()) {
      return TC().TF();
    }
    return this.bTI;
  }

  public void aS(boolean paramBoolean)
  {
    this.bTL = paramBoolean;
  }

  public boolean TG()
  {
    return this.bTL;
  }

  public synchronized void y(File paramFile)
  {
    if (cum()) {
      throw cuq();
    }
    if (!paramFile.exists()) {
      cy("Could not read filters from file " + paramFile + " as it doesn't exist.");
    }

    if (paramFile.isFile()) {
      d("Reading filters from " + paramFile, 3);
      FileInputStream localFileInputStream = null;
      try {
        Properties localProperties = new Properties();
        localFileInputStream = new FileInputStream(paramFile);
        localProperties.load(localFileInputStream);

        Enumeration localEnumeration = localProperties.propertyNames();
        Vector localVector = TB();
        while (localEnumeration.hasMoreElements()) {
          String str1 = (String)localEnumeration.nextElement();
          String str2 = localProperties.getProperty(str1);
          localVector.addElement(new bCX(str1, str2));
        }
      } catch (Exception localException) {
        throw new cJ("Could not read filters from file: " + paramFile, localException);
      }
      finally {
        wh.c(localFileInputStream);
      }
    } else {
      cy("Must specify a file rather than a directory in the filtersfile attribute:" + paramFile);
    }

    this.bTM = null;
  }

  public synchronized String cw(String paramString)
  {
    return cx(paramString);
  }

  public synchronized void a(bCX parambCX)
  {
    if (cum()) {
      throw cur();
    }
    this.bTR.addElement(parambCX);
    this.bTM = null;
  }

  public cOD TH()
  {
    if (cum()) {
      throw cur();
    }
    return new cOD(this);
  }

  public synchronized void t(String paramString1, String paramString2)
  {
    if (cum()) {
      throw cur();
    }
    a(new bCX(paramString1, paramString2));
  }

  public synchronized void a(Jt paramJt)
  {
    if (cum()) {
      throw cur();
    }
    for (bCX localbCX : paramJt.TB())
      a(localbCX);
  }

  public synchronized boolean TI()
  {
    return TB().size() > 0;
  }

  public synchronized Object clone()
  {
    if (cum())
      return TC().clone();
    try
    {
      Jt localJt = (Jt)super.clone();

      Vector localVector = (Vector)TB().clone();
      localJt.bTR = localVector;
      localJt.b(Ga());
      return localJt;
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new cJ(localCloneNotSupportedException);
    }
  }

  public void a(cRC paramcRC)
  {
    this.bTO = paramcRC;
  }

  public cRC TJ()
  {
    return this.bTO;
  }

  private synchronized String cx(String paramString)
  {
    String str1 = TE();
    String str2 = TF();
    int i = paramString.indexOf(str1);

    if (i > -1) {
      Hashtable localHashtable = TD();
      try {
        StringBuilder localStringBuilder = new StringBuilder();
        int j = 0;
        String str3 = null;
        String str4 = null;

        while (i > -1)
        {
          int k = paramString.indexOf(str2, i + str1.length() + 1);

          if (k == -1) {
            break;
          }
          str3 = paramString.substring(i + str1.length(), k);

          localStringBuilder.append(paramString.substring(j, i));
          if (localHashtable.containsKey(str3)) {
            str4 = (String)localHashtable.get(str3);
            if ((this.bTL) && (!str4.equals(str3)))
            {
              str4 = w(str4, str3);
            }
            d("Replacing: " + str1 + str3 + str2 + " -> " + str4, 3);

            localStringBuilder.append(str4);
            j = i + str1.length() + str3.length() + str2.length();
          }
          else
          {
            localStringBuilder.append(str1.charAt(0));
            j = i + 1;
          }
          i = paramString.indexOf(str1, j);
        }

        localStringBuilder.append(paramString.substring(j));
        return localStringBuilder.toString();
      } catch (StringIndexOutOfBoundsException localStringIndexOutOfBoundsException) {
        return paramString;
      }
    }
    return paramString;
  }

  private synchronized String w(String paramString1, String paramString2)
  {
    String str1 = TE();
    String str2 = TF();
    if (this.bTQ == 0) {
      this.bTJ = new Wm();
    }
    this.bTQ += 1;
    if ((this.bTJ.contains(paramString2)) && (!this.bTK)) {
      this.bTK = true;
      System.out.println("Infinite loop in tokens. Currently known tokens : " + this.bTJ.toString() + "\nProblem token : " + str1 + paramString2 + str2 + " called from " + str1 + ((String)this.bTJ.lastElement()).toString() + str2);

      this.bTQ -= 1;
      return paramString2;
    }
    this.bTJ.addElement(paramString2);
    String str3 = cx(paramString1);
    if ((str3.indexOf(str1) == -1) && (!this.bTK) && (this.bTQ == 1))
    {
      this.bTJ = null;
    } else if (this.bTK)
    {
      if (this.bTJ.size() > 0) {
        str3 = (String)this.bTJ.remove(this.bTJ.size() - 1);
        if (this.bTJ.size() == 0) {
          str3 = str1 + str3 + str2;
          this.bTK = false;
        }
      }
    } else if (this.bTJ.size() > 0)
    {
      this.bTJ.remove(this.bTJ.size() - 1);
    }
    this.bTQ -= 1;
    return str3;
  }

  private void cy(String paramString) {
    switch (this.bTO.getIndex()) {
    case 2:
      return;
    case 0:
      throw new cJ(paramString);
    case 1:
      d(paramString, 1);
      return;
    }
    throw new cJ("Invalid value for onMissingFiltersFile");
  }
}