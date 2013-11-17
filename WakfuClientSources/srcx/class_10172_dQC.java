import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class dQC extends aqA
{
  protected static final short mkU = 294;
  public static final byte mkV = 4;
  public static final byte mkW = 4;
  public static final byte mkX = 5;
  public static final byte mkY = 5;
  public static final byte mkZ = 6;
  public static final byte mla = 6;
  public static final byte mlb = 6;
  public static final byte mlc = 6;
  public static final byte mld = 6;
  public static final byte mle = 6;
  public static final int mlf = 28;
  protected boolean mlg;
  protected gA mlh;
  protected gA mli;
  protected boolean mlj;

  public dQC()
  {
    bm((byte)4);
    bn((byte)4);
    this.mlj = false;
    this.mlg = false;
  }

  public void drB() {
    if (this.mlh != null)
      this.mlg = true;
  }

  public boolean drC()
  {
    return this.mlg;
  }

  public gA lm(boolean paramBoolean) {
    if (paramBoolean) {
      return this.mlh;
    }
    return this.mli;
  }

  private boolean aX(gA paramgA)
  {
    if (paramgA == null) {
      return false;
    }
    if (paramgA.oi() == null) {
      return false;
    }
    if (paramgA.oi().bKn() == null) {
      return false;
    }
    return paramgA.oi().bKn().nc() == 294;
  }

  public bKk a(gA paramgA, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1) {
      if (paramgA == null) {
        return bKk.gMe;
      }
      if (this.mlh != null) {
        return bKk.gLW;
      }
      if (!aX(paramgA)) {
        return bKk.gLX;
      }
      if (paramBoolean2) {
        this.mlh = paramgA;
        aBC();
      }
      return bKk.gLV;
    }
    if (paramgA == null) {
      return bKk.gMe;
    }
    if (this.mli != null) {
      return bKk.gLW;
    }
    if (!aX(paramgA)) {
      return bKk.gLX;
    }
    if (this.mlh == null) {
      return bKk.gMa;
    }
    if (this.mlh.ok() != paramgA.ok()) {
      return bKk.gMf;
    }
    if (paramBoolean2) {
      this.mli = paramgA;
      aBC();
    }
    return bKk.gLV;
  }

  public bKk v(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      if (this.mlg) {
        return bKk.gMc;
      }
      if (this.mli != null) {
        return bKk.gLZ;
      }
      if (this.mlh == null) {
        return bKk.gLY;
      }
      if (!isEmpty()) {
        return bKk.gMb;
      }
      if (paramBoolean2) {
        this.mlh = null;
        aBC();
      }
      return bKk.gLV;
    }
    if (this.mli == null) {
      return bKk.gLY;
    }

    EnumSet localEnumSet = aCN();
    for (Object localObject1 = localEnumSet.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (aFk)((Iterator)localObject1).next();
      if (a((aFk)localObject2).size() > ((aFk)localObject2).ebj) {
        return bKk.gMg;
      }

    }

    localObject1 = i(4, 0, 2, 4);
    if (!((ArrayList)localObject1).isEmpty()) {
      return bKk.gMd;
    }

    localObject1 = i(0, 4, 4, 2);
    if (!((ArrayList)localObject1).isEmpty()) {
      return bKk.gMd;
    }

    localObject1 = i(4, 4, 2, 2);
    if (!((ArrayList)localObject1).isEmpty()) {
      return bKk.gMd;
    }

    Object localObject2 = aCI();
    aqA localaqA = this.dyj.bj(this.dyg, this.dyh - 6);
    if ((localaqA != null) && ((localaqA instanceof dQC))) {
      localObject3 = (dQC)localaqA;
      if ((((dQC)localObject3).io == 6) && 
        (!((dQC)localObject3).i(0, 5, 6, 1).isEmpty())) {
        return bKk.gMd;
      }

      if ((((dQC)localObject3).mlj) && 
        (((dQC)localObject3).i((byte)6, (byte)6) != null)) {
        return bKk.gMd;
      }

    }

    Object localObject3 = this.dyj.bj(this.dyg - 6, this.dyh);
    if ((localObject3 != null) && ((localObject3 instanceof dQC))) {
      localObject4 = (dQC)localObject3;
      if ((((dQC)localObject4).bSa == 6) && 
        (!((dQC)localObject4).i(5, 0, 1, 6).isEmpty())) {
        return bKk.gMd;
      }

      if ((((dQC)localObject4).mlj) && 
        (((dQC)localObject4).i((byte)6, (byte)6) != null)) {
        return bKk.gMd;
      }

    }

    Object localObject4 = this.dyj.bj(this.dyg - 6, this.dyh - 6);
    if ((localObject4 instanceof dQC)) {
      dQC localdQC = (dQC)localObject4;

      if ((localdQC.io == 6) && (localdQC.bSa == 6) && 
        (localdQC.i((byte)5, (byte)5) != null)) {
        return bKk.gMd;
      }

      if ((localdQC.mlj) && 
        (localdQC.i((byte)6, (byte)6) != null)) {
        return bKk.gMd;
      }

    }

    if (paramBoolean2) {
      this.mli = null;
      aBC();
    }
    return bKk.gLV;
  }

  public bKk a(boolean paramBoolean1, gA paramgA, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      if (this.mlg) {
        return bKk.gMc;
      }

      if (paramBoolean2) {
        this.mlh = paramgA;
        aBC();
      }
    } else {
      if (this.mlh.ok() != paramgA.ok()) {
        return bKk.gMf;
      }

      if (paramBoolean2) {
        this.mli = paramgA;
        aBC();
      }
    }
    return bKk.gLV;
  }

  public boolean a(cVo paramcVo, int paramInt1, int paramInt2)
  {
    if (this.mlh == null) {
      return false;
    }

    int i = this.mlh.ok();
    int j = 0;
    for (Ka localKa : paramcVo.sJ()) {
      if (localKa.UJ() == i) {
        j = 1;
        break;
      }
    }

    if ((!aCM().contains(paramcVo)) && 
      (e(paramcVo))) {
      return false;
    }

    if ((j != 0) && (!paramcVo.a(this))) {
      return false;
    }

    if (j == 0) {
      return false;
    }

    return super.a(paramcVo, paramInt1, paramInt2);
  }

  public boolean e(cVo paramcVo) {
    aFk localaFk = paramcVo.sK();
    ArrayList localArrayList = a(localaFk);
    int i = localaFk.ebj * drD();
    return localArrayList.size() >= i;
  }

  private int drD() {
    int i = 0;
    if (this.mlh != null) {
      i++;
    }
    if (this.mli != null) {
      i++;
    }
    return i;
  }

  public boolean drE() {
    return this.mlj;
  }

  private boolean b(aqA paramaqA) {
    if (paramaqA == null) {
      return false;
    }
    if (!(paramaqA instanceof dQC)) {
      return false;
    }
    dQC localdQC = (dQC)paramaqA;

    if ((localdQC.mlh == null) || (localdQC.mli == null)) {
      return false;
    }

    if (this.mlh.ok() != localdQC.mlh.ok()) {
      return false;
    }

    if (this.mli.ok() != localdQC.mli.ok()) {
      return false;
    }

    return true;
  }

  private void drF()
  {
    if ((this.mlh != null) && (this.mli != null) && (this.mlh.ok() == this.mli.ok()))
    {
      aqA localaqA1 = this.dyj.bj(this.dyg, (short)(this.dyh + 6));
      this.io = (b(localaqA1) ? 6 : 5);

      aqA localaqA2 = this.dyj.bj((short)(this.dyg + 6), this.dyh);
      this.bSa = (b(localaqA2) ? 6 : 5);

      aqA localaqA3 = this.dyj.bj((short)(this.dyg + 6), (short)(this.dyh + 6));
      this.mlj = ((this.bSa == 6) && (this.io == 6) && (b(localaqA3)));
    } else {
      this.bSa = 4;
      this.io = 4;
    }
  }

  public boolean aBC() {
    try {
      drF();
      aqA localaqA1 = this.dyj.bj(this.dyg, (short)(this.dyh - 6));
      if ((localaqA1 != null) && ((localaqA1 instanceof dQC))) {
        ((dQC)localaqA1).drF();
      }

      aqA localaqA2 = this.dyj.bj((short)(this.dyg - 6), this.dyh);
      if ((localaqA2 != null) && ((localaqA2 instanceof dQC))) {
        ((dQC)localaqA2).drF();
      }

      aqA localaqA3 = this.dyj.bj((short)(this.dyg - 6), (short)(this.dyh - 6));
      if ((localaqA3 != null) && ((localaqA3 instanceof dQC))) {
        ((dQC)localaqA3).drF();
      }

      return true;
    } catch (Exception localException) {
      K.error("Erreur lors de l'Update des room d'un Havre-sac", localException);
    }return false;
  }

  protected uc aCO()
  {
    XS localXS = new XS();

    localXS.cIo = this.mlg;

    localXS.cIp = (this.mlh != null ? this.mlh.ok() : -1);
    localXS.cIq = (this.mlh != null ? this.mlh.oj() : -1L);

    localXS.cIr = (this.mli != null ? this.mli.ok() : -1);
    localXS.cIs = (this.mli != null ? this.mli.oj() : -1L);

    return localXS;
  }

  private gA DG(int paramInt) {
    bBn localbBn = Hh.QM().dh(paramInt);
    if (localbBn != null) {
      gA localgA = gA.a(localbBn);
      localgA.l((short)1);
      return localgA;
    }
    return null;
  }

  protected void a(uc paramuc) {
    XS localXS = (XS)paramuc;

    this.mlg = localXS.cIo;

    release();
    bBn localbBn;
    gA localgA;
    if (localXS.cIp != -1) {
      localbBn = Hh.QM().dh(localXS.cIp);
      localgA = gA.a(localXS.cIq, localbBn);
      if (!aX(localgA)) {
        K.error("La gemme primaire n'est pas un item de la bonne catégorie (refItemId=" + localXS.cIp + "), on la remplace par la gemme par défaut");

        localgA.release();

        this.mlh = DG(Ka.UK().UJ());
      } else {
        this.mlh = localgA;
        this.mlh.l((short)1);
      }
    } else {
      this.mlh = null;
    }

    if (localXS.cIr != -1) {
      if (localXS.cIr != localXS.cIp) {
        K.error("Le type de gemme secondaire n'est pas le meme que le type primaire, on réinitialise cette gemme");
        localXS.cIr = localXS.cIp;
      }

      localbBn = Hh.QM().dh(localXS.cIr);
      localgA = gA.a(localXS.cIs, localbBn);
      if (!aX(localgA)) {
        K.error("La gemme secondaire n'est pas un item de la bonne catégorie (refItemId=" + localXS.cIr + "), on la remplace par la gemme par défaut");

        localgA.release();

        this.mli = DG(this.mlh.ok());
      } else {
        this.mli = localgA;
        this.mli.l((short)1);
      }
    } else {
      this.mli = null;
    }
  }

  public boolean bk(int paramInt1, int paramInt2) {
    if ((paramInt1 >= this.dyg) && (paramInt1 < this.dyg + this.bSa) && 
      (paramInt2 >= this.dyh) && (paramInt2 < this.dyh + this.io)) {
      if ((paramInt1 == this.dyg + this.bSa - 1) && (paramInt2 == this.dyh + this.io - 1) && (this.bSa == 6) && (this.io == 6))
      {
        return this.mlj;
      }
      return true;
    }

    return false;
  }

  public Ka drG() {
    if (this.mlh == null) {
      return null;
    }

    return Ka.fv(this.mlh.ok());
  }

  public Ka drH() {
    if (this.mli == null) {
      return null;
    }

    return Ka.fv(this.mli.ok());
  }

  public void release() {
    if (this.mlh != null) {
      this.mlh.release();
      this.mlh = null;
    }
    if (this.mli != null) {
      this.mli.release();
      this.mli = null;
    }
  }
}