import org.apache.log4j.Logger;

public class ts extends aqv
  implements bWU, brd
{
  protected static final boolean aRN = false;
  protected static final Logger K = Logger.getLogger(ts.class);
  protected bcT bdI;
  protected aee aOr;
  private static int bdJ = -1;

  public ts()
  {
    this.aOr = null;
    cJ(false);
    a(bdJ--);
  }

  public void aJ()
  {
    cJ(false);
    this.bdI = null;
    this.aOr = null;
    a(bdJ--);
  }

  public void bc() {
    this.bdI = null;
    this.aOr = null;
    a(0L);
  }

  public void Bl()
  {
  }

  public void Bm()
  {
    K.info("FrameworkEntity::onReConnect()");
  }

  public void Bn()
  {
  }

  public void Bo()
  {
  }

  public void Bp()
  {
  }

  public void a(aee paramaee)
  {
    this.aOr = paramaee;
  }

  public aee Bq() {
    return this.aOr;
  }

  public synchronized void release()
  {
    if (this.aOr != null)
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.error("Exception levée lors de la libération d'une FrameworkEntity : ", localException);
      }
  }

  public void a(bcT parambcT)
  {
    this.bdI = parambcT;
  }

  public bcT Br() {
    return this.bdI;
  }

  public synchronized void closeConnection()
  {
    if (this.bdI != null)
      this.bdI.brc();
  }

  public synchronized void a(ts paramts)
  {
    if (paramts == null) {
      return;
    }
    if (this.bdI != null) {
      K.info("Fermeture de l'ancienne connection du FrameworkEntity");
      this.bdI.brc();
      this.bdI = null;
    }
    bcT localbcT = paramts.bdI;
    if (localbcT != null) {
      this.bdI = localbcT;
      this.bdI.p(this);
      paramts.a(null);
    }
  }

  public synchronized boolean isConnected()
  {
    return (this.bdI != null) && (!this.bdI.brd());
  }

  public void d(cWG paramcWG)
  {
    a(paramcWG, false);
  }

  public synchronized void a(cWG paramcWG, boolean paramBoolean) {
    if (this.bdI != null)
      try {
        long l = System.currentTimeMillis();
        byte[] arrayOfByte = paramcWG.encode();
        int i = (int)(System.currentTimeMillis() - l);

        dyC localdyC = dyC.S(paramcWG.getClass().getSimpleName(), true);

        if ((arrayOfByte != null) && (arrayOfByte.length > 0)) {
          localdyC.kN(true);
          localdyC.BW(i);
          localdyC.mu(arrayOfByte.length);
          this.bdI.Y(arrayOfByte);
        } else {
          localdyC.kN(false);
          localdyC.BW(i);
          K.error("Message vide ou erreur d'encodage : " + paramcWG.getId() + ", class : " + paramcWG.getClass().getName());
        }

      }
      catch (Exception localException1)
      {
        K.error("Exception levee dans l'envoi d'un message", localException1);
      }
    else {
      K.error("Pas de connexion disponible pour envoyer le message !" + paramcWG.getClass().getSimpleName());
    }
    try
    {
      if (!paramcWG.cKz())
        paramcWG.release();
    }
    catch (Exception localException2) {
      if (this.bdI != null) {
        bXH localbXH = this.bdI.bqV();
        if (localbXH != null)
          localbXH.h(localException2);
        else
          K.error(bBd.g(localException2));
      } else {
        K.error(bBd.g(localException2));
      }
    }
  }

  public synchronized void k(byte[] paramArrayOfByte)
  {
    if (this.bdI != null)
      this.bdI.Y(paramArrayOfByte);
  }
}