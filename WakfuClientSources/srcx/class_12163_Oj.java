import java.util.Date;

public class Oj
{
  public static final Oj cfd = new Oj();

  private final cSR cfe = new cSR();

  private final KR cff = new KR();

  public void a(aiX paramaiX)
  {
    this.cfe.put(paramaiX.getId(), paramaiX);
  }

  public void a(Date paramDate, int paramInt) {
    this.cff.a(dEQ.j(paramDate), paramInt);
  }

  public aiX l(dxL paramdxL) {
    int i = this.cff.L(dEQ.ac(paramdxL));
    aiX localaiX = (aiX)this.cfe.get(i);
    return localaiX != null ? localaiX : aiX.dhv;
  }

  public aiX gf(int paramInt) {
    aiX localaiX = (aiX)this.cfe.get(paramInt);
    if (localaiX != null) {
      return localaiX;
    }
    return aiX.dhv;
  }
}