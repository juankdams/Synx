import com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect.SpellEffectFunctionsLibrary;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bWF extends aIN
  implements aZI
{
  private final doA cYH;
  private final byte[] bXg;
  private final byte[] hdB;
  private final boolean hdC;
  private boolean bIx;
  private final bys hiQ = new bys(this);

  public bWF(int paramInt1, int paramInt2, int paramInt3, int paramInt4, uY paramuY, byte[] paramArrayOfByte1, boolean paramBoolean, byte[] paramArrayOfByte2) {
    super(paramInt1, paramInt2, paramInt4, paramInt3);

    this.cYH = ((doA)paramuY.a(null, ciQ.ckL()));

    this.hdC = paramBoolean;
    this.bXg = paramArrayOfByte1;
    this.hdB = paramArrayOfByte2;

    c(new hQ[] { new SpellEffectFunctionsLibrary(this) });

    ko(tW(paramuY.getId()));
  }

  public void cbE() {
    ckT localckT = mD();
    if (this.cYH != null) {
      if (localckT != null)
        this.cYH.b(localckT.aIq());
      else {
        this.cYH.b(SN.aga());
      }
    }
    this.cYH.a(this.cYH.bkS(), this.bXg, aUk.eVd);
  }

  public void cbF() {
    this.bIx = true;
    if (this.cYH == null) {
      return;
    }

    ckT localckT = mD();
    if (localckT != null)
      this.cYH.b(localckT.aIq());
    else {
      this.cYH.b(SN.aga());
    }

    if (this.hdB != null) {
      this.cYH.nu().a(ByteBuffer.wrap(this.hdB), aUk.eVd);
    }

    this.cYH.q(this.bXg);

    if (this.cYH.bkf() != null) {
      O(this.cYH.bkf().getId());
    }
    if (this.cYH.bke() != null) {
      fE(this.cYH.bke().getId());
    }

    if ((this.cYH.wa() != null) && (((bqk)this.cYH.wa()).nS() == 17)) {
      ko(-1);
    }

    int i = bZo();
    if (i != 0)
      ko(i);
  }

  public long gA()
  {
    if (this.bIx) {
      return super.gA();
    }
    if ((super.gA() == -9223372036854775808L) && (this.cYH != null)) {
      if (this.hdB != null) {
        this.cYH.nu().a(ByteBuffer.wrap(this.hdB), aUk.eVd);
      }
      this.cYH.q(this.bXg);
      if (this.cYH.bkf() != null) {
        O(this.cYH.bkf().getId());
      }
    }
    return super.gA();
  }

  public long Iw() {
    return bwv();
  }

  public long mC()
  {
    cbF();
    return super.mC();
  }

  private int bZo() {
    if (this.cYH.bkc() == null) {
      return 0;
    }
    return ((dpI)this.cYH.bkc()).zM();
  }

  protected void kO()
  {
    try {
      this.hiQ.bFJ();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
    cbG();
    super.kO();
    this.cYH.cVX();
  }

  private void cbG() {
    this.cYH.bkr();
    aVc.bka();
    this.cYH.bky();
    if (this.hdC) {
      this.cYH.bkB();

      this.cYH.c(null, true);
    }
    else {
      if (this.cYH.bkM())
      {
        int i = 0;

        dle localdle = this.cYH.bke();
        int j = (this.cYH.aN()) && (!this.cYH.aM()) ? 1 : 0;
        boolean bool = this.cYH.atX();

        if ((bool) || (j != 0)) {
          if ((localdle != null) && (localdle.atO() != null)) {
            localdle.atO().F(this.cYH);
            i = 1;
          }
        } else if ((this.cYH.bkf() != null) && (this.cYH.bkf().atO() != null)) {
          this.cYH.bkf().atO().F(this.cYH);
          i = 1;
        }

        this.cYH.oT();

        if (i == 0) {
          if (this.cYH.bkc() != null)
            K.error("Unable to find a valid RunningEffectManager to apply effect d'id " + ((dpI)this.cYH.bkc()).yR());
          else {
            K.error("Unable to find a valid RunningEffectManager to apply effect " + this.cYH);
          }

        }

      }

      if ((this.cYH.bkM()) && (!this.cYH.isInfinite()))
      {
        this.cYH.cVI();
      }

      if (!this.cYH.aug())
      {
        this.cYH.c(this.cYH.bkn(), false);
      }
    }
  }

  public void kA(String paramString) {
    if ((paramString != null) && (paramString.length() > 0))
      ehE.info(paramString);
  }

  private static int tW(int paramInt)
  {
    dkF localdkF = (dkF)bsj.bAv().kC(paramInt);

    if (localdkF == null) {
      return -1;
    }

    return localdkF.uN();
  }

  public int are() {
    return this.cYH.getValue();
  }

  public byte bou() {
    return this.cYH.bou();
  }

  public doA bov() {
    return this.cYH;
  }

  public cYk ML() {
    dle localdle = this.cYH.bkf();
    if (localdle != null) {
      return new cYk(localdle.fa(), localdle.fb(), localdle.fc());
    }
    return this.cYH.bkg();
  }

  public cYk bkg() {
    cYk localcYk = this.cYH.bkg();
    if (localcYk != null) {
      return localcYk;
    }
    dle localdle = this.cYH.bkf();
    if (localdle != null) {
      return new cYk(localdle.fa(), localdle.fb(), localdle.fc());
    }
    return null;
  }

  public cYk bow() {
    dle localdle = this.cYH.bke();
    if (localdle != null) {
      return new cYk(localdle.fa(), localdle.fb(), localdle.fc());
    }
    K.error("ATTENTION : on veut récupérer la position du caster d'un effet mais celui ci est inconnu, à défaut on renvoie la cellule cible");
    return this.cYH.bkg();
  }

  public cYk box() {
    dDN localdDN = this.cYH.bkq();
    if (localdDN == null) {
      return null;
    }

    dle localdle = localdDN.axG();
    if (localdle == null) {
      return null;
    }

    return localdle.ML();
  }

  public int boy() {
    if ((this.cYH instanceof cmD))
      return ((cmD)this.cYH).bNq();
    return 0;
  }

  public int bZy()
  {
    if ((this.cYH != null) && (this.cYH.bkc() != null)) {
      return ((dpI)this.cYH.bkc()).yR();
    }
    return super.bZy();
  }
}