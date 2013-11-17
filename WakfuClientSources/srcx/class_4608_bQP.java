public abstract class bQP extends bZA
{
  public static void a(dKY[] paramArrayOfdKY)
  {
    if (paramArrayOfdKY.length != 2)
      throw new ddQ("On essaie d'appliquer un opérateur numérique au mauvais nombre d'arguments ");
    if ((paramArrayOfdKY[0] == null) || (paramArrayOfdKY[1] == null))
      throw new ddQ("Un des 2 paramètres a été impossible à parser");
    for (dKY localdKY : paramArrayOfdKY)
      if ((localdKY.aNE() != Pq.chv) && (localdKY.aNE() != Pq.chz))
        throw new ddQ("On essaie d'appliquer un opérateur numérique à autre chose que des nombres...");
  }
}