import org.apache.log4j.Logger;

public class dOW extends alY
{
  private static final Logger K = Logger.getLogger(dOW.class);
  private aN[] lbg;
  private IW lbf;
  private final alz mgH = new alz();

  public dOW(int paramInt) {
    super(paramInt);
  }

  public void g(aYQ paramaYQ)
  {
    super.g(paramaYQ);
    int i = paramaYQ.readUnsignedShort();
    this.lbg = new aN[i];
    for (int j = 0; j < i; j++) {
      this.lbg[j] = aN.c(paramaYQ);
    }
    this.lbf = new IW((byte)getWidth(), (byte)getHeight());
    this.lbf.g(paramaYQ);

    j = paramaYQ.bnS();
    this.mgH.aV(j);
    for (int k = 0; k < j; k++) {
      byte b = (byte)paramaYQ.readShort();
      byte[] arrayOfByte = M(paramaYQ);
      this.mgH.a(b, arrayOfByte);
    }
  }

  private byte[] M(aYQ paramaYQ) {
    int i = paramaYQ.bnS();

    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++) {
      arrayOfByte[j] = ((byte)paramaYQ.readShort());
    }
    return arrayOfByte;
  }

  public IW cPJ() {
    return new IW(this.lbf);
  }

  public aN[] cPK() {
    return this.lbg;
  }

  public int Wf() {
    return this.mgH.size();
  }

  public void a(bhn parambhn) {
    int i = 0; for (int j = this.mgH.size(); i < j; i++)
      if (!parambhn.b(this.mgH.aW(i), this.mgH.hc(i)))
        return;
  }
}