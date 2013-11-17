import java.util.regex.Pattern;

public final class dqw extends dte
{
  public static final byte lrY = 1;
  public static final byte lrZ = 2;
  public static final byte lsa = 3;
  public static final byte lsb = 4;
  public static final byte lsc = 5;
  public static final byte lsd = 6;
  public static final byte lse = 7;
  public static final byte lsf = 8;
  private Object[] lsg;
  private byte bkM;

  public dqw(byte paramByte, Object[] paramArrayOfObject)
  {
    this.bkM = paramByte;
    this.lsg = paramArrayOfObject;
  }

  public boolean isValid()
  {
    switch (this.bkM) {
    case 1:
    case 2:
    case 3:
    case 6:
      if ((this.lsg != null) && (this.lsg.length > 0) && ((this.lsg[0] instanceof Integer))) {
        return true;
      }
    case 4:
    case 5:
    case 7:
    case 8:
      if ((this.lsg != null) && (this.lsg.length == 1) && ((this.lsg[0] instanceof String)))
        return true;
      break;
    }
    cth.cqP().err("Type de recherche inconnue " + this.bkM);
    return false;
  }

  public void execute()
  {
    Pattern localPattern;
    StringBuilder localStringBuilder;
    cSR localcSR;
    int[] arrayOfInt;
    switch (this.bkM) {
    case 1:
      cy((byte)2);

      break;
    case 2:
    case 3:
    case 6:
      cy((byte)3);

      break;
    case 7:
      localPattern = Pattern.compile(((String)this.lsg[0]).toLowerCase());
      localStringBuilder = new StringBuilder("Result :\r\n========\r\n");
      localcSR = dvc.DZ();
      arrayOfInt = new int[] { 0 };
      localcSR.a(new amT(this, localPattern, localStringBuilder, arrayOfInt));

      localStringBuilder.append("========\r\n").append(arrayOfInt[0]).append(" états trouvés");

      cth.cqP().s(localStringBuilder.toString(), 16777215);

      break;
    case 4:
      localPattern = Pattern.compile(((String)this.lsg[0]).toLowerCase());
      localStringBuilder = new StringBuilder("Result :\r\n========\r\n");
      localcSR = ((vd)vd.QM()).DZ();
      arrayOfInt = new int[] { 0 };
      localcSR.a(new amP(this, localPattern, localStringBuilder, arrayOfInt));

      localStringBuilder.append("========\r\n").append(arrayOfInt[0]).append(" items found");

      cth.cqP().s(localStringBuilder.toString(), 16777215);

      break;
    case 8:
      localPattern = Pattern.compile(((String)this.lsg[0]).toLowerCase());
      localStringBuilder = new StringBuilder("Result :\r\n========\r\n");

      localcSR = bCc.bKN().DZ();
      arrayOfInt = new int[] { 0 };
      localcSR.a(new amN(this, localPattern, localStringBuilder, arrayOfInt));

      localStringBuilder.append("========\r\n").append(arrayOfInt[0]).append(" sets found");

      cth.cqP().s(localStringBuilder.toString(), 16777215);

      break;
    case 5:
      localPattern = Pattern.compile(((String)this.lsg[0]).toLowerCase());
      localStringBuilder = new StringBuilder("Result :\r\n========\r\n");
      localcSR = cMn.cFp().DZ();
      arrayOfInt = new int[] { 0 };
      localcSR.a(new amR(this, localPattern, localStringBuilder, arrayOfInt));

      localStringBuilder.append("========\r\n").append(arrayOfInt[0]).append(" items found");

      cth.cqP().s(localStringBuilder.toString(), 16776960);

      break;
    }
  }

  private void cy(byte paramByte)
  {
    aIG localaIG = new aIG();
    localaIG.bN(this.bkM);
    localaIG.bf((short)56);
    localaIG.bM(paramByte);
    localaIG.mH(((Integer)this.lsg[0]).intValue());
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}