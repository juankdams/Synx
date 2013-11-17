import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public abstract class czj extends cwV
  implements gb, Cloneable
{
  private Vector bZY = new Vector();

  public boolean lT()
  {
    if (cum()) {
      return ((czj)cup()).lT();
    }
    cuo();
    return !this.bZY.isEmpty();
  }

  public int lU()
  {
    if (cum()) {
      return ((czj)cup()).lU();
    }
    cuo();
    return this.bZY.size();
  }

  public ank[] a(FF paramFF)
  {
    if (cum()) {
      return ((czj)U(paramFF)).a(paramFF);
    }

    T(paramFF);
    ank[] arrayOfank = new ank[this.bZY.size()];
    this.bZY.copyInto(arrayOfank);
    return arrayOfank;
  }

  public Enumeration lV()
  {
    if (cum()) {
      return ((czj)cup()).lV();
    }

    cuo();
    return this.bZY.elements();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Enumeration localEnumeration = lV();
    if (localEnumeration.hasMoreElements()) {
      while (localEnumeration.hasMoreElements()) {
        localStringBuilder.append(((ank)localEnumeration.nextElement()).toString());
        if (localEnumeration.hasMoreElements()) {
          localStringBuilder.append(", ");
        }
      }
    }

    return localStringBuilder.toString();
  }

  public void a(ank paramank)
  {
    if (cum()) {
      throw cur();
    }
    this.bZY.addElement(paramank);
    setChecked(false);
  }

  public void validate()
  {
    if (cum()) {
      ((czj)cup()).validate();
    }
    cuo();
    Enumeration localEnumeration = lV();
    while (localEnumeration.hasMoreElements()) {
      Object localObject = localEnumeration.nextElement();
      if ((localObject instanceof wM))
        ((wM)localObject).validate();
    }
  }

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

  protected synchronized void a(Stack paramStack, FF paramFF) {
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

  public synchronized Object clone() {
    if (cum())
      return ((czj)cup()).clone();
    try
    {
      czj localczj = (czj)super.clone();

      localczj.bZY = new Vector(this.bZY);
      return localczj;
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new cJ(localCloneNotSupportedException);
    }
  }
}