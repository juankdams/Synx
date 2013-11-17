public final class dBL
{
  public static final dBL lJn = new dBL();

  public void A(byz parambyz)
  {
    a(parambyz, 34, dEt.lNh, parambyz.bGX());
  }

  public void B(byz parambyz) {
    a(parambyz, 32, dEt.lNg, parambyz.bGW());
  }

  public void C(byz parambyz) {
    a(parambyz, 28, dEt.lNe, parambyz.bGT());
  }

  private void a(byz parambyz, int paramInt, Ce paramCe, adz paramadz) {
    parambyz.bFW().px(paramInt);

    if ((paramadz == null) || (paramadz.isEmpty())) {
      return;
    }
    int[] arrayOfInt = paramadz.toArray();
    for (int i = 0; i < arrayOfInt.length; i++) {
      int j = arrayOfInt[i];
      dpI localdpI = ciQ.ckL().nc(j);
      if (localdpI != null)
      {
        localdpI.a(paramCe, parambyz, parambyz.bEY(), bsj.bAv(), parambyz.fa(), parambyz.fb(), parambyz.fc(), parambyz, null);
      }
    }
  }
}