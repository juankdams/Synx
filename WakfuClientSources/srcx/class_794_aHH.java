import java.util.ArrayList;

public class aHH
{
  private final ArrayList efO = new ArrayList();
  private final ArrayList efP = new ArrayList();

  public ArrayList aTH() {
    return this.efO;
  }

  public void a(ded paramded) {
    this.efO.add(paramded);
  }

  public void b(ded paramded) {
    this.efO.remove(paramded);
  }

  public ArrayList aTI() {
    return this.efP;
  }

  public void b(czg paramczg) {
    this.efP.add(paramczg);
  }

  public void c(czg paramczg) {
    this.efP.remove(paramczg);
  }

  public void d(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    this.efO.ensureCapacity(i);
    Object localObject;
    for (int j = 0; j < i; j++) {
      localObject = new ded();
      ((ded)localObject).d(paramaYQ);
      this.efO.add(localObject);
    }

    i = paramaYQ.readInt();
    this.efP.ensureCapacity(i);

    for (j = 0; j < i; j++) {
      localObject = new czg();
      ((czg)localObject).d(paramaYQ);
      this.efP.add(localObject);
    }
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.efO.size());

    int i = 0; for (int j = this.efO.size(); i < j; i++) {
      ((ded)this.efO.get(i)).b(paramdSw);
    }

    paramdSw.writeInt(this.efP.size());

    i = 0; for (j = this.efP.size(); i < j; i++)
      ((czg)this.efP.get(i)).b(paramdSw);
  }

  public void l(aYQ paramaYQ)
  {
    int i = paramaYQ.readInt();
    this.efO.ensureCapacity(i);
    Object localObject;
    for (int j = 0; j < i; j++) {
      localObject = new ded();
      ((ded)localObject).l(paramaYQ);
      this.efO.add(localObject);
    }

    i = paramaYQ.readInt();
    this.efP.ensureCapacity(i);

    for (j = 0; j < i; j++) {
      localObject = new czg();
      ((czg)localObject).l(paramaYQ);
      this.efP.add(localObject);
    }
  }

  public void f(dSw paramdSw) {
    paramdSw.writeInt(this.efO.size());

    int i = 0; for (int j = this.efO.size(); i < j; i++) {
      ((ded)this.efO.get(i)).f(paramdSw);
    }

    paramdSw.writeInt(this.efP.size());

    i = 0; for (j = this.efP.size(); i < j; i++)
      ((czg)this.efP.get(i)).f(paramdSw);
  }

  public czg mD(int paramInt)
  {
    for (int i = this.efP.size() - 1; i >= 0; i--) {
      czg localczg = (czg)this.efP.get(i);
      if (localczg.aw == paramInt) {
        return localczg;
      }
    }

    return null;
  }

  public ded mE(int paramInt) {
    for (int i = this.efO.size() - 1; i >= 0; i--) {
      ded localded = (ded)this.efO.get(i);
      if (localded.aw == paramInt) {
        return localded;
      }
    }

    return null;
  }
}