import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class duB
{
  private static final Logger K = Logger.getLogger(duB.class);

  private static duB lzd = new duB();
  public static final String lze = "clientConfig";
  private static final String lzf = "clientConfig/%s";
  private static final String lzg = "clientConfig/%s/%s";
  private static final String lzh = "clientConfig/%s/%s/%s";
  private static final String lzi = "clientConfig/%s/%s/%s/%d";
  private static final String lzj = "clientConfig/%s/account.xml";
  private static final String lzk = "clientConfig/%s/%s/world.xml";
  private static final String lzl = "clientConfig/%s/%s/%s/character.xml";
  private static final String lzm = "clientConfig/%s/%s/%s/%d/instance.xml";
  public static final byte lzn = 1;
  public static final byte fgo = 2;
  public static final byte lzo = 3;
  public static final byte lzp = 4;
  private String lzq = null;
  private String lzr = null;
  private String lzs = null;
  private short lzt = -1;

  private Properties lzu = new Properties();
  private Properties lzv = new Properties();
  private Properties lzw = new Properties();
  private Properties lzx = new Properties();

  private duB() {
    File localFile = new File("clientConfig");
    if (!localFile.exists())
      localFile.mkdir();
  }

  public static duB dai()
  {
    return lzd;
  }

  public void qo(String paramString) {
    if ((this.lzq == paramString) || ((paramString != null) && (paramString.equals(this.lzq))) || ((this.lzq != null) && (this.lzq.equals(paramString))))
    {
      return;
    }

    if (this.lzq != null) {
      dak();
    }

    this.lzq = paramString;

    if (this.lzq != null)
      daj();
    else
      this.lzu.clear();
  }

  public void qp(String paramString)
  {
    if ((this.lzr == paramString) || ((paramString != null) && (paramString.equals(this.lzr))) || ((this.lzr != null) && (this.lzr.equals(paramString))))
    {
      return;
    }

    if (this.lzr != null) {
      dam();
    }

    this.lzr = paramString;

    if (this.lzr != null)
      dal();
    else
      this.lzv.clear();
  }

  public void cf(String paramString)
  {
    if ((this.lzs == paramString) || ((paramString != null) && (paramString.equals(this.lzs))) || ((this.lzs != null) && (this.lzs.equals(paramString))))
    {
      return;
    }

    if (this.lzs != null) {
      dao();
    }

    this.lzs = paramString;

    if (this.lzs != null)
      dan();
    else
      this.lzw.clear();
  }

  public void Y(short paramShort)
  {
    if (this.lzt == paramShort) {
      return;
    }

    if (this.lzt != -1) {
      daq();
    }

    this.lzt = paramShort;

    if (this.lzt != -1)
      dap();
    else
      this.lzx.clear();
  }

  private void b(Properties paramProperties, String paramString1, String paramString2)
  {
    File localFile = new File(paramString1);

    if (!localFile.exists()) {
      localFile.mkdirs();
    }

    localFile = new File(paramString2);
    if (!localFile.exists()) {
      try {
        localFile.createNewFile();
      } catch (IOException localIOException1) {
        K.warn("impossible de créer le fichier de compte " + paramString2 + " : " + localIOException1.getMessage());
      }
    }
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramString2);
      paramProperties.load(localFileInputStream);
      localFileInputStream.close();
    } catch (IOException localIOException2) {
      K.warn("Impossible de charger le fichier de propriétés de compte " + paramString2);
    }
  }

  private void g(Properties paramProperties, String paramString) {
    if (paramString == null) {
      K.warn("Impossible de sauver les propriétés d'un fichier inconnu");
      return;
    }
    FileOutputStream localFileOutputStream = null;
    try {
      localFileOutputStream = new FileOutputStream(paramString);
      paramProperties.store(localFileOutputStream, null);
    } catch (IOException localIOException2) {
      K.warn("Problème à l'enregistrement du fichier " + paramString);
    } finally {
      if (localFileOutputStream != null)
        try {
          localFileOutputStream.close();
        } catch (IOException localIOException4) {
          K.warn("Problème à la fermeture du fichier de propriétés " + paramString);
        }
    }
  }

  private void aio()
  {
    if (this.lzq == null)
      return;
    dak();
    if (this.lzr == null)
      return;
    dam();
    if (this.lzs == null)
      return;
    dao();
    if (this.lzt == -1) {
      return;
    }
    daq();
  }

  public void daj() {
    if (this.lzq == null) {
      return;
    }
    b(this.lzu, dar(), String.format("clientConfig/%s/account.xml", new Object[] { this.lzq }));

    dal();
  }

  public void dak() {
    if (this.lzq != null)
      g(this.lzu, String.format("clientConfig/%s/account.xml", new Object[] { this.lzq }));
  }

  public void dal()
  {
    if ((this.lzq != null) && (this.lzr != null)) {
      b(this.lzv, das(), String.format("clientConfig/%s/%s/world.xml", new Object[] { this.lzq, this.lzr }));

      dan();
    }
  }

  public void dam() {
    if ((this.lzq != null) && (this.lzr != null))
      g(this.lzv, String.format("clientConfig/%s/%s/world.xml", new Object[] { this.lzq, this.lzr }));
  }

  public void dan()
  {
    if ((this.lzq != null) && (this.lzr != null) && (this.lzs != null)) {
      b(this.lzw, dat(), String.format("clientConfig/%s/%s/%s/character.xml", new Object[] { this.lzq, this.lzr, this.lzs }));

      dap();
    }
  }

  public void dao() {
    if ((this.lzq != null) && (this.lzr != null) && (this.lzs != null))
      g(this.lzw, String.format("clientConfig/%s/%s/%s/character.xml", new Object[] { this.lzq, this.lzr, this.lzs }));
  }

  public void dap()
  {
    if ((this.lzq != null) && (this.lzr != null) && (this.lzs != null) && (this.lzt != -1))
      b(this.lzx, dau(), String.format("clientConfig/%s/%s/%s/%d/instance.xml", new Object[] { this.lzq, this.lzr, this.lzs, Short.valueOf(this.lzt) }));
  }

  public void daq()
  {
    if ((this.lzq != null) && (this.lzr != null) && (this.lzs != null) && (this.lzt != -1))
      g(this.lzx, String.format("clientConfig/%s/%s/%s/%d/instance.xml", new Object[] { this.lzq, this.lzr, this.lzs, Short.valueOf(this.lzt) }));
  }

  public String dar()
  {
    return String.format("clientConfig/%s", new Object[] { this.lzq });
  }

  public String das() {
    return String.format("clientConfig/%s/%s", new Object[] { this.lzq, this.lzr });
  }

  public String dat() {
    return String.format("clientConfig/%s/%s/%s", new Object[] { this.lzq, this.lzr, this.lzs });
  }

  public String dau() {
    return eu(this.lzt);
  }

  public String eu(short paramShort) {
    return String.format("clientConfig/%s/%s/%s/%d", new Object[] { this.lzq, this.lzr, this.lzs, Short.valueOf(paramShort) });
  }

  private Properties fz(byte paramByte) {
    switch (paramByte) {
    case 1:
      return this.lzu;
    case 2:
      return this.lzv;
    case 3:
      return this.lzw;
    case 4:
      return this.lzx;
    }

    K.warn("Domaine invalide : " + paramByte);

    return null;
  }

  public void a(byte paramByte, String paramString1, String paramString2) {
    Properties localProperties = fz(paramByte);
    if (localProperties == null) {
      return;
    }

    localProperties.setProperty(paramString1, paramString2);

    aio();
  }

  public void a(byte paramByte1, String paramString, byte paramByte2) {
    a(paramByte1, paramString, String.valueOf(paramByte2));
  }

  public void a(byte paramByte, String paramString, int paramInt) {
    a(paramByte, paramString, String.valueOf(paramInt));
  }

  public void a(byte paramByte, String paramString, short paramShort) {
    a(paramByte, paramString, String.valueOf(paramShort));
  }

  public void a(byte paramByte, String paramString, float paramFloat) {
    a(paramByte, paramString, String.valueOf(paramFloat));
  }

  public void a(byte paramByte, String paramString, double paramDouble) {
    a(paramByte, paramString, String.valueOf(paramDouble));
  }

  public void a(byte paramByte, String paramString, long paramLong) {
    a(paramByte, paramString, String.valueOf(paramLong));
  }

  public void b(byte paramByte, String paramString, boolean paramBoolean) {
    a(paramByte, paramString, String.valueOf(paramBoolean));
  }

  public String b(byte paramByte, String paramString) {
    Properties localProperties = fz(paramByte);
    if (localProperties == null) {
      return null;
    }

    return localProperties.getProperty(paramString);
  }

  public boolean c(byte paramByte, String paramString) {
    return bUD.getBoolean(b(paramByte, paramString));
  }

  public byte d(byte paramByte, String paramString) {
    return bUD.getByte(b(paramByte, paramString));
  }

  public short e(byte paramByte, String paramString) {
    return bUD.getShort(b(paramByte, paramString));
  }

  public int f(byte paramByte, String paramString) {
    return bUD.aR(b(paramByte, paramString));
  }

  public long g(byte paramByte, String paramString) {
    return bUD.getLong(b(paramByte, paramString));
  }

  public float h(byte paramByte, String paramString) {
    return bUD.getFloat(b(paramByte, paramString));
  }

  public double i(byte paramByte, String paramString) {
    return bUD.getDouble(b(paramByte, paramString));
  }

  public boolean j(byte paramByte, String paramString) {
    Properties localProperties = fz(paramByte);
    if ((localProperties != null) && (localProperties.containsKey(paramString))) {
      return true;
    }

    return false;
  }

  public void k(byte paramByte, String paramString) {
    Properties localProperties = fz(paramByte);
    if (localProperties == null) {
      return;
    }

    localProperties.remove(paramString);
  }
}