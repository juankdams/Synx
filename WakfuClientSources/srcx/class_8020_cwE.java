import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cwE extends aHN
{
  private static final Logger K = Logger.getLogger(cwE.class);
  private bva aIz;

  private static byte c(bva parambva)
  {
    String str;
    try
    {
      str = String.format(ay.bd().getString("fullSubMapPath"), new Object[] { Integer.valueOf(parambva.bpl()), Integer.valueOf(parambva.getId() / 100) });
    } catch (bdh localbdh) {
      return 1;
    }
    URL localURL;
    try
    {
      localURL = new URL(str);
    } catch (MalformedURLException localMalformedURLException) {
      return 1;
    }
bpA localbpA = new bpA();
    bwZ localbwZ = new bwZ();
    InputStream localInputStream;
    try { localInputStream = localURL.openStream();
    } catch (IOException localIOException1) {
      return 1;
    }

    BufferedInputStream localBufferedInputStream = new BufferedInputStream(localInputStream);
    try {
      localbpA.i(localBufferedInputStream);
      localbpA.a(localbwZ, new cdJ[0]);
      localbpA.close();
    } catch (Exception localException) {
      return 1;
    } finally {
      try {
        localBufferedInputStream.close();
      } catch (IOException localIOException4) {
        K.warn(localIOException4);
      }
    }

    ArrayList localArrayList = localbwZ.bEx().c("mapNavigatorBackgroundPart");
    K localK1 = (K)localArrayList.get(0);
    K localK2 = localK1.e("maskLevel");
    return (byte)(localK2.af() + 1);
  }

  public cwE(bva parambva) {
    super(parambva.bCL(), parambva.getId(), null, null, null, c(parambva));

    this.aIz = parambva;
  }

  public Dg aTP()
  {
    return super.aTP();
  }

  public bNa aqU()
  {
    ayn localayn = (ayn)this.aIz.boT();
    if (localayn == null) {
      return auI.dHD;
    }

    int i = localayn.avc();
    if (i == -1) {
      return auI.dHD;
    }

    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return auI.dHG;
    }

    ctE localctE = (ctE)localbyz.cJf();

    return bPl.a(localctE, dsh.luB.BA(i));
  }

  public String fJ()
  {
    return null;
  }

  public String aqW()
  {
    return null;
  }

  public bva qv() {
    return this.aIz;
  }
}