import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aDC
{
  private final dSC dYw = new dSC();
  private final aoL dYx = new aoL();
  private static final Logger K = Logger.getLogger(aDC.class);

  private bor M(dhJ paramdhJ)
  {
    bor localbor = (bor)this.dYw.get(paramdhJ);
    return localbor == null ? new brm(paramdhJ) : localbor;
  }

  public void a(dhJ paramdhJ1, byte paramByte, boolean paramBoolean, dhJ paramdhJ2)
  {
    if (paramdhJ1 == null) {
      K.error("[FIGHT] fighter cannot be null - " + bBd.bJO());
      return;
    }

    if (!a(paramdhJ2, "controller")) {
      return;
    }
    if (U(paramdhJ1)) {
      K.error(String.format("[FIGHT] On ajoute le fighter %d déjà présent -> réinitialisation de son état.", new Object[] { Long.valueOf(paramdhJ1.getId()) }));
    }

    this.dYw.put(paramdhJ1, a(paramByte, paramBoolean, paramdhJ2));
    this.dYx.put(paramdhJ1.getId(), paramdhJ1);
  }

  private bor a(byte paramByte, boolean paramBoolean, dhJ paramdhJ)
  {
    return new bor(paramByte, !bB(paramByte), paramBoolean, paramdhJ.getId());
  }

  public boolean N(dhJ paramdhJ)
  {
    return M(paramdhJ).a(atC.dFb);
  }

  public boolean O(dhJ paramdhJ) {
    return M(paramdhJ).a(atC.dFc);
  }

  public boolean P(dhJ paramdhJ) {
    return M(paramdhJ).a(atC.dFd);
  }

  public void Q(dhJ paramdhJ) {
    if (!U(paramdhJ)) {
      K.error(String.format("[FIGHT] removeFighter sur un fighter absent %d - %s", new Object[] { Long.valueOf(paramdhJ.getId()), bBd.rV(10) }));

      return;
    }

    bor localbor = (bor)this.dYw.remove(paramdhJ);
    this.dYx.remove(paramdhJ.getId());

    if (localbor.byg()) {
      Collection localCollection = b(new cGB[] { cGB.ej(localbor.Fx()) });
      if (!localCollection.isEmpty())
        M((dhJ)localCollection.iterator().next()).eY(true);
    }
  }

  public boolean R(dhJ paramdhJ)
  {
    return M(paramdhJ).byc();
  }

  public boolean S(dhJ paramdhJ) {
    return M(paramdhJ).aJu();
  }

  public boolean T(dhJ paramdhJ) {
    return M(paramdhJ).byd();
  }

  public dhJ dP(long paramLong) {
    return (dhJ)this.dYx.get(paramLong);
  }

  public boolean U(dhJ paramdhJ) {
    return this.dYw.contains(paramdhJ);
  }

  public boolean V(dhJ paramdhJ)
  {
    return M(paramdhJ).byf();
  }

  public void c(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    if (!a(paramdhJ2, "controller"))
      return;
    if (!a(paramdhJ1, "controlled")) {
      return;
    }
    bor localbor = M(paramdhJ1);
    long l = paramdhJ2.getId();

    localbor.a(Long.valueOf(l), paramdhJ2.Fx());
  }

  public void W(dhJ paramdhJ)
  {
    if (!a(paramdhJ, "controller")) {
      return;
    }
    this.dYw.af(new cEb(this, paramdhJ));
  }

  public void X(dhJ paramdhJ)
  {
    if (!a(paramdhJ, "controlled")) {
      return;
    }

    M(paramdhJ).a(null, (byte)-1);
  }

  public void Y(dhJ paramdhJ)
  {
    if (!a(paramdhJ, "controlled")) {
      return;
    }
    bor localbor = M(paramdhJ);
    localbor.a(Long.valueOf(localbor.aJq()), localbor.bye());
  }

  public Collection Z(dhJ paramdhJ)
  {
    if (!a(paramdhJ, "controller")) {
      return Collections.emptySet();
    }
    return b(new cGB[] { cGB.aS(paramdhJ) });
  }

  public Collection aa(dhJ paramdhJ) {
    if (!a(paramdhJ, "controller")) {
      return Collections.emptySet();
    }
    return b(new cGB[] { cGB.aT(paramdhJ) });
  }

  public dhJ ab(dhJ paramdhJ) {
    if (!a(paramdhJ, "controlled")) {
      return null;
    }
    return a(M(paramdhJ).byh());
  }

  public dhJ ac(dhJ paramdhJ) {
    if (!a(paramdhJ, "controlled")) {
      return null;
    }
    return dP(M(paramdhJ).aJq());
  }

  private dhJ a(Long paramLong) {
    return paramLong == null ? null : dP(paramLong.longValue());
  }

  private boolean a(dhJ paramdhJ, String paramString) {
    if (paramdhJ == null) {
      K.error(String.format("[FIGHT_CONTROLLERS] %s cannot be null - %s", new Object[] { paramString, bBd.cH(1, 10) }));

      return false;
    }

    return true;
  }

  public Collection bA(byte paramByte) {
    return b(new cGB[] { cGB.ej(paramByte), cGB.cBF() });
  }

  private boolean bB(byte paramByte)
  {
    return !b(new cGB[] { cGB.ej(paramByte), cGB.cBE() }).isEmpty();
  }

  public byte ad(dhJ paramdhJ) {
    return M(paramdhJ).Fx();
  }

  public void a(dhJ paramdhJ, byte paramByte) {
    M(paramdhJ).as(paramByte);
  }

  public boolean ae(dhJ paramdhJ) {
    return M(paramdhJ).byg();
  }

  public dhJ a(cGB[] paramArrayOfcGB)
  {
    Collection localCollection = b(paramArrayOfcGB);
    if (localCollection.isEmpty())
      return null;
    if (localCollection.size() > 1) {
      StringBuilder localStringBuilder = new StringBuilder("On a plusieurs fighters différents alors qu'on en attendait un seul ");
      for (cGB localcGB : paramArrayOfcGB) {
        localStringBuilder.append(localcGB).append(", ");
      }
      if (paramArrayOfcGB.length > 0)
        localStringBuilder.setLength(localStringBuilder.length() - 2);
      K.error(localStringBuilder.toString());
    }
    return (dhJ)localCollection.iterator().next();
  }

  public Collection b(cGB[] paramArrayOfcGB)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.dYw.size(); i++) {
      dhJ localdhJ = (dhJ)this.dYw.DT(i);
      if (a(localdhJ, paramArrayOfcGB))
        localArrayList.add(localdhJ);
    }
    return localArrayList;
  }

  private boolean a(dhJ paramdhJ, cGB[] paramArrayOfcGB)
  {
    for (cGB localcGB : paramArrayOfcGB) {
      if (!localcGB.a(paramdhJ, M(paramdhJ))) {
        return false;
      }
    }
    return true;
  }
}