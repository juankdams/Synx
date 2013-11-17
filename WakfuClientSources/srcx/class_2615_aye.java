import org.apache.log4j.Logger;

public abstract class aye extends ts
{
  private byte[] dNL;
  private cyx dNM;
  private int bvu = 0;
  private int bvv = 0;
  private byte[] dnI;
  private byte dNN = 0;

  public aye()
  {
    a(new dUi(this));
  }

  public cyx aJK()
  {
    return this.dNM;
  }

  public void E(cyx paramcyx)
  {
    this.dNM = paramcyx;
  }

  public void br(int paramInt1, int paramInt2)
  {
    this.bvu = paramInt1;
    this.bvv = paramInt2;
  }

  public byte[] ayC()
  {
    return this.dnI;
  }

  public void D(byte[] paramArrayOfByte)
  {
    this.dnI = paramArrayOfByte;
    K.info("ticket = " + paramArrayOfByte);
    if (this.dnI == null) {
      K.info("desactivate connection retry");
      aJO();
    } else {
      K.info("activateConectionRetry");
      aJN();
    }
  }

  public byte[] aJL() {
    return this.dNL;
  }

  public void E(byte[] paramArrayOfByte) {
    this.dNL = paramArrayOfByte;
  }

  public byte aJM()
  {
    return this.dNN;
  }

  public void bs(byte paramByte)
  {
    K.info("Raison de la déconnection de l'entité " + getId() + " : " + paramByte);
    this.dNN = paramByte;
  }

  public void awO()
  {
    aCy();

    a(new dUi(this));
  }

  public void cleanUp()
  {
    K.info("cleanUp() de la ProxyClientEntity, on fait un setTicket à null");
    D(null);
    bs((byte)0);
    awO();
  }

  public void aJN()
  {
    if (aJK() != null) {
      Ac localAc = (Ac)aJK().Br();
      if (localAc != null) {
        localAc.dR(this.bvu);
        localAc.dS(this.bvv);
      }
    }
  }

  public void aJO()
  {
    if (aJK() != null) {
      Ac localAc = (Ac)aJK().Br();
      if (localAc != null) {
        localAc.dR(0);
        localAc.dS(0);
      }
    }
  }

  public abstract void a(int paramInt1, int paramInt2, long paramLong);

  public abstract void aJP();

  public abstract void kZ(int paramInt);

  public abstract void F(byte[] paramArrayOfByte);
}