public abstract interface PT extends bWU
{
  public abstract Or getContentGreedySize(dRq paramdRq, dOc paramdOc, Or paramOr);

  public abstract Or getContentPreferedSize(dRq paramdRq);

  public abstract Or getContentMinSize(dRq paramdRq);

  public abstract void a(dRq paramdRq);

  public abstract void a(dRq paramdRq, dOc paramdOc);

  public abstract boolean isStandAlone();
}