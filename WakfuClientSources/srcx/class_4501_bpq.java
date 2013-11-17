public final class bpq extends ec
{
  public bpq(String paramString, dou[] paramArrayOfdou)
  {
    super(paramString, paramArrayOfdou);
  }

  public bpq(dou[] paramArrayOfdou) {
    super(paramArrayOfdou);
  }

  public final dou[] iu() {
    dou[] arrayOfdou = new dou[it()];

    for (int i = 0; i < it(); i++) {
      arrayOfdou[i] = aC(i);
    }

    return arrayOfdou;
  }
}