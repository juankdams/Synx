import java.util.Iterator;
import org.apache.log4j.Logger;

public class cCX extends doA
{
  private static final aee bx = new bOO(new dKv());

  private static final qM by = new dzQ(new ec[] { new dLx("Jette la cible ", new dmb[0]) });

  private cYk dKD = null;

  public cCH aAR = new dKw(this, 10);

  public qM aF()
  {
    return by;
  }

  public void aH()
  {
    super.aH();
  }

  public cCX cyX()
  {
    cCX localcCX;
    try {
      localcCX = (cCX)bx.Mm();
      localcCX.aOr = bx;
    } catch (Exception localException) {
      localcCX = new cCX();
      localcCX.aOr = null;
      localcCX.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Throw : " + localException.getMessage());
    }
    return localcCX;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!(this.evo instanceof cYl)) {
      cVD();
      return;
    }

    cYl localcYl = (cYl)this.evo;
    if (!localcYl.cLK()) {
      cVD();
      return;
    }

    aTa localaTa = localcYl.cLL();

    int i = localaTa.fa();
    int j = localaTa.fb();
    short s = localaTa.fc();
    boolean bool;
    if (!bkt())
    {
      bool = localcYl.l(this.dKD);
      if (((localaTa instanceof dle)) && (this.ejP.LC() != null))
        this.ejP.LC().a(i, j, s, localaTa.fa(), localaTa.fb(), localaTa.fc(), (dle)localaTa);
    }
    else {
      UG localUG = this.ejP.LB();
      if (localUG == null) {
        K.warn("pas de fightmap sur le context " + this.ejP);
        cVD();
        return;
      }

      if ((!localaTa.aeH()) || (!localUG.s(this.eUw.getX(), this.eUw.getY(), this.eUw.IB())))
        bool = a(paramaVc, paramBoolean, localcYl, localaTa);
      else {
        bool = a(paramaVc, paramBoolean, localcYl, localaTa, localUG);
      }
    }
    if (!bool)
      jJ(true);
  }

  private boolean a(aVc paramaVc, boolean paramBoolean, cYl paramcYl, aTa paramaTa)
  {
    int i = paramaTa.fa();
    int j = paramaTa.fb();
    short s = paramaTa.fc();
    if (!paramcYl.l(this.eUw))
      return false;
    this.dKD = this.eUw;

    b(paramaVc, paramBoolean);

    if (((paramaTa instanceof dle)) && (this.ejP.LC() != null)) {
      ((dle)paramaTa).g(new cYk(i, j, s).aa(this.dKD));
      this.ejP.LC().a(i, j, s, paramaTa.fa(), paramaTa.fb(), paramaTa.fc(), (dle)paramaTa);
      ((dle)paramaTa).g(null);
    }
    return true;
  }

  private boolean a(aVc paramaVc, boolean paramBoolean, cYl paramcYl, aTa paramaTa, UG paramUG) {
    int i = paramaTa.fa();
    int j = paramaTa.fb();
    short s1 = paramaTa.fc();

    if (this.eWL == null) {
      return false;
    }
    bbH localbbH = ((dpI)this.eWL).aui();
    if (localbbH == null) {
      return false;
    }
    Iterable localIterable = localbbH.b(this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), this.evo.fa(), this.evo.fb(), this.evo.fc(), this.evo.E());
    if (localIterable == null) {
      return false;
    }
    Iterator localIterator = localIterable.iterator();

    cYk localcYk = null;
    while (localIterator.hasNext()) {
      int[] arrayOfInt = (int[])localIterator.next();

      if (paramUG.p(arrayOfInt[0], arrayOfInt[1]))
      {
        short s2 = paramUG.aw(arrayOfInt[0], arrayOfInt[1]);
        if (s2 != -32768)
        {
          if (!paramUG.s(arrayOfInt[0], arrayOfInt[1], s2)) {
            localcYk = new cYk(arrayOfInt[0], arrayOfInt[1], s2);
            break;
          }
        }
      }
    }
    if (localcYk == null) {
      return false;
    }
    if (!paramcYl.l(localcYk)) {
      return false;
    }
    this.dKD = localcYk;

    b(paramaVc, paramBoolean);

    if (((paramaTa instanceof dle)) && (this.ejP.LC() != null)) {
      this.ejP.LC().a(i, j, s1, paramaTa.fa(), paramaTa.fb(), paramaTa.fc(), (dle)paramaTa);
    }
    return true;
  }

  public void a(aVc paramaVc)
  {
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public cCH lJ()
  {
    return this.aAR;
  }

  public cYk qR()
  {
    return this.dKD;
  }

  public void bc()
  {
    this.dKD = null;
  }
}