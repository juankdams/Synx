import java.io.File;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public abstract class MS extends wM
  implements gb
{
  private Vector bZY = new Vector();

  public boolean lT()
  {
    cuo();
    return !this.bZY.isEmpty();
  }

  public int lU()
  {
    cuo();
    return this.bZY.size();
  }

  public ank[] a(FF paramFF)
  {
    cuo();
    ank[] arrayOfank = new ank[this.bZY.size()];
    this.bZY.copyInto(arrayOfank);
    return arrayOfank;
  }

  public Enumeration lV()
  {
    cuo();
    return this.bZY.elements();
  }

  public String toString()
  {
    cuo();
    StringBuilder localStringBuilder = new StringBuilder();
    Enumeration localEnumeration = lV();
    while (localEnumeration.hasMoreElements()) {
      localStringBuilder.append(((ank)localEnumeration.nextElement()).toString());
      if (localEnumeration.hasMoreElements()) {
        localStringBuilder.append(", ");
      }
    }
    return localStringBuilder.toString();
  }

  public void a(ank paramank)
  {
    this.bZY.addElement(paramank);
    setChecked(false);
  }

  public void validate()
  {
    cd();
    cuo();
    String str = getError();
    if (str != null) {
      throw new cJ(str);
    }
    Enumeration localEnumeration = lV();
    while (localEnumeration.hasMoreElements()) {
      Object localObject = localEnumeration.nextElement();
      if ((localObject instanceof wM))
        ((wM)localObject).validate();
    }
  }

  public abstract boolean a(File paramFile1, String paramString, File paramFile2);

  public void a(eO parameO)
  {
    a(parameO);
  }

  public void a(bQW parambQW)
  {
    a(parambQW);
  }

  public void a(czH paramczH)
  {
    a(paramczH);
  }

  public void a(dbz paramdbz)
  {
    a(paramdbz);
  }

  public void a(dIM paramdIM)
  {
    a(paramdIM);
  }

  public void a(diF paramdiF)
  {
    a(paramdiF);
  }

  public void a(dFB paramdFB)
  {
    a(paramdFB);
  }

  public void a(cNP paramcNP)
  {
    a(paramcNP);
  }

  public void a(arQ paramarQ)
  {
    a(paramarQ);
  }

  public void a(bxQ parambxQ)
  {
    a(parambxQ);
  }

  public void a(UF paramUF)
  {
    a(paramUF);
  }

  public void a(bJY parambJY)
  {
    a(parambJY);
  }

  public void a(cPj paramcPj)
  {
    a(paramcPj);
  }

  public void a(buP parambuP)
  {
    a(parambuP);
  }

  public void a(dSW paramdSW)
  {
    a(paramdSW);
  }

  public void a(bMy parambMy)
  {
    a(parambMy);
  }

  public void a(aS paramaS)
  {
    a(paramaS);
  }

  public void a(NA paramNA)
  {
    a(paramNA);
  }

  public void a(dff paramdff) {
    a(paramdff);
  }

  public void a(ccl paramccl) {
    a(paramccl);
  }

  public void b(ank paramank)
  {
    a(paramank);
  }

  protected synchronized void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      for (ank localank : this.bZY) {
        if ((localank instanceof cwV)) {
          b((cwV)localank, paramStack, paramFF);
        }
      }
      setChecked(true);
    }
  }
}