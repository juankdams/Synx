import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class aGS extends doA
{
  private static final BitSet eek = new BitSet();

  protected byte eel = 0;
  protected byte eem = 0;
  protected int een = 0;
  protected int eeo = 0;
  protected int eep = 20;

  protected boolean eeq = false;
  protected HashSet eer;

  public abstract aGS aST();

  public aGS aSU()
  {
    aGS localaGS = aST();
    localaGS.eer = this.eer;
    localaGS.eel = this.eel;
    localaGS.eem = this.eem;
    localaGS.een = this.een;
    localaGS.eeo = this.eeo;
    localaGS.eep = this.eep;
    return localaGS;
  }

  public BitSet DV()
  {
    return eek;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (bkt()) {
      this.eer.add(Long.valueOf(this.evp.getId()));
    }
    jJ(true);
  }

  public void a(aVc paramaVc)
  {
    this.cxl -= (int)(this.eel * this.eeo * this.cxl / 100.0F);
    if (this.evp != null)
      this.eer.add(Long.valueOf(this.evp.getId()));
  }

  public boolean Cu()
  {
    if (((this.evp instanceof cjK)) && 
      (!((cjK)this.evp).aeH())) {
      return false;
    }

    return super.Cu();
  }

  public void aK()
  {
    this.eel = ((byte)(this.eel + 1));
    if (this.eel > this.eem) {
      return;
    }
    int i = this.een - (int)(this.eel * this.eeo * this.een / 100.0F);
    if (i <= 0) {
      return;
    }
    if ((this.ejP == null) || (this.ejP.LD() == null)) {
      return;
    }
    if ((!this.evp.b(eu.ayM)) && (!this.evp.b(eu.aAg))) {
      return;
    }
    if (((this.evp instanceof cjK)) && 
      (!((cjK)this.evp).aeH())) {
      return;
    }

    ArrayList localArrayList = new ArrayList();
    Iterator localIterator;
    if (!(this.evp instanceof bQv)) {
      for (localIterator = aSV(); localIterator.hasNext(); ) {
        dle localdle = (dle)localIterator.next();
        if ((localdle.b(eu.ayM)) || (localdle.b(eu.aAg)))
        {
          a(localArrayList, localdle);
        }
      }
    }
    if (!localArrayList.isEmpty())
      r(localArrayList);
    super.aK();
  }

  private Iterator aSV() {
    return this.ejP.LE().Lz();
  }

  private void a(ArrayList paramArrayList, dle paramdle) {
    int i = this.eep;

    if (this.eer.contains(Long.valueOf(paramdle.getId()))) {
      return;
    }

    int j = cqJ.c(paramdle, this.evp);

    int k = j > i ? 1 : 0;
    if (k != 0) {
      return;
    }
    if (((paramdle instanceof cjK)) && 
      (!((cjK)paramdle).aeH())) {
      return;
    }

    if (!(paramdle instanceof aho))
    {
      if ((!(this.evo instanceof dMT)) || (!(paramdle instanceof dMT)))
        return;
      if (!a((dMT)this.evo, (dMT)paramdle)) {
        return;
      }
    }
    boolean bool = b(paramdle, this.evp);
    if (!bool) {
      return;
    }
    a(paramArrayList, paramdle, j);
  }

  protected abstract boolean a(dMT paramdMT1, dMT paramdMT2);

  private boolean b(dle paramdle1, dle paramdle2)
  {
    UG localUG = this.ejP.LB();
    if (localUG == null) {
      K.warn("pas de fightmap sur le context " + this.ejP);
      return false;
    }
    bcy localbcy = bcy.bqD();
    localbcy.F(paramdle2.fa(), paramdle2.fb(), paramdle2.fc());
    localbcy.G(paramdle1.fa(), paramdle1.fb(), paramdle1.fc());
    localbcy.a(localUG);
    if ((paramdle2 instanceof cdO)) {
      localUG.e((cdO)paramdle2);
    }
    boolean bool;
    try
    {
      if (localbcy.bqG()) {
        localUG.ahO();
        localbcy.release();
        return true;
      }

      if (paramdle1.bY() <= 0) {
        localUG.ahO();
        localbcy.release();
        return false;
      }

      localbcy.F(paramdle2.fa(), paramdle2.fb(), (short)(paramdle1.fc() + paramdle1.bY()));

      localbcy.G(paramdle1.fa(), paramdle1.fb(), (short)(paramdle2.fc() + paramdle2.bY()));

      bool = localbcy.bqG();
      localbcy.release();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
      localUG.ahO();
      return false;
    }
    return bool;
  }

  void a(List paramList, dle paramdle, int paramInt) {
    if (paramList == null)
      return;
    if (paramList.isEmpty()) {
      paramList.add(new Cs(Integer.valueOf(paramInt), paramdle));
    } else {
      int i = 0;
      int j = 0;
      for (Cs localCs : paramList) {
        if (((Integer)localCs.getFirst()).intValue() > paramInt) {
          paramList.add(j, new Cs(Integer.valueOf(paramInt), paramdle));
          i = 1;
          break;
        }
        if ((((Integer)localCs.getFirst()).intValue() == paramInt) && 
          (((dle)localCs.Lp()).b(eu.ayM)) && (paramdle.b(eu.ayM)) && (((dle)localCs.Lp()).e(eu.ayM) > paramdle.e(eu.ayM)))
        {
          paramList.add(j, new Cs(Integer.valueOf(paramInt), paramdle));
          i = 1;
          break;
        }

        j++;
      }
      if (i == 0)
        paramList.add(paramList.size(), new Cs(Integer.valueOf(paramInt), paramdle));
    }
  }

  private void r(List paramList)
  {
    if (!cVL())
      return;
    if (!this.eeq)
      s(paramList);
    else
      t(paramList);
  }

  void s(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
      return;
    dle localdle = (dle)((Cs)paramList.get(0)).Lp();
    if (this.eer != null)
      this.eer.add(Long.valueOf(localdle.getId()));
    f(localdle);
  }

  void t(List paramList) {
    if (paramList == null)
      return;
    int i = Math.min(this.eem, paramList.size());
    for (int j = 0; j < i; j++) {
      dle localdle = (dle)((Cs)paramList.get(j)).Lp();
      if ((this.eer != null) && (!this.eer.contains(Long.valueOf(localdle.getId())))) {
        this.eer.add(Long.valueOf(localdle.getId()));
        f(localdle);
      }
      i = Math.min(this.eem, paramList.size());
    }
  }

  private void f(dle paramdle) {
    aGS localaGS = (aGS)bko();
    localaGS.k(paramdle);
    localaGS.release();
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void aJ()
  {
    super.aJ();
    this.eel = 0;
    this.eem = 0;
    this.een = 0;
    this.eeo = 0;
    this.eep = 0;
    this.eer = null;
    this.eeq = false;
  }

  public void bc()
  {
    super.bc();
    this.eel = 0;
    this.eem = 0;
    this.een = 0;
    this.eeo = 0;
    this.eep = 0;
    this.eer = null;
    this.eeq = false;
  }
}