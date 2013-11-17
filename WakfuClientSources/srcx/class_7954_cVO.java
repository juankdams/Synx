import java.util.Comparator;

class cVO
  implements Comparator
{
  public static final cVO kIt = new cVO();

  public int a(bdj parambdj1, bdj parambdj2) {
    return parambdj1.getTreePosition() - parambdj2.getTreePosition();
  }
}