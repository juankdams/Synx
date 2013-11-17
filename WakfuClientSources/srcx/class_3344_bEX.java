import java.util.ArrayList;

public class bEX
  implements Dc
{
  public static final bEX gzY = new bEX();

  private final cSR gzZ = new cSR();

  public void a(bpM parambpM, dQl paramdQl)
  {
    ArrayList localArrayList = (ArrayList)this.gzZ.get(parambpM.ordinal());
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.gzZ.put(parambpM.ordinal(), localArrayList);
    }
    localArrayList.add(paramdQl);
  }

  private void a(bpM parambpM) {
    ArrayList localArrayList = (ArrayList)this.gzZ.get(parambpM.ordinal());
    if (localArrayList != null)
      for (int i = 0; i < localArrayList.size(); i++)
        ((dQl)localArrayList.get(i)).apY();
  }

  private void a(bpM parambpM, dhJ paramdhJ) {
    ArrayList localArrayList = (ArrayList)this.gzZ.get(parambpM.ordinal());
    if (localArrayList != null)
      for (int i = 0; i < localArrayList.size(); i++)
        ((dQl)localArrayList.get(i)).u(paramdhJ);
  }

  private void a(bpM parambpM, dhJ paramdhJ, long paramLong) {
    ArrayList localArrayList = (ArrayList)this.gzZ.get(parambpM.ordinal());
    if (localArrayList != null)
      for (int i = 0; i < localArrayList.size(); i++)
        ((dQl)localArrayList.get(i)).a(paramdhJ, paramLong);
  }

  public void Mg() {
    a(bpM.fKf);
  }

  public void Mh() {
    a(bpM.fKg);
  }

  public void Mi() {
    a(bpM.fKh);
  }

  public void Mj() {
    a(bpM.fKi);

    this.gzZ.clear();
  }

  public void Mk() {
    a(bpM.fKj);
  }

  public void Ml() {
    a(bpM.fKk);
  }

  public void e(dhJ paramdhJ) {
    a(bpM.fKl, paramdhJ);
  }

  public void f(dhJ paramdhJ) {
    a(bpM.fKm, paramdhJ);
  }

  public void g(dhJ paramdhJ) {
    a(bpM.fKn, paramdhJ);
  }

  public void h(dhJ paramdhJ) {
    a(bpM.fKo, paramdhJ);
  }

  public void i(dhJ paramdhJ) {
    a(bpM.fKp, paramdhJ);
  }

  public void j(dhJ paramdhJ) {
    a(bpM.fKq, paramdhJ);
  }

  public void a(dhJ paramdhJ, bzj parambzj) {
    a(bpM.fKr, paramdhJ, parambzj.bHU());
  }

  public void a(aAn paramaAn)
  {
  }

  public void k(dhJ paramdhJ)
  {
  }
}