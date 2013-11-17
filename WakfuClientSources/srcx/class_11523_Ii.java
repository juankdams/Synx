import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;

final class Ii
  implements bvm
{
  public static final boolean aRN = false;
  private static final Logger K = Logger.getLogger(Ii.class);

  private final Collection bQU = new ArrayList();

  private final LinkedList bQV = new LinkedList();

  public LinkedList RB() {
    return this.bQV;
  }

  public void a(bSR parambSR)
  {
    this.bQV.add(parambSR);
  }

  public bSR fb(int paramInt) {
    bSR localbSR = fc(paramInt);
    if (localbSR != null) {
      this.bQV.remove(localbSR);
    }
    return localbSR;
  }

  public bSR fc(int paramInt) {
    for (bSR localbSR : this.bQV) {
      if (localbSR.bQX() == paramInt) {
        return localbSR;
      }
    }
    return null;
  }

  public bSR Z(int paramInt1, int paramInt2) {
    for (bSR localbSR : this.bQV) {
      if ((localbSR.eo() == paramInt2) && (localbSR.uK() == paramInt1)) {
        return localbSR;
      }
    }
    return null;
  }

  public bSR fd(int paramInt) {
    for (bSR localbSR : this.bQV) {
      if (localbSR.uK() == paramInt) {
        return localbSR;
      }
    }
    return null;
  }

  public bSR fe(int paramInt) {
    for (bSR localbSR : this.bQV) {
      if (localbSR.gA() == paramInt) {
        return localbSR;
      }
    }
    return null;
  }

  public Iterable RC() {
    ArrayList localArrayList = new ArrayList();
    for (bSR localbSR : this.bQV) {
      long l = localbSR.gA();

      if ((l != -9223372036854775808L) && (!localArrayList.contains(Long.valueOf(l)))) {
        localArrayList.add(Long.valueOf(l));
      }
    }
    return localArrayList;
  }

  public bSR k(int paramInt1, int paramInt2, int paramInt3) {
    for (bSR localbSR : this.bQV) {
      if ((localbSR.gA() == paramInt1) && (localbSR.uK() == paramInt2) && (localbSR.eo() == paramInt3)) {
        return localbSR;
      }
    }
    return null;
  }

  public void a(cOm paramcOm) {
    this.bQU.add(paramcOm);
  }

  public void b(cOm paramcOm) {
    this.bQU.remove(paramcOm);
  }

  public void RD()
  {
    if ((this.bQV == null) || (this.bQV.isEmpty())) {
      RE();
      return;
    }

    bSR localbSR = (bSR)this.bQV.getFirst();

    a(localbSR, true);
  }

  public void a(bSR parambSR, boolean paramBoolean)
  {
    Iterator localIterator;
    if ((this.bQV != null) && (this.bQV.contains(parambSR))) {
      for (localIterator = this.bQV.iterator(); localIterator.hasNext(); ) {
        bSR localbSR = (bSR)localIterator.next();
        if (localbSR == parambSR)
          break;
        if (!localbSR.bZx())
        {
          if (paramBoolean)
            localbSR.a(this);
          else {
            localIterator.remove();
          }
          a(localbSR, "Forced execution");
        }
      }
    }
    if (paramBoolean)
      parambSR.a(this);
    else {
      fb(parambSR.bQX());
    }
    a(parambSR, "In Group order");
  }

  private void a(bSR parambSR, String paramString)
  {
    try
    {
      parambSR.gE(true);
      parambSR.run();
    } catch (Exception localException) {
      K.error("[_FL_] ACTION FAILURE (" + paramString + ") " + b(parambSR) + " - " + bBd.g(localException));
      c(parambSR);
    }
  }

  private static String b(bSR parambSR)
  {
    return parambSR.getClass().getSimpleName() + " : " + parambSR.bQX() + " #" + parambSR.hashCode();
  }

  public void c(bSR parambSR)
  {
    parambSR.b(this);
    fb(parambSR.bQX());

    RD();
  }

  public void kill() {
    K.info("Kill des actions de la pile (" + this.bQV.size() + ")");

    ArrayList localArrayList = new ArrayList();

    for (Iterator localIterator = this.bQV.iterator(); localIterator.hasNext(); ) { localbSR = (bSR)localIterator.next();
      localbSR.b(this);
      localArrayList.add(localbSR);
    }
    bSR localbSR;
    this.bQV.clear();

    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localbSR = (bSR)localIterator.next();

      if ((localbSR instanceof atX)) {
        int i = ((atX)localbSR).aFX();

        if (i != -1)
          dlD.cTt().AH(i);
      }
      else if ((localbSR instanceof dqt)) {
        dqt localdqt = (dqt)localbSR;
        cAo.cxf().b(localdqt);
      }
    }

    RE();
  }

  private void RE()
  {
    for (cOm localcOm : (cOm[])this.bQU.toArray(new cOm[this.bQU.size()]))
      localcOm.b(this);
  }

  public void RF()
  {
    while (!this.bQV.isEmpty()) {
      bSR localbSR = (bSR)this.bQV.remove();
      localbSR.b(this);
      a(localbSR, "Executing all actions");
    }
  }

  public bSR ff(int paramInt) {
    for (bSR localbSR : this.bQV) {
      if (localbSR.bZy() == paramInt) {
        return localbSR;
      }
    }
    return null;
  }
}