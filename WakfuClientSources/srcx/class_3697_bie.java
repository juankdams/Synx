class bie
  implements eH
{
  bie(aOf paramaOf)
  {
  }

  public boolean a(azX paramazX, byte paramByte)
  {
    if (paramByte > 0) {
      int i = paramazX.fa();
      int j = paramazX.fb();

      float[] arrayOfFloat = (float[])aOf.b(this.fyb).bf(paramByte);
      int k = 3;
      aOf.c(this.fyb).b(arrayOfFloat, paramByte + 1, 3, i - 1, j - 1);

      paramazX.aJ(1.0F / arrayOfFloat[(paramByte + 2)]);
    }

    return true;
  }
}