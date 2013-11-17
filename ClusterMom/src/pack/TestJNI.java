package pack;

public class TestJNI {
	   public native void greetings();

	   static {
	      System.loadLibrary("greet");
	   }

	   public static void main(String args[]) {
	      new TestJNI().greetings();

			
			// TODO Auto-generated method stub                        EhCache
		/*	CacheManager mgr = null;
			CacheCluster cluster = mgr.getCluster("TERRACOTTA");
			  // Get current nodes
			Collection<ClusterNode> nodes = cluster.getNodes();
			for(ClusterNode node : nodes) {
			  System.out.println(node.getId() + " " + node.getHostname() + " " + node.getIp());
			}
			  // Register listener
			cluster.addTopologyListener(new ClusterTopologyListener() {
				public void nodeJoined(ClusterNode node) { System.out.println(node + " joined"); }
				  public void nodeLeft(ClusterNode node) { System.out.println(node + " left"); }
				  public void clusterOnline(ClusterNode node) { System.out.println(node + " enabled"); }
				  public void clusterOffline(ClusterNode node) { System.out.println(node + " disabled"); }
				  public void clusterRejoined(ClusterNode node, ClusterNode newNode) {
				    System.out.println(node + " rejoined the cluster as " + newNode);
				  }
				});  
				*/
	   }
}
