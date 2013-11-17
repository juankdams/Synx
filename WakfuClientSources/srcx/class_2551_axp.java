public class axp extends ec
{
  public axp(String paramString, dou[] paramArrayOfdou)
  {
    super(paramString, paramArrayOfdou);
  }

  public axp(dou[] paramArrayOfdou) {
    super(paramArrayOfdou);
  }

  public final dou[] iu()
  {
    dou[] arrayOfdou = new dou[it()];

    for (int i = 0; i < it(); i++) {
      arrayOfdou[i] = aC(i);
    }

    return arrayOfdou;
  }
}