import org.apache.log4j.Logger;

public abstract class cHP
{
  private static final Logger K = Logger.getLogger(cHP.class);

  private static int iDl = 1;

  private final int aw = iDl++;

  private boolean iDm = false;

  private boolean aEK = false;

  protected abstract boolean aM(String paramString);

  public abstract cVZ Ds();

  public int getId()
  {
    return this.aw;
  }

  public boolean cCd()
  {
    return this.iDm;
  }

  public void jdMethod_if(boolean paramBoolean) {
    this.iDm = paramBoolean;
  }

  public void ig(boolean paramBoolean)
  {
    this.aEK = paramBoolean;
  }

  public boolean cCe() {
    return this.aEK;
  }

  public static cHP nr(String paramString) {
    String[] arrayOfString = paramString.split("\\|", -1);

    if (arrayOfString.length % 2 != 0) {
      K.error("HMI error : Nombre de paramètres décodés: " + arrayOfString.length + " Attendu: pair ");
      return null;
    }

    Byte localByte = Byte.valueOf((byte)0);
    Object localObject = "";
    boolean bool = false;

    for (int i = 0; i < arrayOfString.length; i += 2) {
      String str1 = arrayOfString[i];
      String str2 = arrayOfString[(i + 1)];

      if (str1.equals("type"))
        localByte = Byte.valueOf(Byte.parseByte(str2));
      else if (str1.equals("data"))
        localObject = str2;
      else if (str1.equals("broadcast")) {
        bool = Boolean.parseBoolean(str2);
      }
    }

    jQ.rA(); return jQ.a(cVZ.eI(localByte.byteValue()), (String)localObject, bool);
  }

  public String toString() {
    return "HMIAction{m_id=" + this.aw + ", m_targetOnly=" + this.iDm + ", m_isInstant=" + this.aEK + "} ";
  }
}