import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public abstract class dNt
{
  public static boolean DEBUG = true;
  protected static final Logger K = Logger.getLogger(dNt.class);

  private static final Pattern mec = Pattern.compile("\\A(([\\w\\d-]+|\\?)\\.)*([\\w\\d-]+|\\?|\\*)?(\\.([\\w\\d-]+|\\?))*\\z");
  private final String m_name;
  protected final dNt med;
  protected final dUl mee;
  private boolean aQS;
  private final String ePy;
  private final byte[] mef;

  dNt(String paramString, dNt paramdNt, dUl paramdUl)
  {
    this.m_name = paramString;
    this.med = paramdNt;
    this.mee = paramdUl;
    this.aQS = true;

    if (this.med != null)
      this.ePy = (this.med.getFullName() + "." + this.m_name);
    else {
      this.ePy = paramString;
    }
    this.mef = dzp.qC(this.ePy);
  }

  public final String getName()
  {
    return this.m_name;
  }

  public final String getFullName()
  {
    return this.ePy;
  }

  public final byte[] dpW() {
    return this.mef;
  }

  public final dNt dpX()
  {
    return this.med;
  }

  public final dUl dpY()
  {
    return this.mee;
  }

  protected final void touch()
  {
    this.aQS = true;
    if (this.med != null)
      this.med.touch();
  }

  public boolean isDirty()
  {
    return this.aQS;
  }

  public abstract void clear();

  public void update()
  {
  }

  public abstract boolean hasValue();

  public abstract long getValue();

  public abstract Map byb();

  public final dNt rx(String paramString)
  {
    return (dNt)byb().get(paramString);
  }

  public final cNY ry(String paramString)
  {
    if (paramString == null) {
      throw new RuntimeException("Path invalide : " + paramString);
    }
    Matcher localMatcher = mec.matcher(paramString);
    if (localMatcher.matches()) {
      String[] arrayOfString1 = paramString.split("\\.");
      Object localObject1 = cNY.b(this);
      String str1 = "";
      for (String str2 : arrayOfString1) {
        str1 = str1 + str2;
        Object localObject2;
        Object localObject3;
        dNt localdNt1;
        if (str2.equals("?")) {
          localObject2 = new cNY();
          for (localObject3 = ((cNY)localObject1).cGc().iterator(); ((Iterator)localObject3).hasNext(); ) { localdNt1 = (dNt)((Iterator)localObject3).next();
            ((cNY)localObject2).s(localdNt1.byb().values());
          }
          if (((cNY)localObject2).size() == 0) {
            if (DEBUG)
              K.error("Aucun noeud au niveau " + str1);
            return cNY.ktX;
          }
          localObject1 = localObject2;
        } else if (str2.equals("*")) {
          localObject2 = new LinkedList();
          for (localObject3 = ((cNY)localObject1).cGc().iterator(); ((Iterator)localObject3).hasNext(); ) { localdNt1 = (dNt)((Iterator)localObject3).next();
            ((LinkedList)localObject2).add(localdNt1);
          }
          localObject3 = new cNY();
          while (!((LinkedList)localObject2).isEmpty()) {
            localdNt1 = (dNt)((LinkedList)localObject2).poll();
            ((LinkedList)localObject2).addAll(localdNt1.byb().values());
            ((cNY)localObject3).c(localdNt1);
          }
          if (((cNY)localObject3).size() == 0) {
            K.error("Aucun noeud au niveau " + str1);
            return cNY.ktX;
          }
          localObject1 = localObject3;
        } else {
          localObject2 = new cNY();
          for (localObject3 = ((cNY)localObject1).cGc().iterator(); ((Iterator)localObject3).hasNext(); ) { localdNt1 = (dNt)((Iterator)localObject3).next();
            dNt localdNt2 = localdNt1.rx(str2);
            if (localdNt2 != null) {
              ((cNY)localObject2).c(localdNt2);
            }
          }
          if (((cNY)localObject2).size() == 0) {
            if (DEBUG)
              K.error("Aucun noeud " + str2 + " au niveau " + str1);
            return cNY.ktX;
          }
          localObject1 = localObject2;
        }
        str1 = str1 + ".";
      }
      return localObject1;
    }
    throw new RuntimeException("Path invalide : " + paramString);
  }

  public final dNt rz(String paramString)
  {
    List localList = ry(paramString).cGc();
    if (localList.size() == 1) {
      return (dNt)localList.get(0);
    }
    return null;
  }

  public final bLQ rA(String paramString)
  {
    List localList = ry(paramString).cGe();
    if (localList.size() == 1) {
      return (bLQ)localList.get(0);
    }
    return null;
  }

  public final boq rB(String paramString)
  {
    try
    {
      List localList = ry(paramString).cGd();
      if (localList.size() == 1)
        return (boq)localList.get(0);
    } catch (Exception localException) {
      K.error("Exception levée lors de la récupération des noeuds", localException);
    }
    return null;
  }

  public abstract void a(cXr paramcXr);

  protected void a(cXr paramcXr, cdG paramcdG)
  {
    byte[] arrayOfByte = dzp.qC(getName());
    paramcXr.eL((byte)arrayOfByte.length);
    paramcXr.aD(arrayOfByte);
    paramcXr.eL((byte)paramcdG.ordinal());
    paramcXr.eL((byte)dpY().ordinal());
  }

  public abstract void a(ByteBuffer paramByteBuffer, String paramString);

  public String toString()
  {
    return getFullName();
  }
}