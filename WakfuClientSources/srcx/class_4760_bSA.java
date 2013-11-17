import com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect.SpellEffectFunctionsLibrary;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bSA extends atX
  implements aZI
{
  private final doA cYH;
  private final byte[] bXg;
  private final byte[] hdB;
  private final boolean hdC;

  public bSA(int paramInt1, int paramInt2, int paramInt3, uY paramuY, byte[] paramArrayOfByte1, boolean paramBoolean, byte[] paramArrayOfByte2)
  {
    super(paramInt1, paramInt2, paramInt3);

    this.cYH = ((doA)paramuY.a(null, ciQ.ckL()));

    this.hdC = paramBoolean;
    this.bXg = paramArrayOfByte1;
    this.hdB = paramArrayOfByte2;

    c(new hQ[] { new SpellEffectFunctionsLibrary(this) });

    ko(tW(paramuY.getId()));
  }

  public long Iw() {
    return bwv();
  }

  public int a() {
    return -1;
  }

  public long mC()
  {
    if (this.cYH != null) {
      this.cYH.b(SN.aga());
      this.cYH.q(this.bXg);

      if (this.hdB != null) {
        this.cYH.nu().a(ByteBuffer.wrap(this.hdB), aUk.eVd);
      }

      if (this.cYH.bkf() != null) {
        O(this.cYH.bkf().getId());
      }
      if (this.cYH.bke() != null) {
        fE(this.cYH.bke().getId());
      }
    }

    int i = bZo();
    if (i != 0) {
      ko(i);
    }
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
    int i = this.cYH.getId();
    try
    {
      tV(i);
    } catch (Exception localException) {
      K.error("Exception levee lors de l'affichage, on continue cependant l'execution de notre effet", localException);
    }

    bZp();
    this.cYH.cVX();
  }

  private void bZp() {
    this.cYH.bkr();
    aVc.bka();

    if (this.hdC) {
      this.cYH.bkB();

      this.cYH.c(null, true);
    }
    else {
      if (this.cYH.bkM()) {
        if ((this.cYH.bkf() != null) && (this.cYH.bkf().atO() != null)) {
          this.cYH.bkf().atO().F(this.cYH);
        }
        this.cYH.oT();
      }

      if ((this.cYH.bkM()) && (!this.cYH.isInfinite())) {
        this.cYH.bkI();
      }
      if (!this.cYH.aug())
      {
        this.cYH.c(this.cYH.bkn(), false);
      }
    }

    this.cYH.cVX();
  }

  private void tV(int paramInt)
  {
    byz localbyz = byv.bFN().bFO();
    if ((localbyz != this.cYH.bke()) && (localbyz != this.cYH.bkf()))
    {
      return;
    }

    if ((CA.Lv().bj(gA()) != null) && 
      (paramInt != 30) && (paramInt != 40) && (paramInt != 190) && (!(this.cYH instanceof bPD)) && (
      (((dpI)this.cYH.bkc()).beq()) || ((((dpI)this.cYH.bkc()).ber()) && (localbyz == this.cYH.bke())) || ((((dpI)this.cYH.bkc()).bes()) && (localbyz == this.cYH.bkf()))))
    {
      lZ locallZ = new lZ();
      ArrayList localArrayList = new ArrayList();

      locallZ.tI().am(cPU.kAB).a(CA.Lv().bj(gA()).getName()).a(" : ");
      String str1 = null;
      if (bU.fH().ed(13, this.cYH.yR())) {
        str1 = bU.fH().ec(13, this.cYH.yR());
      }
      if ((str1 == null) || (str1.length() == 0)) {
        str1 = bU.fH().ec(30, paramInt);
      }
      if (str1.length() > 0) {
        locallZ.tJ();
        locallZ.tI().am(cPU.kAC);
        locallZ.a(str1);
        bXU localbXU;
        String str2;
        if ((paramInt == bsj.fSd.getId()) || (paramInt == bsj.fWn.getId()))
        {
          localObject = (bZG)this.cYH;
          localbXU = (bXU)cNO.cFX().yF(((bZG)localObject).pl());
          str2 = String.valueOf(((bZG)localObject).cek());
          localArrayList.add(localbXU.getName());
          localArrayList.add(str2);
        } else if (paramInt == bsj.fRh.getId()) {
          localObject = (hn)this.cYH;
          localbXU = (bXU)cNO.cFX().yF(((hn)localObject).pl());
          str2 = String.valueOf(((hn)localObject).getValue());
          localArrayList.add(localbXU.getName());
          localArrayList.add(str2);
        } else if (paramInt == bsj.fSs.getId()) {
          localObject = (bXU)cNO.cFX().yF(this.cYH.getValue());
          localArrayList.add(((bXU)localObject).getName());
        } else if (paramInt == bsj.fSn.getId()) {
          localArrayList.add(bU.fH().b(6, this.cYH.getValue(), new Object[0]));
        } else {
          localArrayList.add(String.valueOf(this.cYH.getValue()));
        }

        Object localObject = "";
        try {
          localObject = bjv.format(locallZ.tP(), localArrayList.toArray());
        } catch (Exception localException) {
          K.error("Exception", localException);
        }
        aEe localaEe = new aEe((String)localObject);
        localaEe.mm(4);
        CM.LV().a(localaEe);
      }
    }
  }

  private int tW(int paramInt)
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
}