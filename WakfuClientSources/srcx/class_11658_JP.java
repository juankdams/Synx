import java.io.File;
import java.util.Vector;

public class JP
  implements bnA
{
  protected aGK aON;
  private static final wh aIk = wh.Fo();
  private File bVa;

  public JP(aGK paramaGK)
  {
    this.aON = paramaGK;
  }

  public String[] a(String[] paramArrayOfString, File paramFile1, File paramFile2, Jf paramJf)
  {
    return a(paramArrayOfString, paramFile1, paramFile2, paramJf, aIk.Fp());
  }

  public String[] a(String[] paramArrayOfString, File paramFile1, File paramFile2, Jf paramJf, long paramLong)
  {
    this.bVa = paramFile2;
    Vector localVector = new Vector();
    for (int i = 0; i < paramArrayOfString.length; i++) {
      localObject = paramArrayOfString[i];
      localVector.addElement(new aHU(this, paramFile1, (String)localObject, (String)localObject));
    }

    bFe[] arrayOfbFe = new bFe[localVector.size()];
    localVector.copyInto(arrayOfbFe);

    Object localObject = btC.a(this.aON, arrayOfbFe, paramJf, this, paramLong);

    String[] arrayOfString = new String[localObject.length];
    for (int j = 0; j < localObject.length; j++) {
      arrayOfString[j] = localObject[j].getName();
    }
    return arrayOfString;
  }

  public File[] b(String[] paramArrayOfString, File paramFile1, File paramFile2, Jf paramJf)
  {
    return b(paramArrayOfString, paramFile1, paramFile2, paramJf, aIk.Fp());
  }

  public File[] b(String[] paramArrayOfString, File paramFile1, File paramFile2, Jf paramJf, long paramLong)
  {
    String[] arrayOfString = a(paramArrayOfString, paramFile1, paramFile2, paramJf, paramLong);
    File[] arrayOfFile = new File[arrayOfString.length];
    for (int i = 0; i < arrayOfString.length; i++) {
      arrayOfFile[i] = new File(paramFile1, arrayOfString[i]);
    }
    return arrayOfFile;
  }

  public bFe bS(String paramString)
  {
    return new WO(this.bVa, paramString);
  }
}