import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public class Ok
  implements eB
{
  private static final Logger K = Logger.getLogger(Ok.class);
  private static final int cfg = -1;
  private int cfh;
  private final dUy cfi = new dUy();
  private zz cfj = new iy();

  private cSR cfk = new cSR();

  private final aoL cfl = new aoL();
  private final bKR cfm = new bKR();
  private final aoL cfn = new aoL();

  public void a(List paramList)
  {
    int i = 0; for (int j = paramList.size(); i < j; i++) {
      dpI localdpI = (dpI)paramList.get(i);
      this.cfj.a(localdpI);
    }
    this.cfj.a(new dAq(this));
  }

  public int lQ()
  {
    return this.cfh;
  }

  public void aD(int paramInt) {
    this.cfh = paramInt;
  }

  public int r(long paramLong) {
    return this.cfi.kZ(paramLong);
  }

  public void a(long paramLong, int paramInt) {
    if (paramInt == -1)
      return;
    int i = bCO.J(paramInt, this.cfh / 9, this.cfh / 3);
    int j = this.cfi.kZ(paramLong);
    f(paramLong, j + i);
  }

  public void f(long paramLong, int paramInt) {
    int i = Math.max(0, paramInt);
    int j = bN(paramLong);
    if (!this.cfi.containsKey(paramLong))
      this.cfm.add(paramLong);
    this.cfi.G(paramLong, i);
    int k = bN(paramLong);
    if (k > j)
      this.cfm.bB(paramLong);
  }

  public int bN(long paramLong)
  {
    int i = Math.max(1, lQ());
    return r(paramLong) / i - 1;
  }

  public boolean b(long paramLong, int paramInt) {
    return a(paramLong, aE(paramInt));
  }

  private boolean a(long paramLong, dpI paramdpI) {
    List localList = bO(paramLong);
    if (localList == null)
      return false;
    if (!localList.contains(paramdpI))
      return false;
    dpI localdpI = (dpI)this.cfl.get(paramLong);
    if (localdpI != null) {
      localList.add(localdpI);
    }
    this.cfl.put(paramLong, paramdpI);
    localList.remove(paramdpI);

    return true;
  }

  public dpI aE(int paramInt) {
    return this.cfj.aE(paramInt);
  }

  public int a(dpI paramdpI, boolean paramBoolean) {
    return this.cfj.a(paramdpI, paramBoolean);
  }

  protected List bO(long paramLong)
  {
    int i = bN(paramLong);
    Object localObject = (List)this.cfk.get(i);

    if (localObject == null)
    {
      localObject = new ArrayList();
      ((List)localObject).addAll(this.cfj.qo());
      this.cfk.put(i, localObject);
    }
    return localObject;
  }

  public List t(long paramLong) {
    return Collections.unmodifiableList(bO(paramLong));
  }

  public void a(dhJ paramdhJ, cOE paramcOE) {
    if ((paramdhJ == null) || (paramcOE == null))
      return;
    dpI localdpI = (dpI)this.cfl.get(paramdhJ.getId());
    if (localdpI != null) {
      localdpI.a(cMB.b(localdpI.yR(), localdpI), paramdhJ, paramcOE, bsj.bAv(), paramdhJ.fa(), paramdhJ.fb(), paramdhJ.fc(), paramdhJ, null);
    }
    this.cfl.remove(paramdhJ.getId());
    y(paramdhJ.getId());
  }

  public void z(long paramLong) {
    this.cfl.remove(paramLong);
  }

  public void y(long paramLong) {
    Cs localCs = (Cs)this.cfn.get(paramLong);
    if (localCs == null)
      return;
    localCs.w(Integer.valueOf(0));
    localCs.x(Integer.valueOf(0));
  }

  public List lR() {
    return this.cfj.qo();
  }

  public dpI u(long paramLong) {
    return (dpI)this.cfl.get(paramLong);
  }

  public boolean v(long paramLong) {
    return this.cfl.containsKey(paramLong);
  }

  public int c(long paramLong, int paramInt) {
    Cs localCs = (Cs)this.cfn.get(paramLong);
    if (localCs == null) {
      localCs = new Cs(Integer.valueOf(0), Integer.valueOf(0));
      this.cfn.put(paramLong, localCs);
    }
    localCs.w(Integer.valueOf(((Integer)localCs.getFirst()).intValue() + paramInt));
    localCs.x(Integer.valueOf(((Integer)localCs.Lp()).intValue() + 1));
    return paramInt;
  }

  public int w(long paramLong) {
    Cs localCs = (Cs)this.cfn.get(paramLong);
    if (localCs == null)
      return -1;
    if (((Integer)localCs.Lp()).intValue() == 0)
      return 0;
    return ((Integer)localCs.getFirst()).intValue() / ((Integer)localCs.Lp()).intValue();
  }

  public boolean s(long paramLong) {
    if (!this.cfi.containsKey(paramLong))
      return false;
    if (this.cfm.N(paramLong))
      return false;
    return true;
  }

  public void x(long paramLong) {
    this.cfm.add(paramLong);
  }
}