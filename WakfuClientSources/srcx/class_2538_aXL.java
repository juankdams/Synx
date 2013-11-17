import org.apache.log4j.Logger;

public abstract class aXL
{
  private static final Logger K = Logger.getLogger(aXL.class);
  private final long RY;
  private final int fdl;
  private final short fdm;
  private final short fdn;
  private final short fdo = 0;
  private int RZ;
  private final aSl fdp;
  private alY fdq;

  protected aXL(aSl paramaSl, long paramLong, int paramInt1, int paramInt2, short paramShort1, short paramShort2)
  {
    this.fdp = paramaSl;
    this.RY = paramLong;
    this.fdl = paramInt1;
    this.fdm = paramShort1;
    this.fdn = paramShort2;
    ab(paramInt2);
  }

  protected aXL(aSl paramaSl, dDK paramdDK) {
    this(paramaSl, paramdDK.lLY.cxL, paramdDK.lLY.hhV, paramdDK.lLY.hhW, paramdDK.lLY.x, paramdDK.lLY.y);
  }

  protected aXL(aSl paramaSl, cuF paramcuF) {
    this(paramaSl, paramcuF.EN(), paramcuF.adj().nc(), paramcuF.adl(), paramcuF.nx(), paramcuF.ny());
  }

  public boolean isTemporary() {
    return this.RY <= 0L;
  }

  public long gv() {
    return this.RY;
  }

  public int bmU() {
    return this.fdl;
  }

  public int gw() {
    return this.RZ;
  }

  public void ab(int paramInt) {
    this.RZ = paramInt;
    this.fdq = this.fdp.nN(bcY());
    if (this.fdq == null)
      K.error("pas de group d'id " + bcY());
  }

  public int bcY()
  {
    cUh localcUh = adj();
    if (localcUh == null) {
      K.error("pas de définition de batiment " + this.fdl);
      return 0;
    }
    return localcUh.xN(this.RZ);
  }

  public cUh adj() {
    return ars.dzL.aM((short)this.fdl);
  }

  public short bmV() {
    return this.fdm;
  }

  public short bmW() {
    return this.fdn;
  }

  public String toString() {
    return "EditorGroupInstanceInfo{m_buildingUid=" + this.RY + ", m_buildingDefinitionId=" + this.fdl + ", m_itemId=" + this.RZ + ", m_cellX=" + this.fdm + ", m_cellY=" + this.fdn + '}';
  }

  public dQx bmX()
  {
    if (this.fdq == null) {
      return null;
    }
    return new dQx(this.fdm, this.fdm + this.fdq.getWidth(), this.fdn, this.fdn + this.fdq.getHeight());
  }

  public dQx bmY()
  {
    if (this.fdq == null) {
      return null;
    }
    return asc.k(this.fdm, this.fdn, this.fdq.getWidth(), this.fdq.getHeight());
  }

  public int aTy() {
    bOB localbOB = bna();
    if (localbOB == null) {
      K.error("pas d' entrée pour " + this);
      return -1;
    }
    return localbOB.aTy();
  }

  public final int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3) {
    if (this.fdq == null) {
      return 0;
    }
    int i = this.fdm;
    int j = this.fdn;
    int k = 0;
    int m = this.fdq.a(paramInt1 - i, paramInt2 - j, paramArrayOfbep, paramInt3);
    for (int n = 0; n < m; n++) {
      paramArrayOfbep[(paramInt3 + n)].hY += i;
      paramArrayOfbep[(paramInt3 + n)].hZ += j;
      bep tmp95_94 = paramArrayOfbep[(paramInt3 + n)]; tmp95_94.aOl = ((short)(tmp95_94.aOl + 0));
    }
    return m;
  }

  public int a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc, int paramInt3) {
    if (this.fdq == null) {
      return 0;
    }
    int i = this.fdm;
    int j = this.fdn;
    int k = 0;
    int m = this.fdq.a(paramInt1 - i, paramInt2 - j, paramArrayOfcZc, paramInt3);
    for (int n = 0; n < m; n++) {
      paramArrayOfcZc[(paramInt3 + n)].hY += i;
      paramArrayOfcZc[(paramInt3 + n)].hZ += j;
      cZc tmp95_94 = paramArrayOfcZc[(paramInt3 + n)]; tmp95_94.aOl = ((short)(tmp95_94.aOl + 0));
    }
    return m;
  }

  public boolean contains(int paramInt1, int paramInt2) {
    if (this.fdq == null) {
      return false;
    }
    return this.fdq.p(paramInt1 - this.fdm, paramInt2 - this.fdn);
  }

  public boolean be(int paramInt1, int paramInt2) {
    if (this.fdq == null) {
      return false;
    }
    return this.fdq.be(paramInt1 - this.fdm, paramInt2 - this.fdn);
  }

  public boolean I(int paramInt1, int paramInt2) {
    if (this.fdq == null) {
      return true;
    }
    return this.fdq.I(paramInt1 - this.fdm, paramInt2 - this.fdn);
  }

  public boolean A(int paramInt1, int paramInt2, int paramInt3) {
    if (this.fdq == null) {
      return true;
    }
    return this.fdq.bf(paramInt1 - this.fdm, paramInt2 - this.fdn);
  }

  public alY bmZ() {
    return this.fdq;
  }

  public boolean bg(int paramInt1, int paramInt2) {
    if (this.fdq == null) {
      return false;
    }
    return this.fdq.bg(paramInt1 - this.fdm, paramInt2 - this.fdn);
  }

  public bOB bna() {
    return aDF.ba((short)this.fdl);
  }

  public void d(cXr paramcXr) {
    paramcXr.jn(this.RY);
    paramcXr.dT((short)this.fdl);
    paramcXr.putInt(this.RZ);
    paramcXr.dT(this.fdm);
    paramcXr.dT(this.fdn);
  }
}