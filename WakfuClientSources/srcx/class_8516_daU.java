import java.util.ArrayList;

public abstract class daU
  implements cFh, cnk
{
  protected final ArrayList kSO = new ArrayList();

  protected final ArrayList kSP = new ArrayList();

  public ArrayList ao(float paramFloat1, float paramFloat2)
  {
    this.kSO.clear();
    ArrayList localArrayList = this.kSP;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      ahm localahm = (ahm)localArrayList.get(i);
      if (localahm.w(paramFloat1, paramFloat2)) {
        this.kSO.add(localahm);
      }
    }
    return this.kSO;
  }

  public ahm ap(float paramFloat1, float paramFloat2) {
    ArrayList localArrayList = ao(paramFloat1, paramFloat2);
    Object localObject = null;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      ahm localahm = (ahm)localArrayList.get(i);
      if ((localObject == null) || (localahm.ato() > localObject.ato())) {
        localObject = localahm;
      }
    }
    return localObject;
  }

  public final void af(ArrayList paramArrayList) {
    int i = this.kSP.size();
    for (int j = 0; j < i; j++)
      paramArrayList.add(this.kSP.get(j));
  }

  public final void a(cuA paramcuA, ArrayList paramArrayList)
  {
    int i = 0; for (int j = this.kSP.size(); i < j; i++)
      paramArrayList.add(this.kSP.get(i));
  }

  protected void a(ahm paramahm, int paramInt1, int paramInt2, int paramInt3)
  {
    bdB.b(paramahm);
  }

  public void cMO() {
    int i = 0; for (int j = this.kSP.size(); i < j; i++) {
      ahm localahm = (ahm)this.kSP.get(i);
      localahm.cd(localahm.atz());
      localahm.atq();
      localahm.asZ();
    }
  }

  public void g(dCb paramdCb) {
    ArrayList localArrayList = this.kSP;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      ahm localahm = (ahm)localArrayList.get(i);
      if (localahm != paramdCb)
        localahm.setSelected(false);
    }
  }

  public final ArrayList cMP() {
    return this.kSP;
  }

  public abstract void ape();
}