public class cyQ
{
  public static final byte inu = 0;
  public static final byte inv = 1;
  public static final byte inw = 2;
  public static final byte inx = 3;

  public static byte a(byte paramByte, float[] paramArrayOfFloat)
  {
    switch (paramByte) {
    case 0:
      bGT.bOB().y(paramArrayOfFloat);
      if (!bGT.bOB().bOC())
        return 1;
      break;
    case 2:
      bGT.bOB().y(paramArrayOfFloat);
      if (!bGT.bOB().bOC())
        return 3;
      break;
    case 1:
      bGT.bOB().y(paramArrayOfFloat);
      return paramByte;
    }
    return paramByte;
  }
}