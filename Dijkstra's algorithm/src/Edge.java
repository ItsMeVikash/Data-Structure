//To represent the edges in the graph. 10-03-2019
public class Edge {
	public final Vertex target;
	public final double weight;

	public Edge(Vertex target, double weight) {
		this.target = target;
		this.weight = weight;
	}
}