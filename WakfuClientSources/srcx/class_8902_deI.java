import java.util.ArrayList;
import java.util.List;

public final class deI
{
  private azp cza;
  private final List kYB;
  private final List kYC;
  public static final deI kYD = new deI();

  private deI() {
    this.kYB = new ArrayList();
    this.kYB.add(eu.ayM);
    this.kYB.add(eu.aAj);
    this.kYB.add(eu.azg);
    this.kYB.add(eu.azd);
    this.kYB.add(eu.azf);
    this.kYB.add(eu.aze);
    this.kYB.add(eu.azc);

    this.kYB.add(eu.azn);
    this.kYB.add(eu.azk);
    this.kYB.add(eu.azm);
    this.kYB.add(eu.azl);
    this.kYB.add(eu.azj);

    this.kYC = new ArrayList();
    this.kYC.add(eu.ayR);
    this.kYC.add(eu.ayQ);
    this.kYC.add(eu.azq);
  }

  public void a(azp paramazp, float paramFloat1, float paramFloat2) {
    this.cza = paramazp;
    int i = 0;
    eu localeu;
    for (int j = this.kYB.size(); i < j; i++) {
      localeu = (eu)this.kYB.get(i);
      a(localeu, paramFloat1);
    }

    i = 0; for (j = this.kYC.size(); i < j; i++) {
      localeu = (eu)this.kYC.get(i);
      a(localeu, paramFloat2);
    }

    this.cza = null;
  }

  private void a(eu parameu, float paramFloat) {
    cqm localcqm = this.cza.a(parameu);

    int i = localcqm.value();
    localcqm.set(Math.round(i - Math.abs(i * (1.0F - paramFloat))));
    localcqm.setMax(Math.round(localcqm.max() * paramFloat));
  }

  public int a(eu parameu, short paramShort, cgT paramcgT, float paramFloat1, float paramFloat2)
  {
    float f;
    if (this.kYB.contains(parameu))
      f = paramFloat1;
    else if (this.kYC.contains(parameu))
      f = paramFloat2;
    else {
      f = 1.0F;
    }

    int i = paramcgT.c(parameu, paramShort);
    return Math.round(i - Math.abs(i * (1.0F - f)));
  }
}