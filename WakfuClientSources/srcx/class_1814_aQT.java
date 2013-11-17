public class aQT extends dRK
{
  private static final String cgf = "pathDisplayer";
  private static final aQT eNI = new aQT();

  public static aQT bhr() {
    return eNI;
  }

  private aQT() {
    super("pathDisplayer", clP.hOT);
  }

  public void a(cuB paramcuB) {
    clear();

    int i = paramcuB.csW();
    for (int j = 0; j < i; j++) {
      int[] arrayOfInt = paramcuB.wR(j);
      Q(arrayOfInt[0], arrayOfInt[1], (short)arrayOfInt[2]);
    }
  }
}