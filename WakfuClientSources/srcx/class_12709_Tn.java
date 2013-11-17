import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Tn
{
  private static final Logger K = Logger.getLogger(Tn.class);
  public static final boolean aRN = false;
  private long aTz;
  private int cwf;
  private int cwg;
  private ArrayList cwh;

  public Tn(long paramLong)
  {
    this.aTz = paramLong;
    this.cwf = 0;
    this.cwg = 0;
    this.cwh = new ArrayList();
  }

  public void b(byo parambyo) {
    dzM localdzM = bY(parambyo.getId());
    localdzM.aQ(parambyo.nU());
    localdzM.ez(parambyo.Rw());
  }

  public void a(byo parambyo, List paramList)
  {
    Object localObject;
    if (this.cwh.isEmpty()) {
      this.cwf = paramList.size();

      for (i = 0; i < paramList.size(); i++) {
        localObject = (Mh)paramList.get(i);
        dzM localdzM = new dzM(0L, ((Mh)localObject).bWC, ((Mh)localObject).bUp);
        this.cwh.add(localdzM);
      }

    }

    if ((this.cwf < paramList.size()) && (bY(parambyo.getId()) == null)) {
      this.cwh.add(new dzM(parambyo.getId(), parambyo.Rw(), parambyo.nU()));
      this.cwf += 1;
      this.cwg += 1;
      return;
    }

    if (bY(parambyo.getId()) != null) {
      return;
    }

    for (int i = 0; i < this.cwh.size(); i++) {
      localObject = (dzM)this.cwh.get(i);
      if ((((dzM)localObject).getId() == 0L) && (((dzM)localObject).bQz() == parambyo.Rw()) && (((dzM)localObject).nU() == parambyo.nU()))
      {
        ((dzM)localObject).a(parambyo.getId());
        this.cwg += 1;
        return;
      }

    }

    this.cwh.add(new dzM(parambyo.getId(), parambyo.Rw(), parambyo.nU()));
    this.cwf += 1;
    this.cwg += 1;
  }

  public void c(byo parambyo) {
    dzM localdzM = bY(parambyo.getId());
    if (this.cwh.remove(localdzM)) {
      this.cwg -= 1;
      this.cwf -= 1;
    } else {
      K.warn("On essaye de remove plusieurs fois le monstre " + parambyo.getId() + " du NPCGroupInformation.");
    }

    if (this.cwg <= 0)
      cWz.cKu().a(this);
  }

  public void d(byo parambyo)
  {
    dzM localdzM = bY(parambyo.getId());
    if (localdzM == null) {
      return;
    }

    localdzM.a(0L);
    this.cwg -= 1;

    if (this.cwg <= 0)
      cWz.cKu().a(this);
  }

  public boolean agr()
  {
    int i = 0; for (int j = this.cwh.size(); i < j; i++) {
      Su localSu = CA.Lv().bj(((dzM)this.cwh.get(i)).getId());
      if (localSu != null)
      {
        aZx localaZx = localSu.cRc();
        if ((localaZx != null) && (localaZx.c(dKm.lWU)))
          return true;
      }
    }
    return false;
  }

  public List ags() {
    return this.cwh;
  }

  protected dzM bY(long paramLong) {
    for (dzM localdzM : this.cwh) {
      if (localdzM.getId() == paramLong) {
        return localdzM;
      }
    }
    return null;
  }

  public boolean agt() {
    return this.cwf != this.cwh.size();
  }

  public double agu()
  {
    QC localQC = new QC(new short[0]);

    int i = 0; for (int j = this.cwh.size(); i < j; i++) {
      dzM localdzM = (dzM)this.cwh.get(i);
      localQC.c(localdzM.nU());
    }

    return localQC.bvE();
  }

  public int agv() {
    int i = 0;
    int j = 0; for (int k = this.cwh.size(); j < k; j++) {
      dzM localdzM = (dzM)this.cwh.get(j);
      i += localdzM.nU();
    }
    return i;
  }

  public long getId()
  {
    return this.aTz;
  }

  public boolean e(byo parambyo) {
    for (int i = 0; i < this.cwh.size(); i++) {
      dzM localdzM = (dzM)this.cwh.get(i);
      if (localdzM.getId() == parambyo.getId()) {
        return true;
      }
    }
    return false;
  }

  public void f(byo parambyo) {
    if (e(parambyo)) {
      return;
    }
    for (int i = 0; i < this.cwh.size(); i++) {
      dzM localdzM = (dzM)this.cwh.get(i);
      if ((localdzM.bQz() == parambyo.uO()) && (localdzM.nU() == parambyo.nU())) {
        localdzM.a(parambyo.getId());
        return;
      }
    }
  }

  public static dzM g(byo parambyo) {
    return new dzM(parambyo.adv(), parambyo.uO(), parambyo.nU());
  }
}