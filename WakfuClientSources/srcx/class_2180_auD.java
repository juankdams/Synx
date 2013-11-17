import java.util.Comparator;

class auD
  implements Comparator
{
  public static final auD dHy = new auD();

  public int a(bdj parambdj1, bdj parambdj2) {
    return parambdj2.getTreeDepth() - parambdj1.getTreeDepth();
  }
}