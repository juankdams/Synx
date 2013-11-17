import java.util.Comparator;

class deq
  implements Comparator
{
  public static deq kYo = new deq();

  public int a(md parammd1, md parammd2) {
    return (int)(parammd2.getHeight() * parammd2.getWidth() - parammd1.getHeight() * parammd1.getWidth());
  }
}