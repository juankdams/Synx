import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class dpF extends cwV
  implements Cloneable
{
  private Vector lqq = new Vector();

  public void a(bma parambma)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(parambma);
  }

  public Vector cXf()
  {
    if (cum()) {
      return ((dpF)cup()).cXf();
    }
    cuo();
    return this.lqq;
  }

  public void a(awb paramawb)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramawb);
  }

  public void a(djS paramdjS)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramdjS);
  }

  public void a(qs paramqs)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramqs);
  }

  public void a(atN paramatN)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramatN);
  }

  public void a(bNS parambNS)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(parambNS);
  }

  public void a(bsp parambsp)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(parambsp);
  }

  public void a(aHe paramaHe)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramaHe);
  }

  public void a(cka paramcka)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramcka);
  }

  public void a(dPM paramdPM)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramdPM);
  }

  public void a(dbv paramdbv)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramdbv);
  }

  public void a(GD paramGD)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramGD);
  }

  public void a(bRG parambRG)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(parambRG);
  }

  public void a(cgm paramcgm)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramcgm);
  }

  public void a(aHX paramaHX)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramaHX);
  }

  public void a(aAd paramaAd)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramaAd);
  }

  public void a(diD paramdiD)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramdiD);
  }

  public void a(aKL paramaKL)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramaKL);
  }

  public void a(dHE paramdHE)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramdHE);
  }

  public void a(dxG paramdxG)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramdxG);
  }

  public void a(dMm paramdMm)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramdMm);
  }

  public void a(dQD paramdQD)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(paramdQD);
  }

  public void a(cxK paramcxK)
  {
    if (!this.lqq.isEmpty()) {
      throw cuq();
    }
    super.a(paramcxK);
  }

  public void a(bEc parambEc)
  {
    if (cum()) {
      throw cur();
    }
    setChecked(false);
    this.lqq.addElement(parambEc);
  }

  protected synchronized void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      for (Iterator localIterator = this.lqq.iterator(); localIterator.hasNext(); ) {
        Object localObject = localIterator.next();
        if ((localObject instanceof cwV)) {
          b((cwV)localObject, paramStack, paramFF);
        }
      }
      setChecked(true);
    }
  }
}