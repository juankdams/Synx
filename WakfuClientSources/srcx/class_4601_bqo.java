import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.io.IOException;
import org.apache.log4j.Logger;

public class bqo extends dKc
{
  protected static final Logger K = Logger.getLogger(bqo.class);
  private final azX fLs;
  private final bKi fLt;
  private boolean fLu;
  private long cqz;
  private byte erb;
  private bVf fLv;

  public bqo(bKi parambKi, azX paramazX)
  {
    this.fLs = paramazX;
    this.fLt = parambKi;
  }

  public short fU() {
    return 3;
  }

  public boolean fV() {
    if ((this.fLt.axX() != 0) && (!this.bSY.aTn().contains(this.fLt.axX()))) {
      K.error("le joueur ne possède pas ce skill " + this.fLt);
      return false;
    }

    return true;
  }

  public void begin() {
    s(0.0D);
  }

  public void s(double paramDouble)
  {
    cYb.cLu().wh();

    if (this.bSY.bSe() != this) {
      K.info("On démarre l'occupation de collecte sur la ressource " + this.fLs);

      this.bSY.q(false, true);
      this.bSY.b(this.fLs);

      ada localada = (ada)this.fLt.bOK();

      if (localada.apm()) {
        bzv();
      }

      cew localcew = this.bSY.aeL();
      localcew.v(this.fLt.gC(), false);

      this.bSY.a(this);
    } else {
      K.info("[COLLECT_DEBUG] On redémarre une occupation de collecte plutôt que de la mettre à jour. " + bBd.rV(6));
    }

    t(paramDouble);
  }

  private void bzv() {
    try {
      ada localada = (ada)this.fLt.bOK();
      this.fLv = new bVf(dsE.cYX(), this.fLs.fa(), this.fLs.fb(), this.fLs.fc());
      if (bzy()) {
        this.fLv.b(String.format(ay.bd().getString("ANMEquipmentPath"), new Object[] { "AnimHamecon" }), true);
        Anm localAnm = bOE.bVz().C(String.format(ay.bd().getString("ANMEquipmentPath"), new Object[] { Integer.valueOf(localada.apn()) }), true);
        this.fLv.a(localAnm, new int[] { byn.jq("Accessoire") });
      } else {
        this.fLv.b(String.format(ay.bd().getString("ANMEquipmentPath"), new Object[] { Integer.valueOf(localada.apn()) }), true);
      }

      this.fLv.id(this.fLs.asR() + 1);
      this.fLv.em(String.valueOf(localada.apn()));
      this.fLv.eq("AnimStatique-Debut");
      dps.cXa().k(this.fLv);
    } catch (IOException localIOException) {
      K.error("Impossible de charger le fichier d'animation", localIOException);
    } catch (bdh localbdh) {
      K.error("Impossible de récupérer la propriété pour le chargement d'animation", localbdh);
    }
  }

  private void bzw() {
    this.fLv.eq("AnimStatique-Fin");
    this.fLv.a(new dki(this));
  }

  public void t(double paramDouble)
  {
    this.bSY.bHi().a(this.fLs, this.fLt, this.cqz, this.erb, this.fLu, paramDouble);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("Annulation de la collecte, relai au serveur " + paramBoolean2);

    this.bSY.bHi().cvS();

    if (paramBoolean2) {
      localObject = new ayC();
      ((ayC)localObject).bt((byte)3);
      ((ayC)localObject).aS(fU());
      byv.bFN().aJK().d((cWG)localObject);
    }

    Object localObject = this.bSY.aeL();
    ((cew)localObject).v(this.fLt.gC(), true);

    this.bSY.bHe();

    if (this.fLv != null) {
      bzw();
    }

    cYb.cLu().clear();

    return true;
  }

  public boolean fW()
  {
    cYb.cLu().cLz();

    K.info("Fin de l'occupation de collecte");

    ayC localayC = new ayC();
    localayC.bt((byte)2);
    localayC.aS((short)3);
    byv.bFN().aJK().d(localayC);

    cew localcew = this.bSY.aeL();
    localcew.v(this.fLt.gC(), true);

    this.bSY.bHi().cvS();
    this.bSY.bHe();

    if (this.fLv != null) {
      bzw();
    }

    this.bSY.aTn().n(this.fLt.axX(), this.fLt.bOJ());
    return true;
  }

  public void fb(boolean paramBoolean) {
    this.fLu = paramBoolean;
  }

  public boolean bzx() {
    return this.fLu;
  }

  public void fT(long paramLong) {
    this.cqz = paramLong;
  }

  public void cX(byte paramByte) {
    this.erb = paramByte;
  }

  public long acG() {
    return this.cqz;
  }

  private boolean bzy() {
    aCH localaCH = clR.cni().vL(this.fLt.gC());
    if (localaCH == null) {
      return false;
    }
    return localaCH.aOQ().contains("AnimMetier-Peche");
  }
}