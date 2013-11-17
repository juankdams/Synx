import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import org.apache.log4j.Logger;

public class cPV
{
  private static final boolean DEBUG = false;
  private static final Logger K = Logger.getLogger(cPV.class);

  private int bQo = -2147483648;
  private bAw kAS;
  private cWS kAT;
  protected bNN kAU;
  protected String SK;
  protected cus kAV;
  private final ckD gPK = new ckD("EnvMap loader");
  protected final aoL kAW = new aoL();

  private static final cPV kAX = new cPV();

  public static cPV cGZ()
  {
    return kAX;
  }

  public final void setPath(String paramString)
  {
    this.SK = paramString;
  }

  public final void a(cus paramcus) {
    this.kAV = paramcus;
  }

  public final cYL b(short paramShort1, short paramShort2, int paramInt)
  {
    long l = a(paramShort1, paramShort2, paramInt);
    this.gPK.hy(l);
    synchronized (this.kAW) {
      return (cYL)this.kAW.get(l);
    }
  }

  public final cYL V(int paramInt1, int paramInt2, int paramInt3)
  {
    short s1 = (short)asc.jT(paramInt1);
    short s2 = (short)asc.jU(paramInt2);
    return b(s1, s2, paramInt3);
  }

  protected static long a(long paramLong1, long paramLong2, int paramInt)
  {
    if ((!bB) && ((paramLong1 <= -32768L) || (paramLong1 >= 32767L))) throw new AssertionError("faut pas déconner non plus un short ça suffit pour la taille du monde");
    if ((!bB) && ((paramLong2 <= -32768L) || (paramLong2 >= 32767L))) throw new AssertionError("faut pas déconner non plus un short ça suffit pour la taille du monde");
    paramLong1 += 32767L;
    paramLong2 += 32767L;
    return paramLong1 << 48 | paramLong2 << 32 | paramInt;
  }

  private static String a(String paramString, int paramInt, short paramShort1, short paramShort2) {
    if ((!bB) && ((paramString == null) || (!paramString.contains("%d")) || (!paramString.endsWith("/")))) throw new AssertionError();
    return String.format(paramString, new Object[] { Integer.valueOf(paramInt) }) + paramShort1 + '_' + paramShort2;
  }

  public final void c(short paramShort1, short paramShort2, int paramInt)
  {
    if ((!bB) && (this.kAV == null)) throw new AssertionError("Il faut d'abord appeler setMapFactory");
    long l = a(paramShort1, paramShort2, paramInt);
    boolean bool;
    synchronized (this.kAW) {
      bool = this.kAW.N(l);
    }
    if (bool)
    {
      ja(l);
      return;
    }

    ??? = a(this.SK, paramInt, paramShort1, paramShort2);
    aYQ localaYQ = aYQ.V(dtb.readFile((String)???));

    int i = localaYQ.readByte();
    cYL localcYL = this.kAV.bgY();
    if (i != localcYL.cob()) {
      K.warn("version de map d'enviornenemt client incorrect");
    }
    a(localcYL, localaYQ);
    synchronized (this.kAW) {
      this.kAW.put(l, localcYL);
    }
  }

  public void c(bAw parambAw)
  {
    this.kAS = parambAw;
  }

  public void a(cWS paramcWS) {
    this.kAT = paramcWS;
  }

  public void sH(int paramInt)
  {
    this.bQo = paramInt;
  }

  private void ja(long paramLong)
  {
    cYL localcYL;
    synchronized (this.kAW) {
      localcYL = (cYL)this.kAW.get(paramLong);
    }
    if ((localcYL != null) && (!localcYL.cdg))
      e(localcYL);
  }

  protected void a(cYL paramcYL, aYQ paramaYQ)
  {
    paramcYL.d(paramaYQ);
    e(paramcYL);
  }

  private void e(cYL paramcYL) {
    if (paramcYL.cdg) {
      K.error("chargement d'une map déjà chargée  " + g(paramcYL));
      return;
    }

    cCc[] arrayOfcCc = paramcYL.aDf();
    Object localObject;
    if ((arrayOfcCc != null) && (this.kAT != null)) {
      for (int i = 0; i < arrayOfcCc.length; i++) {
        cCc localcCc = arrayOfcCc[i];
        localObject = cof.cop().dD(localcCc.aEG, localcCc.cWk);
        if (localObject == null) {
          K.warn("Erreur de création du systeme de particule " + localcCc);
        }
        else {
          float f1 = paramcYL.pH(localcCc.boO) + localcCc.ium / 100.0F;
          float f2 = paramcYL.pI(localcCc.boP) + localcCc.iun / 100.0F;
          float f3 = localcCc.aOl + localcCc.iuo / 10.0F;
          ((CellParticleSystem)localObject).f(f1, f2, f3);
          ((CellParticleSystem)localObject).S(localcCc.bML);
          if ((!bB) && (localcCc.iul != null)) throw new AssertionError();
          localcCc.iul = ((CellParticleSystem)localObject);
          this.kAT.a((CellParticleSystem)localObject);
        }
      }
    }
    cyB[] arrayOfcyB = paramcYL.aDg();
    if ((arrayOfcyB != null) && (this.kAS != null)) {
      for (int j = 0; j < arrayOfcyB.length; j++) {
        localObject = arrayOfcyB[j];
        cgc localcgc = cui.csF().wP(((cyB)localObject).hj);
        int k = paramcYL.pH(((cyB)localObject).boO);
        int m = paramcYL.pI(((cyB)localObject).boP);
        if ((!bB) && (((cyB)localObject).imX != null)) throw new AssertionError();
        ((cyB)localObject).imX = this.kAS.a(localcgc, k, m, ((cyB)localObject).aOl);
      }
    }

    paramcYL.cdg = true;

    if (this.kAU != null)
      this.kAU.b(paramcYL);
  }

  public void L(short paramShort1, short paramShort2)
  {
    long l = a(paramShort1, paramShort2, this.bQo);
    this.gPK.a(l, new cap(this, paramShort1, paramShort2));
  }

  public void J(short paramShort1, short paramShort2)
  {
    if ((!bB) && (this.bQo == -2147483648)) throw new AssertionError("il faut d'abord appler setWorldId");
    c(paramShort1, paramShort2, this.bQo);
  }

  public void T(short paramShort1, short paramShort2) {
    long l = a(paramShort1, paramShort2, this.bQo);
    U(paramShort1, paramShort2);
    synchronized (this.kAW) {
      this.kAW.remove(l);
      this.gPK.fD(l);
    }
  }

  protected void f(cYL paramcYL)
  {
    if (!paramcYL.cdg)
    {
      return;
    }

    cCc[] arrayOfcCc = paramcYL.aDf();
    if ((arrayOfcCc != null) && (this.kAT != null)) {
      for (int i = 0; i < arrayOfcCc.length; i++) {
        CellParticleSystem localCellParticleSystem = arrayOfcCc[i].iul;
        if (localCellParticleSystem != null) {
          localCellParticleSystem.kill();
          arrayOfcCc[i].iul = null;
        }
      }
    }

    cyB[] arrayOfcyB = paramcYL.aDg();
    if ((arrayOfcyB != null) && (this.kAS != null)) {
      for (int j = 0; j < arrayOfcyB.length; j++) {
        caQ localcaQ = arrayOfcyB[j].imX;
        if (localcaQ != null) {
          localcaQ.release();
          arrayOfcyB[j].imX = null;
        }
      }
    }
    paramcYL.cdg = false;

    if (this.kAU != null)
      this.kAU.c(paramcYL);
  }

  private void U(short paramShort1, short paramShort2)
  {
    cYL localcYL = V(paramShort1, paramShort2);
    if (localcYL == null) {
      K.warn("Déchargement d'une map non chargée (" + paramShort1 + ' ' + paramShort2 + ')');
      return;
    }
    f(localcYL);
  }

  public final void cHa() {
    synchronized (this.kAW) {
      this.kAW.s(new cao(this));
    }
  }

  public final cYL V(short paramShort1, short paramShort2)
  {
    if ((!bB) && (this.bQo == -2147483648)) throw new AssertionError("il faut d'abord appeler setWorldId");
    return b(paramShort1, paramShort2, this.bQo);
  }

  public final cYL es(int paramInt1, int paramInt2)
  {
    if ((!bB) && (this.bQo == -2147483648)) throw new AssertionError("il faut d'abord appeler setWorldId");
    return V(paramInt1, paramInt2, this.bQo);
  }

  public void reset() {
    synchronized (this.kAW) {
      this.kAW.s(new cat(this));

      this.kAW.clear();
    }
    this.bQo = -2147483648;
  }

  private String g(cYL paramcYL)
  {
    return "(" + paramcYL.nx() + ' ' + paramcYL.ny() + " @" + this.bQo + ')';
  }

  public void a(bNN parambNN) {
    this.kAU = parambNN;
  }

  public void a(short paramShort1, short paramShort2, cYL paramcYL) {
    long l = a(paramShort1, paramShort2, this.bQo);
    synchronized (this.kAW) {
      this.kAW.put(l, paramcYL);
      e(paramcYL);
    }
  }
}