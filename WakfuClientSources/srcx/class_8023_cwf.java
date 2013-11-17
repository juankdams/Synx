import java.util.ArrayList;
import java.util.Collections;

public class cwf
{
  private static cwf ihy = new cwf();

  private final ArrayList aBf = new ArrayList();
  private final ArrayList ihz = new ArrayList();
  private final ArrayList ihA = new ArrayList();

  private final ArrayList ihB = new ArrayList();

  private boolean dse = false;

  private boolean coU = false;

  private final ArrayList ihC = new ArrayList();
  private final ArrayList ihD = new ArrayList();

  private boolean ihE = false;

  private int ihF = 0;

  public static cwf ctJ()
  {
    return ihy;
  }

  public void a(cfK paramcfK)
  {
    if (!this.coU) {
      this.aBf.add(paramcfK);
    } else {
      this.ihz.add(paramcfK);
      this.ihE = true;
    }
  }

  public void b(cfK paramcfK) {
    if (!this.coU) {
      this.aBf.remove(paramcfK);
    } else {
      this.ihA.add(paramcfK);
      this.ihE = true;
    }
  }

  public void j(axU paramaxU)
  {
    if (this.coU) {
      this.ihC.add(paramaxU);
      this.ihE = true;
    } else {
      if (!this.ihB.contains(paramaxU)) {
        this.ihB.add(paramaxU);
      }
      this.dse = true;
    }
  }

  public void k(axU paramaxU)
  {
    if (this.coU) {
      if (this.ihC.contains(paramaxU))
        this.ihC.remove(paramaxU);
      else {
        this.ihD.add(paramaxU);
      }
      this.ihE = true;
    } else {
      this.ihB.remove(paramaxU);
    }
  }

  public void sort()
  {
    Collections.sort(this.ihB, dx.hr());
    this.dse = false;
  }

  public void aAp()
  {
    this.dse = true;
  }

  public boolean ctK()
  {
    return this.dse;
  }

  public void ctL() {
    lock();
    int i = this.ihF;
    this.ihF = 0;
    int j = 0; for (int k = this.ihB.size(); j < k; j++) {
      if (((axU)this.ihB.get(j)).aJE()) {
        this.ihF += 1;
      }
    }
    if ((this.ihF == 0) && (i > 0)) {
      j = 0; for (k = this.aBf.size(); j < k; j++) {
        ((cfK)this.aBf.get(j)).bnt();
      }
    }
    unlock();
  }

  public void lock()
  {
    this.coU = true;
  }

  public void unlock()
  {
    this.coU = false;
    if (!this.ihE) {
      return;
    }

    int i = this.ihC.size();
    int j;
    if (i > 0) {
      for (j = 0; j < i; j++) {
        j((axU)this.ihC.get(j));
      }
      this.ihC.clear();
    }
    i = this.ihD.size();
    if (i > 0) {
      for (j = 0; j < i; j++) {
        k((axU)this.ihD.get(j));
      }
      this.ihD.clear();
    }
    i = this.ihz.size();
    if (i > 0) {
      for (j = 0; j < i; j++) {
        a((cfK)this.ihz.get(j));
      }
      this.ihz.clear();
    }
    i = this.ihA.size();
    if (i > 0) {
      for (j = 0; j < i; j++) {
        b((cfK)this.ihA.get(j));
      }
      this.ihA.clear();
    }
    this.ihE = false;
  }
}